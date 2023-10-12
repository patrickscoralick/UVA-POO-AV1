/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Dao.OrderDao;
import Exceptions.ColumnNotFoundException;
import Exceptions.InvalidIdException;
import Exceptions.ModelNotCreatedExeception;
import Models.Order;
import Models.Product;
import Models.Stock;
import java.util.ArrayList;

/**
 *
 * @author msmeneze
 */
public class OrderController {

    public Order add(Order order) throws Exception {
        OrderDao orderDao = new OrderDao();
        ProductController productController = new ProductController();
        StockController stockController = new StockController();
        Product product;
        Stock stock;
        for(Product p : order.products) {
            product = productController.getByProduct(p);
            stock = stockController.getByProduct(p);

            if(product == null) {
                throw new ModelNotCreatedExeception("Product is not exist");
            }

            if(stock == null) {
                throw new ColumnNotFoundException("Product is not found in stock");
            }

            if(stock.quantity <= 0) {
                throw new ColumnNotFoundException("Product is not found in stock");
            }

            stock.quantity--;
            stockController.update(stock);

        }

        return orderDao.set(order);
    }

    public void delete(Order order) throws Exception {
        OrderDao orderDao = new OrderDao();
        StockController stockController = new StockController();
        Stock stock;
        for(Product p : order.products) {
            stock = stockController.getByProduct(p);
            stock.quantity++;
            stockController.update(stock);
        }

        ArrayList<Order> orders = orderDao.get();

        int orderIndex = orders.indexOf(order);

        if(orderIndex != -1) {
            orders.remove(orderIndex);
            orderDao.update(orders);
        } else {
            throw new ModelNotCreatedExeception("order is not created");
        }


    }


    public Order update(Order order) throws Exception {
        OrderDao orderDao = new OrderDao();
        ProductController productController = new ProductController();
        StockController stockController = new StockController();
        Product product;
        Stock stock;

        if(order.id == -1) {
            throw new InvalidIdException("invalid id");
        }

        for(Product p : order.products) {
            product = productController.getByProduct(p);
            stock = stockController.getByProduct(p);

            if(product == null) {
                throw new ModelNotCreatedExeception("Product is not exist");
            }

            if(stock == null) {
                throw new ColumnNotFoundException("Product is not found in stock");
            }

            if(stock.quantity <= 0) {
                throw new ColumnNotFoundException("Product is not found in stock");
            }

            stockController.update(stock);
        }

        ArrayList<Order> orders = orderDao.get();

        int orderIndex = orders.indexOf(order);

        if(orderIndex != -1) {
            orders.set(orderIndex, order);
            orderDao.update(orders);
        } else {
            throw new ModelNotCreatedExeception("order is not created");
        }

        return order;
    }

    public Order getById(int orderId) {
        OrderDao orderDao = new OrderDao();
        ArrayList<Order> orders = orderDao.get();

        for (Order order : orders) {
            if (order.id == orderId) {
                return order;
            }
        }

        return null;
    }

    public void deleteByNumeroPedido(int numeroPedido) throws Exception {
        try {
            OrderDao orderDao = new OrderDao();
            ArrayList<Order> orders = orderDao.get();
            Order orderToRemove = null;

            for (Order order : orders) {
                if (order.id == numeroPedido) {
                    orderToRemove = order;
                    break;
                }
            }

            if (orderToRemove != null) {
                orders.remove(orderToRemove);
                orderDao.update(orders);
            } else {
                throw new ModelNotCreatedExeception("Pedido não encontrado.");
            }
        } catch (Exception ex) {
            throw new ModelNotCreatedExeception("Erro ao excluir o pedido: " + ex.getMessage());
        }
    }
    public float calcularTotalDosItens(float valor_item1, float valor_item2, boolean promotion) {
        float total = valor_item1 + valor_item2; // Inicialize a variável total com a soma dos valores dos itens

        if (promotion) {
            total -= 1; // Subtrai 1 unidade do total se a promoção for verdadeira
        }

        return total;
    }
    public ArrayList<Order> get() {
        OrderDao orderDao = new OrderDao();
        return orderDao.get();
    }



}
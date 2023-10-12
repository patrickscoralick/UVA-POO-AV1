/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package views;

import Controllers.ProductController;
import Controllers.StockController;
import Exceptions.InvalidIdException;
import Exceptions.InvalidQuantityExeception;
import Exceptions.ModelNotCreatedExeception;
import Models.Product;
import Models.Stock;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author patri
 */
public class Estoque extends javax.swing.JDialog {
    
    public class Item {
        private int id;
        private Product product;

        public Item(int id, Product product) {
            this.id = id;
            this.product = product;
        }

        
        public int getId() {
            return id;
        }

        @Override
        public String toString() {
            return product.name;
        }
    }
   

    /**
     * Creates new form Estoque
     */
    public Estoque(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
      
       ProductController productController = new ProductController();
       ArrayList<Product> products =  productController.get();
        
          
        for(Product product: products) {
            jComboBox1_Nome_Porduto.addItem(product);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_TituloTelaPedido = new javax.swing.JLabel();
        jSpinner_Hamburguer = new javax.swing.JSpinner();
        jButton_RegistroEstoque = new javax.swing.JButton();
        jButton_ListarEstoque = new javax.swing.JButton();
        jLabel_EstoqueSalgado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_EstoqueProdutos = new javax.swing.JTable();
        jButton_ListarEstoque2 = new javax.swing.JButton();
        jButton_ListarEstoque1 = new javax.swing.JButton();
        jLabel_EstoqueSalgado1 = new javax.swing.JLabel();
        jComboBox1_Nome_Porduto = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel_TituloTelaPedido.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_TituloTelaPedido.setText("ESTOQUE DE PRODUTOS");

        jButton_RegistroEstoque.setBackground(new java.awt.Color(0, 0, 0));
        jButton_RegistroEstoque.setForeground(new java.awt.Color(255, 255, 255));
        jButton_RegistroEstoque.setText("REGISTRAR");
        jButton_RegistroEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegistroEstoqueActionPerformed(evt);
            }
        });

        jButton_ListarEstoque.setBackground(new java.awt.Color(0, 0, 0));
        jButton_ListarEstoque.setForeground(new java.awt.Color(255, 255, 255));
        jButton_ListarEstoque.setText("PESQUISAR");
        jButton_ListarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ListarEstoqueActionPerformed(evt);
            }
        });

        jLabel_EstoqueSalgado.setText("Nome do Produto:");

        jTable_EstoqueProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Produto", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_EstoqueProdutos);

        jButton_ListarEstoque2.setBackground(new java.awt.Color(0, 0, 0));
        jButton_ListarEstoque2.setForeground(new java.awt.Color(255, 255, 255));
        jButton_ListarEstoque2.setText("EDITAR");
        jButton_ListarEstoque2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ListarEstoque2ActionPerformed(evt);
            }
        });

        jButton_ListarEstoque1.setBackground(new java.awt.Color(0, 0, 0));
        jButton_ListarEstoque1.setForeground(new java.awt.Color(255, 255, 255));
        jButton_ListarEstoque1.setText("EXCLUIR");
        jButton_ListarEstoque1.setToolTipText("");
        jButton_ListarEstoque1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ListarEstoque1ActionPerformed(evt);
            }
        });

        jLabel_EstoqueSalgado1.setText("Quantidade:");

        jComboBox1_Nome_Porduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1_Nome_PordutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel_EstoqueSalgado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1_Nome_Porduto, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_EstoqueSalgado1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinner_Hamburguer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_TituloTelaPedido)
                .addGap(196, 196, 196))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_RegistroEstoque)
                        .addGap(64, 64, 64)
                        .addComponent(jButton_ListarEstoque)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_ListarEstoque2)
                        .addGap(60, 60, 60)
                        .addComponent(jButton_ListarEstoque1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel_TituloTelaPedido)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_EstoqueSalgado)
                    .addComponent(jSpinner_Hamburguer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_EstoqueSalgado1)
                    .addComponent(jComboBox1_Nome_Porduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_RegistroEstoque)
                    .addComponent(jButton_ListarEstoque)
                    .addComponent(jButton_ListarEstoque2)
                    .addComponent(jButton_ListarEstoque1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ListarEstoque2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ListarEstoque2ActionPerformed
//        Editar
        try {
            // TODO add your handling code here:
            int quantity = (int) jSpinner_Hamburguer.getValue();
            Product product = (Product) jComboBox1_Nome_Porduto.getSelectedItem();
            StockController stockController = new StockController();
            Stock stock = stockController.getByProduct(product);
            stock.quantity = quantity;
            stockController.update(stock);
            jButton_ListarEstoque.doClick();
        } catch (InvalidQuantityExeception ex) {
            Logger.getLogger(Estoque.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidIdException ex) {
            Logger.getLogger(Estoque.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ModelNotCreatedExeception ex) {
            Logger.getLogger(Estoque.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton_ListarEstoque2ActionPerformed

    private void jButton_ListarEstoque1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ListarEstoque1ActionPerformed
//        Excluir
        try {
            Product product = (Product) jComboBox1_Nome_Porduto.getSelectedItem();
            StockController stockController = new StockController();
            Stock stock = stockController.getByProduct(product);
            stockController.delete(stock);
            jButton_ListarEstoque.doClick();
        } catch (Exception ex) {
            Logger.getLogger(Estoque.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_ListarEstoque1ActionPerformed

    private void jButton_ListarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ListarEstoqueActionPerformed
//        Listar
 
        StockController stockController = new StockController();
        
        
        ArrayList<Stock> stocks = stockController.get();
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Produto");
        modelo.addColumn("Quatidade");
        
        for (Stock stock : stocks) {
            modelo.addRow(new Object[]{stock.product.name, stock.quantity});
        }
 
        jTable_EstoqueProdutos.setModel(modelo);
        jTable_EstoqueProdutos.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int rowIndex = jTable_EstoqueProdutos.getSelectedRow();
                if(rowIndex != -1) {
                    StockController stockController = new StockController();
                    ArrayList<Stock> stocks = stockController.get();
                    Stock stock = stocks.get(rowIndex);

                    jSpinner_Hamburguer.setValue(stock.quantity);
                    jComboBox1_Nome_Porduto.setSelectedItem(stock.product);
                }
            }
            
        });
          // Adicionar a tabela a um painel de rolagem
  
    }//GEN-LAST:event_jButton_ListarEstoqueActionPerformed

    private void jComboBox1_Nome_PordutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1_Nome_PordutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1_Nome_PordutoActionPerformed

    private void jButton_RegistroEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegistroEstoqueActionPerformed
        try {
            // TODO add your handling code here:
            int quantity = (int) jSpinner_Hamburguer.getValue();
            Product product = (Product) jComboBox1_Nome_Porduto.getSelectedItem();
            
            
            StockController stockController = new StockController();
            stockController.add(new Stock(product, quantity));
            jButton_ListarEstoque.doClick();
        } catch (Exception ex) {
            Logger.getLogger(Estoque.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_jButton_RegistroEstoqueActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Estoque dialog = new Estoque(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_ListarEstoque;
    private javax.swing.JButton jButton_ListarEstoque1;
    private javax.swing.JButton jButton_ListarEstoque2;
    private javax.swing.JButton jButton_RegistroEstoque;
    private javax.swing.JComboBox<Product> jComboBox1_Nome_Porduto;
    private javax.swing.JLabel jLabel_EstoqueSalgado;
    private javax.swing.JLabel jLabel_EstoqueSalgado1;
    private javax.swing.JLabel jLabel_TituloTelaPedido;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner_Hamburguer;
    private javax.swing.JTable jTable_EstoqueProdutos;
    // End of variables declaration//GEN-END:variables
}

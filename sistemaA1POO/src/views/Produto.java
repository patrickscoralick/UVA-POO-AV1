/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package views;
import Controllers.ProductController;

import Enums.Type;
import Exceptions.InvalidIdException;
import Exceptions.InvalidQuantityExeception;
import Exceptions.ModelNotCreatedExeception;
import Models.Product;
import Models.Stock;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author patri
 */
public class Produto extends javax.swing.JDialog {
    private ProductController productController;
    /**
     * Creates new form Pedidos
     */
    public Produto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        productController = new ProductController();
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
        jLabel_NPedido = new javax.swing.JLabel();
        jLabel_TipoSalgado = new javax.swing.JLabel();
        jLabel_TipoSuco = new javax.swing.JLabel();
        jComboBox_TipoSalgado = new javax.swing.JComboBox<>();
        jTextField_NPedido = new javax.swing.JTextField();
        jButton_Anotar = new javax.swing.JButton();
        jButton_Listar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton_Editar = new javax.swing.JButton();
        jButton_Editar1 = new javax.swing.JButton();
        jLabel_NPedido1 = new javax.swing.JLabel();
        jTextField_NPedido1 = new javax.swing.JTextField();
        jLabel_TipoSalgado1 = new javax.swing.JLabel();
        jTextField_NPedido2 = new javax.swing.JTextField();
        jTextField_NPedido3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel_TituloTelaPedido.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_TituloTelaPedido.setText("CRIAR PRODUTO");

        jLabel_NPedido.setText("Tipo:");

        jLabel_TipoSalgado.setText("Nome Produto:");

        jLabel_TipoSuco.setText("Descrição:");

        jComboBox_TipoSalgado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Salgado Médio", "Salgadão" }));
        jComboBox_TipoSalgado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_TipoSalgadoActionPerformed(evt);
            }
        });

        jTextField_NPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NPedidoActionPerformed(evt);
            }
        });

        jButton_Anotar.setBackground(new java.awt.Color(0, 0, 0));
        jButton_Anotar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Anotar.setText("REGISTRAR");
        jButton_Anotar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AnotarActionPerformed(evt);
            }
        });

        jButton_Listar.setBackground(new java.awt.Color(0, 0, 0));
        jButton_Listar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Listar.setText("LISTAR");
        jButton_Listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ListarActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null}
                },
                new String [] {
                        "Id", "Tipo", "Descrição", "Produto", "Preço (R$)"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jButton_Editar.setBackground(new java.awt.Color(0, 0, 0));
        jButton_Editar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Editar.setText("EDITAR");
        jButton_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EditarActionPerformed(evt);
            }
        });

        jButton_Editar1.setBackground(new java.awt.Color(0, 0, 0));
        jButton_Editar1.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Editar1.setText("EXCLUIR");
        jButton_Editar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Editar1ActionPerformed(evt);
            }
        });

        jLabel_NPedido1.setText("Id:");

        jTextField_NPedido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NPedido1ActionPerformed(evt);
            }
        });

        jLabel_TipoSalgado1.setText("Preço R$:");

        jTextField_NPedido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NPedido2ActionPerformed(evt);
            }
        });

        jTextField_NPedido3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NPedido3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel_TituloTelaPedido)
                                                .addGap(319, 319, 319))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jButton_Anotar)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jButton_Listar)
                                                                .addGap(139, 139, 139)
                                                                .addComponent(jButton_Editar)
                                                                .addGap(127, 127, 127)
                                                                .addComponent(jButton_Editar1)))
                                                .addGap(78, 78, 78))))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel_TipoSalgado)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField_NPedido2)
                                                .addGap(54, 54, 54))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel_NPedido1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField_NPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(62, 62, 62)
                                                .addComponent(jLabel_NPedido)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jComboBox_TipoSalgado, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(31, 31, 31)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel_TipoSalgado1)
                                        .addComponent(jLabel_TipoSuco))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField_NPedido1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField_NPedido3, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel_TituloTelaPedido)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel_NPedido1)
                                        .addComponent(jTextField_NPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel_NPedido)
                                        .addComponent(jLabel_TipoSuco)
                                        .addComponent(jTextField_NPedido3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox_TipoSalgado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel_TipoSalgado)
                                        .addComponent(jTextField_NPedido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel_TipoSalgado1)
                                        .addComponent(jTextField_NPedido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton_Anotar)
                                        .addComponent(jButton_Listar)
                                        .addComponent(jButton_Editar)
                                        .addComponent(jButton_Editar1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_TipoSalgadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_TipoSalgadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_TipoSalgadoActionPerformed

    private void jTextField_NPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NPedidoActionPerformed

    private void jButton_Editar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Editar1ActionPerformed
        // Excluir
        try {
            int id = Integer.parseInt(jTextField_NPedido.getText());
//            Type tipo = jComboBox_TipoSalgado.getSelectedItem()
            String name_product = jTextField_NPedido2.getText();
            String descricao = jTextField_NPedido3.getText();
            float preco = Float.parseFloat(jTextField_NPedido1.getText());
            ProductController productController = new ProductController();
            Product searchProduct = new Product(id ,name_product, descricao, null, preco);
            Product foundProduct = productController.getByProduct(searchProduct);
            System.out.println(foundProduct);
            productController.delete(foundProduct);
            jTextField_NPedido2.setText("");
            jTextField_NPedido1.setText("");
            jTextField_NPedido3.setText("");
            jTextField_NPedido.setText("");
        } catch (Exception ex) {
            Logger.getLogger(Estoque.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_Editar1ActionPerformed

    private void jTextField_NPedido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NPedido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NPedido1ActionPerformed

    private void jTextField_NPedido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NPedido2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NPedido2ActionPerformed

    private void jTextField_NPedido3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NPedido3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NPedido3ActionPerformed

    private void jButton_EditarActionPerformed(java.awt.event.ActionEvent evt){
        try{
//      Editar pedido
            int id = Integer.parseInt(jTextField_NPedido.getText());
            // Type tipo = jComboBox_TipoSalgado
            String descricao = jTextField_NPedido3.getText();
            String productName = jTextField_NPedido2.getText();
            float preco = Float.parseFloat(jTextField_NPedido1.getText());
            ProductController productController = new ProductController();
            Product searchProduct = new Product(id, productName, descricao, null, preco);
            Product foundProduct = productController.getByProduct(searchProduct);
            foundProduct.price = preco;
            foundProduct.description = descricao;
//            foundProduct.type = tipo;
            productController.update(foundProduct);
            jTextField_NPedido.setText("");
            jTextField_NPedido1.setText("");
            jTextField_NPedido2.setText("");
            jTextField_NPedido3.setText("");
        } catch (InvalidQuantityExeception ex) {
            Logger.getLogger(Estoque.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidIdException ex) {
            Logger.getLogger(Estoque.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ModelNotCreatedExeception ex) {
            Logger.getLogger(Estoque.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void jButton_AnotarActionPerformed(java.awt.event.ActionEvent evt){
//        Registrar pedido
        try {
            if (jTextField_NPedido.getText().isEmpty() || jTextField_NPedido1.getText().isEmpty() ||
                    jTextField_NPedido2.getText().isEmpty() || jTextField_NPedido3.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Preencha todos os campos antes de registrar o produto.");
                return;
            }
            int id = Integer.parseInt(jTextField_NPedido.getText());
//        Type tipo = jComboBox_TipoSalgado
            String descricao = jTextField_NPedido3.getText();
            String nomeProduto = jTextField_NPedido2.getText();
            float preco = Float.parseFloat(jTextField_NPedido1.getText());

            ProductController productController = new ProductController();

            productController.add(new Product(id, nomeProduto, descricao, Enums.Type.DRINK, preco));

            jTextField_NPedido.setText("");
            jTextField_NPedido1.setText("");
            jTextField_NPedido2.setText("");
            jTextField_NPedido3.setText("");

            JOptionPane.showMessageDialog(this, "Produto registrado com sucesso.");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao registrar o produto. Verifique os valores inseridos.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao registrar o produto.");
        }
    }

    private void jButton_ListarActionPerformed(java.awt.event.ActionEvent evt){
//        Listar pedido
        ProductController productController = new ProductController();


        ArrayList<Product> products = productController.get();

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Tipo");
        modelo.addColumn("Descricao");
        modelo.addColumn("Produto");
        modelo.addColumn("Preco");

        for (Product product : products) {
            modelo.addRow(new Object[]{product.id, product.type, product.description, product.name, product.price});
        }

        jTable2.setModel(modelo);
        jTable2.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int rowIndex = jTable2.getSelectedRow();
                if(rowIndex != -1) {
                    ProductController productController = new ProductController();
                    ArrayList<Product> products = productController.get();
                    Product product = products.get(rowIndex);

                    jTextField_NPedido.setText(String.valueOf(product.id));
                    jTextField_NPedido3.setText(product.description);
                    jTextField_NPedido2.setText(product.name);
                    jTextField_NPedido1.setText(String.valueOf(product.price));
//                    jComboBox_TipoSalgado.setSelectedItem(product.type);

                }
            }

        });
    }
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
            java.util.logging.Logger.getLogger(Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Produto dialog = new Produto(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton_Anotar;
    private javax.swing.JButton jButton_Editar;
    private javax.swing.JButton jButton_Editar1;
    private javax.swing.JButton jButton_Listar;
    private javax.swing.JComboBox<String> jComboBox_TipoSalgado;
    private javax.swing.JLabel jLabel_NPedido;
    private javax.swing.JLabel jLabel_NPedido1;
    private javax.swing.JLabel jLabel_TipoSalgado;
    private javax.swing.JLabel jLabel_TipoSalgado1;
    private javax.swing.JLabel jLabel_TipoSuco;
    private javax.swing.JLabel jLabel_TituloTelaPedido;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField_NPedido;
    private javax.swing.JTextField jTextField_NPedido1;
    private javax.swing.JTextField jTextField_NPedido2;
    private javax.swing.JTextField jTextField_NPedido3;
    // End of variables declaration//GEN-END:variables
}
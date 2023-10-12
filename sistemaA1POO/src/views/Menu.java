package views;

import Enums.Level;
import Controllers.LoginController;
import java.awt.Image;
import javax.swing.*;

public class Menu extends javax.swing.JFrame {
    private boolean loginRealizado = false;
    public Menu() {
        initComponents();

        Icon i = jLabel_logo_uva.getIcon();
        ImageIcon icon = (ImageIcon)i;
        Image image = icon.getImage().getScaledInstance(jLabel_logo_uva.getWidth(), jLabel_logo_uva.getHeight(), Image.SCALE_SMOOTH);
        jLabel_logo_uva.setIcon(new ImageIcon(image));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_logo_uva = new javax.swing.JLabel();
        jLabel_titulo = new javax.swing.JLabel();
        jLabel_subtitulo = new javax.swing.JLabel();
        jButton_pedidos = new javax.swing.JButton();
        jButton_estoque = new javax.swing.JButton();
        jDesktopPane_login = new javax.swing.JDesktopPane();
        jLabel_IconeLogin = new javax.swing.JLabel();
        jButton_Entrar = new javax.swing.JButton();
        jButton_Sair = new javax.swing.JButton();
        jButton_estoque1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_logo_uva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyImages/LogoUVA.png"))); // NOI18N

        jLabel_titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel_titulo.setForeground(new java.awt.Color(155, 0, 155));
        jLabel_titulo.setText("CANTINA'S");
        jLabel_titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel_subtitulo.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel_subtitulo.setText("Programação Orientada à Objetos | Profº Dênis Cople | Feito po Matheus Silva, Filipi Amoedo e Patrick Scoralick | V. 1.0");
        jLabel_subtitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton_pedidos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_pedidos.setText("PEDIDOS");
        jButton_pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_pedidosActionPerformed(evt);
            }
        });

        jButton_estoque.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_estoque.setText("ESTOQUE");
        jButton_estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_estoqueActionPerformed(evt);
            }
        });

        jLabel_IconeLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyImages/UserIcone.png"))); // NOI18N

        jButton_Entrar.setText("ENTRAR");
        jButton_Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EntrarActionPerformed(evt);
            }
        });



        jButton_Sair.setText("SAIR");
        jButton_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SairActionPerformed(evt);
            }
        });

        jDesktopPane_login.setLayer(jLabel_IconeLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane_login.setLayer(jButton_Entrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane_login.setLayer(jButton_Sair, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane_loginLayout = new javax.swing.GroupLayout(jDesktopPane_login);
        jDesktopPane_login.setLayout(jDesktopPane_loginLayout);
        jDesktopPane_loginLayout.setHorizontalGroup(
                jDesktopPane_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDesktopPane_loginLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jDesktopPane_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jDesktopPane_loginLayout.createSequentialGroup()
                                                .addComponent(jButton_Entrar)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane_loginLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(jDesktopPane_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton_Sair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel_IconeLogin, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addContainerGap())
        );
        jDesktopPane_loginLayout.setVerticalGroup(
                jDesktopPane_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDesktopPane_loginLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel_IconeLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Entrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Sair)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton_estoque1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_estoque1.setText("PRODUTO");
        jButton_estoque1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_estoque1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(481, 481, 481)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton_estoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jButton_pedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(3, 3, 3))
                                                        .addComponent(jButton_estoque1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(381, 381, 381))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(jLabel_logo_uva)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jDesktopPane_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel_subtitulo)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel_titulo)
                                .addGap(349, 349, 349))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(jLabel_logo_uva, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jDesktopPane_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                                .addComponent(jLabel_titulo)
                                .addGap(51, 51, 51)
                                .addComponent(jButton_pedidos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_estoque)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_estoque1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(112, 112, 112)
                                .addComponent(jLabel_subtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void setLoginRealizado(boolean loginRealizado) {
        this.loginRealizado = loginRealizado;
    }
    private void jButton_pedidosActionPerformed(java.awt.event.ActionEvent evt) {
        if (loginRealizado) {
            Pedidos pedidoDialog = new Pedidos(this, true);
            pedidoDialog.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Realize o login antes de acessar Pedidos.", "Login Necessário", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton_pedidosActionPerformed

    private void jButton_estoqueActionPerformed(java.awt.event.ActionEvent evt) {
        if (loginRealizado) {
            Estoque estoqueDialog = new Estoque(this, true);
            estoqueDialog.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Realize o login antes de acessar Estoque.", "Login Necessário", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton_estoqueActionPerformed

    private void jButton_SairActionPerformed(java.awt.event.ActionEvent evt) {
        desfazerLogin();
    }

    private void jButton_estoque1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_estoque1ActionPerformed
        // TODO add your handling code here:
        if (loginRealizado) {
            Produto produtoDialog = new Produto(this, true);
            produtoDialog.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Realize o login antes de acessar Produto.", "Login Necessário", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton_estoque1ActionPerformed

    private void jButton_EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Login login = new Login(Menu.this, true);
        login.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void ocultarBotaoEntrar() {
        jButton_Entrar.setVisible(false);
    }
    public void desfazerLogin() {
        loginRealizado = false;
        exibirBotaoEntrar();
    }
    public void exibirBotaoEntrar() {
        jButton_Entrar.setVisible(true);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Entrar;
    private javax.swing.JButton jButton_Sair;
    private javax.swing.JButton jButton_estoque;
    private javax.swing.JButton jButton_estoque1;
    private javax.swing.JButton jButton_pedidos;
    private javax.swing.JDesktopPane jDesktopPane_login;
    private javax.swing.JLabel jLabel_IconeLogin;
    private javax.swing.JLabel jLabel_logo_uva;
    private javax.swing.JLabel jLabel_subtitulo;
    private javax.swing.JLabel jLabel_titulo;
    // End of variables declaration//GEN-END:variables
}

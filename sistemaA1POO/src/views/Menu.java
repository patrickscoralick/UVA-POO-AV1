package views;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Menu extends javax.swing.JFrame {

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
        jButton_logins = new javax.swing.JButton();
        jButton_salvar = new javax.swing.JButton();
        jButton_sair = new javax.swing.JButton();
        jDesktopPane_login = new javax.swing.JDesktopPane();
        jLabel_IconeLogin = new javax.swing.JLabel();
        jButton_Entrar = new javax.swing.JButton();
        jButton_Sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_logo_uva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyImages/LogoUVA.png"))); // NOI18N

        jLabel_titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel_titulo.setForeground(new java.awt.Color(255, 255, 0));
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

        jButton_logins.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_logins.setText("LOGINS");
        jButton_logins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_loginsActionPerformed(evt);
            }
        });

        jButton_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyImages/disqueteIcone.png"))); // NOI18N

        jButton_sair.setBackground(new java.awt.Color(255, 0, 0));
        jButton_sair.setForeground(new java.awt.Color(255, 255, 255));
        jButton_sair.setText("Sair");

        jLabel_IconeLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyImages/UserIcone.png"))); // NOI18N

        jButton_Entrar.setText("ENTRAR");

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
                            .addComponent(jButton_logins, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(381, 381, 381))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_salvar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel_logo_uva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDesktopPane_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_titulo)
                            .addComponent(jLabel_subtitulo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_sair)))
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 229, Short.MAX_VALUE)
                .addComponent(jLabel_titulo)
                .addGap(18, 18, 18)
                .addComponent(jButton_pedidos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_estoque)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_logins)
                .addGap(47, 47, 47)
                .addComponent(jButton_salvar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_subtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_sair))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_pedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_pedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_pedidosActionPerformed

    private void jButton_estoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_estoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_estoqueActionPerformed

    private void jButton_loginsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_loginsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_loginsActionPerformed

    private void jButton_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_SairActionPerformed

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
    private javax.swing.JButton jButton_logins;
    private javax.swing.JButton jButton_pedidos;
    private javax.swing.JButton jButton_sair;
    private javax.swing.JButton jButton_salvar;
    private javax.swing.JDesktopPane jDesktopPane_login;
    private javax.swing.JLabel jLabel_IconeLogin;
    private javax.swing.JLabel jLabel_logo_uva;
    private javax.swing.JLabel jLabel_subtitulo;
    private javax.swing.JLabel jLabel_titulo;
    // End of variables declaration//GEN-END:variables
}

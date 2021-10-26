package Vistas;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.ListCellRenderer;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyledDocument;

public class Inicio extends javax.swing.JFrame {

    SimpleAttributeSet attr = new SimpleAttributeSet();

    public Inicio() {
        initComponents();
        this.pack();
        this.setLocationRelativeTo(null);
    }

    private void publicar() throws BadLocationException {
        JTextPane frontPane = new JTextPane();
        StyledDocument doc = frontPane.getStyledDocument();
        frontPane.setSize((txtPanePublicaciones.getWidth() - 200), (txtPanePublicaciones.getHeight() / 4));
        frontPane.setBackground(Color.GREEN);
        txtPanePublicaciones.add(frontPane);
//        txtPanePublicaciones.revalidate();
//        txtPanePublicaciones.repaint();
        doc.insertString(doc.getLength(),
                "Mayonesa\n"
                + "Ella me bate como haciendo mayonesa\n"
                + "Todo lo que había tomado\n"
                + "Se me subió pronto a la cabeza\n"
                + "Mayonesa\n"
                + "Ella me bate como haciendo mayonesa\n"
                + "No sé ni cómo me llamo\n"
                + "Ni dónde vivo (Ni dónde vivo)\n"
                + "Ni me interesa",
                attr);
    }

//    private ActionListener accionBotonPueba() {
//        ActionListener actionListener = new ActionListener() {
//            public void actionPerformed(ActionEvent event) {
//                JOptionPane.showMessageDialog(panel, "wow", "Impresionante", JOptionPane.INFORMATION_MESSAGE);
//            }
//        };
//        return actionListener;
//    }
//    private ListCellRenderer<? super String> getRenderer() {
//        return new DefaultListCellRenderer(){
//            @Override
//            public Component getListCellRendererComponent(JList<?> list,
//                    Object value, int index, boolean isSelected,
//                    boolean cellHasFocus) {
//                JLabel listCellRendererComponent = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected,cellHasFocus);
//                listCellRendererComponent.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0,Color.BLACK));
//                return listCellRendererComponent;
//            }
//        };
//    }
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDashPerfil = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        BtnVerPerfil3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        panelPublicacion = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPanePublicaciones = new javax.swing.JTextPane();
        panelBuscar = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        btnPublicar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio");
        setBackground(new java.awt.Color(247, 241, 227));

        panelDashPerfil.setBackground(new java.awt.Color(52, 172, 224));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/unnamed.png"))); // NOI18N
        jLabel7.setText("jLabel1");

        BtnVerPerfil3.setBackground(new java.awt.Color(232, 65, 24));
        BtnVerPerfil3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        BtnVerPerfil3.setText("Visitar perfil");
        BtnVerPerfil3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVerPerfilActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Nombre de usuario");

        javax.swing.GroupLayout panelDashPerfilLayout = new javax.swing.GroupLayout(panelDashPerfil);
        panelDashPerfil.setLayout(panelDashPerfilLayout);
        panelDashPerfilLayout.setHorizontalGroup(
            panelDashPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDashPerfilLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelDashPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDashPerfilLayout.createSequentialGroup()
                        .addComponent(BtnVerPerfil3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDashPerfilLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))))
            .addGroup(panelDashPerfilLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel8)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        panelDashPerfilLayout.setVerticalGroup(
            panelDashPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDashPerfilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnVerPerfil3)
                .addContainerGap(451, Short.MAX_VALUE))
        );

        panelPublicacion.setBackground(new java.awt.Color(247, 241, 227));
        panelPublicacion.setToolTipText("");

        txtPanePublicaciones.setEditable(false);
        txtPanePublicaciones.setBackground(new java.awt.Color(247, 241, 227));
        jScrollPane2.setViewportView(txtPanePublicaciones);

        javax.swing.GroupLayout panelPublicacionLayout = new javax.swing.GroupLayout(panelPublicacion);
        panelPublicacion.setLayout(panelPublicacionLayout);
        panelPublicacionLayout.setHorizontalGroup(
            panelPublicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPublicacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 907, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelPublicacionLayout.setVerticalGroup(
            panelPublicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPublicacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        jTextField1.setText("Buscar...");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        btnPublicar.setBackground(new java.awt.Color(0, 168, 255));
        btnPublicar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnPublicar.setForeground(new java.awt.Color(255, 255, 255));
        btnPublicar.setText("Publicar");
        btnPublicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPublicarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBuscarLayout = new javax.swing.GroupLayout(panelBuscar);
        panelBuscar.setLayout(panelBuscarLayout);
        panelBuscarLayout.setHorizontalGroup(
            panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 914, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPublicar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelBuscarLayout.setVerticalGroup(
            panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPublicar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelPublicacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(panelDashPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelDashPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(panelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelPublicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnPublicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublicarActionPerformed
        try {
            publicar();
        } catch (BadLocationException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPublicarActionPerformed

    private void BtnVerPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVerPerfilActionPerformed
        Perfil perfilForm = new Perfil();
        perfilForm.setVisible(true);
        perfilForm.pack();
        perfilForm.setLocationRelativeTo(null);
        perfilForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_BtnVerPerfilActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnVerPerfil3;
    private javax.swing.JButton btnPublicar;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel panelBuscar;
    private javax.swing.JPanel panelDashPerfil;
    private javax.swing.JPanel panelPublicacion;
    private javax.swing.JTextPane txtPanePublicaciones;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JButton botonPrueba;

}

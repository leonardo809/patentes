package IngresarActualizarEliminar;
import Programa.*;
import javax.swing.JPanel;
public class IAE_Menú extends javax.swing.JFrame {
    public IAE_Menú() {
        initComponents();
      }
    int x,y;
    IAE_Ayudante ayu=new IAE_Ayudante();
    IAE_Empresa emp=new IAE_Empresa();
    IAE_Inventor inv=new IAE_Inventor();
    IAE_Patentes pat=new IAE_Patentes();
    
    IAE_Calle cal=new IAE_Calle();
    IAE_Colonia col=new IAE_Colonia();
    IAE_Delegacion del=new IAE_Delegacion();
    
    IAE_Telefono_Ayudante T_ayu=new IAE_Telefono_Ayudante();
    IAE_Telefono_Empresa  T_emp=new IAE_Telefono_Empresa();
    IAE_Telefono_Inventor T_inv=new IAE_Telefono_Inventor();
    IAE_TelefonosGen T=new IAE_TelefonosGen();
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel17 = new javax.swing.JPanel();
        bMinimizar4 = new javax.swing.JButton();
        bSalir1 = new javax.swing.JButton();
        bRegresar = new javax.swing.JButton();
        lBarra4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setBackground(new java.awt.Color(44, 109, 212));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bMinimizar4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        bMinimizar4.setForeground(new java.awt.Color(255, 255, 255));
        bMinimizar4.setText("-");
        bMinimizar4.setBorder(null);
        bMinimizar4.setBorderPainted(false);
        bMinimizar4.setContentAreaFilled(false);
        bMinimizar4.setRolloverEnabled(false);
        bMinimizar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMinimizar4ActionPerformed(evt);
            }
        });
        jPanel17.add(bMinimizar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 20, 20));

        bSalir1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        bSalir1.setForeground(new java.awt.Color(255, 255, 255));
        bSalir1.setText("x");
        bSalir1.setBorder(null);
        bSalir1.setBorderPainted(false);
        bSalir1.setContentAreaFilled(false);
        bSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalir1ActionPerformed(evt);
            }
        });
        jPanel17.add(bSalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 20, 20));

        bRegresar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        bRegresar.setForeground(new java.awt.Color(255, 255, 255));
        bRegresar.setText("<");
        bRegresar.setBorder(null);
        bRegresar.setBorderPainted(false);
        bRegresar.setContentAreaFilled(false);
        bRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegresarActionPerformed(evt);
            }
        });
        jPanel17.add(bRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, 20));

        lBarra4.setFont(new java.awt.Font("Caviar Dreams", 1, 20)); // NOI18N
        lBarra4.setForeground(new java.awt.Color(240, 240, 240));
        lBarra4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lBarra4.setText("Menú - Ingresar, actualizar y eliminar");
        lBarra4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lBarra4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lBarra4MouseDragged(evt);
            }
        });
        lBarra4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lBarra4MousePressed(evt);
            }
        });
        jPanel17.add(lBarra4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 40));

        getContentPane().add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 40));

        jPanel2.setBackground(new java.awt.Color(45, 118, 232));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoVergas.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 320, 180));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 600, 220));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(860, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(854, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(45, 118, 232));
        jLabel4.setText("© PrototypeX by Isolated Systems");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 170, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/azul/contelempb.png"))); // NOI18N
        jLabel24.setToolTipText("TELEFONO EMPRESA");
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 50, 50));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/azul/contelayub.png"))); // NOI18N
        jLabel23.setToolTipText("TELEFONO AYUDANTE");
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 50, 50));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/azul/contelinvb.png"))); // NOI18N
        jLabel22.setToolTipText("TELEFONO INVENTOR");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 50, 50));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/azul/contelb.png"))); // NOI18N
        jLabel21.setToolTipText("TELEFONO");
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 50, 50));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/azul/concoloniab.png"))); // NOI18N
        jLabel20.setToolTipText("COLONIA");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 50, 50));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/azul/condelegacionb.png"))); // NOI18N
        jLabel19.setToolTipText("DELEGACION");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 50, 50));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/azul/concalleb.png"))); // NOI18N
        jLabel18.setToolTipText("CALLE");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 50, 50));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/azul/conpatenteb.png"))); // NOI18N
        jLabel17.setToolTipText("PATENTE");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 50, 50));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/azul/conempresab.png"))); // NOI18N
        jLabel16.setToolTipText("EMPRESA");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 50, 50));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/azul/conayudanteb.png"))); // NOI18N
        jLabel15.setToolTipText("AYUDANTE");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 50, 50));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/azul/coninventorb.png"))); // NOI18N
        jLabel13.setToolTipText("INVENTOR");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 50, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 600, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    int xx,xy;
    private void bRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegresarActionPerformed
        this.dispose();
        Menú Men=new Menú();
        Men.setVisible(true);
    }//GEN-LAST:event_bRegresarActionPerformed

    private void bSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalir1ActionPerformed
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_bSalir1ActionPerformed

    private void bMinimizar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMinimizar4ActionPerformed
        this.setExtendedState(ICONIFIED);
        this.setExtendedState(1);
    }//GEN-LAST:event_bMinimizar4ActionPerformed

    private void lBarra4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lBarra4MouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_lBarra4MouseDragged

    private void lBarra4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lBarra4MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_lBarra4MousePressed

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        this.dispose();
        emp.setVisible(true);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        this.dispose();
        inv.setVisible(true);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        this.dispose();
        pat.setVisible(true);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        this.dispose();
        ayu.setVisible(true);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        this.dispose();
        T.setVisible(true);
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        this.dispose();
        T_emp.setVisible(true);
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        this.dispose();
        T_inv.setVisible(true);
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        this.dispose();
        T_ayu.setVisible(true);
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        this.dispose();
        del.setVisible(true);
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        this.dispose();
        col.setVisible(true);
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        this.dispose();
        cal.setVisible(true);
    }//GEN-LAST:event_jLabel18MouseClicked
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
            java.util.logging.Logger.getLogger(IAE_Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IAE_Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IAE_Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IAE_Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IAE_Menú().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bMinimizar4;
    private javax.swing.JButton bRegresar;
    private javax.swing.JButton bSalir1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lBarra4;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IngresarActualizarEliminar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class IAE_Delegacion extends javax.swing.JFrame {

    /**
     * Creates new form I_Delegacion
     */
    public IAE_Delegacion() {
        initComponents();
    }
    int x,y;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jEliminar = new javax.swing.JButton();
        jActualizarClave = new javax.swing.JButton();
        jActualizar = new javax.swing.JButton();
        jIngresar = new javax.swing.JButton();
        jDelegacion = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        bSalir = new javax.swing.JButton();
        bMinimizar = new javax.swing.JButton();
        bRegresar1 = new javax.swing.JButton();
        lBarra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(49, 126, 247));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoVergas2.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, 110));

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Clave");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 70, -1));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 70, 30));
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 170, 30));

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Delegación");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 170, -1));

        jEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/borrar.png"))); // NOI18N
        jEliminar.setToolTipText("Borrar elemento.");
        jEliminar.setContentAreaFilled(false);
        jEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jEliminarMouseClicked(evt);
            }
        });
        jEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(jEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 50, 50, 50));

        jActualizarClave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/actualizarclave.png"))); // NOI18N
        jActualizarClave.setToolTipText("Actualizar elemento.");
        jActualizarClave.setContentAreaFilled(false);
        jActualizarClave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jActualizarClaveMouseClicked(evt);
            }
        });
        jActualizarClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jActualizarClaveActionPerformed(evt);
            }
        });
        jPanel2.add(jActualizarClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, 50, 50));

        jActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/actualizar.png"))); // NOI18N
        jActualizar.setToolTipText("Seleccionar elemento a actualizar.");
        jActualizar.setContentAreaFilled(false);
        jActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jActualizarMouseClicked(evt);
            }
        });
        jActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jActualizarActionPerformed(evt);
            }
        });
        jPanel2.add(jActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 50, 50));

        jIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/ingresar.png"))); // NOI18N
        jIngresar.setToolTipText("Ingresar elemento.");
        jIngresar.setContentAreaFilled(false);
        jIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jIngresarMouseClicked(evt);
            }
        });
        jIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIngresarActionPerformed(evt);
            }
        });
        jPanel2.add(jIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 50, 50));

        jDelegacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/condelegacion.png"))); // NOI18N
        jDelegacion.setToolTipText("Consultar delegación.");
        jDelegacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDelegacionMouseClicked(evt);
            }
        });
        jPanel2.add(jDelegacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 900, 130));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Clave", "Delegacion"
            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 840, 190));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 900, 250));

        jPanel4.setBackground(new java.awt.Color(44, 109, 212));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bSalir.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        bSalir.setForeground(new java.awt.Color(255, 255, 255));
        bSalir.setText("x");
        bSalir.setBorder(null);
        bSalir.setBorderPainted(false);
        bSalir.setContentAreaFilled(false);
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });
        jPanel4.add(bSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, 20, 20));

        bMinimizar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        bMinimizar.setForeground(new java.awt.Color(255, 255, 255));
        bMinimizar.setText("-");
        bMinimizar.setBorder(null);
        bMinimizar.setBorderPainted(false);
        bMinimizar.setContentAreaFilled(false);
        bMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMinimizarActionPerformed(evt);
            }
        });
        jPanel4.add(bMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 20, 20));

        bRegresar1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        bRegresar1.setForeground(new java.awt.Color(255, 255, 255));
        bRegresar1.setText("<");
        bRegresar1.setBorder(null);
        bRegresar1.setBorderPainted(false);
        bRegresar1.setContentAreaFilled(false);
        bRegresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegresar1ActionPerformed(evt);
            }
        });
        jPanel4.add(bRegresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, 20));

        lBarra.setFont(new java.awt.Font("Caviar Dreams", 1, 20)); // NOI18N
        lBarra.setForeground(new java.awt.Color(240, 240, 240));
        lBarra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lBarra.setText("Delegación");
        lBarra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lBarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lBarraMouseDragged(evt);
            }
        });
        lBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lBarraMousePressed(evt);
            }
        });
        jPanel4.add(lBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 40));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_bSalirActionPerformed

    private void bMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMinimizarActionPerformed
        this.setExtendedState(ICONIFIED);
        this.setExtendedState(1);
    }//GEN-LAST:event_bMinimizarActionPerformed

    private void bRegresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegresar1ActionPerformed
        new IAE_Menú().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bRegresar1ActionPerformed

    private void lBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lBarraMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_lBarraMouseDragged

    private void lBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lBarraMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_lBarraMousePressed

    private void jEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jEliminarActionPerformed

    private void jActualizarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jActualizarClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jActualizarClaveActionPerformed

    private void jActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jActualizarActionPerformed

    private void jIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIngresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jIngresarActionPerformed

    private void jDelegacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDelegacionMouseClicked
        // TODO add your handling code here:
        {                                         
        // TODO add your handling code here:
        try
    {
        
    DefaultTableModel tabla=new DefaultTableModel();
     Connection con;
     con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=patentes; user=sa; password=sasa;");
    Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery("exec DEL");
    tabla.addColumn("CLAVE");
    tabla.addColumn("DELEGACIÓN");
    while (rs.next())
    {
        Object dato[]=new Object[2];
        for (int i=0;i<2;i++)
        {
            dato[i]=rs.getString(i+1);
        }
        tabla.addRow(dato);
    }
    this.jTable1.setModel(tabla);
    }
    catch(Exception e) { }
    }
    }//GEN-LAST:event_jDelegacionMouseClicked

    private void jIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jIngresarMouseClicked
  try{
                    
                    String clave_d, nom_d;
                     
                    clave_d=jTextField1.getText();
                    nom_d=jTextField2.getText();
                    clave_d=clave_d.toUpperCase();
                    nom_d=nom_d.toUpperCase();
                    Connection con;
                    con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=patentes;user=sa;password=sasa;");
                    Statement stmt= con.createStatement();
                    ResultSet rs=stmt.executeQuery("exec i_delegacion '"+clave_d+"','"+nom_d+"'");
                    
                }
                catch(SQLException e)  {
                    
                }
jTextField1.setText("");
jTextField2.setText(""); jTextField1.setEnabled(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jIngresarMouseClicked

    private void jActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jActualizarMouseClicked
 try{      
            String clave_c;
             clave_c = jTextField1.getText();
                
         
                  Connection con;
                    con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=patentes;user=sa;password=sasa;");
                    Statement stmt= con.createStatement();
                 ResultSet rs=stmt.executeQuery("select *from delegacion where clave_del='"+clave_c+"'");
                if (rs.next()) {
                    jTextField1.setText(String.valueOf(rs.getString(1)));
                    jTextField2.setText(String.valueOf(rs.getString(2)));
                    
                                         
                    jTextField1.setEnabled(false);
                    
                    
                     
                    stmt.close();
                    
                } 
            } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
                
            }       // TODO add your handling code here:
    }//GEN-LAST:event_jActualizarMouseClicked

    private void jActualizarClaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jActualizarClaveMouseClicked
 try{
                    
                    String clave_d, nom_d;
                     
                    clave_d=jTextField1.getText();
                    nom_d=jTextField2.getText();
                    clave_d=clave_d.toUpperCase();
                    nom_d=nom_d.toUpperCase();
                    Connection con;
                    con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=patentes;user=sa;password=sasa;");
                    Statement stmt= con.createStatement();
                    ResultSet rs=stmt.executeQuery("exec act2 '"+clave_d+"','"+nom_d+"'");
                    
                }
                catch(SQLException e)  {
                    
                }
 jTextField1.setEnabled(true);
jTextField1.setText("");
jTextField2.setText("");
    }//GEN-LAST:event_jActualizarClaveMouseClicked

    private void jEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEliminarMouseClicked
 try{      
            String clave_t;
             clave_t = jTextField1.getText();
                
         
                  Connection con;
                    con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=patentes;user=sa;password=sasa;");
                    Statement stmt= con.createStatement();
                 ResultSet rs=stmt.executeQuery("exec bor2 "+clave_t+"");
        }
        catch(Exception e) {// JOptionPane.showMessageDialog(null, e);
        } jTextField1.setText("");       // TODO add your handling code here:
    }//GEN-LAST:event_jEliminarMouseClicked

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
            java.util.logging.Logger.getLogger(IAE_Delegacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IAE_Delegacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IAE_Delegacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IAE_Delegacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IAE_Delegacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bMinimizar;
    private javax.swing.JButton bRegresar1;
    private javax.swing.JButton bSalir;
    private javax.swing.JButton jActualizar;
    private javax.swing.JButton jActualizarClave;
    private javax.swing.JLabel jDelegacion;
    private javax.swing.JButton jEliminar;
    private javax.swing.JButton jIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lBarra;
    // End of variables declaration//GEN-END:variables
}

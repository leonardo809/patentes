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
public class IAE_Telefono_Ayudante extends javax.swing.JFrame {

    /**
     * Creates new form I_Telefono_Ayudante
     */
    public IAE_Telefono_Ayudante() {
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
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTel = new javax.swing.JLabel();
        jAyudante = new javax.swing.JLabel();
        jIngresar = new javax.swing.JButton();
        jEmpresa3 = new javax.swing.JLabel();
        jActualizar = new javax.swing.JButton();
        jActualizarClave = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        bSalir = new javax.swing.JButton();
        bMinimizar = new javax.swing.JButton();
        bRegresar = new javax.swing.JButton();
        lBarra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(49, 126, 247));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 120, 30));

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Numero telef??nico:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 170, 30));

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Clave del ayudante:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 190, 30));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 70, 30));
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 70, 30));

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Clave: Tipo de N??mero:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 200, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoVergas2.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, 120));

        jTel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/contel.png"))); // NOI18N
        jTel.setText("Consultar Tipo de Telefono");
        jTel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTelMouseClicked(evt);
            }
        });
        jPanel2.add(jTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 50, 50));

        jAyudante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/conayudante.png"))); // NOI18N
        jAyudante.setText("Consultar Ayudante.");
        jAyudante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jAyudanteMouseClicked(evt);
            }
        });
        jPanel2.add(jAyudante, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 50, 50));

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
        jPanel2.add(jIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, 50, 50));

        jEmpresa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/contelayu.png"))); // NOI18N
        jEmpresa3.setToolTipText("Consultar empresas.");
        jEmpresa3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jEmpresa3MouseClicked(evt);
            }
        });
        jPanel2.add(jEmpresa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 50, 50));

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
        jPanel2.add(jActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, 50, 50));

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
        jPanel2.add(jActualizarClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 950, 200));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Clave del ayudante", "Clave del Tipo Num.", "Numero Telefonico"
            }
        ));
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jScrollPane2.setViewportView(jTable2);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 870, 200));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 950, 260));

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
        jPanel4.add(bSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, 20, 20));

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
        jPanel4.add(bMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 20, 20));

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
        jPanel4.add(bRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, 20));

        lBarra.setFont(new java.awt.Font("Caviar Dreams", 1, 20)); // NOI18N
        lBarra.setForeground(new java.awt.Color(240, 240, 240));
        lBarra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lBarra.setText("Tel??fono de Ayudante");
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
        jPanel4.add(lBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 40));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 40));

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

    private void bRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegresarActionPerformed
        new IAE_Men??().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bRegresarActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void lBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lBarraMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_lBarraMouseDragged

    private void lBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lBarraMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_lBarraMousePressed

    private void jIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIngresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jIngresarActionPerformed

    private void jAyudanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAyudanteMouseClicked
        // TODO add your handling code here:
        {                                       
        // TODO add your handling code here:
        try
    {
        
    DefaultTableModel tabla=new DefaultTableModel();
     Connection con;
     con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=patentes; user=sa; password=sasa;");
    Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery("exec ayu");
    tabla.addColumn("CLAVE");
    tabla.addColumn("AYUDANTE");
    tabla.addColumn("RFC");
    tabla.addColumn("FECHA");
    tabla.addColumn("DELEGACI??N");
    tabla.addColumn("COLONIA");
    tabla.addColumn("CALLE");
    tabla.addColumn("EMPRESA");
    tabla.addColumn("INVENTOR");
    while (rs.next())
    {
        Object dato[]=new Object[9];
        for (int i=0;i<9;i++)
        {
            dato[i]=rs.getString(i+1);
        }
        tabla.addRow(dato);
    }
    this.jTable2.setModel(tabla);
    }
    catch(Exception e) { }
    }
    }//GEN-LAST:event_jAyudanteMouseClicked

    private void jTelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTelMouseClicked
 {                                  
        // TODO add your handling code here:
        try
    {
        
    DefaultTableModel tabla=new DefaultTableModel();
     Connection con;
     con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=PATENTES; user=sa; password=sasa;");
    Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery("exec TEL");
    tabla.addColumn("CLAVE");
    tabla.addColumn("TIPO DE TELEFONO");
    while (rs.next())
    {
        Object dato[]=new Object[2];
        for (int i=0;i<2;i++)
        {
            dato[i]=rs.getString(i+1);
        }
        tabla.addRow(dato);
    }
    this.jTable2.setModel(tabla);
    }
    catch(Exception e) { 
    //    JOptionPane.showMessageDialog(null,e);
    }
    }       // TODO add your handling code here:
    }//GEN-LAST:event_jTelMouseClicked

    private void jIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jIngresarMouseClicked
        // TODO add your handling code here:
        try{
                    
                    String clave_a, num, clave_T;
                     
                    clave_a=jTextField1.getText();
                    clave_T=jTextField3.getText();
                    num=jTextField2.getText();
                    clave_a=clave_a.toUpperCase();
                    clave_T=clave_T.toUpperCase();
                    num=num.toUpperCase();
                    Connection con;
                    con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=patentes;user=sa;password=sasa;");
                    Statement stmt= con.createStatement();
                    
                    ResultSet rs=stmt.executeQuery("exec i_t_ayudante " +clave_a+ "," +clave_T+ ",'" +num+ "' ");
                    
                }
                catch(SQLException e)  {
                //    JOptionPane.showMessageDialog(null, e);
    }    
        jTextField1.setText("");jTextField2.setText("");jTextField3.setText(""); jTextField1.setEnabled(true);
    }//GEN-LAST:event_jIngresarMouseClicked

    private void jEmpresa3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEmpresa3MouseClicked
        // TODO add your handling code here:
        try
        {

            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=PATENTES; user=sa; password=sasa;");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("exec AYUTEL");
            tabla.addColumn("AYUDANTE");
            tabla.addColumn("TIPO");
            tabla.addColumn("NUMERO");
            while (rs.next())
            {
                Object dato[]=new Object[3];
                for (int i=0;i<3;i++)
                {
                    dato[i]=rs.getString(i+1);
                }
                tabla.addRow(dato);
            }
            this.jTable2.setModel(tabla);
        }
        catch(Exception e) { 
        //    JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jEmpresa3MouseClicked

    private void jActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jActualizarMouseClicked
        // TODO add your handling code here:
        try{
            String clave_c, clave_a;
            clave_c = jTextField1.getText();
            clave_a=jTextField3.getText();

            Connection con;
            con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=PATENTES;user=sa;password=sasa;");
            Statement stmt= con.createStatement();
            ResultSet rs=stmt.executeQuery("select *from TELAYU where cA4=' "+clave_c+"' AND CT1= "+clave_a+"");
            if (rs.next()) {
                jTextField1.setText(String.valueOf(rs.getString(1)));
                jTextField3.setText(String.valueOf(rs.getString(2)));
                jTextField2.setText(String.valueOf(rs.getString(3)));

                jTextField3.setEnabled(false);
                jTextField1.setEnabled(false);

                stmt.close();

            }
        }
        catch (SQLException e) {
            //  JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_jActualizarMouseClicked

    private void jActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jActualizarActionPerformed

    private void jActualizarClaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jActualizarClaveMouseClicked
try{
                    
                    String clave_a, num, clave_T;
                     
                    clave_a=jTextField1.getText();
                    clave_T=jTextField3.getText();
                    num=jTextField2.getText();
                    clave_a=clave_a.toUpperCase();
                    clave_T=clave_T.toUpperCase();
                    num=num.toUpperCase();
                    Connection con;
                    con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=patentes;user=sa;password=sasa;");
                    Statement stmt= con.createStatement();
                    
                    ResultSet rs=stmt.executeQuery("exec act9 " +clave_a+ "," +clave_T+ ",'" +num+ "' ");
                    
                }
                catch(SQLException e)  {
                //    JOptionPane.showMessageDialog(null, e);
    }    
        jTextField1.setText("");jTextField2.setText("");jTextField3.setText("");jTextField1.setEnabled(true);jTextField3.setEnabled(true);
    }//GEN-LAST:event_jActualizarClaveMouseClicked

    private void jActualizarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jActualizarClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jActualizarClaveActionPerformed

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
            java.util.logging.Logger.getLogger(IAE_Telefono_Ayudante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IAE_Telefono_Ayudante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IAE_Telefono_Ayudante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IAE_Telefono_Ayudante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IAE_Telefono_Ayudante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bMinimizar;
    private javax.swing.JButton bRegresar;
    private javax.swing.JButton bSalir;
    private javax.swing.JButton jActualizar;
    private javax.swing.JButton jActualizarClave;
    private javax.swing.JLabel jAyudante;
    private javax.swing.JLabel jEmpresa3;
    private javax.swing.JButton jIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel jTel;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lBarra;
    // End of variables declaration//GEN-END:variables
}

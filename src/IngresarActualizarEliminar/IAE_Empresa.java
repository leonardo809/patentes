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
public class IAE_Empresa extends javax.swing.JFrame {

    /**
     * Creates new form I_Empresa
     */
    public IAE_Empresa() {
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

        jPanel9 = new javax.swing.JPanel();
        bMinimizar1 = new javax.swing.JButton();
        bRegresar = new javax.swing.JButton();
        bSalir1 = new javax.swing.JButton();
        lBarra = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jTextField4 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jDelegacion = new javax.swing.JLabel();
        jColonia = new javax.swing.JLabel();
        jCalle = new javax.swing.JLabel();
        jEmpresa = new javax.swing.JLabel();
        jEliminar = new javax.swing.JButton();
        jActualizarClave = new javax.swing.JButton();
        jActualizar = new javax.swing.JButton();
        jIngresar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(44, 109, 212));
        jPanel9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel9MouseDragged(evt);
            }
        });
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel9MousePressed(evt);
            }
        });
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bMinimizar1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        bMinimizar1.setForeground(new java.awt.Color(255, 255, 255));
        bMinimizar1.setText("-");
        bMinimizar1.setBorder(null);
        bMinimizar1.setBorderPainted(false);
        bMinimizar1.setContentAreaFilled(false);
        bMinimizar1.setRolloverEnabled(false);
        bMinimizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMinimizar1ActionPerformed(evt);
            }
        });
        jPanel9.add(bMinimizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 20, 20));

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
        jPanel9.add(bRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, 20));

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
        jPanel9.add(bSalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 20, 20));

        lBarra.setFont(new java.awt.Font("Caviar Dreams", 1, 20)); // NOI18N
        lBarra.setForeground(new java.awt.Color(240, 240, 240));
        lBarra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lBarra.setText("Empresa");
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
        jPanel9.add(lBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 40));

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 40));

        jPanel2.setBackground(new java.awt.Color(49, 126, 247));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Clave de calle:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 120, 30));

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Clave de delegación:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 170, 30));
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, 50, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Datos de la dirección:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 20));

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Nombre:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 80, 30));

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Clave de la empresa:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 170, 30));

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Clave de colonia:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 140, 30));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 870, 10));
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 50, 30));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 190, 30));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 50, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Datos de la empresa:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, 20));
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 50, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoVergas2.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 210, 130));

        jDelegacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/condelegacion.png"))); // NOI18N
        jDelegacion.setToolTipText("Consultar delegación.");
        jDelegacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDelegacionMouseClicked(evt);
            }
        });
        jPanel2.add(jDelegacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 50, 50));

        jColonia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/concolonia.png"))); // NOI18N
        jColonia.setToolTipText("Consultar colonia.");
        jColonia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jColoniaMouseClicked(evt);
            }
        });
        jPanel2.add(jColonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 50, 50));

        jCalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/concalle.png"))); // NOI18N
        jCalle.setToolTipText("Consultar calle.");
        jCalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCalleMouseClicked(evt);
            }
        });
        jPanel2.add(jCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, 50, 50));

        jEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/conempresa.png"))); // NOI18N
        jEmpresa.setToolTipText("Consultar empresas.");
        jEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jEmpresaMouseClicked(evt);
            }
        });
        jPanel2.add(jEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 50, 50));

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
        jPanel2.add(jEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 50, 50));

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
        jPanel2.add(jActualizarClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 50, 50));

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
        jPanel2.add(jActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 50, 50));

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
        jPanel2.add(jIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 810, 190));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Clave de la empresa", "Nombre", "Clav. Deleg", "Clav. Col.", "Clav. Calle", "Patentes", "Fecha"
            }
        ));
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jScrollPane2.setViewportView(jTable2);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 740, 180));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 800, 250));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bMinimizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMinimizar1ActionPerformed
        this.setExtendedState(ICONIFIED);
        this.setExtendedState(1);
    }//GEN-LAST:event_bMinimizar1ActionPerformed

    private void bSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalir1ActionPerformed
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_bSalir1ActionPerformed

    private void bRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegresarActionPerformed
        new IAE_Menú().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bRegresarActionPerformed

    private void jPanel9MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel9MouseDragged

    private void jPanel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel9MousePressed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

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
    this.jTable2.setModel(tabla);
    }
    catch(Exception e) { }
    }
    }//GEN-LAST:event_jDelegacionMouseClicked

    private void jEmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEmpresaMouseClicked
{                                      
        // TODO add your handling code here:
        try
    {
        
    DefaultTableModel tabla=new DefaultTableModel();
     Connection con;
     con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=patentes; user=sa; password=sasa;");
    Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery("exec EMP");
    tabla.addColumn("CLAVE");
    tabla.addColumn("EMPRESA");
    tabla.addColumn("COLONIA");
    tabla.addColumn("CALLE");
    tabla.addColumn("DELEGACION");
    
    while (rs.next())
    {
        Object dato[]=new Object[5];
        for (int i=0;i<5;i++)
        {
            dato[i]=rs.getString(i+1);
        }
        tabla.addRow(dato);
    }
    this.jTable2.setModel(tabla);
    }
    catch(Exception e) { }
    }        // TODO add your handling code here:
    }//GEN-LAST:event_jEmpresaMouseClicked

    private void jColoniaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jColoniaMouseClicked
 {                                      
        // TODO add your handling code here:
        try
    {
        
    DefaultTableModel tabla=new DefaultTableModel();
     Connection con;
     con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=patentes; user=sa; password=sasa;");
    Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery("exec col");
    tabla.addColumn("CLAVE");
    tabla.addColumn("COLONIA");
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
    catch(Exception e) { }
    }       // TODO add your handling code here:
    }//GEN-LAST:event_jColoniaMouseClicked

    private void jCalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCalleMouseClicked
 {                                    
        // TODO add your handling code here:
        try
    {
        
    DefaultTableModel tabla=new DefaultTableModel();
     Connection con;
     con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=PATENTES; user=sa; password=sasa;");
    Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery("exec CAL");
    tabla.addColumn("CLAVE");
    tabla.addColumn("CALLE");
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
    catch(Exception e) { }
    }       // TODO add your handling code here:
    }//GEN-LAST:event_jCalleMouseClicked

    private void jIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jIngresarMouseClicked
try{
                    
                    String clave_e, nom_e, ce, cce, de;
                     
                    clave_e=jTextField1.getText();
                    nom_e=jTextField3.getText();
                    ce=jTextField4.getText();
                    cce=jTextField5.getText();
                    de=jTextField2.getText();
                    clave_e=clave_e.toUpperCase();
                    nom_e=nom_e.toUpperCase();
                    ce=ce.toUpperCase();
                    cce=cce.toUpperCase();
                    de=de.toUpperCase();
                    Connection con;
                    con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=patentes;user=sa;password=sasa;");
                    Statement stmt= con.createStatement();
                    ResultSet rs=stmt.executeQuery("exec i_mpres1 '"+clave_e+"','"+nom_e+"','"+ce+"','"+cce+"','"+de+"'");
                    
                }
                catch(SQLException e)  {
                    
                }  jTextField2.setText("");jTextField4.setText("");jTextField1.setText("");jTextField3.setText("");jTextField5.setText("");
                jTextField1.setEnabled(true);// TODO add your handling code here:
    }//GEN-LAST:event_jIngresarMouseClicked

    private void jActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jActualizarMouseClicked
 try{      
            String clave_c;
             clave_c = jTextField1.getText();
                
         
                  Connection con;
                    con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=patentes;user=sa;password=sasa;");
                    Statement stmt= con.createStatement();
                 ResultSet rs=stmt.executeQuery("select *from empresa where clave_em='"+clave_c+"'");
                if (rs.next()) {
                    jTextField1.setText(String.valueOf(rs.getString(1)));
                    jTextField3.setText(String.valueOf(rs.getString(2)));
                    jTextField4.setText(String.valueOf(rs.getString(3)));
                    jTextField5.setText(String.valueOf(rs.getString(4)));
                    jTextField2.setText(String.valueOf(rs.getString(5)));
                    
                                         
                    jTextField1.setEnabled(false);
                     
                    stmt.close();
                    
                } 
            } 
        catch (SQLException e) {
     //       JOptionPane.showMessageDialog(null, e);
                
            }       // TODO add your handling code here:
    }//GEN-LAST:event_jActualizarMouseClicked

    private void jActualizarClaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jActualizarClaveMouseClicked
try{
                    
                    String clave_e, nom_e, ce, cce, de;
                     
                    clave_e=jTextField1.getText();
                    nom_e=jTextField3.getText();
                    ce=jTextField4.getText();
                    cce=jTextField5.getText();
                    de=jTextField2.getText();
                    clave_e=clave_e.toUpperCase();
                    nom_e=nom_e.toUpperCase();
                    ce=ce.toUpperCase();
                    cce=cce.toUpperCase();
                    de=de.toUpperCase();
                    Connection con;
                    con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=patentes;user=sa;password=sasa;");
                    Statement stmt= con.createStatement();
                    ResultSet rs=stmt.executeQuery("exec act5 '"+clave_e+"','"+nom_e+"','"+ce+"','"+cce+"','"+de+"'");
                    
                }
                catch(SQLException e)  {
                    
                }  jTextField1.setEnabled(true);jTextField2.setText("");jTextField4.setText("");jTextField1.setText("");jTextField3.setText("");jTextField5.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jActualizarClaveMouseClicked

    private void jEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEliminarMouseClicked
 try{      
            String clave_t;
             clave_t = jTextField1.getText();
                
         
                  Connection con;
                    con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=patentes;user=sa;password=sasa;");
                    Statement stmt= con.createStatement();
                 ResultSet rs=stmt.executeQuery("exec bor5 "+clave_t+"");
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
            java.util.logging.Logger.getLogger(IAE_Empresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IAE_Empresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IAE_Empresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IAE_Empresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IAE_Empresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bMinimizar1;
    private javax.swing.JButton bRegresar;
    private javax.swing.JButton bSalir1;
    private javax.swing.JButton jActualizar;
    private javax.swing.JButton jActualizarClave;
    private javax.swing.JLabel jCalle;
    private javax.swing.JLabel jColonia;
    private javax.swing.JLabel jDelegacion;
    private javax.swing.JButton jEliminar;
    private javax.swing.JLabel jEmpresa;
    private javax.swing.JButton jIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel lBarra;
    // End of variables declaration//GEN-END:variables
}

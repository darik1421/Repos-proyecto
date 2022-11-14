/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package Controlador;

import Vista.*;
/**
 *
 * @author gonzalez
 */
public class SistemaRegistrosMDI extends javax.swing.JFrame {
  
     private JInternalFrameEmpleado Empleados;
     private JInternalFrameCliente Clientes;
     private JInternalFrameProducto Productos;
     private JInternalFrameProveedor Proveedores;
     private JInternalFrameCompra Compras;
     private JInternalFrameServicio Servicios;
     private JInternalFrameVenta Ventas;

    public SistemaRegistrosMDI() {
        initComponents();
        setTitle("Registros");
        Empleados=new JInternalFrameEmpleado();
        desktopPane.add(Empleados);
        Clientes=new JInternalFrameCliente();
        desktopPane.add(Clientes);
        Productos=new JInternalFrameProducto();
        desktopPane.add(Productos);
        Proveedores=new JInternalFrameProveedor();
        desktopPane.add(Proveedores);
        Compras=new JInternalFrameCompra();
        desktopPane.add(Compras);
        Servicios=new JInternalFrameServicio();
        desktopPane.add(Servicios);
        Ventas=new JInternalFrameVenta();
        desktopPane.add(Ventas);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        verEmpleadoMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        verClienteMenuItem = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        verProveedorMenuItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        verProductoMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        verServicioMenuItem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        verCompraMenuItem = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        verVentaMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 494, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Empleado");

        verEmpleadoMenuItem.setMnemonic('t');
        verEmpleadoMenuItem.setText("Ver Empleados");
        verEmpleadoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verEmpleadoMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(verEmpleadoMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Cliente");

        verClienteMenuItem.setMnemonic('c');
        verClienteMenuItem.setText("Ver Clientes");
        verClienteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verClienteMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(verClienteMenuItem);

        menuBar.add(helpMenu);

        jMenu4.setText("Proveedor");

        verProveedorMenuItem.setText("Ver Proveedores");
        verProveedorMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verProveedorMenuItemActionPerformed(evt);
            }
        });
        jMenu4.add(verProveedorMenuItem);

        menuBar.add(jMenu4);

        jMenu1.setText("Producto");

        verProductoMenuItem.setText("Ver Productos");
        verProductoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verProductoMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(verProductoMenuItem);

        menuBar.add(jMenu1);

        jMenu2.setText("Servicio");

        verServicioMenuItem.setText("Ver Servicios");
        verServicioMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verServicioMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(verServicioMenuItem);

        menuBar.add(jMenu2);

        jMenu3.setText("Compra");

        verCompraMenuItem.setText("Ver Compras");
        verCompraMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verCompraMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(verCompraMenuItem);

        menuBar.add(jMenu3);

        jMenu5.setText("Venta");

        verVentaMenuItem.setText("Ver Ventas");
        verVentaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verVentaMenuItemActionPerformed(evt);
            }
        });
        jMenu5.add(verVentaMenuItem);

        menuBar.add(jMenu5);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void verEmpleadoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verEmpleadoMenuItemActionPerformed
       Empleados.obtenerDatos();
       Empleados.setVisible(true);
    }//GEN-LAST:event_verEmpleadoMenuItemActionPerformed

    private void verClienteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verClienteMenuItemActionPerformed
       Clientes.obtenerDatos();
       Clientes.setVisible(true);
    }//GEN-LAST:event_verClienteMenuItemActionPerformed

    private void verProveedorMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verProveedorMenuItemActionPerformed
        Proveedores.obtenerDatos();
        Proveedores.setVisible(true);
    }//GEN-LAST:event_verProveedorMenuItemActionPerformed

    private void verProductoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verProductoMenuItemActionPerformed
        Productos.obtenerDatos();
        Productos.setVisible(true);
    }//GEN-LAST:event_verProductoMenuItemActionPerformed

    private void verServicioMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verServicioMenuItemActionPerformed
        Servicios.obtenerDatos();
        Servicios.setVisible(true);
    }//GEN-LAST:event_verServicioMenuItemActionPerformed

    private void verCompraMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verCompraMenuItemActionPerformed
       Compras.obtenerDatos();
       Compras.setVisible(true);
    }//GEN-LAST:event_verCompraMenuItemActionPerformed

    private void verVentaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verVentaMenuItemActionPerformed
       Ventas.obtenerDatos();
       Ventas.setVisible(true);
    }//GEN-LAST:event_verVentaMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(SistemaRegistrosMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemaRegistrosMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemaRegistrosMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemaRegistrosMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemaRegistrosMDI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JMenuItem verClienteMenuItem;
    private javax.swing.JMenuItem verCompraMenuItem;
    private javax.swing.JMenuItem verEmpleadoMenuItem;
    private javax.swing.JMenuItem verProductoMenuItem;
    private javax.swing.JMenuItem verProveedorMenuItem;
    private javax.swing.JMenuItem verServicioMenuItem;
    private javax.swing.JMenuItem verVentaMenuItem;
    // End of variables declaration//GEN-END:variables

}

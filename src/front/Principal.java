/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package front;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lexico.AnalisisLexico;

/**
 *
 * @author Milton
 */
public class Principal extends javax.swing.JFrame {
    private Editor editor;
    private File archivoSalida;
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jFileChooser1 = new javax.swing.JFileChooser();
        jToolBar1 = new javax.swing.JToolBar();
        btnNuevo = new javax.swing.JButton();
        btnAbrir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnGuardarComo = new javax.swing.JButton();
        btnGuardarTodo = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnCerrarTodo = new javax.swing.JButton();
        btnCompilar = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        tpnFuentes = new javax.swing.JTabbedPane();
        tpnSalidas = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itmNuevo = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        btnNuevo.setText("Nuevo Archivo");
        btnNuevo.setFocusable(false);
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNuevo);

        btnAbrir.setText("Abrir");
        btnAbrir.setFocusable(false);
        btnAbrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAbrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAbrir);

        btnGuardar.setText("Guardar");
        btnGuardar.setFocusable(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGuardar);

        btnGuardarComo.setText("Guardar como");
        btnGuardarComo.setFocusable(false);
        btnGuardarComo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardarComo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarComoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGuardarComo);

        btnGuardarTodo.setText("Guardar todo");
        btnGuardarTodo.setFocusable(false);
        btnGuardarTodo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardarTodo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarTodoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGuardarTodo);

        btnCerrar.setText("Cerrar");
        btnCerrar.setFocusable(false);
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCerrar);

        btnCerrarTodo.setText("Cerrar todo");
        btnCerrarTodo.setFocusable(false);
        btnCerrarTodo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrarTodo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCerrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarTodoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCerrarTodo);

        btnCompilar.setText("Ejecutar");
        btnCompilar.setFocusable(false);
        btnCompilar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCompilar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCompilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompilarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCompilar);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jSplitPane1.setLeftComponent(tpnFuentes);
        jSplitPane1.setRightComponent(tpnSalidas);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("File");

        itmNuevo.setMnemonic('N');
        itmNuevo.setText("Nuevo");
        itmNuevo.setToolTipText("");
        itmNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmNuevoActionPerformed(evt);
            }
        });
        jMenu1.add(itmNuevo);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itmNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmNuevoActionPerformed
        jFileChooser1.showSaveDialog(this);
        File archivo = jFileChooser1.getSelectedFile();
        editor = new Editor(archivo);
        tpnFuentes.addTab(archivo.getName(), editor);
        tpnFuentes.setSelectedComponent(editor);
    }//GEN-LAST:event_itmNuevoActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        jFileChooser1.showSaveDialog(this);
        File archivo = jFileChooser1.getSelectedFile();
        if(!archivo.exists()){
        editor = new Editor(archivo);
        tpnFuentes.addTab(archivo.getName(), editor);
        tpnFuentes.setSelectedComponent(editor);
        }else{
           JOptionPane.showMessageDialog(this, "No fue posible crear el archivo");
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarComoActionPerformed
        if(editor == null){
          //No hace nada para que no tenga errores al presionar el boton sin tener ni una pestaña abierta. 
       } else{
            int response = jFileChooser1.showSaveDialog(this);
            if (response == jFileChooser1.APPROVE_OPTION) {
                File archivo = jFileChooser1.getSelectedFile();
                if (!archivo.exists()) {
                    saveAs(archivo, false);
                } else {
                    String[] options = {"Si", "No"};
                    int x = JOptionPane.showOptionDialog(this, "¿Desea continuar?, Se sobreescribira la informacion y se perdera de forma permante",
                            "¿Desea reemplazar el archivo " + archivo.getName() + "?",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
                    switch (x) {
                        case 0:
                            saveAs(archivo, true);
                            break;
                        case 1:
                        default:
                            break;
                    }

                }
            }
        }
    }//GEN-LAST:event_btnGuardarComoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       editor = (Editor) tpnFuentes.getSelectedComponent();
       if(editor == null){
          //No hace nada para que no tenga errores al presionar el boton sin tener ni una pestaña abierta. 
       }else{
        try {
            editor.guardar();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        
        editor = (Editor) tpnFuentes.getSelectedComponent();
        if(editor == null){
          //No hace nada para que no tenga errores al presionar el boton sin tener ni una pestaña abierta. 
       }else{
        File archivo = editor.getarchivo();
         
        int SelectOption = JOptionPane.showConfirmDialog(this, "Deseas guardar " + archivo.getName() +  " antes de cerrar?");
        //verificar si desea guardar o no
        switch (SelectOption) {
            case 0:   
            {
                try {
                    editor.guardar();
                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
                tpnFuentes.remove(editor);
            }
                break;
            case 1:
                tpnFuentes.remove(editor);
                break;
            case 2:
                return;
            default:
                return;
        }
        }
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnCerrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarTodoActionPerformed
        if(editor == null){
          //No hace nada para que no tenga errores al presionar el boton sin tener ni una pestaña abierta. 
       }else{
        while (tpnFuentes.getComponentCount() > 0) {
         editor = (Editor) tpnFuentes.getComponent(0);
         File archivo = editor.getarchivo();
         
        int SelectOption = JOptionPane.showConfirmDialog(this, "Deseas guardar " + archivo.getName() +  " antes de cerrar?");
        //verificar si desea guardar o no
        switch (SelectOption) {
            case 0:   
            {
                try {
                    editor.guardar();
                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
                tpnFuentes.remove(editor);
            }
                break;
            case 1:
                tpnFuentes.remove(editor);
                break;
            case 2:
                return;
            default:
                return;
        }
        }
        }
    }//GEN-LAST:event_btnCerrarTodoActionPerformed

    private void btnGuardarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTodoActionPerformed
        for(int i = 0; i < tpnFuentes.getComponentCount(); i++){
            editor = (Editor)tpnFuentes.getComponent(i);
            try {
                editor.guardar();
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }  
    }//GEN-LAST:event_btnGuardarTodoActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
       int response =  jFileChooser1.showOpenDialog(this);
        if (response == jFileChooser1.APPROVE_OPTION) {
            File archivo = jFileChooser1.getSelectedFile();
            boolean opened = false;
            for (int i = 0; i < tpnFuentes.getComponentCount(); i++) {
                Editor editor = (Editor) tpnFuentes.getComponentAt(i);
                String comparation1 = editor.getArchivo().getPath();
                String comparation2 = archivo.getPath();
                if (comparation2.equals(comparation1)) {
                    opened = true;
                }
            }
            if (archivo.exists() && opened == false) {
                editor = new Editor(archivo);
                try {
                    editor.abrir(archivo);
                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
                tpnFuentes.addTab(archivo.getName(), editor);
                tpnFuentes.setSelectedComponent(editor);
            } else {
                JOptionPane.showMessageDialog(this, "No se puede abrir el archivo o ya esta abierto");

            }

        }    
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnCompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompilarActionPerformed
    if (tpnFuentes.getSelectedIndex() != -1) {
            editor = (Editor) tpnFuentes.getSelectedComponent();

            if (editor.getarchivo().getName().endsWith(".txt")) {
                String output = AnalisisLexico.analyze(editor.getArchivo());
                archivoSalida = new File("src/archivos/Resultado");

                if (archivoSalida != null) {
                    if(archivoSalida.exists()) {
                        archivoSalida.delete();
                        archivoSalida = new File("src/archivos/Resultado");
                    }
                    
                    if (!archivoSalida.exists()) {
                        if(tpnSalidas.getComponentCount() > 1) {
                            tpnSalidas.remove(1);
                        }
                        editor = new Editor(archivoSalida);
                        editor.txaContenido.setText(output);
                        try {
                            editor.abrir(archivoSalida);
                        } catch (IOException ex) {
                            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        tpnSalidas.addTab(archivoSalida.getName(), editor);
                        tpnSalidas.setSelectedComponent(editor);
                    } else {
                        editor = new Editor(archivoSalida);
                        editor.txaContenido.setText(output);
                        try {
                            editor.abrir(archivoSalida);
                        } catch (IOException ex) {
                            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        tpnSalidas.setSelectedComponent(editor);
                    }
                    
                    editor.fileOutputWriter(editor.txaContenido.getText());
                }
            } else {
                JOptionPane.showMessageDialog(this, "Por favor seleccione un archivo valido, con extension .txt!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor seleccione un archivo antes de correr su archivo!");
        }
    }//GEN-LAST:event_btnCompilarActionPerformed
    
    public void saveAs(File archivo, boolean remove) {
        editor = (Editor) tpnFuentes.getSelectedComponent();
        String archivoTxt = editor.getText();
        editor = new Editor(archivo);
        editor.setText(archivoTxt);
        try {
            editor.guardar();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (remove == true) {
            tpnFuentes.remove(tpnFuentes.getSelectedComponent());
        }
        tpnFuentes.add(editor.getArchivo().getName(), editor);
        tpnFuentes.setSelectedComponent(editor);
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnCerrarTodo;
    private javax.swing.JButton btnCompilar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarComo;
    private javax.swing.JButton btnGuardarTodo;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JMenuItem itmNuevo;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTabbedPane tpnFuentes;
    private javax.swing.JTabbedPane tpnSalidas;
    // End of variables declaration//GEN-END:variables
}

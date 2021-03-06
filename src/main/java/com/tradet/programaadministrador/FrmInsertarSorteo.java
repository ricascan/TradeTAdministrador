/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tradet.programaadministrador;

import com.tradet.excepciones.ExcepcionTradeT;

import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class FrmInsertarSorteo extends javax.swing.JFrame {

    /**
     * Creates new form FrmInsertarSorteo
     */
    public FrmInsertarSorteo() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        pnlDatos = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblDescripcion = new javax.swing.JLabel();
        scpDescripcion = new javax.swing.JScrollPane();
        txaDescripcion = new javax.swing.JTextArea();
        btnInsertar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(921, 562));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(3, 1, 0, 20));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Insertar Sorteo");
        getContentPane().add(lblTitulo);

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblNombre.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        lblDescripcion.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblDescripcion.setText("Descripción:");

        txaDescripcion.setColumns(20);
        txaDescripcion.setRows(5);
        scpDescripcion.setViewportView(txaDescripcion);

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombre))
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addComponent(lblDescripcion)
                        .addGap(18, 18, 18)
                        .addComponent(scpDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addComponent(lblDescripcion)
                        .addGap(0, 49, Short.MAX_VALUE))
                    .addComponent(scpDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(pnlDatos);

        btnInsertar.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsertar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        if(!txtNombre.getText().trim().equals("") && !txaDescripcion.getText().equals("")){
            String nombre = txtNombre.getText();
            String descripcion = txaDescripcion.getText();
            if(nombre.length() <= 20 && descripcion.length() <= 100){
                ComunicacionServidor comunicacionServidor = new ComunicacionServidor();
                Sorteo sorteo = new Sorteo(nombre, descripcion);
                try {
                    comunicacionServidor.insertarSorteo(sorteo);
                    JOptionPane.showMessageDialog(this,
                    "Sorteo insertado correctamente.");
                } catch (ExcepcionTradeT ex) {
                    JOptionPane.showMessageDialog(this,
                    ex.getMensajeUsuario(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(this,
                    "La longitud máxima del nombre es de 20 caracteres y la de la descripción es de 100 caracteres.");
            }
        }else{
            JOptionPane.showMessageDialog(this,
                    "Ningún campo puede estar vacío.");
        }
    }//GEN-LAST:event_btnInsertarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsertar;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JScrollPane scpDescripcion;
    private javax.swing.JTextArea txaDescripcion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}

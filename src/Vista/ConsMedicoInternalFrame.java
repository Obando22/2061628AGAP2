/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author david
 */
public class ConsMedicoInternalFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsMedicoInternalFrame
     */
    public ConsMedicoInternalFrame() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        rdb_identificacion = new javax.swing.JRadioButton();
        rdb_nombres = new javax.swing.JRadioButton();
        rdb_apellidos = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txt_valor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_datos = new javax.swing.JTable();

        setTitle("CONSULTAR MÉDICOS");

        buttonGroup1.add(rdb_identificacion);
        rdb_identificacion.setText("Identificación");
        rdb_identificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_identificacionActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdb_nombres);
        rdb_nombres.setText("Nombres");

        buttonGroup1.add(rdb_apellidos);
        rdb_apellidos.setText("Apellidos");

        jLabel1.setText("Valor a buscar:");

        jButton1.setText("Aceptar");

        Tbl_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Tbl_datos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_valor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(rdb_identificacion)
                        .addGap(18, 18, 18)
                        .addComponent(rdb_nombres)
                        .addGap(27, 27, 27)
                        .addComponent(rdb_apellidos))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdb_identificacion)
                    .addComponent(rdb_nombres)
                    .addComponent(rdb_apellidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdb_identificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_identificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdb_identificacionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable Tbl_datos;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JRadioButton rdb_apellidos;
    public javax.swing.JRadioButton rdb_identificacion;
    public javax.swing.JRadioButton rdb_nombres;
    public javax.swing.JTextField txt_valor;
    // End of variables declaration//GEN-END:variables
}


package vista;


import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class ConsPacienteInternalFrame extends javax.swing.JInternalFrame {
        private Controlador.GestorPacienteControl gestorpacientesControl;
    private DefaultTableModel tabla;

    public ConsPacienteInternalFrame() throws SQLException 
    {
        initComponents();
        gestorpacientesControl=new Controlador.GestorPacienteControl (this);
        String titulosTabla[]={"Identificacion","Nombres","Apellidos","Fecha nacimiento","sexo"};
        tabla = new DefaultTableModel(null, titulosTabla);
        tbl_Datos.setModel(tabla);
        btn_Aceptar.addActionListener(gestorpacientesControl);//
    }
        public DefaultTableModel getTableModel()
        {
        return tabla;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenuItem1 = new javax.swing.JMenuItem();
        buttonGroup2 = new javax.swing.ButtonGroup();
        rbd_Identificacion = new javax.swing.JRadioButton();
        rbd_Nombres = new javax.swing.JRadioButton();
        rbd_Apellidos = new javax.swing.JRadioButton();
        rbd_Sexo = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txt_Valor = new javax.swing.JTextField();
        btn_Aceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Datos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jMenuItem1.setText("jMenuItem1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        buttonGroup1.add(rbd_Identificacion);
        rbd_Identificacion.setText("Identificación");

        buttonGroup1.add(rbd_Nombres);
        rbd_Nombres.setText("Nombres");

        buttonGroup1.add(rbd_Apellidos);
        rbd_Apellidos.setText("Apellidos");

        buttonGroup1.add(rbd_Sexo);
        rbd_Sexo.setText("Sexo");

        jLabel1.setText("Valor a buscar");

        txt_Valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ValorActionPerformed(evt);
            }
        });

        btn_Aceptar.setText("Aceptar");

        tbl_Datos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_Datos);

        jLabel2.setText("Consulta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbd_Identificacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbd_Nombres)
                                .addGap(18, 18, 18)
                                .addComponent(rbd_Apellidos)
                                .addGap(18, 18, 18)
                                .addComponent(rbd_Sexo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Aceptar)))
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbd_Identificacion)
                    .addComponent(rbd_Nombres)
                    .addComponent(rbd_Apellidos)
                    .addComponent(rbd_Sexo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Aceptar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_ValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ValorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_Aceptar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    public javax.swing.JRadioButton rbd_Apellidos;
    public javax.swing.JRadioButton rbd_Identificacion;
    public javax.swing.JRadioButton rbd_Nombres;
    public javax.swing.JRadioButton rbd_Sexo;
    private javax.swing.JTable tbl_Datos;
    public javax.swing.JTextField txt_Valor;
    // End of variables declaration//GEN-END:variables
}


package GUI;

import Controller.BabelTower;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class Interfaz extends javax.swing.JFrame {

    
    private final JFileChooser fileChooserInitialConfiguration = new JFileChooser();
    private final JFileChooser fileChooserFinalConfiguration = new JFileChooser();
    private BabelTower controller = new BabelTower();
    public Interfaz() {
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

        jLabel1 = new javax.swing.JLabel();
        TxtFieldRutaInicial = new javax.swing.JTextField();
        BotonBuscarTxtInicial = new javax.swing.JButton();
        LabelConfiguracionInicial = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TextoConfiguracionInicial = new javax.swing.JTextArea();
        BotonBuscarSolucion = new javax.swing.JButton();
        BotonGuardarTxt = new javax.swing.JButton();
        LabelConfiguracionFinal = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TextoConfiguracionFinal = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Cargar desde archivo:");

        BotonBuscarTxtInicial.setText("Buscar");
        BotonBuscarTxtInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarTxtInicialActionPerformed(evt);
            }
        });

        LabelConfiguracionInicial.setText("Configuración Inicial");

        TextoConfiguracionInicial.setColumns(20);
        TextoConfiguracionInicial.setRows(5);
        jScrollPane3.setViewportView(TextoConfiguracionInicial);

        BotonBuscarSolucion.setText("Buscar Solución");
        BotonBuscarSolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarSolucionActionPerformed(evt);
            }
        });

        BotonGuardarTxt.setText("Guardar en Txt Config 1");
        BotonGuardarTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarTxtActionPerformed(evt);
            }
        });

        LabelConfiguracionFinal.setText("Configuración Final");

        TextoConfiguracionFinal.setColumns(20);
        TextoConfiguracionFinal.setRows(5);
        jScrollPane4.setViewportView(TextoConfiguracionFinal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(LabelConfiguracionInicial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelConfiguracionFinal)
                .addGap(159, 159, 159))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtFieldRutaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(BotonBuscarTxtInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonGuardarTxt)
                        .addGap(170, 170, 170)
                        .addComponent(BotonBuscarSolucion))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtFieldRutaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonBuscarTxtInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelConfiguracionInicial)
                    .addComponent(LabelConfiguracionFinal))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonGuardarTxt)
                            .addComponent(BotonBuscarSolucion)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonBuscarTxtInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarTxtInicialActionPerformed
        try {    
            int res = fileChooserInitialConfiguration.showDialog(Interfaz.this, "Abrir archivo");
            File file = fileChooserInitialConfiguration.getSelectedFile();
            String path = file.getPath();

            TxtFieldRutaInicial.setText(path);

            String Configuration=controller.ReadTxt(file);         
            String[] matrix = Configuration.trim().split(";");//separo en dos matrices
            TextoConfiguracionInicial.setText(matrix[0].trim());
            TextoConfiguracionFinal.setText(matrix[1].trim());
        } catch (Exception e) {
            
        }
        
    }//GEN-LAST:event_BotonBuscarTxtInicialActionPerformed

    private void BotonBuscarSolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarSolucionActionPerformed
        if(TextoConfiguracionInicial.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Debe ingresar la configuración inicial.","Error",JOptionPane.ERROR_MESSAGE);
        }
        if(TextoConfiguracionFinal.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Debe ingresar la configuración final.","Error",JOptionPane.ERROR_MESSAGE);
        }
        if(!TextoConfiguracionInicial.getText().isEmpty() ){
            boolean [] IsValid=controller.ConvertMatrix(TextoConfiguracionInicial.getText(),TextoConfiguracionFinal.getText());
            if(IsValid[0]==false){
                JOptionPane.showMessageDialog(this,"La configuración inicial no es válida.","Error",JOptionPane.ERROR_MESSAGE);
            }
            if(IsValid[1]==false){
                JOptionPane.showMessageDialog(this,"La configuración final no es válida.","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_BotonBuscarSolucionActionPerformed

    private void BotonGuardarTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarTxtActionPerformed
        controller.WriteTxt(TextoConfiguracionFinal.getText());
        JOptionPane.showMessageDialog(this,"Se ha guardado la configuración en BabelTower.txt","Éxito",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_BotonGuardarTxtActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
    
    
    /*private void analizarTexto() throws IOException {
        /*File file = new File("Input.txt"); /*Crea un archivo de texto, es donde se almacena el resultado
        PrintWriter writer;
        try {
            writer = new PrintWriter(file);
            writer.print(TextoConfiguracionFinal.getText()); /*Escribe lo que quiero scanear
            writer.close();
        } catch (Exception e) {
        }
        BufferedReader reader = new BufferedReader(new FileReader(file));
        
        String result = "";
        String error="";
        

    }*/
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscarSolucion;
    private javax.swing.JButton BotonBuscarTxtInicial;
    private javax.swing.JButton BotonGuardarTxt;
    private javax.swing.JLabel LabelConfiguracionFinal;
    private javax.swing.JLabel LabelConfiguracionInicial;
    private javax.swing.JTextArea TextoConfiguracionFinal;
    private javax.swing.JTextArea TextoConfiguracionInicial;
    private javax.swing.JTextField TxtFieldRutaInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}

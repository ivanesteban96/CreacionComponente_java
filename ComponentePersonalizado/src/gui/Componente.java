/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author IvánEstebanBenedicto
 */
public class Componente extends javax.swing.JPanel {

    public Componente() {
        initComponents();
    }

    public String tipoValidacion;
    
    public String getTipoValidacion(){
        return tipoValidacion;
    }
    
    public void setTipoValidacion(String tipoValidacion){
        this.tipoValidacion=tipoValidacion;
    }
    
    public void validar(){
        
        switch(tipoValidacion)
        {
            case("telefono"):
              
              if(textField1.getText().length()==0)
              { 
               jLabel1.setText("el numero esta vacio");
              }
              break;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textField1 = new java.awt.TextField();
        jLabel1 = new javax.swing.JLabel();

        textField1.setText("textField1");
        textField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textField1FocusLost(evt);
            }
        });

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textField1FocusLost
        validar();
    }//GEN-LAST:event_textField1FocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables
}

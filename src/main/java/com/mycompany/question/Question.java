/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.question;

import java.io.Serializable;

/**
 *
 * @author Alumno Tarde
 */
public class Question extends javax.swing.JPanel implements Serializable{

    /**
     * Creates new form Question
     */
    public Question(String enun, String pre1, String pre2, String pre3, String sol, int num) {
        initComponents();
        numeroPreg.setText(String.valueOf(num));
        //45
        enunciado.setText("<html>" + enun + "</html>");
        //50
        rBRespuesta1.setText("<html>" + pre1 + "</html>");
        rBRespuesta2.setText("<html>" + pre2 + "</html>");
        rBRespuesta3.setText("<html>" + pre3 + "</html>");
        rBRespuesta4.setText("<html>" + sol + "</html>");

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
        rBRespuesta1 = new javax.swing.JRadioButton();
        rBRespuesta2 = new javax.swing.JRadioButton();
        rBRespuesta3 = new javax.swing.JRadioButton();
        rBRespuesta4 = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        numeroPreg = new javax.swing.JLabel();
        enunciado = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(400, 305));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(400, 305));
        setRequestFocusEnabled(false);

        buttonGroup1.add(rBRespuesta1);
        rBRespuesta1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        rBRespuesta1.setText("Respuesta 1");

        buttonGroup1.add(rBRespuesta2);
        rBRespuesta2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        rBRespuesta2.setText("Respuesta 2");

        buttonGroup1.add(rBRespuesta3);
        rBRespuesta3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        rBRespuesta3.setText("Respuesta 3");

        buttonGroup1.add(rBRespuesta4);
        rBRespuesta4.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        rBRespuesta4.setText("Respuesta 4");

        numeroPreg.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        numeroPreg.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        numeroPreg.setText("1.");

        enunciado.setText("<html><p>Texto de la pregunta que es totalmente aleatorio ahdjajij  iajasij dijwi wij diwjdiwjdio jao ddijdiwa woijd iwioajdoajidjwijdiwad</p> </html>");
        enunciado.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        enunciado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(numeroPreg, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(enunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rBRespuesta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rBRespuesta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rBRespuesta3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rBRespuesta4, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(numeroPreg, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(enunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rBRespuesta1)
                .addGap(18, 18, 18)
                .addComponent(rBRespuesta2)
                .addGap(18, 18, 18)
                .addComponent(rBRespuesta3)
                .addGap(18, 18, 18)
                .addComponent(rBRespuesta4)
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public String preguntaEscogida() {
        String pregunta = "";
        if (rBRespuesta1.isSelected()) {
            pregunta = rBRespuesta1.getText();
        } else if (rBRespuesta2.isSelected()) {
            pregunta = rBRespuesta2.getText();
        } else if (rBRespuesta3.isSelected()) {
            pregunta = rBRespuesta3.getText();   
        } else if (rBRespuesta4.isSelected()) {
            pregunta = rBRespuesta4.getText();
        }
        return pregunta;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel enunciado;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel numeroPreg;
    private javax.swing.JRadioButton rBRespuesta1;
    private javax.swing.JRadioButton rBRespuesta2;
    private javax.swing.JRadioButton rBRespuesta3;
    private javax.swing.JRadioButton rBRespuesta4;
    // End of variables declaration//GEN-END:variables
}

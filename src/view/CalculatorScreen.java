/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.MainController;

/**
 *
 * @author Luiz Rossa
 */
public class CalculatorScreen extends javax.swing.JFrame 
{
    private float firstNumber, secondNumber, result;
    private String operation;
    /**
     * Creates new form CalculatorScreen
     */
    public CalculatorScreen() 
    {
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

        jPanel1 = new javax.swing.JPanel();
        textFirstNumber = new javax.swing.JTextField();
        textSecondNumber = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSum = new javax.swing.JButton();
        btnSubtraction = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        textResult = new javax.swing.JTextField();
        btnMultiplication = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textFirstNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFirstNumberActionPerformed(evt);
            }
        });

        jLabel1.setText("Informe o primeiro número");

        jLabel2.setText("Informe o segundo número");

        jLabel3.setText("Escolha a operação");

        btnSum.setText("+");
        btnSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumActionPerformed(evt);
            }
        });

        btnSubtraction.setText("-");
        btnSubtraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtractionActionPerformed(evt);
            }
        });

        jLabel4.setText("Resultado");

        btnMultiplication.setText("x");
        btnMultiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicationActionPerformed(evt);
            }
        });

        btnDivision.setText("/");
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(textResult, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnSum)
                                    .addComponent(btnMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDivision)
                                    .addComponent(btnSubtraction))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textFirstNumber)
                                .addComponent(textSecondNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(btnReset))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFirstNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(textSecondNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSum)
                    .addComponent(btnSubtraction))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMultiplication)
                    .addComponent(btnDivision))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReset)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFirstNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFirstNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFirstNumberActionPerformed

    private void btnSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumActionPerformed
        // TODO add your handling code here:
        getTextView();
        operation = "sum";
        MainController.getInstance().sum(firstNumber, secondNumber, operation);
        MainController.getInstance().result(operation);
    }//GEN-LAST:event_btnSumActionPerformed

    private void btnSubtractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtractionActionPerformed
        // TODO add your handling code here:
        getTextView();
        operation = "subtraction";
        MainController.getInstance().subtraction(firstNumber, secondNumber, operation);
        MainController.getInstance().result(operation);
    }//GEN-LAST:event_btnSubtractionActionPerformed

    private void btnMultiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicationActionPerformed
        // TODO add your handling code here:
        getTextView();
        operation = "multiplication";
        MainController.getInstance().multiplication(firstNumber, secondNumber, operation);
        MainController.getInstance().result(operation);
    }//GEN-LAST:event_btnMultiplicationActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        // TODO add your handling code here:
        getTextView();
        operation = "division";
        MainController.getInstance().division(firstNumber, secondNumber, operation);
        MainController.getInstance().result(operation);
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnResetActionPerformed

    /**
     * Atualiza o campo de texto do resultado
     * @param text 
     */
    public void updateResult(String text)
    {
        textResult.setText(text);
        
        if(text.equals("0.0"))
        {
            textResult.setText("");
        }
    }
    
    /**
     * Coleta os dados digitados pelo usuário nas caixas de texto.
     */
    private void getTextView()
    {
        firstNumber = Float.parseFloat(textFirstNumber.getText());
        secondNumber = Float.parseFloat(textSecondNumber.getText());
    }
    
    /**
     * Realiza a limpeza das caixas de texto da tela.
     */
    private void clear()
    {
        textFirstNumber.setText("");
        textSecondNumber.setText("");
        textResult.setText("");
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
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
            java.util.logging.Logger.getLogger(CalculatorScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run()
            {
                new CalculatorScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnMultiplication;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSubtraction;
    private javax.swing.JButton btnSum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textFirstNumber;
    private javax.swing.JTextField textResult;
    private javax.swing.JTextField textSecondNumber;
    // End of variables declaration//GEN-END:variables
}

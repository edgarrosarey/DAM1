package M3P10;

import java.awt.Color;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NewJFrameConversor1 extends javax.swing.JFrame {

    static Scanner keyboard = new Scanner(System.in);

    public NewJFrameConversor1() {
        initComponents();
        boolean Window = false;
        this.getContentPane().setBackground(Color.red);
        this.setLocationRelativeTo(this);
        this.setResizable(false);
        //Window.setAlwaysOnTop(boolean);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldºC = new javax.swing.JTextField();
        TgC = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        TgK = new javax.swing.JTextField();
        TgF = new javax.swing.JTextField();
        jTextFieldºK = new javax.swing.JTextField();
        jTextFieldºF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldºC.setBackground(new java.awt.Color(0, 204, 255));
        jTextFieldºC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldºC.setText("Temperature in ºC");
        jTextFieldºC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldºCActionPerformed(evt);
            }
        });

        TgC.setBackground(new java.awt.Color(51, 255, 51));
        TgC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TgCActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/image.PNG"))); // NOI18N

        exit.setBackground(new java.awt.Color(51, 204, 255));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        TgK.setBackground(new java.awt.Color(51, 255, 51));
        TgK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TgKActionPerformed(evt);
            }
        });

        TgF.setBackground(new java.awt.Color(51, 255, 51));
        TgF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TgFActionPerformed(evt);
            }
        });

        jTextFieldºK.setBackground(new java.awt.Color(0, 204, 255));
        jTextFieldºK.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldºK.setText("Kelvin");
        jTextFieldºK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldºKActionPerformed(evt);
            }
        });

        jTextFieldºF.setBackground(new java.awt.Color(0, 204, 255));
        jTextFieldºF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldºF.setText("Fahrenheit");

        jButton1.setText("Convert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(TgC, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(exit)
                                .addGap(31, 31, 31))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldºC, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldºK, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldºF, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TgK, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TgF, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldºC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TgC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TgK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldºK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldºF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TgF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(exit)
                .addGap(5, 5, 5)
                .addComponent(jLabel1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldºCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldºCActionPerformed

    }//GEN-LAST:event_jTextFieldºCActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
        exit.setBackground(Color.cyan);
    }//GEN-LAST:event_exitActionPerformed

    private void TgKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TgKActionPerformed

    }//GEN-LAST:event_TgKActionPerformed

    private void TgFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TgFActionPerformed

    }//GEN-LAST:event_TgFActionPerformed

    private void jTextFieldºKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldºKActionPerformed

    }//GEN-LAST:event_jTextFieldºKActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DecimalFormat df = new DecimalFormat("##.00 ");
        float c = 0, k = 0, f = 0;
        c = Float.parseFloat(TgC.getText());
        TgC.setText("" +(df.format(c)));
        k = c + 273;
        TgK.setText("" +(df.format(k)));
        f = (1.8f * c) + 32;
        TgF.setText("" +(df.format(f)));

        if (c >= 100) {
            jTextFieldºC.setBackground(Color.blue);
        }
        if (k >= 373) {
            jTextFieldºK.setBackground(Color.blue);
        }
        if (f >= 212) {
            jTextFieldºF.setBackground(Color.blue);
        }
        if (c <= 0) {
            jTextFieldºC.setBackground(Color.yellow);
        }
        if (k <= 273) {
            jTextFieldºK.setBackground(Color.yellow);
        }
        if (f <= 32) {
            jTextFieldºF.setBackground(Color.yellow);
        }
        if (c >= 0 && c <= 100) {
            jTextFieldºC.setBackground(Color.pink);
        }
        if (k >= 273 && k <= 373) {
            jTextFieldºK.setBackground(Color.pink);
        }
        if (f >= 32 && f <= 212) {
            jTextFieldºF.setBackground(Color.pink);

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void TgCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TgCActionPerformed

    }//GEN-LAST:event_TgCActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrameConversor1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TgC;
    private javax.swing.JTextField TgF;
    private javax.swing.JTextField TgK;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldºC;
    private javax.swing.JTextField jTextFieldºF;
    private javax.swing.JTextField jTextFieldºK;
    // End of variables declaration//GEN-END:variables
}

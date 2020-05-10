
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SoloCode JSHDVR
 */
public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public LoginForm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGPanel = new javax.swing.JPanel();
        topBarPanel = new javax.swing.JPanel();
        exitLabel = new javax.swing.JLabel();
        minimizeLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        userNameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        registerLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BGPanel.setBackground(new java.awt.Color(153, 153, 153));
        BGPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        topBarPanel.setBackground(new java.awt.Color(204, 204, 204));
        topBarPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                topBarPanelMouseDragged(evt);
            }
        });
        topBarPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                topBarPanelMousePressed(evt);
            }
        });

        exitLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exitLabel.setText("X");
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });

        minimizeLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        minimizeLabel.setText("_");
        minimizeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout topBarPanelLayout = new javax.swing.GroupLayout(topBarPanel);
        topBarPanel.setLayout(topBarPanelLayout);
        topBarPanelLayout.setHorizontalGroup(
            topBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topBarPanelLayout.createSequentialGroup()
                .addContainerGap(357, Short.MAX_VALUE)
                .addComponent(minimizeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exitLabel)
                .addContainerGap())
        );
        topBarPanelLayout.setVerticalGroup(
            topBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topBarPanelLayout.createSequentialGroup()
                .addGroup(topBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitLabel)
                    .addComponent(minimizeLabel))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        BGPanel.add(topBarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 30));

        loginButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loginButton.setText("LOGIN");
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        BGPanel.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 170, 30));

        userNameField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userNameField.setText("USERNAME");
        BGPanel.add(userNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 170, 30));

        passwordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordField.setText("jPasswordField1");
        BGPanel.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 170, 30));

        registerLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        registerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registerLabel.setText("REGISTER");
        registerLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerLabelMouseClicked(evt);
            }
        });
        BGPanel.add(registerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 170, 20));

        getContentPane().add(BGPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        // TODO add your handling code here:
        MainForm main = new MainForm();

        main.setVisible(true);
        main.pack();
        main.setLocationRelativeTo(null);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        this.dispose();
        
    }//GEN-LAST:event_loginButtonMouseClicked

    private void registerLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerLabelMouseClicked
        // TODO add your handling code here:
        RegisterForm ragister = new RegisterForm();

        ragister.setVisible(true);
        ragister.pack();
        ragister.setLocationRelativeTo(null);
        ragister.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        this.dispose();
    }//GEN-LAST:event_registerLabelMouseClicked

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButtonActionPerformed
    private int mousePositionX, mousePositionY;
    private void topBarPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topBarPanelMousePressed

        mousePositionX = evt.getX();
        mousePositionY = evt.getY();
        // TODO add your handling code here:
    }//GEN-LAST:event_topBarPanelMousePressed

    private void topBarPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topBarPanelMouseDragged
        // TODO add your handling code here:
        int positionX = evt.getXOnScreen();
        int positionY = evt.getYOnScreen();

        this.setLocation(positionX - mousePositionX, positionY - mousePositionY);
    }//GEN-LAST:event_topBarPanelMouseDragged

    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitLabelMouseClicked

    private void minimizeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeLabelMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeLabelMouseClicked

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BGPanel;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel minimizeLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel registerLabel;
    private javax.swing.JPanel topBarPanel;
    private javax.swing.JTextField userNameField;
    // End of variables declaration//GEN-END:variables
}

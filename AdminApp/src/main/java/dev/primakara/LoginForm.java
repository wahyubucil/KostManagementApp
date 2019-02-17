/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.primakara;

import com.google.firebase.database.*;
import dev.primakara.model.User;

import java.awt.*;
import javax.swing.JOptionPane;

/**
 *
 * @author hellyeah
 */
public class LoginForm extends javax.swing.JFrame {
    
    static Point mouseDownCompCoords;
    
    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
        
        //set overlay
        loginBackgroundImageOverlay.setBackground(new Color(0,0,0,200));
        
        //prevent default focus to JTextField
        btnLogin.requestFocusInWindow();
    }
    
    public boolean checkInputs()
    {
        String defaultUsername = "Username";
        String emptyUsername = "";
        String defaultPassword = "Password";
        String emptyPassword = "";
        
        if(defaultUsername.equals(username.getText())
                || emptyUsername.equals(username.getText())
                || defaultPassword.equals(new String(password.getPassword()))
                || emptyPassword.equals(new String(password.getPassword()))){
            return false;
        } else{
            return true;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        loginFrame = new javax.swing.JPanel();
        closeBtn = new javax.swing.JLabel();
        usernameIcon = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        separatorUsername = new javax.swing.JSeparator();
        passwordIcon = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        separatorPassword = new javax.swing.JSeparator();
        btnLogin = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        loginBackgroundImage = new javax.swing.JPanel();
        loginBackgroundImageOverlay = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("LoginFrame"); // NOI18N
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new java.awt.CardLayout());

        loginFrame.setBackground(new java.awt.Color(255, 255, 255));

        closeBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        closeBtn.setForeground(new java.awt.Color(255, 255, 255));
        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-multiply-25.png"))); // NOI18N
        closeBtn.setToolTipText("");
        closeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnMouseClicked(evt);
            }
        });

        usernameIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dark-user-32.png"))); // NOI18N

        username.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        username.setForeground(new java.awt.Color(110, 89, 222));
        username.setText("Username");
        username.setBorder(null);
        username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFocusLost(evt);
            }
        });

        separatorUsername.setBackground(new java.awt.Color(110, 89, 222));
        separatorUsername.setForeground(new java.awt.Color(110, 89, 222));

        passwordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dark-password-32.png"))); // NOI18N

        password.setForeground(new java.awt.Color(110, 89, 222));
        password.setText("Password");
        password.setBorder(null);
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });

        separatorPassword.setBackground(new java.awt.Color(110, 89, 222));
        separatorPassword.setForeground(new java.awt.Color(110, 89, 222));

        btnLogin.setBackground(new java.awt.Color(85, 65, 118));
        btnLogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setToolTipText("");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("LOGIN");

        javax.swing.GroupLayout btnLoginLayout = new javax.swing.GroupLayout(btnLogin);
        btnLogin.setLayout(btnLoginLayout);
        btnLoginLayout.setHorizontalGroup(
            btnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLoginLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel14)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        btnLoginLayout.setVerticalGroup(
            btnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Kost Management App");

        loginBackgroundImage.setBackground(new java.awt.Color(255, 255, 255));
        loginBackgroundImage.setLayout(new javax.swing.OverlayLayout(loginBackgroundImage));

        loginBackgroundImageOverlay.setBackground(new java.awt.Color(0, 0, 0));
        loginBackgroundImageOverlay.setPreferredSize(new java.awt.Dimension(400, 420));

        javax.swing.GroupLayout loginBackgroundImageOverlayLayout = new javax.swing.GroupLayout(loginBackgroundImageOverlay);
        loginBackgroundImageOverlay.setLayout(loginBackgroundImageOverlayLayout);
        loginBackgroundImageOverlayLayout.setHorizontalGroup(
            loginBackgroundImageOverlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        loginBackgroundImageOverlayLayout.setVerticalGroup(
            loginBackgroundImageOverlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        loginBackgroundImage.add(loginBackgroundImageOverlay);

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bgLogin.jpg"))); // NOI18N
        image.setMaximumSize(new java.awt.Dimension(400, 420));
        image.setMinimumSize(new java.awt.Dimension(400, 420));
        image.setPreferredSize(new java.awt.Dimension(400, 420));
        loginBackgroundImage.add(image);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_logo-gradient.png"))); // NOI18N

        javax.swing.GroupLayout loginFrameLayout = new javax.swing.GroupLayout(loginFrame);
        loginFrame.setLayout(loginFrameLayout);
        loginFrameLayout.setHorizontalGroup(
            loginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginFrameLayout.createSequentialGroup()
                .addComponent(loginBackgroundImage, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(loginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginFrameLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                            .addComponent(closeBtn))
                        .addGroup(loginFrameLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(loginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(loginFrameLayout.createSequentialGroup()
                                    .addGroup(loginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(usernameIcon)
                                        .addComponent(passwordIcon))
                                    .addGap(18, 18, 18)
                                    .addGroup(loginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(password, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(username, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                                        .addComponent(separatorUsername, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(separatorPassword))))
                            .addGap(40, 40, 40)))
                    .addGroup(loginFrameLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginFrameLayout.setVerticalGroup(
            loginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(loginFrameLayout.createSequentialGroup()
                        .addComponent(closeBtn)
                        .addGap(96, 96, 96))
                    .addGroup(loginFrameLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(11, 11, 11)))
                .addGroup(loginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginFrameLayout.createSequentialGroup()
                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separatorUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginFrameLayout.createSequentialGroup()
                        .addComponent(usernameIcon)
                        .addGap(8, 8, 8)))
                .addGap(30, 30, 30)
                .addGroup(loginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginFrameLayout.createSequentialGroup()
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separatorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginFrameLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(passwordIcon)))
                .addGap(42, 42, 42)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(loginBackgroundImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg.add(loginFrame, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeBtnMouseClicked

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusGained
        if(MainClass.objLoginForm.username.getText().equals("Username")){
            MainClass.objLoginForm.username.setText("");
        }
    }//GEN-LAST:event_usernameFocusGained

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        String defaultPass = "Password";
        if(defaultPass.equals(new String(password.getPassword()))){
            MainClass.objLoginForm.password.setText("");
        }
    }//GEN-LAST:event_passwordFocusGained

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        if(checkInputs()){
            MainClass.isLogin = true;
            MainClass.loginCheck();   
        }else{
            loginErrorMessage("Mohon masukkan username dan password terlebih dahulu!");
        }
        
//        String username = MainClass.objLoginForm.username.getText();
//        String password = String.valueOf(MainClass.objLoginForm.password.getPassword());

//        final FirebaseDatabase database = FirebaseDatabase.getInstance();
//        DatabaseReference usersRef = database.getReference("users");
//        usersRef.orderByChild("email").equalTo(username).addListenerForSingleValueEvent(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot snapshot) {
//                if (snapshot.exists()) {
//                    DataSnapshot selectedUser = snapshot.getChildren().iterator().next();
//                    User user = selectedUser.getValue(User.class);
//                    if (!user.getPassword().equals(password)) {
//                        loginErrorMessage("Username atau Password salah");
//                    } else {
//                        MainClass.isLogin = true;
//                        MainClass.loginCheck();
//                    }
//                } else {
//                    loginErrorMessage("Username atau Password salah");
//                }
//            }
//
//            @Override
//            public void onCancelled(DatabaseError error) {
//                loginErrorMessage("The read failed: " + error.getMessage());
//            }
//        });
    }//GEN-LAST:event_btnLoginMouseClicked

    private void loginErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(rootPane, errorMessage, 
            "Whoops! something were wrong!", HEIGHT);
    }

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        mouseDownCompCoords = evt.getPoint();
    }//GEN-LAST:event_formMousePressed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        mouseDownCompCoords = null;
    }//GEN-LAST:event_formMouseReleased

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        Point currCoords = evt.getLocationOnScreen();
        MainClass.objLoginForm.setLocation(currCoords.x - mouseDownCompCoords.x, currCoords.y - mouseDownCompCoords.y);
    }//GEN-LAST:event_formMouseDragged

    private void usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusLost
        if(MainClass.objLoginForm.username.getText().equals("")){
            MainClass.objLoginForm.username.setText("Username");
        }
    }//GEN-LAST:event_usernameFocusLost

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
        String emptyPassword = "";
        if(emptyPassword.equals(new String(password.getPassword()))){
            MainClass.objLoginForm.password.setText("Password");
        }
    }//GEN-LAST:event_passwordFocusLost

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btnLogin;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel loginBackgroundImage;
    private javax.swing.JPanel loginBackgroundImageOverlay;
    private javax.swing.JPanel loginFrame;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel passwordIcon;
    private javax.swing.JSeparator separatorPassword;
    private javax.swing.JSeparator separatorUsername;
    private javax.swing.JTextField username;
    private javax.swing.JLabel usernameIcon;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.primakara;

/**
 *
 * @author hellyeah
 */
public class MainClass {
    static boolean isLogin = false;
    static LoginForm objLoginForm = new LoginForm();
    static MainForm objMainForm = new MainForm();
    
    public static void main(String []args){
        MainClass.loginCheck();
    }
    
    public static void loginCheck() {
        
        if (MainClass.isLogin) {
            MainClass.objMainForm.setVisible(true);
            MainClass.objLoginForm.dispose();
        } else {
            MainClass.objLoginForm.setVisible(true);
        }
    }
}

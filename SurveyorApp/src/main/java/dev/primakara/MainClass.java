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
    static MainForm objMainForm = new MainForm();
    static LoginForm objLoginForm = new LoginForm();
    
    public static void main(String []args){
        MainClass.objMainForm.setVisible(true);
    }
}

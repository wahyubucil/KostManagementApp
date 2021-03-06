/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.primakara;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import dev.primakara.model.User;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author hellyeah
 */
public class MainClass {
    static boolean isLogin = false;
    static MainForm objMainForm = new MainForm();
    static LoginForm objLoginForm = new LoginForm();
    static User authUser;
    
    public static void main(String []args){
        MainClass.firebaseInit();
        MainClass.loginCheck();
    }

    public static void firebaseInit() {
        try {
            // [START initialize]
            FileInputStream serviceAccount = new FileInputStream("service-account.json");
            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .setDatabaseUrl("https://kost-management-app.firebaseio.com")
                    .build();
            FirebaseApp.initializeApp(options);
            // [END initialize]
        } catch (IOException e) {
            System.out.println("ERROR: invalid service account credentials. See README.");
            System.out.println(e.getMessage());

            System.exit(1);
        }
    }
    
    public static void loginCheck() {
        
        if (MainClass.isLogin) {
            MainClass.objMainForm.setVisible(true);
            MainClass.objLoginForm.dispose();
        } else {
            MainClass.objLoginForm.setVisible(true);
        }
    }

    public static void logout() {
        MainClass.isLogin = false;
        MainClass.objMainForm.dispose();

        MainClass.objLoginForm = new LoginForm();
        MainClass.objMainForm = new MainForm();

        loginCheck();
    }
}

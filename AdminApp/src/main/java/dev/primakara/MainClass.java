/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.primakara;

import at.favre.lib.crypto.bcrypt.BCrypt;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.*;
import dev.primakara.model.Kost;
import dev.primakara.model.User;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author hellyeah
 */
public class MainClass {
    static boolean isLogin = false;
    static LoginForm objLoginForm = new LoginForm();
    static MainForm objMainForm = new MainForm();
    static User authUser;
    
    public static void main(String []args){
        MainClass.firebaseInit();
        MainClass.loginCheck();
//        MainClass.waitForData();
//        MainClass.saveKostData();
//        MainClass.updateKostData();
//        MainClass.deleteKostData();
//        MainClass.saveSurveyorData();
//        MainClass.saveAdminData();

    }
    
    public static void loginCheck() {
        
        if (MainClass.isLogin) {
            MainClass.objMainForm.setVisible(true);
            MainClass.objLoginForm.dispose();
        } else {
            MainClass.objLoginForm.setVisible(true);
        }
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

    public static void saveKostData() {
        System.out.println("Save Data");
        Kost kost = new Kost();
        kost.setName("Kost Akar Jaya");
        kost.setAddress("Jl. Gunung Agung No. 1");
        kost.setRooms(10);
        kost.setPrice(750000);
        kost.setElectricityCost(true);
        kost.setWaterCost(false);
        kost.setDescription("Kost yang sangat keren dan murah luar biasa");
        kost.setOwnerName("Pak Sugeng");
        kost.setOwnerName("085777090331");

        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference();

        DatabaseReference kostsRef = ref.child("kosts");
        kostsRef.push().setValueAsync(kost);
    }

    public static void updateKostData() {
        System.out.println("Update Data");
        Kost kost = new Kost();
        kost.setName("Kost Akar Jaya Luar Biasa");
        kost.setAddress("Jl. Gunung Agung No. 1");
        kost.setRooms(10);
        kost.setPrice(750000);
        kost.setElectricityCost(false);
        kost.setWaterCost(true);
        kost.setDescription("Kost yang sangat keren dan murah luar biasa");
        kost.setOwnerName("Pak Sugeng");
        kost.setOwnerName("085777090331");

        Map<String, Object> kostUpdate = new HashMap<>();
        kostUpdate.put("-LYa6H9i1hqcm1JXDLAv", kost);

        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference();
        DatabaseReference kostsRef = ref.child("kosts");

        kostsRef.updateChildrenAsync(kostUpdate);
    }

    public static void deleteKostData() {
        System.out.println("Update Data");
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        database.getReference("kosts/" + "-LYa6htxCY2ozA9PbPsD").removeValueAsync();
    }

    public static void saveSurveyorData() {
        System.out.println("Save Surveyor Data");
        User surveyor = new User();
        surveyor.setEmail("agus@kostpedia.id");

        String password = "agusmantap";
        String bcryptHashString = BCrypt.withDefaults().hashToString(12, password.toCharArray());

        surveyor.setPassword(bcryptHashString);

        surveyor.setDisplayName("Agus Wibawa");
        surveyor.setType("surveyor");

        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference();

        DatabaseReference usersRef = ref.child("users");
        usersRef.child("agus").setValueAsync(surveyor);
    }

    public static void saveAdminData() {
        System.out.println("Save Admin Data");
        User admin = new User();
        admin.setEmail("admin@kostpedia.id");

        String password = "kostpediamantap";
        String bcryptHashString = BCrypt.withDefaults().hashToString(12, password.toCharArray());

        admin.setPassword(bcryptHashString);
        admin.setDisplayName("Admin Kostpedia");
        admin.setType("admin");

        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference();

        DatabaseReference usersRef = ref.child("users");
        usersRef.child("admin").setValueAsync(admin);
    }

    public static void waitForData() {
        System.out.println("Wait Data");
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference("kosts");

        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                System.out.println("Count: " + snapshot.getChildrenCount());
            }

            @Override
            public void onCancelled(DatabaseError error) {

            }
        });
    }
}

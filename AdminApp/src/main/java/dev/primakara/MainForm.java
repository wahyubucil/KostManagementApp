/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.primakara;

import com.google.firebase.database.*;
import dev.primakara.model.Kost;
import dev.primakara.model.User;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author hellyeah
 */
public class MainForm extends javax.swing.JFrame {
    
    static Point mouseDownCompCoords;

    private Map<String, Kost> kosts = new LinkedHashMap<>();
    private Map<String, User> users = new LinkedHashMap<>();
    private String selectedKostId;
    private String selectedSurveyorId;

    /**
     * Creates new form Main_Form
     */
    public MainForm() {

        initComponents();

        // Remove column that contain Unique ID
        tableListKost.removeColumn(tableListKost.getColumnModel().getColumn(3));
        tableListSurveyor.removeColumn(tableListSurveyor.getColumnModel().getColumn(3));
        
        showHome();
    }

    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        if (visible) {
            listenToKostData();
            listenToUserData();
            currentUserLoggedIn.setText(MainClass.authUser.getDisplayName());
        }
    }

    private void listenToKostData() {
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference("kosts");

        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                kosts.clear();
                for (DataSnapshot kostData : snapshot.getChildren()) {
                    Kost kost = kostData.getValue(Kost.class);
                    kosts.put(kostData.getKey(), kost);
                }

                Show_Kosts_In_JTable();
            }

            @Override
            public void onCancelled(DatabaseError error) {
                JOptionPane.showMessageDialog(null, error.getMessage());
            }
        });
    }

    private void listenToUserData() {
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference("users");

        ref.orderByChild("type").equalTo("surveyor").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                users.clear();
                for (DataSnapshot userData : snapshot.getChildren()) {
                    User user = userData.getValue(User.class);
                    users.put(userData.getKey(), user);
                }

                Show_Users_In_JTable();
            }

            @Override
            public void onCancelled(DatabaseError error) {
                JOptionPane.showMessageDialog(null, error.getMessage());
            }
        });
    }

  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupEditBiayaListrik = new javax.swing.ButtonGroup();
        btnGroupEditBiayaPdam = new javax.swing.ButtonGroup();
        bg = new javax.swing.JPanel();
        closeBtn = new javax.swing.JLabel();
        info = new javax.swing.JLabel();
        sidebar = new javax.swing.JPanel();
        sidebarTitle = new javax.swing.JLabel();
        titleSeparator = new javax.swing.JSeparator();
        homeBtn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        listKostBtn = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        aboutBtn = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        currentUserLoggedIn = new javax.swing.JLabel();
        listSurveyorBtn = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        mainHeader = new javax.swing.JPanel();
        menuTitle = new javax.swing.JLabel();
        menuDesc = new javax.swing.JLabel();
        mainContentScroll = new javax.swing.JScrollPane();
        mainContent = new javax.swing.JPanel();
        addSurveyor = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        insertEmail = new javax.swing.JTextField();
        btnInsertKost = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        insertPassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        insertUsername1 = new javax.swing.JTextField();
        insertDisplayName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        listKost = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        scrollPaneListKost = new javax.swing.JScrollPane();
        tableListKost = new javax.swing.JTable();
        detailKost = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        lblNamaKost = new javax.swing.JLabel();
        namaKost = new javax.swing.JLabel();
        alamatLengkapKost = new javax.swing.JLabel();
        lblAlamatLengkap = new javax.swing.JLabel();
        jumlahKamar = new javax.swing.JLabel();
        lblJumlahKamar = new javax.swing.JLabel();
        lblHargaBulanan = new javax.swing.JLabel();
        hargaBulanan = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblKamar = new javax.swing.JLabel();
        lblKetentuanKost = new javax.swing.JLabel();
        lblPDAM = new javax.swing.JLabel();
        lblListrik = new javax.swing.JLabel();
        ketentuanPDAM = new javax.swing.JLabel();
        ketentuanListrik = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel37 = new javax.swing.JLabel();
        lblNamaLengkap = new javax.swing.JLabel();
        namaLengkapPemilik = new javax.swing.JLabel();
        lblNomorTelefon = new javax.swing.JLabel();
        nomorTeleponPemilik = new javax.swing.JLabel();
        about = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        aboutDesc = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        devThree = new javax.swing.JLabel();
        devOne = new javax.swing.JLabel();
        devTwo = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        editSurveyor = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        editEmail = new javax.swing.JTextField();
        btnUpdateSurveyor = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        editUsername = new javax.swing.JTextField();
        editDisplayName = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        listSurveyor = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        scrollPaneListSurveyor = new javax.swing.JScrollPane();
        tableListSurveyor = new javax.swing.JTable();
        detailSurveyor = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        lblNamaLengkap1 = new javax.swing.JLabel();
        usernameSurveyor = new javax.swing.JLabel();
        lblNomorTelefon1 = new javax.swing.JLabel();
        emailSurveyor = new javax.swing.JLabel();
        displayNameSurveyor = new javax.swing.JLabel();
        lblNomorTelefon2 = new javax.swing.JLabel();
        btnHapusSurveyor = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        btnEditSurveyor = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        minimizeBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
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

        info.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_logo-gradient.png"))); // NOI18N
        info.setToolTipText("");
        info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoMouseClicked(evt);
            }
        });

        sidebar.setBackground(new java.awt.Color(54, 33, 89));

        sidebarTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sidebarTitle.setForeground(new java.awt.Color(255, 255, 255));
        sidebarTitle.setText("KOST ADMIN MANAGEMENT");

        homeBtn.setBackground(new java.awt.Color(85, 55, 115));
        homeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeBtn.setPreferredSize(new java.awt.Dimension(244, 66));
        homeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                homeBtnMousePressed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-create-document-24.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tambah Surveyor Baru");

        javax.swing.GroupLayout homeBtnLayout = new javax.swing.GroupLayout(homeBtn);
        homeBtn.setLayout(homeBtnLayout);
        homeBtnLayout.setHorizontalGroup(
            homeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeBtnLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        homeBtnLayout.setVerticalGroup(
            homeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(homeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addContainerGap())
        );

        listKostBtn.setBackground(new java.awt.Color(64, 43, 100));
        listKostBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listKostBtn.setPreferredSize(new java.awt.Dimension(240, 66));
        listKostBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listKostBtnMousePressed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-apartment-24.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Daftar Kost");

        javax.swing.GroupLayout listKostBtnLayout = new javax.swing.GroupLayout(listKostBtn);
        listKostBtn.setLayout(listKostBtnLayout);
        listKostBtnLayout.setHorizontalGroup(
            listKostBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listKostBtnLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        listKostBtnLayout.setVerticalGroup(
            listKostBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listKostBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listKostBtnLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(19, 19, 19))
        );

        aboutBtn.setBackground(new java.awt.Color(64, 43, 100));
        aboutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aboutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutBtnMouseClicked(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-info-filled-24.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Tentang Kami");

        javax.swing.GroupLayout aboutBtnLayout = new javax.swing.GroupLayout(aboutBtn);
        aboutBtn.setLayout(aboutBtnLayout);
        aboutBtnLayout.setHorizontalGroup(
            aboutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutBtnLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        aboutBtnLayout.setVerticalGroup(
            aboutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(aboutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnLogout.setBackground(new java.awt.Color(64, 43, 100));
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.setPreferredSize(new java.awt.Dimension(240, 66));
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });

        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-exit-24.png"))); // NOI18N

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Logout");

        javax.swing.GroupLayout btnLogoutLayout = new javax.swing.GroupLayout(btnLogout);
        btnLogout.setLayout(btnLogoutLayout);
        btnLogoutLayout.setHorizontalGroup(
            btnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLogoutLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        btnLogoutLayout.setVerticalGroup(
            btnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLogoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLogoutLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel32)
                .addGap(19, 19, 19))
        );

        jLabel34.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("You logged in as,");

        currentUserLoggedIn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        currentUserLoggedIn.setForeground(new java.awt.Color(255, 255, 255));
        currentUserLoggedIn.setText("User");

        listSurveyorBtn.setBackground(new java.awt.Color(64, 43, 100));
        listSurveyorBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listSurveyorBtn.setPreferredSize(new java.awt.Dimension(240, 66));
        listSurveyorBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listSurveyorBtnMouseClicked(evt);
            }
        });

        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-contact-us-24.png"))); // NOI18N

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Daftar Surveyor");

        javax.swing.GroupLayout listSurveyorBtnLayout = new javax.swing.GroupLayout(listSurveyorBtn);
        listSurveyorBtn.setLayout(listSurveyorBtnLayout);
        listSurveyorBtnLayout.setHorizontalGroup(
            listSurveyorBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listSurveyorBtnLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        listSurveyorBtnLayout.setVerticalGroup(
            listSurveyorBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listSurveyorBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listSurveyorBtnLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel38)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
            .addComponent(listKostBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(titleSeparator)
                    .addComponent(sidebarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
            .addComponent(aboutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
            .addComponent(listSurveyorBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(currentUserLoggedIn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(sidebarTitle)
                .addGap(18, 18, 18)
                .addComponent(titleSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(listKostBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(listSurveyorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(aboutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(currentUserLoggedIn))
                .addContainerGap())
        );

        mainHeader.setBackground(new java.awt.Color(110, 89, 222));
        mainHeader.setMinimumSize(new java.awt.Dimension(647, 119));
        mainHeader.setName(""); // NOI18N

        menuTitle.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        menuTitle.setForeground(new java.awt.Color(255, 255, 255));

        menuDesc.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        menuDesc.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout mainHeaderLayout = new javax.swing.GroupLayout(mainHeader);
        mainHeader.setLayout(mainHeaderLayout);
        mainHeaderLayout.setHorizontalGroup(
            mainHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainHeaderLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(menuDesc, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                .addGap(183, 183, 183))
            .addGroup(mainHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainHeaderLayout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(menuTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                    .addGap(188, 188, 188)))
        );
        mainHeaderLayout.setVerticalGroup(
            mainHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainHeaderLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(menuDesc, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addGroup(mainHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainHeaderLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(menuTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addGap(54, 54, 54)))
        );

        mainContentScroll.setBackground(new java.awt.Color(255, 255, 255));
        mainContentScroll.setBorder(null);
        mainContentScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        mainContent.setBackground(new java.awt.Color(255, 255, 255));
        mainContent.setEnabled(false);
        mainContent.setLayout(new java.awt.CardLayout());

        addSurveyor.setBackground(new java.awt.Color(255, 255, 255));
        addSurveyor.setForeground(new java.awt.Color(110, 89, 222));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("Username");

        insertEmail.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        insertEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        insertEmail.setBorder(null);

        btnInsertKost.setBackground(new java.awt.Color(85, 65, 118));
        btnInsertKost.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnInsertKost.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertKost.setToolTipText("");
        btnInsertKost.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsertKost.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInsertKostMouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("SIMPAN");

        javax.swing.GroupLayout btnInsertKostLayout = new javax.swing.GroupLayout(btnInsertKost);
        btnInsertKost.setLayout(btnInsertKostLayout);
        btnInsertKostLayout.setHorizontalGroup(
            btnInsertKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnInsertKostLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel14)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        btnInsertKostLayout.setVerticalGroup(
            btnInsertKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jLabel25.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel25.setText("DATA DIRI SURVEYOR");

        jSeparator1.setBackground(new java.awt.Color(110, 89, 222));
        jSeparator1.setForeground(new java.awt.Color(110, 89, 222));

        jSeparator5.setBackground(new java.awt.Color(110, 89, 222));
        jSeparator5.setForeground(new java.awt.Color(110, 89, 222));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setText("Password");

        insertPassword.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        insertPassword.setBorder(null);

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setText("Email");

        jSeparator6.setBackground(new java.awt.Color(110, 89, 222));
        jSeparator6.setForeground(new java.awt.Color(110, 89, 222));

        insertUsername1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        insertUsername1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        insertUsername1.setBorder(null);

        insertDisplayName.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        insertDisplayName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        insertDisplayName.setBorder(null);

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("Display Name");

        jSeparator7.setBackground(new java.awt.Color(110, 89, 222));
        jSeparator7.setForeground(new java.awt.Color(110, 89, 222));

        javax.swing.GroupLayout addSurveyorLayout = new javax.swing.GroupLayout(addSurveyor);
        addSurveyor.setLayout(addSurveyorLayout);
        addSurveyorLayout.setHorizontalGroup(
            addSurveyorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addSurveyorLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(addSurveyorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addGroup(addSurveyorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(insertDisplayName, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(insertPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel25)
                    .addComponent(jLabel3)
                    .addGroup(addSurveyorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(insertEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                        .addComponent(insertUsername1, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)))
                .addContainerGap(446, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addSurveyorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInsertKost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        addSurveyorLayout.setVerticalGroup(
            addSurveyorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addSurveyorLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel25)
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(11, 11, 11)
                .addComponent(insertUsername1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insertPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addGap(11, 11, 11)
                .addComponent(insertEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addGap(11, 11, 11)
                .addComponent(insertDisplayName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnInsertKost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainContent.add(addSurveyor, "card2");

        listKost.setBackground(new java.awt.Color(255, 255, 255));
        listKost.setPreferredSize(new java.awt.Dimension(639, 473));

        jPanel1.setBackground(new java.awt.Color(110, 89, 222));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("KOST");

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("PEMILIK KOST");

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("ALAMAT LENGKAP");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(156, 156, 156)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(78, 78, 78))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addContainerGap())
        );

        scrollPaneListKost.setBackground(new java.awt.Color(255, 255, 255));
        scrollPaneListKost.setBorder(null);
        scrollPaneListKost.setOpaque(false);
        scrollPaneListKost.setPreferredSize(new java.awt.Dimension(450, 473));

        tableListKost.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        tableListKost.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableListKost.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tableListKost.setGridColor(new java.awt.Color(0, 0, 0));
        tableListKost.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tableListKost.setPreferredSize(new java.awt.Dimension(610, 473));
        tableListKost.setRowHeight(50);
        tableListKost.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tableListKost.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tableListKost.setShowHorizontalLines(false);
        tableListKost.setShowVerticalLines(false);
        tableListKost.getTableHeader().setResizingAllowed(false);
        tableListKost.getTableHeader().setReorderingAllowed(false);
        tableListKost.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableListKostMouseClicked(evt);
            }
        });
        scrollPaneListKost.setViewportView(tableListKost);
        if (tableListKost.getColumnModel().getColumnCount() > 0) {
            tableListKost.getColumnModel().getColumn(0).setResizable(false);
            tableListKost.getColumnModel().getColumn(0).setPreferredWidth(10);
            tableListKost.getColumnModel().getColumn(1).setPreferredWidth(10);
            tableListKost.getColumnModel().getColumn(2).setPreferredWidth(10);
            tableListKost.getColumnModel().getColumn(3).setResizable(false);
            tableListKost.getColumnModel().getColumn(3).setPreferredWidth(0);
        }

        javax.swing.GroupLayout listKostLayout = new javax.swing.GroupLayout(listKost);
        listKost.setLayout(listKostLayout);
        listKostLayout.setHorizontalGroup(
            listKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listKostLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(listKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listKostLayout.createSequentialGroup()
                        .addComponent(scrollPaneListKost, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(listKostLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(20, 20, 20))))
        );
        listKostLayout.setVerticalGroup(
            listKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listKostLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneListKost, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainContent.add(listKost, "card2");

        detailKost.setBackground(new java.awt.Color(255, 255, 255));

        jLabel36.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel36.setText("INFORMASI KOST");

        lblNamaKost.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblNamaKost.setText("Nama Kost");

        namaKost.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        namaKost.setText("Nama Kost Disini");

        alamatLengkapKost.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        alamatLengkapKost.setText("Alamat Lengkap Disini");

        lblAlamatLengkap.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblAlamatLengkap.setText("Alamat Lengkap");

        jumlahKamar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jumlahKamar.setText("0");

        lblJumlahKamar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblJumlahKamar.setText("Jumlah Kamar");

        lblHargaBulanan.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblHargaBulanan.setText("Harga Bulanan");

        hargaBulanan.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        hargaBulanan.setText("RP. 000.000");

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel8.setText("/bulan");

        lblKamar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        lblKamar.setText("Kamar");

        lblKetentuanKost.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblKetentuanKost.setText("Ketentuan Kost");

        lblPDAM.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblPDAM.setText("Biaya PDAM");

        lblListrik.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblListrik.setText("Biaya Listrik");

        ketentuanPDAM.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        ketentuanPDAM.setText("Blablaba Termasuk");

        ketentuanListrik.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        ketentuanListrik.setText("Blablaba Termasuk");

        jLabel37.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel37.setText("INFORMASI PEMILIK");

        lblNamaLengkap.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblNamaLengkap.setText("Nama Lengkap");

        namaLengkapPemilik.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        namaLengkapPemilik.setText("Nama Lengkap Disini");

        lblNomorTelefon.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblNomorTelefon.setText("Nomor Telefon");

        nomorTeleponPemilik.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        nomorTeleponPemilik.setText("Nomor Telefon Disini");

        javax.swing.GroupLayout detailKostLayout = new javax.swing.GroupLayout(detailKost);
        detailKost.setLayout(detailKostLayout);
        detailKostLayout.setHorizontalGroup(
            detailKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailKostLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(detailKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addGroup(detailKostLayout.createSequentialGroup()
                        .addGroup(detailKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addComponent(lblNamaKost)
                            .addComponent(namaKost)
                            .addComponent(lblAlamatLengkap)
                            .addComponent(alamatLengkapKost)
                            .addComponent(lblJumlahKamar)
                            .addGroup(detailKostLayout.createSequentialGroup()
                                .addComponent(jumlahKamar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblKamar))
                            .addComponent(lblHargaBulanan)
                            .addGroup(detailKostLayout.createSequentialGroup()
                                .addComponent(hargaBulanan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8))
                            .addComponent(lblKetentuanKost)
                            .addGroup(detailKostLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(detailKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblListrik)
                                    .addComponent(lblPDAM)
                                    .addComponent(ketentuanPDAM)
                                    .addComponent(ketentuanListrik)))
                            .addComponent(jLabel37)
                            .addComponent(lblNamaLengkap)
                            .addComponent(namaLengkapPemilik)
                            .addComponent(lblNomorTelefon)
                            .addComponent(nomorTeleponPemilik))
                        .addGap(0, 453, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        detailKostLayout.setVerticalGroup(
            detailKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailKostLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel36)
                .addGap(18, 18, 18)
                .addComponent(lblNamaKost)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namaKost)
                .addGap(18, 18, 18)
                .addComponent(lblAlamatLengkap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alamatLengkapKost)
                .addGap(18, 18, 18)
                .addComponent(lblJumlahKamar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jumlahKamar)
                    .addComponent(lblKamar))
                .addGap(18, 18, 18)
                .addComponent(lblHargaBulanan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hargaBulanan)
                    .addComponent(jLabel8))
                .addGap(20, 20, 20)
                .addComponent(lblKetentuanKost)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPDAM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ketentuanPDAM)
                .addGap(20, 20, 20)
                .addComponent(lblListrik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ketentuanListrik)
                .addGap(30, 30, 30)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel37)
                .addGap(18, 18, 18)
                .addComponent(lblNamaLengkap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namaLengkapPemilik)
                .addGap(18, 18, 18)
                .addComponent(lblNomorTelefon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomorTeleponPemilik)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainContent.add(detailKost, "card3");

        about.setBackground(new java.awt.Color(255, 255, 255));
        about.setPreferredSize(new java.awt.Dimension(649, 466));

        jLabel17.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel17.setText("About App");

        aboutDesc.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        aboutDesc.setText("Silahkan di run app nya untuk melihat teks disini (convert from HTML for wrap)");
        aboutDesc.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel18.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel18.setText("Development Team");

        devThree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/devThree.png"))); // NOI18N

        devOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/devOne.png"))); // NOI18N

        devTwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/devTwo.png"))); // NOI18N

        jLabel21.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(110, 89, 222));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Wahyu Budi Saputra");
        jLabel21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel27.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(110, 89, 222));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("1701020002");
        jLabel27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel28.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(110, 89, 222));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("1701020041");
        jLabel28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel29.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(110, 89, 222));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Marvel Alexius");
        jLabel29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel30.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(110, 89, 222));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("1701020017");
        jLabel30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel31.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(110, 89, 222));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Dody Prasetyo");
        jLabel31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout aboutLayout = new javax.swing.GroupLayout(about);
        about.setLayout(aboutLayout);
        aboutLayout.setHorizontalGroup(
            aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(aboutLayout.createSequentialGroup()
                        .addGroup(aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(devOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(82, 82, 82)
                        .addGroup(aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(aboutLayout.createSequentialGroup()
                                .addComponent(devTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(devThree, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(aboutLayout.createSequentialGroup()
                                .addGroup(aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(82, 82, 82)
                                .addGroup(aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(aboutDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        aboutLayout.setVerticalGroup(
            aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel17)
                .addGap(20, 20, 20)
                .addComponent(aboutDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel18)
                .addGap(20, 20, 20)
                .addGroup(aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(devThree, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(devOne, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(devTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(aboutLayout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel27))
                    .addGroup(aboutLayout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel30))
                    .addGroup(aboutLayout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel28)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainContent.add(about, "card2");

        editSurveyor.setBackground(new java.awt.Color(255, 255, 255));
        editSurveyor.setForeground(new java.awt.Color(110, 89, 222));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setText("Username");

        editEmail.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        editEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        editEmail.setBorder(null);

        btnUpdateSurveyor.setBackground(new java.awt.Color(85, 65, 118));
        btnUpdateSurveyor.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnUpdateSurveyor.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateSurveyor.setToolTipText("");
        btnUpdateSurveyor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdateSurveyor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateSurveyorMouseClicked(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("SIMPAN");

        javax.swing.GroupLayout btnUpdateSurveyorLayout = new javax.swing.GroupLayout(btnUpdateSurveyor);
        btnUpdateSurveyor.setLayout(btnUpdateSurveyorLayout);
        btnUpdateSurveyorLayout.setHorizontalGroup(
            btnUpdateSurveyorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnUpdateSurveyorLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel19)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        btnUpdateSurveyorLayout.setVerticalGroup(
            btnUpdateSurveyorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jLabel26.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel26.setText("DATA DIRI SURVEYOR");

        jSeparator8.setBackground(new java.awt.Color(110, 89, 222));
        jSeparator8.setForeground(new java.awt.Color(110, 89, 222));

        jLabel22.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel22.setText("Email");

        jSeparator10.setBackground(new java.awt.Color(110, 89, 222));
        jSeparator10.setForeground(new java.awt.Color(110, 89, 222));

        editUsername.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        editUsername.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        editUsername.setBorder(null);

        editDisplayName.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        editDisplayName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        editDisplayName.setBorder(null);

        jLabel23.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel23.setText("Display Name");

        jSeparator16.setBackground(new java.awt.Color(110, 89, 222));
        jSeparator16.setForeground(new java.awt.Color(110, 89, 222));

        javax.swing.GroupLayout editSurveyorLayout = new javax.swing.GroupLayout(editSurveyor);
        editSurveyor.setLayout(editSurveyorLayout);
        editSurveyorLayout.setHorizontalGroup(
            editSurveyorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editSurveyorLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(editSurveyorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addGroup(editSurveyorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator16, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(editDisplayName, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel26)
                    .addComponent(jLabel7)
                    .addGroup(editSurveyorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(editEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                        .addComponent(editUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)))
                .addContainerGap(446, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editSurveyorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUpdateSurveyor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        editSurveyorLayout.setVerticalGroup(
            editSurveyorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editSurveyorLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel26)
                .addGap(20, 20, 20)
                .addComponent(jLabel7)
                .addGap(11, 11, 11)
                .addComponent(editUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel22)
                .addGap(11, 11, 11)
                .addComponent(editEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel23)
                .addGap(11, 11, 11)
                .addComponent(editDisplayName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnUpdateSurveyor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainContent.add(editSurveyor, "card2");

        listSurveyor.setBackground(new java.awt.Color(255, 255, 255));
        listSurveyor.setPreferredSize(new java.awt.Dimension(639, 473));

        jPanel2.setBackground(new java.awt.Color(110, 89, 222));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel40.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("USERNAME");

        jLabel41.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("EMAIL");

        jLabel42.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("DISPLAY NAME");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel40)
                .addGap(96, 96, 96)
                .addComponent(jLabel41)
                .addGap(70, 70, 70)
                .addComponent(jLabel42)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42))
                .addContainerGap())
        );

        scrollPaneListSurveyor.setBackground(new java.awt.Color(255, 255, 255));
        scrollPaneListSurveyor.setBorder(null);
        scrollPaneListSurveyor.setOpaque(false);
        scrollPaneListSurveyor.setPreferredSize(new java.awt.Dimension(450, 473));

        tableListSurveyor.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        tableListSurveyor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableListSurveyor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tableListSurveyor.setGridColor(new java.awt.Color(0, 0, 0));
        tableListSurveyor.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tableListSurveyor.setPreferredSize(new java.awt.Dimension(610, 473));
        tableListSurveyor.setRowHeight(50);
        tableListSurveyor.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tableListSurveyor.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tableListSurveyor.setShowHorizontalLines(false);
        tableListSurveyor.setShowVerticalLines(false);
        tableListSurveyor.getTableHeader().setResizingAllowed(false);
        tableListSurveyor.getTableHeader().setReorderingAllowed(false);
        tableListSurveyor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableListSurveyorMouseClicked(evt);
            }
        });
        scrollPaneListSurveyor.setViewportView(tableListSurveyor);
        if (tableListSurveyor.getColumnModel().getColumnCount() > 0) {
            tableListSurveyor.getColumnModel().getColumn(0).setResizable(false);
            tableListSurveyor.getColumnModel().getColumn(0).setPreferredWidth(10);
            tableListSurveyor.getColumnModel().getColumn(1).setPreferredWidth(10);
            tableListSurveyor.getColumnModel().getColumn(2).setPreferredWidth(10);
            tableListSurveyor.getColumnModel().getColumn(3).setResizable(false);
            tableListSurveyor.getColumnModel().getColumn(3).setPreferredWidth(0);
        }

        javax.swing.GroupLayout listSurveyorLayout = new javax.swing.GroupLayout(listSurveyor);
        listSurveyor.setLayout(listSurveyorLayout);
        listSurveyorLayout.setHorizontalGroup(
            listSurveyorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listSurveyorLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(listSurveyorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listSurveyorLayout.createSequentialGroup()
                        .addComponent(scrollPaneListSurveyor, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(listSurveyorLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(20, 20, 20))))
        );
        listSurveyorLayout.setVerticalGroup(
            listSurveyorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listSurveyorLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneListSurveyor, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainContent.add(listSurveyor, "card2");

        detailSurveyor.setBackground(new java.awt.Color(255, 255, 255));

        jLabel45.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel45.setText("DATA DIRI SURVEYOR");

        lblNamaLengkap1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblNamaLengkap1.setText("Username");

        usernameSurveyor.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        usernameSurveyor.setText("Username Surveyor Disini");

        lblNomorTelefon1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblNomorTelefon1.setText("Email");

        emailSurveyor.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        emailSurveyor.setText("Email Surveyor Disini");

        displayNameSurveyor.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        displayNameSurveyor.setText("Display Name Surveyor Disini");

        lblNomorTelefon2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblNomorTelefon2.setText("Display Name");

        btnHapusSurveyor.setBackground(new java.awt.Color(85, 65, 118));
        btnHapusSurveyor.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnHapusSurveyor.setForeground(new java.awt.Color(255, 255, 255));
        btnHapusSurveyor.setToolTipText("");
        btnHapusSurveyor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHapusSurveyor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHapusSurveyorMouseClicked(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("HAPUS");

        javax.swing.GroupLayout btnHapusSurveyorLayout = new javax.swing.GroupLayout(btnHapusSurveyor);
        btnHapusSurveyor.setLayout(btnHapusSurveyorLayout);
        btnHapusSurveyorLayout.setHorizontalGroup(
            btnHapusSurveyorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnHapusSurveyorLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel43)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        btnHapusSurveyorLayout.setVerticalGroup(
            btnHapusSurveyorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        btnEditSurveyor.setBackground(new java.awt.Color(85, 65, 118));
        btnEditSurveyor.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEditSurveyor.setForeground(new java.awt.Color(255, 255, 255));
        btnEditSurveyor.setToolTipText("");
        btnEditSurveyor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditSurveyor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditSurveyorMouseClicked(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("EDIT");

        javax.swing.GroupLayout btnEditSurveyorLayout = new javax.swing.GroupLayout(btnEditSurveyor);
        btnEditSurveyor.setLayout(btnEditSurveyorLayout);
        btnEditSurveyorLayout.setHorizontalGroup(
            btnEditSurveyorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEditSurveyorLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel44)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        btnEditSurveyorLayout.setVerticalGroup(
            btnEditSurveyorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout detailSurveyorLayout = new javax.swing.GroupLayout(detailSurveyor);
        detailSurveyor.setLayout(detailSurveyorLayout);
        detailSurveyorLayout.setHorizontalGroup(
            detailSurveyorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailSurveyorLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(detailSurveyorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomorTelefon2)
                    .addComponent(displayNameSurveyor)
                    .addComponent(jLabel45)
                    .addComponent(lblNamaLengkap1)
                    .addComponent(usernameSurveyor)
                    .addComponent(lblNomorTelefon1)
                    .addComponent(emailSurveyor))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailSurveyorLayout.createSequentialGroup()
                .addContainerGap(420, Short.MAX_VALUE)
                .addComponent(btnEditSurveyor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHapusSurveyor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        detailSurveyorLayout.setVerticalGroup(
            detailSurveyorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailSurveyorLayout.createSequentialGroup()
                .addGroup(detailSurveyorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(detailSurveyorLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditSurveyor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(detailSurveyorLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel45)
                        .addGap(18, 18, 18)
                        .addComponent(lblNamaLengkap1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usernameSurveyor)
                        .addGap(18, 18, 18)
                        .addComponent(lblNomorTelefon1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailSurveyor)
                        .addGap(18, 18, 18)
                        .addComponent(lblNomorTelefon2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(displayNameSurveyor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(btnHapusSurveyor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        mainContent.add(detailSurveyor, "card3");

        mainContentScroll.setViewportView(mainContent);

        minimizeBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        minimizeBtn.setText("__");
        minimizeBtn.setToolTipText("");
        minimizeBtn.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        minimizeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(info)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(minimizeBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(closeBtn)
                        .addContainerGap())
                    .addComponent(mainHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                    .addGap(0, 300, Short.MAX_VALUE)
                    .addComponent(mainContentScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(closeBtn)
                            .addComponent(info)))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(minimizeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(mainHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                    .addGap(0, 179, Short.MAX_VALUE)
                    .addComponent(mainContentScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        Utils.exitApp(this);
    }//GEN-LAST:event_closeBtnMouseClicked

    private void homeBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMousePressed
        showHome();
    }//GEN-LAST:event_homeBtnMousePressed

    private void listKostBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listKostBtnMousePressed
        showListKost();
    }//GEN-LAST:event_listKostBtnMousePressed
    
//    Event Handler agar JFrame dapat di drag and drop
    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        mouseDownCompCoords = null;
    }//GEN-LAST:event_formMouseReleased

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        mouseDownCompCoords = evt.getPoint();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        Point currCoords = evt.getLocationOnScreen();
        MainClass.objMainForm.setLocation(currCoords.x - mouseDownCompCoords.x, currCoords.y - mouseDownCompCoords.y);
    }//GEN-LAST:event_formMouseDragged

    private void tableListKostMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableListKostMouseClicked
        selectedKostId = tableListKost.getModel().getValueAt(tableListKost.getSelectedRow(), 3).toString();
        showDetailKost(selectedKostId);
    }//GEN-LAST:event_tableListKostMouseClicked

    private void btnInsertKostMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertKostMouseClicked
        insertData();
    }//GEN-LAST:event_btnInsertKostMouseClicked

    private void aboutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutBtnMouseClicked
        showAbout();
    }//GEN-LAST:event_aboutBtnMouseClicked

    private void infoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_infoMouseClicked

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        // Kode Logout Disini
        int confirmStatus = JOptionPane.showConfirmDialog(this, "Anda yakin ingin logout?", 
                "Confirmation Message", JOptionPane.YES_NO_OPTION);
        
        if(confirmStatus == JOptionPane.YES_OPTION){
            MainClass.logout();
        }
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void minimizeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeBtnMouseClicked
        this.setState(MainForm.ICONIFIED);
    }//GEN-LAST:event_minimizeBtnMouseClicked

    private void btnUpdateSurveyorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateSurveyorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateSurveyorMouseClicked

    private void tableListSurveyorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableListSurveyorMouseClicked
        selectedSurveyorId = tableListSurveyor.getModel().getValueAt(tableListSurveyor.getSelectedRow(), 0).toString();
        showDetailSurveyor(selectedSurveyorId);
    }//GEN-LAST:event_tableListSurveyorMouseClicked

    private void listSurveyorBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listSurveyorBtnMouseClicked
        showListSurveyor();
    }//GEN-LAST:event_listSurveyorBtnMouseClicked

    private void btnHapusSurveyorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusSurveyorMouseClicked
        
    }//GEN-LAST:event_btnHapusSurveyorMouseClicked

    private void btnEditSurveyorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditSurveyorMouseClicked
        showEditSurveyor(selectedSurveyorId);
    }//GEN-LAST:event_btnEditSurveyorMouseClicked
    
//    Method untuk ngerubah warna menu di sidebar
    void setColor(JPanel panel)
    {
        panel.setBackground(new Color(85,65,118));
    }
    
    void resetColor(JPanel panel)
    {
        panel.setBackground(new Color(64,43,100));
    }
    
    // Method for fill listKost JTable with Kost List
    void Show_Kosts_In_JTable() {
        DefaultTableModel model = (DefaultTableModel)tableListKost.getModel();
        // clear jtable content
        model.setRowCount(0);
        Object[] row = new Object[4];
        kosts.forEach((key, value) -> {
            row[0] = value.getName();
            row[1] = value.getOwnerName();
            row[2] = value.getAddress();
            row[3] = key;

            model.addRow(row);
        });

        tableListKost.setModel(model);
    }

    private void Show_Users_In_JTable() {
        DefaultTableModel model = (DefaultTableModel)tableListSurveyor.getModel();
        // clear jtable content
        model.setRowCount(0);
        Object[] row = new Object[4];
        users.forEach((key, value) -> {
            row[0] = key;
            row[1] = value.getEmail();
            row[2] = value.getDisplayName();

            model.addRow(row);
        });

        tableListSurveyor.setModel(model);
    }
    
    // Method for collects inputs and then send to firebase    
    void insertData() {
        
    }

    private void clearInput_InsertKost() {
        
    }

    private void inputError(String errorMessage) {
        JOptionPane.showMessageDialog(rootPane, errorMessage,
                "Whoops! something were wrong!", HEIGHT);
    }
    
    void updateData() {
        
    }
    
    // VIEWS

    // HOME
    void showHome() {
    //  Atur perubahan warna pada tombol sidebar
        setColor(homeBtn);
        resetColor(listKostBtn);
        resetColor(listSurveyorBtn);
        resetColor(aboutBtn);
        
    //  Atur mainHeader content
        menuTitle.setText("TAMBAH KOST BARU");
        menuDesc.setText("Silahkan isi secara lengkap data kost yang ingin di tambahkan");
        
    //  Remove content sblmnya jika ada
        mainContent.removeAll();
        mainContent.repaint();
        mainContent.revalidate();
        
    //  Munculkan konten halaman ke mainContent
        mainContent.add(addSurveyor);
        mainContent.repaint();
        mainContent.revalidate();
    }
    
    // LIST KOST   
    void showListKost() {
    scrollPaneListKost.getViewport().setForeground(Color.BLACK);
    scrollPaneListKost.setBorder(BorderFactory.createEmptyBorder());
    tableListKost.setTableHeader(null);    
        
    //  Atur perubahan warna pada tombol sidebar
        resetColor(homeBtn);
        setColor(listKostBtn);
        resetColor(listSurveyorBtn);
        resetColor(aboutBtn);
    
    //  Atur mainHeader content
        menuTitle.setText("DAFTAR KOST");
        menuDesc.setText("Berikut adalah Daftar Hunian atau Kost yang telah terdaftar");
        
    //  Remove content sblmnya jika ada
        mainContent.removeAll();
        mainContent.repaint();
        mainContent.revalidate();
        
    //  Munculkan konten halaman ke mainContent
        mainContent.add(listKost);
        mainContent.repaint();
        mainContent.revalidate();
    }
    
    // LIST SURVEYOR   
    void showListSurveyor() {
    scrollPaneListSurveyor.getViewport().setForeground(Color.BLACK);
    scrollPaneListSurveyor.setBorder(BorderFactory.createEmptyBorder());
    tableListSurveyor.setTableHeader(null);    
        
    //  Atur perubahan warna pada tombol sidebar
        resetColor(homeBtn);
        resetColor(listKostBtn);
        setColor(listSurveyorBtn);
        resetColor(aboutBtn);
    
    //  Atur mainHeader content
        menuTitle.setText("DAFTAR KOST");
        menuDesc.setText("Berikut adalah Daftar Hunian atau Kost yang telah terdaftar");
        
    //  Remove content sblmnya jika ada
        mainContent.removeAll();
        mainContent.repaint();
        mainContent.revalidate();
        
    //  Munculkan konten halaman ke mainContent
        mainContent.add(listSurveyor);
        mainContent.repaint();
        mainContent.revalidate();
    }
    
    // EDIT SURVEYOR
    void showEditSurveyor(String uniqueId){
        //  Atur mainHeader content
        menuTitle.setText("EDIT DATA DIRI SURVEYOR");
        menuDesc.setText("Silahkan isi secara lengkap data diri surveyor yang ingin di ubah");
        
        //  Remove content sblmnya jika ada
        mainContent.removeAll();
        mainContent.repaint();
        mainContent.revalidate();
        
        //  Munculkan konten halaman ke listKost
        mainContent.add(editSurveyor);
        mainContent.repaint();
        mainContent.revalidate();


        User user = users.get(uniqueId);
        editUsername.setText(uniqueId);
        editEmail.setText(user.getEmail());
        editDisplayName.setText(user.getDisplayName());
    }
    
    // DETAIL KOST
    void showDetailKost(String uniqueId) {
        Kost selectedKost = kosts.get(uniqueId);

        //  Atur mainHeader content
        menuTitle.setText("DETAIL KOST");
        menuDesc.setText(selectedKost.getName());
        
        //  Remove content sblmnya jika ada
        mainContent.removeAll();
        mainContent.repaint();
        mainContent.revalidate();
        
        //  Munculkan konten halaman ke detailKost
        mainContent.add(detailKost);
        mainContent.repaint();
        mainContent.revalidate();
    }
    
    // DETAIL SURVEYOR
    void showDetailSurveyor(String uniqueId) {
        //  Atur mainHeader content
        menuTitle.setText("DETAIL SURVEYOR");
        menuDesc.setText("Informasi lebih detail mengenai Surveyor Kost");
        
        //  Remove content sblmnya jika ada
        mainContent.removeAll();
        mainContent.repaint();
        mainContent.revalidate();
        
        //  Munculkan konten halaman ke detailSurveyor
        mainContent.add(detailSurveyor);
        mainContent.repaint();
        mainContent.revalidate();


        User user = users.get(uniqueId);
        usernameSurveyor.setText(uniqueId);
        emailSurveyor.setText(user.getEmail());
        displayNameSurveyor.setText(user.getDisplayName());
    }
    
    // ABOUT
    void showAbout() {
    StringBuilder objStringBuilder = new StringBuilder(64);
    objStringBuilder.append("<html>Merupakan aplikasi yang berfungsi untuk pendataan kost atau hunian di seluruh Indonesia.")
        .append(" Aplikasi ini memiliki misi sosial yaitu membantu perantau di Indonesia dalam mencari dan memesan hunian sewa, ")
        .append("hingga menemukan jasa pindahan saat diperlukan</html>");
        
    aboutDesc.setText(objStringBuilder.toString());
        
    //  Atur perubahan warna pada tombol sidebar
        resetColor(homeBtn);
        resetColor(listKostBtn);
        resetColor(listSurveyorBtn);
        setColor(aboutBtn);
        
    //  Atur mainHeader content
        menuTitle.setText("TENTANG KAMI");
        menuDesc.setText("Tentang Aplikasi dan Tim yang bekerja di belakang nya");
        
    //  Remove content sblmnya jika ada
        mainContent.removeAll();
        mainContent.repaint();
        mainContent.revalidate();
        
    //  Munculkan konten halaman ke mainContent
        mainContent.add(about);
        mainContent.repaint();
        mainContent.revalidate();
    }
    
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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel about;
    private javax.swing.JPanel aboutBtn;
    private javax.swing.JLabel aboutDesc;
    private javax.swing.JPanel addSurveyor;
    private javax.swing.JLabel alamatLengkapKost;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btnEditSurveyor;
    private javax.swing.ButtonGroup btnGroupEditBiayaListrik;
    private javax.swing.ButtonGroup btnGroupEditBiayaPdam;
    private javax.swing.JPanel btnHapusSurveyor;
    private javax.swing.JPanel btnInsertKost;
    private javax.swing.JPanel btnLogout;
    private javax.swing.JPanel btnUpdateSurveyor;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JLabel currentUserLoggedIn;
    private javax.swing.JPanel detailKost;
    private javax.swing.JPanel detailSurveyor;
    private javax.swing.JLabel devOne;
    private javax.swing.JLabel devThree;
    private javax.swing.JLabel devTwo;
    private javax.swing.JLabel displayNameSurveyor;
    private javax.swing.JTextField editDisplayName;
    private javax.swing.JTextField editEmail;
    private javax.swing.JPanel editSurveyor;
    private javax.swing.JTextField editUsername;
    private javax.swing.JLabel emailSurveyor;
    private javax.swing.JLabel hargaBulanan;
    private javax.swing.JPanel homeBtn;
    private javax.swing.JLabel info;
    private javax.swing.JTextField insertDisplayName;
    private javax.swing.JTextField insertEmail;
    private javax.swing.JPasswordField insertPassword;
    private javax.swing.JTextField insertUsername1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel jumlahKamar;
    private javax.swing.JLabel ketentuanListrik;
    private javax.swing.JLabel ketentuanPDAM;
    private javax.swing.JLabel lblAlamatLengkap;
    private javax.swing.JLabel lblHargaBulanan;
    private javax.swing.JLabel lblJumlahKamar;
    private javax.swing.JLabel lblKamar;
    private javax.swing.JLabel lblKetentuanKost;
    private javax.swing.JLabel lblListrik;
    private javax.swing.JLabel lblNamaKost;
    private javax.swing.JLabel lblNamaLengkap;
    private javax.swing.JLabel lblNamaLengkap1;
    private javax.swing.JLabel lblNomorTelefon;
    private javax.swing.JLabel lblNomorTelefon1;
    private javax.swing.JLabel lblNomorTelefon2;
    private javax.swing.JLabel lblPDAM;
    private javax.swing.JPanel listKost;
    private javax.swing.JPanel listKostBtn;
    private javax.swing.JPanel listSurveyor;
    private javax.swing.JPanel listSurveyorBtn;
    private javax.swing.JPanel mainContent;
    private javax.swing.JScrollPane mainContentScroll;
    private javax.swing.JPanel mainHeader;
    private javax.swing.JLabel menuDesc;
    private javax.swing.JLabel menuTitle;
    private javax.swing.JLabel minimizeBtn;
    private javax.swing.JLabel namaKost;
    private javax.swing.JLabel namaLengkapPemilik;
    private javax.swing.JLabel nomorTeleponPemilik;
    private javax.swing.JScrollPane scrollPaneListKost;
    private javax.swing.JScrollPane scrollPaneListSurveyor;
    private javax.swing.JPanel sidebar;
    private javax.swing.JLabel sidebarTitle;
    private javax.swing.JTable tableListKost;
    private javax.swing.JTable tableListSurveyor;
    private javax.swing.JSeparator titleSeparator;
    private javax.swing.JLabel usernameSurveyor;
    // End of variables declaration//GEN-END:variables
}

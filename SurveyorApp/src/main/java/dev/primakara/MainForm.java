/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.primakara;

import com.google.firebase.database.*;
import dev.primakara.model.Kost;

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
    private String selectedKostId;

    /**
     * Creates new form Main_Form
     */
    public MainForm() {

        initComponents();

        // Remove column that contain Unique ID
        tableListKost.removeColumn(tableListKost.getColumnModel().getColumn(3));
        
        showListKost();
    }

    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        if (visible) {
            listenToKostData();
        }
    }

    public void listenToKostData() {
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
        mainHeader = new javax.swing.JPanel();
        menuTitle = new javax.swing.JLabel();
        menuDesc = new javax.swing.JLabel();
        mainContentScroll = new javax.swing.JScrollPane();
        mainContent = new javax.swing.JPanel();
        addKost = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        insertNamaKost = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        insertJumlahKamar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        insertNamaLengkapPemilik = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        deskripsiScrollPane = new javax.swing.JScrollPane();
        insertDeskripsiKost = new javax.swing.JTextArea();
        btnInsertKost = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        insertAlamatKost = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        insertHargaBulanan = new javax.swing.JFormattedTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        biayaPdamSudahTermasuk = new javax.swing.JRadioButton();
        biayaPdamBelumTermasuk = new javax.swing.JRadioButton();
        jLabel24 = new javax.swing.JLabel();
        biayaListrikSudahTermasuk = new javax.swing.JRadioButton();
        biayaListrikBelumTermasuk = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        insertNomorTeleponPemilik = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        editKost = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        editNamaKost = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        editJumlahKamar = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        editNamaLengkapPemilik = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        deskripsiScrollPane3 = new javax.swing.JScrollPane();
        editDeskripsiKost = new javax.swing.JTextArea();
        btnSaveUpdateKost = new javax.swing.JPanel();
        btnUpdateKost = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        editAlamatKost = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        editHargaBulanan = new javax.swing.JFormattedTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        editBiayaPdamSudahTermasuk = new javax.swing.JRadioButton();
        editBiayaPdamBelumTermasuk = new javax.swing.JRadioButton();
        jLabel51 = new javax.swing.JLabel();
        editBiayaListrikSudahTermasuk = new javax.swing.JRadioButton();
        editBiayaListrikBelumTermasuk = new javax.swing.JRadioButton();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        editNomorTeleponPemilik = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        listKost = new javax.swing.JPanel();
        tableListKost = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
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
        btnEditKost = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        btnHapusKost = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
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
        jLabel2.setText("Tambah Kost Baru");

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
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
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

        jLabel34.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("You logged in as,");

        currentUserLoggedIn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        currentUserLoggedIn.setForeground(new java.awt.Color(255, 255, 255));
        currentUserLoggedIn.setText("User");

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
            .addComponent(listKostBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(titleSeparator)
                    .addComponent(sidebarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
            .addComponent(aboutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(40, 40, 40)
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
                .addComponent(aboutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(currentUserLoggedIn))
                .addGap(20, 20, 20))
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

        addKost.setBackground(new java.awt.Color(255, 255, 255));
        addKost.setForeground(new java.awt.Color(110, 89, 222));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("Nama Kost");

        insertNamaKost.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        insertNamaKost.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        insertNamaKost.setBorder(null);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setText("Alamat Kost");

        insertJumlahKamar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        insertJumlahKamar.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        insertJumlahKamar.setBorder(null);

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("Deskripsi Kost");

        insertNamaLengkapPemilik.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        insertNamaLengkapPemilik.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        insertNamaLengkapPemilik.setBorder(null);

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel5.setText("Nama Lengkap");

        deskripsiScrollPane.setBorder(null);
        deskripsiScrollPane.setForeground(new java.awt.Color(110, 89, 222));

        insertDeskripsiKost.setColumns(20);
        insertDeskripsiKost.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        insertDeskripsiKost.setLineWrap(true);
        insertDeskripsiKost.setRows(5);
        insertDeskripsiKost.setBorder(null);
        deskripsiScrollPane.setViewportView(insertDeskripsiKost);

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

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel7.setText("INFORMASI PEMILIK");

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel19.setText("Jumlah Kamar");

        insertAlamatKost.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        insertAlamatKost.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        insertAlamatKost.setBorder(null);

        jLabel20.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel20.setText("Harga Bulanan");

        insertHargaBulanan.setBorder(null);

        jLabel22.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel22.setText("Ketentuan Kost");

        jLabel23.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel23.setText("Biaya PDAM");

        biayaPdamSudahTermasuk.setBackground(new java.awt.Color(255, 255, 255));
        biayaPdamSudahTermasuk.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        biayaPdamSudahTermasuk.setText("Sudah Termasuk");

        biayaPdamBelumTermasuk.setBackground(new java.awt.Color(255, 255, 255));
        biayaPdamBelumTermasuk.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        biayaPdamBelumTermasuk.setText("Belum  Termasuk");

        jLabel24.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel24.setText("Biaya Listrik");

        biayaListrikSudahTermasuk.setBackground(new java.awt.Color(255, 255, 255));
        biayaListrikSudahTermasuk.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        biayaListrikSudahTermasuk.setText("Sudah Termasuk");

        biayaListrikBelumTermasuk.setBackground(new java.awt.Color(255, 255, 255));
        biayaListrikBelumTermasuk.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        biayaListrikBelumTermasuk.setText("Belum  Termasuk");

        jLabel25.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel25.setText("INFORMASI KOST");

        jLabel26.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel26.setText("Nomor Telepon");

        insertNomorTeleponPemilik.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        insertNomorTeleponPemilik.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        insertNomorTeleponPemilik.setBorder(null);

        jSeparator5.setBackground(new java.awt.Color(110, 89, 222));
        jSeparator5.setForeground(new java.awt.Color(110, 89, 222));

        jSeparator6.setBackground(new java.awt.Color(110, 89, 222));
        jSeparator6.setForeground(new java.awt.Color(110, 89, 222));

        jSeparator7.setBackground(new java.awt.Color(110, 89, 222));
        jSeparator7.setForeground(new java.awt.Color(110, 89, 222));

        jSeparator16.setBackground(new java.awt.Color(110, 89, 222));
        jSeparator16.setForeground(new java.awt.Color(110, 89, 222));

        jSeparator8.setBackground(new java.awt.Color(110, 89, 222));
        jSeparator8.setForeground(new java.awt.Color(110, 89, 222));

        jSeparator9.setBackground(new java.awt.Color(110, 89, 222));
        jSeparator9.setForeground(new java.awt.Color(110, 89, 222));

        jSeparator1.setBackground(new java.awt.Color(110, 89, 222));
        jSeparator1.setForeground(new java.awt.Color(110, 89, 222));

        javax.swing.GroupLayout addKostLayout = new javax.swing.GroupLayout(addKost);
        addKost.setLayout(addKostLayout);
        addKostLayout.setHorizontalGroup(
            addKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addKostLayout.createSequentialGroup()
                .addGroup(addKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addKostLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInsertKost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addKostLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(addKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel26)
                            .addComponent(jLabel25)
                            .addComponent(jLabel7)
                            .addComponent(jLabel22)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(deskripsiScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addGroup(addKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(addKostLayout.createSequentialGroup()
                                    .addGroup(addKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(insertAlamatKost, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                        .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(insertHargaBulanan, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator5)
                                        .addComponent(insertJumlahKamar, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(135, 135, 135))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(insertNamaKost, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)))
                            .addGroup(addKostLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(addKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(biayaPdamBelumTermasuk)
                                    .addComponent(biayaPdamSudahTermasuk)
                                    .addComponent(jLabel24)
                                    .addComponent(biayaListrikBelumTermasuk)
                                    .addComponent(biayaListrikSudahTermasuk)
                                    .addComponent(jLabel23)))
                            .addComponent(jSeparator9)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                            .addComponent(insertNomorTeleponPemilik)
                            .addComponent(jSeparator16)
                            .addComponent(insertNamaLengkapPemilik))
                        .addGap(0, 35, Short.MAX_VALUE)))
                .addContainerGap())
        );
        addKostLayout.setVerticalGroup(
            addKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addKostLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel25)
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(insertNamaKost, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insertAlamatKost, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(insertJumlahKamar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(insertHargaBulanan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(biayaPdamSudahTermasuk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(biayaPdamBelumTermasuk)
                .addGap(20, 20, 20)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(biayaListrikSudahTermasuk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(biayaListrikBelumTermasuk)
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deskripsiScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insertNamaLengkapPemilik, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insertNomorTeleponPemilik, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(btnInsertKost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        mainContent.add(addKost, "card2");

        editKost.setBackground(new java.awt.Color(255, 255, 255));

        jLabel40.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel40.setText("Nama Kost");

        editNamaKost.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        editNamaKost.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        editNamaKost.setBorder(null);

        jLabel41.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel41.setText("Alamat Kost");

        editJumlahKamar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        editJumlahKamar.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        editJumlahKamar.setBorder(null);

        jLabel42.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel42.setText("Deskripsi Kost");

        editNamaLengkapPemilik.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        editNamaLengkapPemilik.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        editNamaLengkapPemilik.setBorder(null);

        jLabel43.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel43.setText("Nama Lengkap");

        deskripsiScrollPane3.setBorder(null);

        editDeskripsiKost.setColumns(20);
        editDeskripsiKost.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        editDeskripsiKost.setLineWrap(true);
        editDeskripsiKost.setRows(5);
        editDeskripsiKost.setWrapStyleWord(true);
        editDeskripsiKost.setBorder(null);
        deskripsiScrollPane3.setViewportView(editDeskripsiKost);

        btnSaveUpdateKost.setBackground(new java.awt.Color(85, 65, 118));
        btnSaveUpdateKost.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSaveUpdateKost.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveUpdateKost.setToolTipText("");
        btnSaveUpdateKost.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSaveUpdateKost.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveUpdateKostMouseClicked(evt);
            }
        });

        btnUpdateKost.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdateKost.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateKost.setText("SIMPAN");

        javax.swing.GroupLayout btnSaveUpdateKostLayout = new javax.swing.GroupLayout(btnSaveUpdateKost);
        btnSaveUpdateKost.setLayout(btnSaveUpdateKostLayout);
        btnSaveUpdateKostLayout.setHorizontalGroup(
            btnSaveUpdateKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSaveUpdateKostLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnUpdateKost)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        btnSaveUpdateKostLayout.setVerticalGroup(
            btnSaveUpdateKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnUpdateKost, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jLabel45.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel45.setText("INFORMASI PEMILIK");

        jLabel46.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel46.setText("Jumlah Kamar");

        editAlamatKost.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        editAlamatKost.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        editAlamatKost.setBorder(null);

        jLabel47.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel47.setText("Harga Bulanan");

        editHargaBulanan.setBorder(null);

        jLabel49.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel49.setText("Ketentuan Kost");

        jLabel50.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel50.setText("Biaya PDAM");

        editBiayaPdamSudahTermasuk.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupEditBiayaPdam.add(editBiayaPdamSudahTermasuk);
        editBiayaPdamSudahTermasuk.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        editBiayaPdamSudahTermasuk.setText("Sudah Termasuk");

        editBiayaPdamBelumTermasuk.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupEditBiayaPdam.add(editBiayaPdamBelumTermasuk);
        editBiayaPdamBelumTermasuk.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        editBiayaPdamBelumTermasuk.setText("Belum  Termasuk");

        jLabel51.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel51.setText("Biaya Listrik");

        editBiayaListrikSudahTermasuk.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupEditBiayaListrik.add(editBiayaListrikSudahTermasuk);
        editBiayaListrikSudahTermasuk.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        editBiayaListrikSudahTermasuk.setText("Sudah Termasuk");

        editBiayaListrikBelumTermasuk.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupEditBiayaListrik.add(editBiayaListrikBelumTermasuk);
        editBiayaListrikBelumTermasuk.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        editBiayaListrikBelumTermasuk.setText("Belum  Termasuk");

        jLabel52.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel52.setText("INFORMASI KOST");

        jLabel53.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel53.setText("Nomor Telepon");

        editNomorTeleponPemilik.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        editNomorTeleponPemilik.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        editNomorTeleponPemilik.setBorder(null);

        jSeparator10.setBackground(new java.awt.Color(110, 89, 222));
        jSeparator10.setForeground(new java.awt.Color(110, 89, 222));

        jSeparator11.setBackground(new java.awt.Color(110, 89, 222));
        jSeparator11.setForeground(new java.awt.Color(110, 89, 222));

        jSeparator12.setBackground(new java.awt.Color(110, 89, 222));
        jSeparator12.setForeground(new java.awt.Color(110, 89, 222));

        jSeparator13.setBackground(new java.awt.Color(110, 89, 222));
        jSeparator13.setForeground(new java.awt.Color(110, 89, 222));

        jSeparator14.setBackground(new java.awt.Color(110, 89, 222));
        jSeparator14.setForeground(new java.awt.Color(110, 89, 222));

        jSeparator15.setBackground(new java.awt.Color(110, 89, 222));
        jSeparator15.setForeground(new java.awt.Color(110, 89, 222));

        jSeparator4.setBackground(new java.awt.Color(110, 89, 222));
        jSeparator4.setForeground(new java.awt.Color(110, 89, 222));

        javax.swing.GroupLayout editKostLayout = new javax.swing.GroupLayout(editKost);
        editKost.setLayout(editKostLayout);
        editKostLayout.setHorizontalGroup(
            editKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editKostLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSaveUpdateKost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(editKostLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(editKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editNamaLengkapPemilik, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43)
                    .addComponent(editNomorTeleponPemilik, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53)
                    .addComponent(jLabel52)
                    .addComponent(jLabel45)
                    .addComponent(jLabel49)
                    .addComponent(jLabel42)
                    .addComponent(jLabel41)
                    .addComponent(jLabel40)
                    .addComponent(deskripsiScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                    .addComponent(jLabel46)
                    .addComponent(jLabel47)
                    .addGroup(editKostLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(editKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editBiayaPdamBelumTermasuk)
                            .addComponent(editBiayaPdamSudahTermasuk)
                            .addComponent(jLabel51)
                            .addComponent(editBiayaListrikBelumTermasuk)
                            .addComponent(editBiayaListrikSudahTermasuk)
                            .addComponent(jLabel50)))
                    .addComponent(editHargaBulanan, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(editJumlahKamar)
                    .addComponent(editAlamatKost)
                    .addComponent(editNamaKost)
                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        editKostLayout.setVerticalGroup(
            editKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editKostLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel52)
                .addGap(20, 20, 20)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editNamaKost, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editAlamatKost, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editJumlahKamar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editHargaBulanan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editBiayaPdamSudahTermasuk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editBiayaPdamBelumTermasuk)
                .addGap(20, 20, 20)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editBiayaListrikSudahTermasuk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editBiayaListrikBelumTermasuk)
                .addGap(20, 20, 20)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deskripsiScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel45)
                .addGap(24, 24, 24)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editNamaLengkapPemilik, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editNomorTeleponPemilik, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(btnSaveUpdateKost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        mainContent.add(editKost, "card2");

        listKost.setBackground(new java.awt.Color(255, 255, 255));

        tableListKost.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        tableListKost.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "KOST", "PEMILIK", "ALAMAT", "id"
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
        tableListKost.setGridColor(new java.awt.Color(0, 0, 0));
        tableListKost.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tableListKost.setRowHeight(50);
        tableListKost.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tableListKost.setShowHorizontalLines(false);
        tableListKost.setShowVerticalLines(false);
        tableListKost.getTableHeader().setResizingAllowed(false);
        tableListKost.getTableHeader().setReorderingAllowed(false);
        tableListKost.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableListKostMouseClicked(evt);
            }
        });

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

        javax.swing.GroupLayout listKostLayout = new javax.swing.GroupLayout(listKost);
        listKost.setLayout(listKostLayout);
        listKostLayout.setHorizontalGroup(
            listKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listKostLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(listKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tableListKost, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        listKostLayout.setVerticalGroup(
            listKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listKostLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tableListKost, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        if (tableListKost.getColumnModel().getColumnCount() > 0) {
            tableListKost.getColumnModel().getColumn(0).setResizable(false);
            tableListKost.getColumnModel().getColumn(0).setPreferredWidth(10);
            tableListKost.getColumnModel().getColumn(1).setPreferredWidth(10);
            tableListKost.getColumnModel().getColumn(2).setPreferredWidth(10);
            tableListKost.getColumnModel().getColumn(3).setResizable(false);
            tableListKost.getColumnModel().getColumn(3).setPreferredWidth(0);
        }

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

        btnEditKost.setBackground(new java.awt.Color(85, 65, 118));
        btnEditKost.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEditKost.setForeground(new java.awt.Color(255, 255, 255));
        btnEditKost.setToolTipText("");
        btnEditKost.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditKost.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditKostMouseClicked(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("EDIT");

        javax.swing.GroupLayout btnEditKostLayout = new javax.swing.GroupLayout(btnEditKost);
        btnEditKost.setLayout(btnEditKostLayout);
        btnEditKostLayout.setHorizontalGroup(
            btnEditKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEditKostLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel38)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        btnEditKostLayout.setVerticalGroup(
            btnEditKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        btnHapusKost.setBackground(new java.awt.Color(85, 65, 118));
        btnHapusKost.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnHapusKost.setForeground(new java.awt.Color(255, 255, 255));
        btnHapusKost.setToolTipText("");
        btnHapusKost.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("HAPUS");

        javax.swing.GroupLayout btnHapusKostLayout = new javax.swing.GroupLayout(btnHapusKost);
        btnHapusKost.setLayout(btnHapusKostLayout);
        btnHapusKostLayout.setHorizontalGroup(
            btnHapusKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnHapusKostLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel39)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        btnHapusKostLayout.setVerticalGroup(
            btnHapusKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

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
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailKostLayout.createSequentialGroup()
                        .addGap(0, 386, Short.MAX_VALUE)
                        .addComponent(btnEditKost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnHapusKost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(20, 20, 20)
                .addGroup(detailKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHapusKost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditKost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jLabel21.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(110, 89, 222));
        jLabel21.setText("Wahyu Budi Saputra");

        jLabel27.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(110, 89, 222));
        jLabel27.setText("1701020002");

        jLabel28.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(110, 89, 222));
        jLabel28.setText("1701020041");

        jLabel29.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(110, 89, 222));
        jLabel29.setText("Marvel Alexius");

        jLabel30.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(110, 89, 222));
        jLabel30.setText("1701020017");

        jLabel31.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(110, 89, 222));
        jLabel31.setText("Dody Prasetyo");

        javax.swing.GroupLayout aboutLayout = new javax.swing.GroupLayout(about);
        about.setLayout(aboutLayout);
        aboutLayout.setHorizontalGroup(
            aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(aboutLayout.createSequentialGroup()
                        .addGroup(aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(devOne, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(aboutLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel21))
                            .addGroup(aboutLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel27)))
                        .addGroup(aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(aboutLayout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(devTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(devThree, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(aboutLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel28))
                                .addGap(136, 136, 136)
                                .addGroup(aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel30))
                                .addGap(80, 80, 80))))
                    .addGroup(aboutLayout.createSequentialGroup()
                        .addGroup(aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(aboutDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))))
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
                        .addComponent(jLabel29)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel28))
                    .addGroup(aboutLayout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel30)))
                .addGap(0, 0, 0))
        );

        mainContent.add(about, "card2");

        mainContentScroll.setViewportView(mainContent);

        minimizeBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        minimizeBtn.setText("__");
        minimizeBtn.setToolTipText("");
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
                        .addContainerGap()
                        .addComponent(minimizeBtn)))
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

    private void btnSaveUpdateKostMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveUpdateKostMouseClicked
        updateData();
    }//GEN-LAST:event_btnSaveUpdateKostMouseClicked

    private void btnEditKostMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditKostMouseClicked
        showEditKost(selectedKostId);
    }//GEN-LAST:event_btnEditKostMouseClicked

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
    }
    
    // Method for collects inputs and then send to firebase    
    void insertData() {
        String namaKost = insertNamaKost.getText().trim();
        String alamatKost = insertAlamatKost.getText().trim();
        int jumlahKamar = Integer.parseInt(insertJumlahKamar.getText().trim());
        int hargaBulanan = Integer.parseInt(insertHargaBulanan.getText().trim());
        String deskripsiKost = insertDeskripsiKost.getText().trim();
        String pemilikKost = insertNamaLengkapPemilik.getText().trim();
        String telponPemilik = insertNomorTeleponPemilik.getText().trim();
        boolean biayalistrik = false;
        boolean biayapam = false;
        
        if (biayaListrikSudahTermasuk.isSelected()) {
            biayalistrik = true;
        } else if (biayaListrikBelumTermasuk.isSelected()) {
            biayalistrik = false;
        }
        
        if (biayaPdamSudahTermasuk.isSelected()) {
            biayapam = true;
        } else if (biayaPdamBelumTermasuk.isSelected()) {
            biayapam = false;
        }


        Kost kost = new Kost();
        kost.setName(namaKost);
        kost.setAddress(alamatKost);
        kost.setRooms(jumlahKamar);
        kost.setPrice(hargaBulanan);
        kost.setElectricityCost(biayalistrik);
        kost.setWaterCost(biayapam);
        kost.setDescription(deskripsiKost);
        kost.setOwnerName(pemilikKost);
        kost.setOwnerPhoneNumber(telponPemilik);

        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference();

        DatabaseReference kostsRef = ref.child("kosts");
        kostsRef.push().setValue(kost, (error, ref1) -> {
            if (error != null) {
                JOptionPane.showMessageDialog(rootPane, "Data could not be saved " + error.getMessage(),
                        "Whoops! something were wrong!", HEIGHT);
            } else {
                showListKost();
                clearInput_InsertKost();
            }
        });
    }

    private void clearInput_InsertKost() {
        insertNamaKost.setText("");
        insertAlamatKost.setText("");
        insertJumlahKamar.setText("");
        insertHargaBulanan.setText("");
        insertDeskripsiKost.setText("");
        insertNamaLengkapPemilik.setText("");
        insertNomorTeleponPemilik.setText("");

        biayaListrikSudahTermasuk.setSelected(false);
        biayaListrikBelumTermasuk.setSelected(false);
        biayaPdamSudahTermasuk.setSelected(false);
        biayaPdamBelumTermasuk.setSelected(false);
    }
    
    void updateData() {
        String namaKost = editNamaKost.getText().trim();
        String alamatKost = editAlamatKost.getText().trim();
        int jumlahKamar = Integer.parseInt(editJumlahKamar.getText().trim());
        int hargaBulanan = Integer.parseInt(editHargaBulanan.getText().trim());
        String deskripsiKost = editDeskripsiKost.getText().trim();
        String pemilikKost = editNamaLengkapPemilik.getText().trim();
        String telponPemilik = editNomorTeleponPemilik.getText().trim();
        boolean biayalistrik = false;
        boolean biayapam = false;

        if (editBiayaListrikSudahTermasuk.isSelected()) {
            biayalistrik = true;
        } else if (editBiayaListrikBelumTermasuk.isSelected()) {
            biayalistrik = false;
        }

        if (editBiayaPdamSudahTermasuk.isSelected()) {
            biayapam = true;
        } else if (editBiayaPdamBelumTermasuk.isSelected()) {
            biayapam = false;
        }


        Kost kost = new Kost();
        kost.setName(namaKost);
        kost.setAddress(alamatKost);
        kost.setRooms(jumlahKamar);
        kost.setPrice(hargaBulanan);
        kost.setElectricityCost(biayalistrik);
        kost.setWaterCost(biayapam);
        kost.setDescription(deskripsiKost);
        kost.setOwnerName(pemilikKost);
        kost.setOwnerPhoneNumber(telponPemilik);

        Map<String, Object> kostUpdate = new HashMap<>();
        kostUpdate.put(selectedKostId, kost);

        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference();
        DatabaseReference kostsRef = ref.child("kosts");

        kostsRef.updateChildren(kostUpdate, (error, ref1) -> {
            showDetailKost(selectedKostId);
        });
    }

    //Method for send data to inputs in editKost
    void sendDataToEditKost(String uniqueId) {
        Kost selectedKost = kosts.get(uniqueId);

        editNamaKost.setText(selectedKost.getName());
        editAlamatKost.setText(selectedKost.getAddress());
        editJumlahKamar.setText(Integer.toString(selectedKost.getRooms()));
        editHargaBulanan.setText(Integer.toString(selectedKost.getPrice()));
        editDeskripsiKost.setText(selectedKost.getDescription());
        editNamaLengkapPemilik.setText(selectedKost.getOwnerName());
        editNomorTeleponPemilik.setText(selectedKost.getOwnerPhoneNumber());

        
        if (selectedKost.getWaterCost()) {
            btnGroupEditBiayaPdam.setSelected(editBiayaPdamSudahTermasuk.getModel(), true);
        } else {
            btnGroupEditBiayaPdam.setSelected(editBiayaPdamBelumTermasuk.getModel(), true);
        }
        
        if (selectedKost.getElectricityCost()) {
            btnGroupEditBiayaListrik.setSelected(editBiayaListrikSudahTermasuk.getModel(), true);
        } else {
            btnGroupEditBiayaListrik.setSelected(editBiayaListrikBelumTermasuk.getModel(), true);
        }
    }
    
    //Method for send data to labels
    void sendDataToDetailKost(String uniqueId){
        Kost selectedKost = kosts.get(uniqueId);

        namaKost.setText(selectedKost.getName());
        alamatLengkapKost.setText(selectedKost.getAddress());
        jumlahKamar.setText(Integer.toString(selectedKost.getRooms()));
        hargaBulanan.setText(Integer.toString(selectedKost.getPrice()));
        namaLengkapPemilik.setText(selectedKost.getOwnerName());
        nomorTeleponPemilik.setText(selectedKost.getOwnerPhoneNumber());

        if (selectedKost.getElectricityCost()) ketentuanListrik.setText("Sudah Termasuk");
        else ketentuanListrik.setText("Belum Termasuk");

        if (selectedKost.getWaterCost()) ketentuanPDAM.setText("Sudah Termasuk");
        else ketentuanPDAM.setText("Belum Termasuk");
    }
    
    // VIEWS

    // HOME
    void showHome() {
    //  Atur perubahan warna pada tombol sidebar
        setColor(homeBtn);
        resetColor(listKostBtn);
        resetColor(aboutBtn);
        
    //  Atur mainHeader content
        menuTitle.setText("TAMBAH KOST BARU");
        menuDesc.setText("Silahkan isi secara lengkap data kost yang ingin di tambahkan");
        
    //  Remove content sblmnya jika ada
        mainContent.removeAll();
        mainContent.repaint();
        mainContent.revalidate();
        
    //  Munculkan konten halaman ke mainContent
        mainContent.add(addKost);
        mainContent.repaint();
        mainContent.revalidate();
    }
    
    // LIST KOST   
    void showListKost() {
    //  Atur perubahan warna pada tombol sidebar
        resetColor(homeBtn);
        setColor(listKostBtn);
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
    
    // EDIT KOST
    void showEditKost(String uniqueId){
        //  Atur mainHeader content
        menuTitle.setText("EDIT DATA KOST");
        menuDesc.setText("Silahkan isi secara lengkap data kost yang ingin di tambahkan");
        
        //  Remove content sblmnya jika ada
        mainContent.removeAll();
        mainContent.repaint();
        mainContent.revalidate();
        
        //  Munculkan konten halaman ke listKost
        mainContent.add(editKost);
        mainContent.repaint();
        mainContent.revalidate();
        
        sendDataToEditKost(uniqueId);
    }
    
    // DETAIL KOST
    void showDetailKost(String uniqueId) {
        Kost selectedKost = kosts.get(uniqueId);
        // Send Data to Detail Labels
        sendDataToDetailKost(uniqueId);

        //  Atur mainHeader content
        menuTitle.setText("DETAIL KOST");
        menuDesc.setText(selectedKost.getName());
        
        //  Remove content sblmnya jika ada
        mainContent.removeAll();
        mainContent.repaint();
        mainContent.revalidate();
        
        //  Munculkan konten halaman ke listKost
        mainContent.add(detailKost);
        mainContent.repaint();
        mainContent.revalidate();
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
    private javax.swing.JPanel addKost;
    private javax.swing.JLabel alamatLengkapKost;
    private javax.swing.JPanel bg;
    private javax.swing.JRadioButton biayaListrikBelumTermasuk;
    private javax.swing.JRadioButton biayaListrikSudahTermasuk;
    private javax.swing.JRadioButton biayaPdamBelumTermasuk;
    private javax.swing.JRadioButton biayaPdamSudahTermasuk;
    private javax.swing.JPanel btnEditKost;
    private javax.swing.ButtonGroup btnGroupEditBiayaListrik;
    private javax.swing.ButtonGroup btnGroupEditBiayaPdam;
    private javax.swing.JPanel btnHapusKost;
    private javax.swing.JPanel btnInsertKost;
    private javax.swing.JPanel btnLogout;
    private javax.swing.JPanel btnSaveUpdateKost;
    private javax.swing.JLabel btnUpdateKost;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JLabel currentUserLoggedIn;
    private javax.swing.JScrollPane deskripsiScrollPane;
    private javax.swing.JScrollPane deskripsiScrollPane3;
    private javax.swing.JPanel detailKost;
    private javax.swing.JLabel devOne;
    private javax.swing.JLabel devThree;
    private javax.swing.JLabel devTwo;
    private javax.swing.JTextField editAlamatKost;
    private javax.swing.JRadioButton editBiayaListrikBelumTermasuk;
    private javax.swing.JRadioButton editBiayaListrikSudahTermasuk;
    private javax.swing.JRadioButton editBiayaPdamBelumTermasuk;
    private javax.swing.JRadioButton editBiayaPdamSudahTermasuk;
    private javax.swing.JTextArea editDeskripsiKost;
    private javax.swing.JFormattedTextField editHargaBulanan;
    private javax.swing.JTextField editJumlahKamar;
    private javax.swing.JPanel editKost;
    private javax.swing.JTextField editNamaKost;
    private javax.swing.JTextField editNamaLengkapPemilik;
    private javax.swing.JTextField editNomorTeleponPemilik;
    private javax.swing.JLabel hargaBulanan;
    private javax.swing.JPanel homeBtn;
    private javax.swing.JLabel info;
    private javax.swing.JTextField insertAlamatKost;
    private javax.swing.JTextArea insertDeskripsiKost;
    private javax.swing.JFormattedTextField insertHargaBulanan;
    private javax.swing.JTextField insertJumlahKamar;
    private javax.swing.JTextField insertNamaKost;
    private javax.swing.JTextField insertNamaLengkapPemilik;
    private javax.swing.JTextField insertNomorTeleponPemilik;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
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
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
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
    private javax.swing.JLabel lblNomorTelefon;
    private javax.swing.JLabel lblPDAM;
    private javax.swing.JPanel listKost;
    private javax.swing.JPanel listKostBtn;
    private javax.swing.JPanel mainContent;
    private javax.swing.JScrollPane mainContentScroll;
    private javax.swing.JPanel mainHeader;
    private javax.swing.JLabel menuDesc;
    private javax.swing.JLabel menuTitle;
    private javax.swing.JLabel minimizeBtn;
    private javax.swing.JLabel namaKost;
    private javax.swing.JLabel namaLengkapPemilik;
    private javax.swing.JLabel nomorTeleponPemilik;
    private javax.swing.JPanel sidebar;
    private javax.swing.JLabel sidebarTitle;
    private javax.swing.JTable tableListKost;
    private javax.swing.JSeparator titleSeparator;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.primakara;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author hellyeah
 */
public class MainForm extends javax.swing.JFrame {
    
    static Point mouseDownCompCoords;
    static int selectedRowIndex;

    /**
     * Creates new form Main_Form
     */
    public MainForm() {

        initComponents();
        
        //  Atur mainHeader content
        menuTitle.setText("TAMBAH SURVEYOR BARU");
        menuDesc.setText("Silahkan isi secara lengkap data surveyor yang ingin di tambahkan");
        
        //  Remove content sblmnya jika ada
        mainContent.removeAll();
        mainContent.repaint();
        mainContent.revalidate();
        
        //  Munculkan konten halaman ke mainContent
        mainContent.add(addSurveyor);
        mainContent.repaint();
        mainContent.revalidate();
    }
    
    public Connection getConnection()
    {
        Connection con = null;
        
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/uas","root","");
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        biayalistrik = new javax.swing.ButtonGroup();
        biayapam = new javax.swing.ButtonGroup();
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
        listSurveyorBtn = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        aboutBtn = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        mainHeader = new javax.swing.JPanel();
        menuTitle = new javax.swing.JLabel();
        menuDesc = new javax.swing.JLabel();
        mainContentScroll = new javax.swing.JScrollPane();
        mainContent = new javax.swing.JPanel();
        addSurveyor = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtSurveyorUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtSurveyorEmail = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtSurveyorDisplayName = new javax.swing.JFormattedTextField();
        jLabel25 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtSurveyorPassword = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        about = new javax.swing.JPanel();
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
        jSeparator5 = new javax.swing.JSeparator();
        jLabel37 = new javax.swing.JLabel();
        lblNamaLengkap = new javax.swing.JLabel();
        namaLengkapPemilik = new javax.swing.JLabel();
        lblNomorTelefon = new javax.swing.JLabel();
        nomorTeleponPemilik = new javax.swing.JLabel();
        listSurveyor = new javax.swing.JPanel();
        tableListSurveyor = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

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
        info.setText("Created by Primakara Developers");
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        listSurveyorBtn.setBackground(new java.awt.Color(64, 43, 100));
        listSurveyorBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listSurveyorBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listSurveyorBtnMousePressed(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-contact-us-24.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Daftar Surveyor");

        javax.swing.GroupLayout listSurveyorBtnLayout = new javax.swing.GroupLayout(listSurveyorBtn);
        listSurveyorBtn.setLayout(listSurveyorBtnLayout);
        listSurveyorBtnLayout.setHorizontalGroup(
            listSurveyorBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listSurveyorBtnLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        listSurveyorBtnLayout.setVerticalGroup(
            listSurveyorBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listSurveyorBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listSurveyorBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addContainerGap())
        );

        aboutBtn.setBackground(new java.awt.Color(64, 43, 100));
        aboutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aboutBtn.setPreferredSize(new java.awt.Dimension(240, 66));
        aboutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                aboutBtnMousePressed(evt);
            }
        });

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-info-filled-24.png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Tentang Kami");

        javax.swing.GroupLayout aboutBtnLayout = new javax.swing.GroupLayout(aboutBtn);
        aboutBtn.setLayout(aboutBtnLayout);
        aboutBtnLayout.setHorizontalGroup(
            aboutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutBtnLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        aboutBtnLayout.setVerticalGroup(
            aboutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aboutBtnLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
            .addComponent(listKostBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(titleSeparator)
                    .addComponent(sidebarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
            .addComponent(listSurveyorBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(aboutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
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
                .addContainerGap(267, Short.MAX_VALUE))
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
                .addComponent(menuDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        mainContentScroll.setPreferredSize(new java.awt.Dimension(636, 658));

        mainContent.setBackground(new java.awt.Color(255, 255, 255));
        mainContent.setEnabled(false);
        mainContent.setLayout(new java.awt.CardLayout());

        addSurveyor.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("Username");

        txtSurveyorUsername.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtSurveyorUsername.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtSurveyorUsername.setBorder(null);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setText("Email");

        jPanel4.setBackground(new java.awt.Color(85, 65, 118));
        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setToolTipText("");
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("SIMPAN");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel14)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel19.setText("Password");

        txtSurveyorEmail.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtSurveyorEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtSurveyorEmail.setBorder(null);

        jLabel20.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel20.setText("Display Name");

        txtSurveyorDisplayName.setBorder(null);

        jLabel25.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel25.setText("DATA DIRI SURVEYOR");

        jSeparator1.setBackground(new java.awt.Color(110, 89, 222));
        jSeparator1.setForeground(new java.awt.Color(110, 89, 222));

        jSeparator2.setBackground(new java.awt.Color(110, 89, 222));
        jSeparator2.setForeground(new java.awt.Color(110, 89, 222));

        txtSurveyorPassword.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtSurveyorPassword.setBorder(null);

        jSeparator3.setBackground(new java.awt.Color(110, 89, 222));
        jSeparator3.setForeground(new java.awt.Color(110, 89, 222));

        jSeparator4.setBackground(new java.awt.Color(110, 89, 222));
        jSeparator4.setForeground(new java.awt.Color(110, 89, 222));

        javax.swing.GroupLayout addSurveyorLayout = new javax.swing.GroupLayout(addSurveyor);
        addSurveyor.setLayout(addSurveyorLayout);
        addSurveyorLayout.setHorizontalGroup(
            addSurveyorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addSurveyorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(addSurveyorLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(addSurveyorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSurveyorPassword)
                    .addComponent(jLabel25)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(txtSurveyorDisplayName, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(txtSurveyorEmail)
                    .addComponent(txtSurveyorUsername)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator4))
                .addGap(0, 446, Short.MAX_VALUE))
        );
        addSurveyorLayout.setVerticalGroup(
            addSurveyorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addSurveyorLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel25)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSurveyorUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSurveyorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSurveyorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSurveyorDisplayName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        mainContent.add(addSurveyor, "card2");

        about.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout aboutLayout = new javax.swing.GroupLayout(about);
        about.setLayout(aboutLayout);
        aboutLayout.setHorizontalGroup(
            aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 649, Short.MAX_VALUE)
        );
        aboutLayout.setVerticalGroup(
            aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        mainContent.add(about, "card2");

        listKost.setBackground(new java.awt.Color(255, 255, 255));

        tableListKost.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        tableListKost.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "KOST", "PEMILIK", "ALAMAT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
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
                .addComponent(tableListKost, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                .addGap(34, 34, 34))
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
                    .addComponent(jSeparator5)
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
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        listSurveyor.setBackground(new java.awt.Color(255, 255, 255));

        tableListSurveyor.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        tableListSurveyor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "USERNAME", "EMAIL", "DISPLAY NAME"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableListSurveyor.setGridColor(new java.awt.Color(0, 0, 0));
        tableListSurveyor.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tableListSurveyor.setRowHeight(50);
        tableListSurveyor.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tableListSurveyor.setShowHorizontalLines(false);
        tableListSurveyor.setShowVerticalLines(false);
        tableListSurveyor.getTableHeader().setResizingAllowed(false);
        tableListSurveyor.getTableHeader().setReorderingAllowed(false);
        tableListSurveyor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableListSurveyorMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(110, 89, 222));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel21.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("USERNAME");

        jLabel22.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("EMAIL");

        jLabel23.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("DISPLAY NAME");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addGap(120, 120, 120)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addGap(91, 91, 91))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addContainerGap())
        );

        javax.swing.GroupLayout listSurveyorLayout = new javax.swing.GroupLayout(listSurveyor);
        listSurveyor.setLayout(listSurveyorLayout);
        listSurveyorLayout.setHorizontalGroup(
            listSurveyorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listSurveyorLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(listSurveyorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tableListSurveyor, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        listSurveyorLayout.setVerticalGroup(
            listSurveyorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listSurveyorLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tableListSurveyor, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        mainContent.add(listSurveyor, "card2");

        mainContentScroll.setViewportView(mainContent);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(info)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 375, Short.MAX_VALUE)
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
                .addGap(17, 17, 17)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(closeBtn)
                    .addComponent(info))
                .addGap(18, 18, 18)
                .addComponent(mainHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                    .addGap(0, 179, Short.MAX_VALUE)
                    .addComponent(mainContentScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)))
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
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeBtnMouseClicked

    private void infoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_infoMouseClicked

    private void homeBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMousePressed
    //  Atur perubahan warna pada tombol sidebar
        setColor(homeBtn);
        resetColor(listKostBtn);
        resetColor(listSurveyorBtn);
        
    //  Atur mainHeader content
        menuTitle.setText("TAMBAH SURVEYOR BARU");
        menuDesc.setText("Silahkan isi secara lengkap data surveyor yang ingin di tambahkan");
        
    //  Remove content sblmnya jika ada
        mainContent.removeAll();
        mainContent.repaint();
        mainContent.revalidate();
        
    //  Munculkan konten halaman ke mainContent
        mainContent.add(addSurveyor);
        mainContent.repaint();
        mainContent.revalidate();
    }//GEN-LAST:event_homeBtnMousePressed

    private void listKostBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listKostBtnMousePressed
    //  Atur perubahan warna pada tombol sidebar
        resetColor(homeBtn);
        setColor(listKostBtn);
        resetColor(listSurveyorBtn);
    
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
    }//GEN-LAST:event_listKostBtnMousePressed

    private void listSurveyorBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listSurveyorBtnMousePressed
    //  Atur perubahan warna pada tombol sidebar
        resetColor(homeBtn);
        resetColor(listKostBtn);
        setColor(listSurveyorBtn);
        
    //  Atur mainHeader content
        menuTitle.setText("DAFTAR SURVEYOR");
        menuDesc.setText("Berikut adalah Daftar Nama yang telah terdaftar sebagai Surveyor");
        
    //  Remove content sblmnya jika ada
        mainContent.removeAll();
        mainContent.repaint();
        mainContent.revalidate();
        
    //  Munculkan konten halaman ke mainContent
        mainContent.add(listSurveyor);
        mainContent.repaint();
        mainContent.revalidate();
    }//GEN-LAST:event_listSurveyorBtnMousePressed
    
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

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        
    }//GEN-LAST:event_jPanel4MouseClicked

    private void tableListKostMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableListKostMouseClicked
        selectedRowIndex = tableListKost.getSelectedRow();
        //  Atur mainHeader content
        menuTitle.setText("DETAIL KOST");
        menuDesc.setText("DESKRIPSI KOST");
        
        //  Remove content sblmnya jika ada
        mainContent.removeAll();
        mainContent.repaint();
        mainContent.revalidate();
        
        //  Munculkan konten halaman ke mainContent
        mainContent.add(detailKost);
        mainContent.repaint();
        mainContent.revalidate();
    }//GEN-LAST:event_tableListKostMouseClicked

    private void aboutBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutBtnMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_aboutBtnMousePressed

    private void tableListSurveyorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableListSurveyorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableListSurveyorMouseClicked
//    Method untuk ngerubah warna menu di sidebar
    void setColor(JPanel panel)
    {
        panel.setBackground(new Color(85,65,118));
    }
    
    void resetColor(JPanel panel)
    {
        panel.setBackground(new Color(64,43,100));
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
    private javax.swing.JPanel addSurveyor;
    private javax.swing.JLabel alamatLengkapKost;
    private javax.swing.JPanel bg;
    private javax.swing.ButtonGroup biayalistrik;
    private javax.swing.ButtonGroup biayapam;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JPanel detailKost;
    private javax.swing.JLabel hargaBulanan;
    private javax.swing.JPanel homeBtn;
    private javax.swing.JLabel info;
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
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
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
    private javax.swing.JPanel listSurveyor;
    private javax.swing.JPanel listSurveyorBtn;
    private javax.swing.JPanel mainContent;
    private javax.swing.JScrollPane mainContentScroll;
    private javax.swing.JPanel mainHeader;
    private javax.swing.JLabel menuDesc;
    private javax.swing.JLabel menuTitle;
    private javax.swing.JLabel namaKost;
    private javax.swing.JLabel namaLengkapPemilik;
    private javax.swing.JLabel nomorTeleponPemilik;
    private javax.swing.JPanel sidebar;
    private javax.swing.JLabel sidebarTitle;
    private javax.swing.JTable tableListKost;
    private javax.swing.JTable tableListSurveyor;
    private javax.swing.JSeparator titleSeparator;
    private javax.swing.JFormattedTextField txtSurveyorDisplayName;
    private javax.swing.JTextField txtSurveyorEmail;
    private javax.swing.JPasswordField txtSurveyorPassword;
    private javax.swing.JTextField txtSurveyorUsername;
    // End of variables declaration//GEN-END:variables
}

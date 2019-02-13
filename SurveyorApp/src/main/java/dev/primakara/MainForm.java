/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.primakara;

import dev.primakara.model.Kost;
import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hellyeah
 */
public class MainForm extends javax.swing.JFrame {
    
    static Point mouseDownCompCoords;

    /**
     * Creates new form Main_Form
     */
    public MainForm() {

        initComponents();
        
        //  Atur mainHeader content
        menuTitle.setText("TAMBAH KOST BARU");
        menuDesc.setText("Silahkan isi secara lengkap data kost yang ingin di tambahkan");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        biayaPdamSudahTermasuk = new javax.swing.JRadioButton();
        biayaPdamBelumTermasuk = new javax.swing.JRadioButton();
        jLabel24 = new javax.swing.JLabel();
        biayaListrikSudahTermasuk = new javax.swing.JRadioButton();
        biayaBelumTermasuk = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        insertNomorTeleponPemilik = new javax.swing.JTextField();
        deskripsiScrollPane2 = new javax.swing.JScrollPane();
        insertFasilitasKost = new javax.swing.JTextArea();
        editKost = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        nama_kost1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        alamat_kost1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        pemilik_kost1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        deskripsiScrollPane1 = new javax.swing.JScrollPane();
        deskripsi_kost1 = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        alamat_kost3 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jLabel30 = new javax.swing.JLabel();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jCheckBox20 = new javax.swing.JCheckBox();
        jCheckBox21 = new javax.swing.JCheckBox();
        jCheckBox22 = new javax.swing.JCheckBox();
        jCheckBox23 = new javax.swing.JCheckBox();
        jCheckBox24 = new javax.swing.JCheckBox();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel33 = new javax.swing.JLabel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        pemilik_kost3 = new javax.swing.JTextField();
        listKost = new javax.swing.JPanel();
        listKostTableJScroll = new javax.swing.JScrollPane();
        tableListKost = new javax.swing.JTable();
        about = new javax.swing.JPanel();
        detailKost = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        lblNamaKost = new javax.swing.JLabel();
        namaKost = new javax.swing.JLabel();
        alamatLengkap = new javax.swing.JLabel();
        lblAlamatLengkap = new javax.swing.JLabel();
        jumlahKamar = new javax.swing.JLabel();
        lblJumlahKamar = new javax.swing.JLabel();
        lblHargaBulanan = new javax.swing.JLabel();
        hargaBulanan = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblKamar = new javax.swing.JLabel();
        lblHargaBulanan1 = new javax.swing.JLabel();
        fasilitas = new javax.swing.JLabel();
        lblKetentuanKost = new javax.swing.JLabel();
        lblPDAM = new javax.swing.JLabel();
        lblListrik = new javax.swing.JLabel();
        ketentuanPDAM = new javax.swing.JLabel();
        ketentuanListrik = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel37 = new javax.swing.JLabel();
        lblNamaLengkap = new javax.swing.JLabel();
        namaLengkap = new javax.swing.JLabel();
        lblNomorTelefon = new javax.swing.JLabel();
        nomorTelefon = new javax.swing.JLabel();
        btnEditKost = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        btnHapusKost = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();

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

        aboutBtn.setBackground(new java.awt.Color(64, 43, 100));
        aboutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aboutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                aboutBtnMousePressed(evt);
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(333, Short.MAX_VALUE))
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

        mainContent.setBackground(new java.awt.Color(255, 255, 255));
        mainContent.setEnabled(false);
        mainContent.setLayout(new java.awt.CardLayout());

        addKost.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("Nama Kost");

        insertNamaKost.setBackground(new java.awt.Color(238, 238, 238));
        insertNamaKost.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        insertNamaKost.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        insertNamaKost.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setText("Alamat Kost");

        insertJumlahKamar.setBackground(new java.awt.Color(238, 238, 238));
        insertJumlahKamar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        insertJumlahKamar.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        insertJumlahKamar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("Deskripsi Kost");

        insertNamaLengkapPemilik.setBackground(new java.awt.Color(238, 238, 238));
        insertNamaLengkapPemilik.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        insertNamaLengkapPemilik.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        insertNamaLengkapPemilik.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel5.setText("Nama Lengkap");

        insertDeskripsiKost.setBackground(new java.awt.Color(238, 238, 238));
        insertDeskripsiKost.setColumns(20);
        insertDeskripsiKost.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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

        insertAlamatKost.setBackground(new java.awt.Color(238, 238, 238));
        insertAlamatKost.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        insertAlamatKost.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        insertAlamatKost.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel20.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel20.setText("Harga Bulanan");

        insertHargaBulanan.setBackground(new java.awt.Color(238, 238, 238));
        insertHargaBulanan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel21.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel21.setText("Penejalasan Fasilitas Kost");

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

        biayaBelumTermasuk.setBackground(new java.awt.Color(255, 255, 255));
        biayaBelumTermasuk.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        biayaBelumTermasuk.setText("Belum  Termasuk");

        jLabel25.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel25.setText("INFORMASI KOST");

        jLabel26.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel26.setText("Nomor Telepon");

        insertNomorTeleponPemilik.setBackground(new java.awt.Color(238, 238, 238));
        insertNomorTeleponPemilik.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        insertNomorTeleponPemilik.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        insertNomorTeleponPemilik.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        insertFasilitasKost.setBackground(new java.awt.Color(238, 238, 238));
        insertFasilitasKost.setColumns(20);
        insertFasilitasKost.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        insertFasilitasKost.setRows(5);
        insertFasilitasKost.setBorder(null);
        deskripsiScrollPane2.setViewportView(insertFasilitasKost);

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
                        .addGroup(addKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deskripsiScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
                            .addGroup(addKostLayout.createSequentialGroup()
                                .addGroup(addKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(insertNamaLengkapPemilik, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(insertNomorTeleponPemilik, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel22)
                                    .addGroup(addKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(deskripsiScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                                        .addComponent(jLabel19)
                                        .addComponent(jLabel20)
                                        .addGroup(addKostLayout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addGroup(addKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(biayaPdamBelumTermasuk)
                                                .addComponent(biayaPdamSudahTermasuk)
                                                .addComponent(jLabel24)
                                                .addComponent(biayaBelumTermasuk)
                                                .addComponent(biayaListrikSudahTermasuk)))
                                        .addComponent(jSeparator1)
                                        .addGroup(addKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(insertHargaBulanan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                            .addComponent(insertJumlahKamar, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(insertAlamatKost, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(insertNamaKost, javax.swing.GroupLayout.Alignment.LEADING)))
                                    .addComponent(jLabel21)
                                    .addGroup(addKostLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel23)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
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
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(insertAlamatKost, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(insertJumlahKamar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(insertHargaBulanan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deskripsiScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addComponent(biayaBelumTermasuk)
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deskripsiScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel7)
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insertNamaLengkapPemilik, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insertNomorTeleponPemilik, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnInsertKost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainContent.add(addKost, "card2");

        editKost.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel11.setText("Nama Kost");

        nama_kost1.setBackground(new java.awt.Color(238, 238, 238));
        nama_kost1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        nama_kost1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nama_kost1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel15.setText("Alamat Kost");

        alamat_kost1.setBackground(new java.awt.Color(238, 238, 238));
        alamat_kost1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        alamat_kost1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        alamat_kost1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel16.setText("Deskripsi Kost");

        pemilik_kost1.setBackground(new java.awt.Color(238, 238, 238));
        pemilik_kost1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        pemilik_kost1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pemilik_kost1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel17.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel17.setText("Nama Lengkap");

        deskripsi_kost1.setBackground(new java.awt.Color(238, 238, 238));
        deskripsi_kost1.setColumns(20);
        deskripsi_kost1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        deskripsi_kost1.setRows(5);
        deskripsi_kost1.setBorder(null);
        deskripsiScrollPane1.setViewportView(deskripsi_kost1);

        jPanel5.setBackground(new java.awt.Color(85, 65, 118));
        jPanel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.setToolTipText("");
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("SIMPAN");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel18)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jLabel27.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel27.setText("INFORMASI PEMILIK");

        jLabel28.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel28.setText("Jumlah Kamar");

        alamat_kost3.setBackground(new java.awt.Color(238, 238, 238));
        alamat_kost3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        alamat_kost3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        alamat_kost3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel29.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel29.setText("Harga Bulanan");

        jFormattedTextField2.setBackground(new java.awt.Color(238, 238, 238));
        jFormattedTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel30.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel30.setText("Fasilitas");

        jCheckBox13.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox13.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jCheckBox13.setText("Kolam Renang");

        jCheckBox14.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox14.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jCheckBox14.setText("Spring Bed");

        jCheckBox15.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox15.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jCheckBox15.setText("Televisi");

        jCheckBox16.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox16.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jCheckBox16.setText("Dapur Mini");

        jCheckBox17.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox17.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jCheckBox17.setText("Dapur Umum");

        jCheckBox18.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox18.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jCheckBox18.setText("CCTV");

        jCheckBox19.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox19.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jCheckBox19.setText("Security");

        jCheckBox20.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox20.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jCheckBox20.setText("Parkir Motor");

        jCheckBox21.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox21.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jCheckBox21.setText("Parkir Mobil");

        jCheckBox22.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox22.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jCheckBox22.setText("AC");

        jCheckBox23.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox23.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jCheckBox23.setText("PDAM");

        jCheckBox24.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox24.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jCheckBox24.setText("Area Santai");

        jLabel31.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel31.setText("Ketentuan Kost");

        jLabel32.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel32.setText("Biaya Listrik");

        jRadioButton5.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jRadioButton5.setText("Sudah Termasuk");

        jRadioButton6.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jRadioButton6.setText("Belum  Termasuk");

        jLabel33.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel33.setText("Biaya Listrik");

        jRadioButton7.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jRadioButton7.setText("Sudah Termasuk");

        jRadioButton8.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton8.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jRadioButton8.setText("Belum  Termasuk");

        jLabel34.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel34.setText("INFORMASI KOST");

        jLabel35.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel35.setText("Nomor Telepon");

        pemilik_kost3.setBackground(new java.awt.Color(238, 238, 238));
        pemilik_kost3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        pemilik_kost3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pemilik_kost3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout editKostLayout = new javax.swing.GroupLayout(editKost);
        editKost.setLayout(editKostLayout);
        editKostLayout.setHorizontalGroup(
            editKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editKostLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(editKostLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(editKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editKostLayout.createSequentialGroup()
                        .addGroup(editKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pemilik_kost1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(editKostLayout.createSequentialGroup()
                        .addGroup(editKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pemilik_kost3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35)
                            .addComponent(jLabel34)
                            .addComponent(jLabel27)
                            .addComponent(jLabel31)
                            .addGroup(editKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel16)
                                .addComponent(jLabel15)
                                .addComponent(jLabel11)
                                .addComponent(deskripsiScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                                .addComponent(jLabel28)
                                .addComponent(jLabel29)
                                .addGroup(editKostLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(editKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRadioButton6)
                                        .addComponent(jRadioButton5)
                                        .addComponent(jLabel33)
                                        .addComponent(jRadioButton8)
                                        .addComponent(jRadioButton7)))
                                .addComponent(jSeparator2)
                                .addComponent(jFormattedTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                .addComponent(alamat_kost1)
                                .addComponent(alamat_kost3)
                                .addComponent(nama_kost1))
                            .addGroup(editKostLayout.createSequentialGroup()
                                .addGroup(editKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox13)
                                    .addComponent(jCheckBox14)
                                    .addComponent(jCheckBox15)
                                    .addComponent(jLabel30)
                                    .addGroup(editKostLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel32)))
                                .addGap(40, 40, 40)
                                .addGroup(editKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox16)
                                    .addComponent(jCheckBox17)
                                    .addComponent(jCheckBox18))
                                .addGap(28, 28, 28)
                                .addGroup(editKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(editKostLayout.createSequentialGroup()
                                        .addComponent(jCheckBox21)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBox24))
                                    .addGroup(editKostLayout.createSequentialGroup()
                                        .addGroup(editKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox19)
                                            .addComponent(jCheckBox20))
                                        .addGap(16, 16, 16)
                                        .addGroup(editKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox23)
                                            .addComponent(jCheckBox22))))))
                        .addGap(0, 32, Short.MAX_VALUE))))
        );
        editKostLayout.setVerticalGroup(
            editKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editKostLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel34)
                .addGap(20, 20, 20)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nama_kost1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alamat_kost3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alamat_kost1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(editKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(editKostLayout.createSequentialGroup()
                        .addGroup(editKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox16)
                            .addComponent(jCheckBox19)
                            .addComponent(jCheckBox22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(editKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox17)
                            .addComponent(jCheckBox20)
                            .addComponent(jCheckBox23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(editKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox18)
                            .addComponent(jCheckBox21)
                            .addComponent(jCheckBox24)))
                    .addGroup(editKostLayout.createSequentialGroup()
                        .addComponent(jCheckBox13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox15)))
                .addGap(20, 20, 20)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton6)
                .addGap(20, 20, 20)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton8)
                .addGap(20, 20, 20)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deskripsiScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel27)
                .addGap(24, 24, 24)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pemilik_kost1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pemilik_kost3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainContent.add(editKost, "card2");

        listKost.setBackground(new java.awt.Color(255, 255, 255));

        listKostTableJScroll.setBackground(new java.awt.Color(255, 255, 255));
        listKostTableJScroll.setBorder(null);
        listKostTableJScroll.setOpaque(false);
        listKostTableJScroll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listKostTableJScrollMouseClicked(evt);
            }
        });

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
                false, true, true
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
        tableListKost.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableListKostMouseClicked(evt);
            }
        });
        listKostTableJScroll.setViewportView(tableListKost);
        if (tableListKost.getColumnModel().getColumnCount() > 0) {
            tableListKost.getColumnModel().getColumn(0).setPreferredWidth(10);
            tableListKost.getColumnModel().getColumn(1).setResizable(false);
            tableListKost.getColumnModel().getColumn(1).setPreferredWidth(10);
            tableListKost.getColumnModel().getColumn(2).setResizable(false);
            tableListKost.getColumnModel().getColumn(2).setPreferredWidth(10);
        }

        javax.swing.GroupLayout listKostLayout = new javax.swing.GroupLayout(listKost);
        listKost.setLayout(listKostLayout);
        listKostLayout.setHorizontalGroup(
            listKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(listKostTableJScroll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        listKostLayout.setVerticalGroup(
            listKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listKostLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(listKostTableJScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        mainContent.add(listKost, "card2");

        about.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout aboutLayout = new javax.swing.GroupLayout(about);
        about.setLayout(aboutLayout);
        aboutLayout.setHorizontalGroup(
            aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 636, Short.MAX_VALUE)
        );
        aboutLayout.setVerticalGroup(
            aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1171, Short.MAX_VALUE)
        );

        mainContent.add(about, "card2");

        detailKost.setBackground(new java.awt.Color(255, 255, 255));

        jLabel36.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel36.setText("INFORMASI KOST");

        lblNamaKost.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblNamaKost.setText("Nama Kost");

        namaKost.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        namaKost.setText("Nama Kost Disini");

        alamatLengkap.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        alamatLengkap.setText("Alamat Lengkap Disini");

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

        lblHargaBulanan1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblHargaBulanan1.setText("Fasilitas");

        fasilitas.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        fasilitas.setText("Fasilitas1,Fasilitas2,Fasilitas3");

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

        namaLengkap.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        namaLengkap.setText("Nama Lengkap Disini");

        lblNomorTelefon.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblNomorTelefon.setText("Nomor Telefon");

        nomorTelefon.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        nomorTelefon.setText("Nomor Telefon Disini");

        btnEditKost.setBackground(new java.awt.Color(85, 65, 118));
        btnEditKost.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEditKost.setForeground(new java.awt.Color(255, 255, 255));
        btnEditKost.setToolTipText("");
        btnEditKost.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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
                .addContainerGap()
                .addGroup(detailKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addGroup(detailKostLayout.createSequentialGroup()
                        .addGroup(detailKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addComponent(lblNamaKost)
                            .addComponent(namaKost)
                            .addComponent(lblAlamatLengkap)
                            .addComponent(alamatLengkap)
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
                            .addComponent(lblHargaBulanan1)
                            .addComponent(fasilitas)
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
                            .addComponent(namaLengkap)
                            .addComponent(lblNomorTelefon)
                            .addComponent(nomorTelefon))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailKostLayout.createSequentialGroup()
                        .addGap(0, 397, Short.MAX_VALUE)
                        .addComponent(btnEditKost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHapusKost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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
                .addComponent(alamatLengkap)
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
                .addGap(18, 18, 18)
                .addComponent(lblHargaBulanan1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fasilitas)
                .addGap(18, 18, 18)
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
                .addGroup(detailKostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailKostLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel37)
                        .addGap(18, 18, 18)
                        .addComponent(lblNamaLengkap)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namaLengkap)
                        .addGap(18, 18, 18)
                        .addComponent(lblNomorTelefon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomorTelefon)
                        .addGap(20, 20, 20)
                        .addComponent(btnHapusKost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(detailKostLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditKost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        mainContent.add(detailKost, "card3");

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 373, Short.MAX_VALUE)
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
        this.dispose();
    }//GEN-LAST:event_closeBtnMouseClicked

    private void infoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_infoMouseClicked

    private void homeBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMousePressed
        showHome();
    }//GEN-LAST:event_homeBtnMousePressed

    private void listKostBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listKostBtnMousePressed
    
    }//GEN-LAST:event_listKostBtnMousePressed

    private void aboutBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutBtnMousePressed
    //  Atur perubahan warna pada tombol sidebar
        resetColor(homeBtn);
        resetColor(listKostBtn);
        setColor(aboutBtn);
        
    //  Atur mainHeader content
        menuTitle.setText("TENTANG KAMI");
        menuDesc.setText("Lorem ipsum sit dolor amet");
        
    //  Remove content sblmnya jika ada
        mainContent.removeAll();
        mainContent.repaint();
        mainContent.revalidate();
        
    //  Munculkan konten halaman ke mainContent
        mainContent.add(about);
        mainContent.repaint();
        mainContent.revalidate();
    }//GEN-LAST:event_aboutBtnMousePressed
    
//    Event Handler agar JFrame dapat di drag and drop
    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        mouseDownCompCoords = null;
    }//GEN-LAST:event_formMouseReleased

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        mouseDownCompCoords = evt.getPoint();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        Point currCoords = evt.getLocationOnScreen();
//        MainClass.objMainForm.setLocation(currCoords.x - mouseDownCompCoords.x, currCoords.y - mouseDownCompCoords.y);
    }//GEN-LAST:event_formMouseDragged

    private void tableListKostMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableListKostMouseClicked
       showDetailKost();
    }//GEN-LAST:event_tableListKostMouseClicked

    private void listKostTableJScrollMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listKostTableJScrollMouseClicked
        showListKost();
    }//GEN-LAST:event_listKostTableJScrollMouseClicked

    private void btnInsertKostMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertKostMouseClicked
        insertData();
    }//GEN-LAST:event_btnInsertKostMouseClicked
    
//    Method untuk ngerubah warna menu di sidebar
    void setColor(JPanel panel)
    {
        panel.setBackground(new Color(85,65,118));
    }
    
    void resetColor(JPanel panel)
    {
        panel.setBackground(new Color(64,43,100));
    }
    
    //Array List Data Kost from Model    
    ArrayList<Kost> getKostList() {
        ArrayList<Kost> kostList = new ArrayList<>();
        
        //  nanti try catch disini
        Kost objKost = new Kost();
        objKost.setName("Ini contoh nama kost");
        objKost.setAddress("Jln. Groove Street, Los Santos");
        objKost.setPrice(100000);
        objKost.setFacilities("ada kolam renang, ada dapur, dll");
        objKost.setElectricityCost("Sudah Termasuk Biaya Listrik");
        objKost.setWaterCost("Sudah Termasuk Biaya PDAM");
        objKost.setDescription("Blaah blaah blaaah blaaaah blaaaah");
        objKost.setOwnerName("Mr. Bean");
        objKost.setOwnerPhoneNumber("0827223891");
        kostList.add(objKost);
        
        return kostList;
    }
    
    // Method for fill listKost JTable with Kost List
    void Show_Kosts_In_JTable() {
        tableListKost.setRowHeight(30);
        ArrayList<Kost> list = getKostList();
        DefaultTableModel model = (DefaultTableModel)tableListKost.getModel();
        // clear jtable content
        model.setRowCount(0);
        Object[] row = new Object[4];
        for(int i = 0; i < list.size(); i++)
        {
            row[0] = list.get(i).getName();
            row[1] = list.get(i).getOwnerName();
            row[2] = list.get(i).getAddress();
            
            model.addRow(row);
        }
    }
    
    // Method for collects inputs and then send to firebase    
    void insertData() {
        String namaKost = insertNamaKost.getText();
        String alamatKost = insertAlamatKost.getText();
        String jumlahKamar = insertJumlahKamar.getText();
        String hargaBulanan = insertHargaBulanan.getText();
        String deskripsiKost = insertDeskripsiKost.getText();
        String pemilikKost = insertNamaLengkapPemilik.getText();
        String telponPemilik = insertNomorTeleponPemilik.getText();
        String biayalistrik, biayapam;
        boolean insertSuccess = true;
        
        
        if (biayaPdamSudahTermasuk.isSelected()) {
            biayalistrik = "Sudah Termasuk";
        } else if (biayaPdamBelumTermasuk.isSelected()) {
            biayalistrik = "Belum Termasuk";
        }
        
        if (biayaListrikSudahTermasuk.isSelected()) {
            biayapam = "Sudah Termasuk";
        } else if (biayaBelumTermasuk.isSelected()) {
            biayapam = "Belum Termasuk";
        }
        
        if(insertSuccess){
            showListKost();
        }
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
    //  Show Data
        Show_Kosts_In_JTable();

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
    
    // DETAIL KOST
    void showDetailKost() {
        //  Atur mainHeader content
        menuTitle.setText("DETAIL KOST");
        menuDesc.setText("Deskripsi Kost disini");
        
        //  Remove content sblmnya jika ada
        mainContent.removeAll();
        mainContent.repaint();
        mainContent.revalidate();
        
        //  Munculkan konten halaman ke listKost
        mainContent.add(detailKost);
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
    private javax.swing.JPanel addKost;
    private javax.swing.JLabel alamatLengkap;
    private javax.swing.JTextField alamat_kost1;
    private javax.swing.JTextField alamat_kost3;
    private javax.swing.JPanel bg;
    private javax.swing.JRadioButton biayaBelumTermasuk;
    private javax.swing.JRadioButton biayaListrikSudahTermasuk;
    private javax.swing.JRadioButton biayaPdamBelumTermasuk;
    private javax.swing.JRadioButton biayaPdamSudahTermasuk;
    private javax.swing.JPanel btnEditKost;
    private javax.swing.JPanel btnHapusKost;
    private javax.swing.JPanel btnInsertKost;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JScrollPane deskripsiScrollPane;
    private javax.swing.JScrollPane deskripsiScrollPane1;
    private javax.swing.JScrollPane deskripsiScrollPane2;
    private javax.swing.JTextArea deskripsi_kost1;
    private javax.swing.JPanel detailKost;
    private javax.swing.JPanel editKost;
    private javax.swing.JLabel fasilitas;
    private javax.swing.JLabel hargaBulanan;
    private javax.swing.JPanel homeBtn;
    private javax.swing.JLabel info;
    private javax.swing.JTextField insertAlamatKost;
    private javax.swing.JTextArea insertDeskripsiKost;
    private javax.swing.JTextArea insertFasilitasKost;
    private javax.swing.JFormattedTextField insertHargaBulanan;
    private javax.swing.JTextField insertJumlahKamar;
    private javax.swing.JTextField insertNamaKost;
    private javax.swing.JTextField insertNamaLengkapPemilik;
    private javax.swing.JTextField insertNomorTeleponPemilik;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JFormattedTextField jFormattedTextField2;
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
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel jumlahKamar;
    private javax.swing.JLabel ketentuanListrik;
    private javax.swing.JLabel ketentuanPDAM;
    private javax.swing.JLabel lblAlamatLengkap;
    private javax.swing.JLabel lblHargaBulanan;
    private javax.swing.JLabel lblHargaBulanan1;
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
    private javax.swing.JScrollPane listKostTableJScroll;
    private javax.swing.JPanel mainContent;
    private javax.swing.JScrollPane mainContentScroll;
    private javax.swing.JPanel mainHeader;
    private javax.swing.JLabel menuDesc;
    private javax.swing.JLabel menuTitle;
    private javax.swing.JLabel namaKost;
    private javax.swing.JLabel namaLengkap;
    private javax.swing.JTextField nama_kost1;
    private javax.swing.JLabel nomorTelefon;
    private javax.swing.JTextField pemilik_kost1;
    private javax.swing.JTextField pemilik_kost3;
    private javax.swing.JPanel sidebar;
    private javax.swing.JLabel sidebarTitle;
    private javax.swing.JTable tableListKost;
    private javax.swing.JSeparator titleSeparator;
    // End of variables declaration//GEN-END:variables
}
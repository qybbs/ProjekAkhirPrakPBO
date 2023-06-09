/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import javax.swing.JTable;
import javax.swing.JTextField;
import Controller.*;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class AdminViewPinjaman extends javax.swing.JFrame {

    /**
     * Creates new form ViewBuku
     */
    datapinjamancontroller dc;
    databukucontroller bc;
    
    public AdminViewPinjaman() {
        initComponents();
        dc = new datapinjamancontroller(this);
        bc = new databukucontroller(this);
        dc.isiTabel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbGroup = new javax.swing.ButtonGroup();
        PanelBuku = new javax.swing.JPanel();
        tfCari = new javax.swing.JTextField();
        btnTampil = new javax.swing.JButton();
        btnCari = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelDataBuku = new javax.swing.JTable();
        rbISBN = new javax.swing.JRadioButton();
        rbJudul = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TabelDataUser = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tfTglHarusKembali = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfTglKembali = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfDenda = new javax.swing.JTextField();
        btnHapus = new javax.swing.JButton();
        tfJudul = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnPinjam = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfIDUser = new javax.swing.JTextField();
        tfIDBuku = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfTglPinjam = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelDataPinjaman = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnTampil.setText("Tampilkan Semua");
        btnTampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTampilActionPerformed(evt);
            }
        });

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Data Buku");

        TabelDataBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TabelDataBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelDataBukuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelDataBuku);

        rbGroup.add(rbISBN);
        rbISBN.setText("ISBN");
        rbISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbISBNActionPerformed(evt);
            }
        });

        rbGroup.add(rbJudul);
        rbJudul.setText("Judul");
        rbJudul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbJudulActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBukuLayout = new javax.swing.GroupLayout(PanelBuku);
        PanelBuku.setLayout(PanelBukuLayout);
        PanelBukuLayout.setHorizontalGroup(
            PanelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBukuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(209, 209, 209))
            .addGroup(PanelBukuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBukuLayout.createSequentialGroup()
                            .addComponent(btnTampil)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCari))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBukuLayout.createSequentialGroup()
                            .addComponent(rbISBN)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rbJudul)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCari, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelBukuLayout.setVerticalGroup(
            PanelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBukuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbISBN)
                    .addComponent(rbJudul)
                    .addComponent(tfCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCari)
                    .addComponent(btnTampil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        TabelDataUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TabelDataUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelDataUserMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TabelDataUser);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Data User");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(140, 140, 140))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        jLabel8.setText("Tgl Kembali");

        jLabel9.setText("Denda");

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        tfJudul.setEditable(false);

        jLabel4.setText("Judul");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Peminjaman Buku");

        btnPinjam.setText("Pinjam");
        btnPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPinjamActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        jLabel5.setText("ID");

        tfID.setEditable(false);

        jLabel6.setText("Tgl Pinjam");

        jLabel1.setText("IDUser");

        tfIDUser.setEditable(false);

        tfIDBuku.setEditable(false);

        jLabel2.setText("IDBuku");

        tfUsername.setEditable(false);

        jLabel3.setText("Username");

        jLabel7.setText("Tgl Harus Kembali");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(144, Short.MAX_VALUE)
                        .addComponent(btnClear)
                        .addGap(6, 6, 6)
                        .addComponent(btnPinjam)
                        .addGap(6, 6, 6)
                        .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(btnUbah)
                        .addGap(6, 6, 6)
                        .addComponent(btnHapus))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfTglKembali, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                                    .addComponent(tfID, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfIDUser, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfIDBuku, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfUsername, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfJudul, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfTglPinjam, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfTglHarusKembali)
                                    .addComponent(tfDenda)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(tfIDUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(tfIDBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(tfJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addComponent(tfTglPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7))
                    .addComponent(tfTglHarusKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel8))
                    .addComponent(tfTglKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel9))
                    .addComponent(tfDenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClear)
                    .addComponent(btnPinjam)
                    .addComponent(btnKembali)
                    .addComponent(btnUbah)
                    .addComponent(btnHapus))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Data Peminjaman");

        TabelDataPinjaman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TabelDataPinjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelDataPinjamanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TabelDataPinjaman);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(PanelBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelBuku, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPinjamActionPerformed
        // TODO add your handling code here:
        if (tfIDUser.getText().isEmpty() || tfIDBuku.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Buku/User belum terpilih!");
        } else {
            dc.pinjam();
            dc.isiTabel();
        }
        
    }//GEN-LAST:event_btnPinjamActionPerformed

    private void TabelDataBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelDataBukuMouseClicked
        // TODO add your handling code here:
        int rbuku = TabelDataBuku.getSelectedRow();
        tfIDBuku.setText(TabelDataBuku.getValueAt(rbuku, 0).toString());
        tfJudul.setText(TabelDataBuku.getValueAt(rbuku, 2).toString());
    }//GEN-LAST:event_TabelDataBukuMouseClicked

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        // TODO add your handling code here:
        if (tfID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tidak ada data peminjaman yang terpilih!");
        } else {
            dc.kembali();
            dc.isiTabel();
        }
        
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        if (tfID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tidak ada data peminjaman yang terpilih!");
        } else {
            dc.update();
            dc.isiTabel();
        }
        
    }//GEN-LAST:event_btnUbahActionPerformed

    private void TabelDataUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelDataUserMouseClicked
        // TODO add your handling code here:
        int ruser = TabelDataUser.getSelectedRow();
        tfIDUser.setText(TabelDataUser.getValueAt(ruser, 0).toString());
        tfUsername.setText(TabelDataUser.getValueAt(ruser, 1).toString());
    }//GEN-LAST:event_TabelDataUserMouseClicked

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        if (tfID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tidak ada data peminjaman yang terpilih!");
        } else {
            dc.delete();
            dc.isiTabel();
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void TabelDataPinjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelDataPinjamanMouseClicked
        // TODO add your handling code here:
        int rpinjaman = TabelDataPinjaman.getSelectedRow();
        tfID.setText(TabelDataPinjaman.getValueAt(rpinjaman, 0).toString());
        tfIDUser.setText(TabelDataPinjaman.getValueAt(rpinjaman, 1).toString());
        tfIDBuku.setText(TabelDataPinjaman.getValueAt(rpinjaman, 2).toString());
        tfUsername.setText(TabelDataPinjaman.getValueAt(rpinjaman, 3).toString());
        tfJudul.setText(TabelDataPinjaman.getValueAt(rpinjaman, 4).toString());
        tfTglPinjam.setText(TabelDataPinjaman.getValueAt(rpinjaman, 5).toString());
        tfTglHarusKembali.setText(TabelDataPinjaman.getValueAt(rpinjaman, 6).toString());
        if (TabelDataPinjaman.getValueAt(rpinjaman, 7) == null) {
            tfTglKembali.setText("");
        } else {
            tfTglKembali.setText(TabelDataPinjaman.getValueAt(rpinjaman, 7).toString());
        }
        
        tfDenda.setText(TabelDataPinjaman.getValueAt(rpinjaman, 8).toString());
    }//GEN-LAST:event_TabelDataPinjamanMouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        dc.clearTf();
    }//GEN-LAST:event_btnClearActionPerformed

    private void rbISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbISBNActionPerformed

    private void rbJudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbJudulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbJudulActionPerformed

    private void btnTampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTampilActionPerformed
        // TODO add your handling code here:
        dc.isiTabel();
    }//GEN-LAST:event_btnTampilActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        if (rbISBN.isSelected()) {
            bc.isiTabelCari("ISBN");
        } else if (rbJudul.isSelected()) {
            bc.isiTabelCari("Judul");
        } else {
            JOptionPane.showMessageDialog(null, "Harap pilih pencarian dengan ISBN atau Judul!");
        }
    }//GEN-LAST:event_btnCariActionPerformed

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
            java.util.logging.Logger.getLogger(AdminViewPinjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminViewPinjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminViewPinjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminViewPinjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminViewPinjaman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBuku;
    private javax.swing.JTable TabelDataBuku;
    private javax.swing.JTable TabelDataPinjaman;
    private javax.swing.JTable TabelDataUser;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnPinjam;
    private javax.swing.JButton btnTampil;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.ButtonGroup rbGroup;
    private javax.swing.JRadioButton rbISBN;
    private javax.swing.JRadioButton rbJudul;
    private javax.swing.JTextField tfCari;
    private javax.swing.JTextField tfDenda;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfIDBuku;
    private javax.swing.JTextField tfIDUser;
    private javax.swing.JTextField tfJudul;
    private javax.swing.JTextField tfTglHarusKembali;
    private javax.swing.JTextField tfTglKembali;
    private javax.swing.JTextField tfTglPinjam;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables

    public JTable getTabelDataBuku() {
        return TabelDataBuku;
    }

    public void setTabelDataBuku(JTable TabelDataBuku) {
        this.TabelDataBuku = TabelDataBuku;
    }

    public JTable getTabelDataPinjaman() {
        return TabelDataPinjaman;
    }

    public void setTabelDataPinjaman(JTable TabelDataPinjaman) {
        this.TabelDataPinjaman = TabelDataPinjaman;
    }

    public JTable getTabelDataUser() {
        return TabelDataUser;
    }

    public void setTabelDataUser(JTable TabelDataUser) {
        this.TabelDataUser = TabelDataUser;
    }

    public JTextField getTfDenda() {
        return tfDenda;
    }

    public void setTfDenda(JTextField tfDenda) {
        this.tfDenda = tfDenda;
    }

    public JTextField getTfID() {
        return tfID;
    }

    public void setTfID(JTextField tfID) {
        this.tfID = tfID;
    }

    public JTextField getTfIDBuku() {
        return tfIDBuku;
    }

    public void setTfIDBuku(JTextField tfIDBuku) {
        this.tfIDBuku = tfIDBuku;
    }

    public JTextField getTfIDUser() {
        return tfIDUser;
    }

    public void setTfIDUser(JTextField tfIDUser) {
        this.tfIDUser = tfIDUser;
    }

    public JTextField getTfJudul() {
        return tfJudul;
    }

    public void setTfJudul(JTextField tfJudul) {
        this.tfJudul = tfJudul;
    }

    public JTextField getTfTglHarusKembali() {
        return tfTglHarusKembali;
    }

    public void setTfTglHarusKembali(JTextField tfTglHarusKembali) {
        this.tfTglHarusKembali = tfTglHarusKembali;
    }

    public JTextField getTfTglKembali() {
        return tfTglKembali;
    }

    public void setTfTglKembali(JTextField tfTglKembali) {
        this.tfTglKembali = tfTglKembali;
    }

    public JTextField getTfTglPinjam() {
        return tfTglPinjam;
    }

    public void setTfTglPinjam(JTextField tfTglPinjam) {
        this.tfTglPinjam = tfTglPinjam;
    }

    public JTextField getTfUsername() {
        return tfUsername;
    }

    public void setTfUsername(JTextField tfUsername) {
        this.tfUsername = tfUsername;
    }

    public void setTfID(String string) {
        tfID.setText(string);
    }

    public void setTfIDUser(String string) {
        tfIDUser.setText(string);
    }
    
    public void setTfIDBuku(String string) {
        tfIDBuku.setText(string);
    }
    
    public void setTfUsername(String string) {
        tfUsername.setText(string);
    }
    
    public void setTfJudul(String string) {
        tfJudul.setText(string);
    }
    
    public void setTfTglPinjam(String string) {
        tfTglPinjam.setText(string);
    }
    
    public void setTfTglHarusKembali(String string) {
        tfTglHarusKembali.setText(string);
    }
    
    public void setTfTglKembali(String string) {
        tfTglKembali.setText(string);
    }
    
    public void setTfDenda(String string) {
        tfDenda.setText(string);
    }

    public JTextField getTfCari() {
        return tfCari;
    }

    public void setTfCari(JTextField tfCari) {
        this.tfCari = tfCari;
    }
    
    
    
}

/*
    201351016_Andika Muhammad Aditya_IF PAGI B
*/
package Apotekuas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class KelolaData extends javax.swing.JFrame {

    Connection con;
    Statement stat;
    ResultSet rs;
    String sql;
    DefaultTableModel model;
    
    public KelolaData() {
        initComponents();
        Koneksi DB = new Koneksi();
        DB.config();
        con = DB.con;
        stat = DB.stm;
        
        String judul[]={"ID OBAT","NAMA OBAT","KATEGORI","STOK","SATUAN","HARGA","EXPIRED","SUPPLIER","TANGGAL BELI","DESKRIPSI"};
        model = new DefaultTableModel(judul, 0);
        t_kelola.setModel(model);
        
        tampilkan();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        kategori = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        satuan = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        harga = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tanggalKD = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        supplier = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tanggalBeli = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        simpan = new javax.swing.JButton();
        stok = new javax.swing.JTextField();
        hapus = new javax.swing.JButton();
        backtodataobat = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_kelola = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        deskripsi = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel4.setText("KELOLA DATA");

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setText("FORM EDIT DATA");

        jLabel2.setText("Id Obat :");

        jLabel3.setText("Nama Obat :");

        jLabel5.setText("Kategori Obat :");

        kategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Obat Bebas", "Obat Bebas Terbatas", "Obat Resep", "Obat Generik", "Suplemen Makanan", "Vitamin dan Mineral", "Herbal dan Obat Tradisional", "Obat Penyakit Tertentu", "Alat Kesehatan" }));

        jLabel6.setText("Stok Obat :");

        jLabel7.setText("Satuan Obat : ");

        satuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tablet", "Kapsul", "Botol", "Ampul", "Tube", "Sachet", "Serbuk", "Tetes", "Suppositoria", "Sediaan semprot (spray)", "Cream", "Salep", "Sirup", "Suspensi", "Pil" }));

        jLabel8.setText("Harga Obat :");

        jLabel9.setText("Tanggal Kadaluarsa :");

        jLabel10.setText("Supplier Obat :");

        jLabel11.setText("Tanggal Pembelian Obat :");

        jLabel12.setText("Deskripsi Obat :");

        simpan.setText("SIMPAN");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        hapus.setText("HAPUS DATA");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        backtodataobat.setText("KEMBALI KE HALAMAN DATA OBAT");
        backtodataobat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backtodataobatActionPerformed(evt);
            }
        });

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        t_kelola.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10"
            }
        ));
        jScrollPane1.setViewportView(t_kelola);

        jScrollPane4.setViewportView(jScrollPane1);

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        deskripsi.setColumns(20);
        deskripsi.setRows(5);
        jScrollPane2.setViewportView(deskripsi);

        jScrollPane5.setViewportView(jScrollPane2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(stok, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(kategori, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(tanggalKD, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(satuan, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addComponent(id)
                                .addComponent(jLabel3)
                                .addComponent(jLabel8)
                                .addComponent(harga)
                                .addComponent(jLabel9)
                                .addComponent(supplier)
                                .addComponent(jLabel11)
                                .addComponent(tanggalBeli)
                                .addComponent(jLabel12)
                                .addComponent(simpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(hapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(backtodataobat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(580, 615, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(satuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tanggalKD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(supplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tanggalBeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(simpan)
                .addGap(18, 18, 18)
                .addComponent(hapus)
                .addGap(18, 18, 18)
                .addComponent(backtodataobat)
                .addGap(130, 130, 130))
        );

        jScrollPane3.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
    try {
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/apotekuas","root","");
        String idObat = id.getText();

        // Memeriksa apakah ID obat kosong
        if (idObat.isEmpty()) {
            JOptionPane.showMessageDialog(this, "ID Obat harus diisi!");
            return;
        }

        // Membangun query update
        StringBuilder queryBuilder = new StringBuilder();
        queryBuilder.append("UPDATE tb_obat SET ");

        // Memeriksa dan mengupdate field yang diisi
        if (!nama.getText().isEmpty()) {
            queryBuilder.append("nama = '").append(nama.getText()).append("', ");
        }
        if (kategori.getSelectedIndex() != -1) {
            queryBuilder.append("kategori = '").append(kategori.getSelectedItem()).append("', ");
        }
        if (!stok.getText().isEmpty()) {
            queryBuilder.append("stok = '").append(stok.getText()).append("', ");
        }
        if (satuan.getSelectedIndex() != -1) {
            queryBuilder.append("satuan = '").append(satuan.getSelectedItem()).append("', ");
        }
        if (!harga.getText().isEmpty()) {
            queryBuilder.append("harga = '").append(harga.getText()).append("', ");
        }
        if (!tanggalKD.getText().isEmpty()) {
            queryBuilder.append("tanggal = '").append(tanggalKD.getText()).append("', ");
        }
        if (!supplier.getText().isEmpty()) {
            queryBuilder.append("supplier = '").append(supplier.getText()).append("', ");
        }
        if (!tanggalBeli.getText().isEmpty()) {
            queryBuilder.append("tanggalbeli = '").append(tanggalBeli.getText()).append("', ");
        }
        if (!deskripsi.getText().isEmpty()) {
            queryBuilder.append("deskripsi = '").append(deskripsi.getText()).append("', ");
        }

        // Menghapus koma terakhir dari query
        queryBuilder.deleteCharAt(queryBuilder.length() - 2);

        // Menambahkan kondisi WHERE ID
        queryBuilder.append("WHERE id = '").append(idObat).append("'");

        // Menjalankan query update
        cn.createStatement().executeUpdate(queryBuilder.toString());

        JOptionPane.showMessageDialog(this, "Data berhasil diedit dan telah disimpan!");
        tampilkan();
    } catch (SQLException ex) {
        Logger.getLogger(KelolaData.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_simpanActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        Connection cn;
        try {
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/apotekuas","root","");
            cn.createStatement().executeUpdate("DELETE from tb_obat  WHERE id = '"+id.getText()+"' ");
            JOptionPane.showMessageDialog(this, "Data berhasil dihapus!");
            tampilkan();
        } catch (SQLException ex) {
            Logger.getLogger(KelolaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_hapusActionPerformed

    private void backtodataobatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backtodataobatActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        this.setVisible(false);
        new DataObat().setVisible(true);
    }//GEN-LAST:event_backtodataobatActionPerformed

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
            java.util.logging.Logger.getLogger(KelolaData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KelolaData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KelolaData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KelolaData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KelolaData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backtodataobat;
    private javax.swing.JTextArea deskripsi;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField harga;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JComboBox<String> kategori;
    private javax.swing.JTextField nama;
    private javax.swing.JComboBox<String> satuan;
    private javax.swing.JButton simpan;
    private javax.swing.JTextField stok;
    private javax.swing.JTextField supplier;
    private javax.swing.JTable t_kelola;
    private javax.swing.JTextField tanggalBeli;
    private javax.swing.JTextField tanggalKD;
    // End of variables declaration//GEN-END:variables
    
        private void tampilkan() {
        int row = t_kelola.getRowCount();
        for (int a = 0; a < row; a++) 
            model.removeRow(0);
        
        try {
            Connection cn;
            ResultSet rs;
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/apotekuas","root","");
            rs = cn.createStatement().executeQuery("SELECT * FROM tb_obat");
            while (rs.next()) {            
                String data[]={rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10)};
                model.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KelolaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

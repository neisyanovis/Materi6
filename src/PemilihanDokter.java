/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SMK TELKOM
 */
public class PemilihanDokter extends javax.swing.JFrame {

    /**
     * Creates new form PemilihanDokter
     */
    public PemilihanDokter() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pilih = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        alamat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        usia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jenis = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        gol = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        status = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        kewar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        waktu = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        spesial = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Pemilihan Dokter");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 10, 130, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("Pilih Dokter");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 60, 80, 14);

        pilih.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Salah Satu--", "DR. Farras Yassar", "DR. Dian Sikahita ", "DR. Harun Ulum Fajar" }));
        pilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihActionPerformed(evt);
            }
        });
        getContentPane().add(pilih);
        pilih.setBounds(120, 60, 180, 20);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("Identitas");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 100, 60, 14);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("Nama");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 120, 70, 14);

        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        getContentPane().add(nama);
        nama.setBounds(120, 120, 180, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setText("Alamat");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 150, 70, 14);

        alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatActionPerformed(evt);
            }
        });
        getContentPane().add(alamat);
        alamat.setBounds(120, 150, 180, 30);

        jLabel6.setText("Usia");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 180, 80, 14);

        usia.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(usia);
        usia.setBounds(120, 180, 180, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setText("Jenis Kelamin");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 210, 110, 14);

        jenis.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(jenis);
        jenis.setBounds(120, 210, 180, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel8.setText("Golongan Darah");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 240, 100, 14);
        getContentPane().add(gol);
        gol.setBounds(120, 240, 180, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel9.setText("Status");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 270, 70, 14);

        status.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(status);
        status.setBounds(120, 270, 180, 30);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel10.setText("Kewarganegaraan");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 300, 100, 14);
        getContentPane().add(kewar);
        kewar.setBounds(120, 300, 180, 30);

        jLabel11.setText("Waktu Praktek");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 330, 100, 14);
        getContentPane().add(waktu);
        waktu.setBounds(120, 330, 180, 30);

        jLabel12.setText("Dokter Spesialis");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(20, 360, 110, 14);
        getContentPane().add(spesial);
        spesial.setBounds(120, 360, 180, 30);

        setBounds(0, 0, 416, 442);
    }// </editor-fold>//GEN-END:initComponents

    private void pilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihActionPerformed
        // TODO add your handling code here:
        if(pilih.getSelectedItem().equals("DR. Farras Yassar")){
            nama.setText("DR. Farras Yassar ");
            alamat.setText("Jl. Surabaya 16, Malang");
            usia.setText("20 Tahun");
            jenis.setText("Laki-Laki");
            gol.setText("A");
            status.setText("Belum Menikah ");
            kewar.setText("Indonesia");
            spesial.setText("Dokter Umum");
            waktu.setText(" Pagi (07.00-15.00)");
        }
        else
        if(pilih.getSelectedItem().equals("DR. Dian Sikahita")){
            nama.setText("DR. Dian Sikahita");
            alamat.setText("Jl. Veteran 3, Malang");
            usia.setText("20 Tahun");
            jenis.setText("Perempuan");
            gol.setText("O");
            status.setText("Belum Menikah");
            kewar.setText("Indonesia");
            spesial.setText("Dokter Gigi");
            waktu.setText(" Sore (16.00-22.00)");
        }
        else
        if(pilih.getSelectedItem().equals("DR. Harun Ulum Fajar")){
            nama.setText("DR. Harun Ulum Fajar");
            alamat.setText("Jl. Bandung 9, Malang");
            usia.setText("20 Tahun");
            jenis.setText("Laki-Laki");
            gol.setText("B");
            status.setText("Belum Menikah");
            kewar.setText("Indonesia");
            spesial.setText("Dokter Gizi");
            waktu.setText(" Malam (22.00-06.00)");
        }

        
    }//GEN-LAST:event_pilihActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatActionPerformed

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
            java.util.logging.Logger.getLogger(PemilihanDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PemilihanDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PemilihanDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PemilihanDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PemilihanDokter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JTextField gol;
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
    private javax.swing.JTextField jenis;
    private javax.swing.JTextField kewar;
    private javax.swing.JTextField nama;
    private javax.swing.JComboBox<String> pilih;
    private javax.swing.JTextField spesial;
    private javax.swing.JTextField status;
    private javax.swing.JTextField usia;
    private javax.swing.JTextField waktu;
    // End of variables declaration//GEN-END:variables
}

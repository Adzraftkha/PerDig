/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perdig;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
    public class Databuku extends javax.swing.JFrame {
  
    /**
     * Creates new form Databuku
     */
    public Databuku() {
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

        databuku = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Jbuku = new javax.swing.JTextField();
        pengarang = new javax.swing.JTextField();
        penerbit = new javax.swing.JTextField();
        Tterbit = new javax.swing.JTextField();
        edisi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_buku = new javax.swing.JTable();
        save = new javax.swing.JButton();
        next = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        databuku.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        databuku.setText("DATA BUKU ");
        getContentPane().add(databuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("Judul Buku:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 62, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("Pengarang:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 88, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("Penerbit:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 114, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setText("Tahun Terbit:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setText("Edisi:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 166, -1, -1));
        getContentPane().add(Jbuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 59, 154, -1));
        getContentPane().add(pengarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 85, 154, -1));
        getContentPane().add(penerbit, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 111, 154, -1));
        getContentPane().add(Tterbit, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 137, 154, -1));
        getContentPane().add(edisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 163, 154, -1));

        tbl_buku.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tbl_buku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Judul Buku", "Pengarang", "Penerbit", "Tahun terbit", "Edisi"
            }
        ));
        jScrollPane1.setViewportView(tbl_buku);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 480, 180));

        save.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        next.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        getContentPane().add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 57, -1));

        clear.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        exit.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 57, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\546a5aa9-411e-4b60-940a-e90bfb27a183-stocksy_txp0f5aad02gup100_small_279031.jpg")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-410, -90, 930, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
Jbuku.getText();
pengarang.getText();
penerbit.getText();
Tterbit.getText();
edisi.getText();
DefaultTableModel model= (DefaultTableModel) tbl_buku.getModel();

model.addRow(new Object[]{Jbuku.getText(),pengarang.getText(),penerbit.getText(),Tterbit.getText(),edisi.getText()});
    }//GEN-LAST:event_saveActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        Jbuku.setText("");
        pengarang.setText("");
        penerbit.setText("");
        Tterbit.setText("");
        edisi.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
new Datapeminjam().setVisible(true); 
dispose(); // saat button next diklik, jendela yang di-close hanya jframe ini, Jrame yang dipanggil tetap aktif
    }//GEN-LAST:event_nextActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
if (JOptionPane.showConfirmDialog(null, "Anda yakin ingin keluar?","Warning!!", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
 System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(Databuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Databuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Databuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Databuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Databuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Jbuku;
    private javax.swing.JTextField Tterbit;
    private javax.swing.JButton clear;
    private javax.swing.JLabel databuku;
    private javax.swing.JTextField edisi;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton next;
    private javax.swing.JTextField penerbit;
    private javax.swing.JTextField pengarang;
    private javax.swing.JButton save;
    private javax.swing.JTable tbl_buku;
    // End of variables declaration//GEN-END:variables
    }

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Database.Koneksi;
import SaleSystemProject.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author acer
 */
public class ListUsers extends javax.swing.JFrame {

    /**
     * Creates new form ListUsers
     */
    AdminLogin AdminLogin;
    AddDesktop AddDesktop;
    AddLaptop AddLaptop;
    ListUsers ListUsers;
    
    public ListUsers() {
        initComponents();
        setLocationRelativeTo(this);
        showUser();
    }
    Connection c = Koneksi.getKoneksi();
    public ArrayList<User> getUser()
    {
        ArrayList<User> ListUser = new ArrayList<User>();
        String query = "SELECT * FROM `user`";
        Statement st;
        ResultSet rs;
        
        try{
            st = c.createStatement();
            rs = st.executeQuery(query);
            
            User usr;
            
            while(rs.next())
            {
                usr = new User(
                                 rs.getString("nama"),
                                 rs.getString("alamat"),
                                 rs.getString("email"),
                                 rs.getString("username"),
                                 rs.getString("password")
                                );
                ListUser.add(usr);
            }
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return ListUser;
    }
    
    public void showUser(){
        ArrayList<User> User = getUser();
        DefaultTableModel model = (DefaultTableModel)userTable.getModel();
        Object[] row = new Object[4];     
        for(int i = 0; i < User.size(); i++)
        {
            row[0] = User.get(i).getNama();
            row[1] = User.get(i).getAlamat();
            row[2] = User.get(i).getEmail();
            row[3] = User.get(i).getUsername();
            model.addRow(row);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        addDesktopBtn = new javax.swing.JLabel();
        addLaptopBtn = new javax.swing.JLabel();
        usersListBtn = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        deleteBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("List Users");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "Alamat", "Email", "Username"
            }
        ));
        userTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(userTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 930, 150));

        addDesktopBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addDesktopBtnMouseClicked(evt);
            }
        });
        jPanel1.add(addDesktopBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 260, 50));

        addLaptopBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addLaptopBtnMouseClicked(evt);
            }
        });
        jPanel1.add(addLaptopBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 260, 50));

        usersListBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersListBtnMouseClicked(evt);
            }
        });
        jPanel1.add(usersListBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 260, 50));

        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBtnMouseClicked(evt);
            }
        });
        jPanel1.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 260, 50));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Alamat:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Username:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, -1));
        jPanel1.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 190, -1));
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 190, -1));

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 190, -1));
        jPanel1.add(alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 190, -1));

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Dashboard Login Dark Theme (8)1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addDesktopBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDesktopBtnMouseClicked
        AddDesktop = new AddDesktop();
        AddDesktop.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addDesktopBtnMouseClicked

    private void addLaptopBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addLaptopBtnMouseClicked
        AddLaptop = new AddLaptop();
        AddLaptop.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addLaptopBtnMouseClicked

    private void usersListBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersListBtnMouseClicked
        ListUsers = new ListUsers();
        ListUsers.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_usersListBtnMouseClicked

    private void logoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseClicked
        AdminLogin = new AdminLogin();
        AdminLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBtnMouseClicked

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void userTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTableMouseClicked
       int i = userTable.getSelectedRow();
        TableModel model  = userTable.getModel();
        nama.setText(model.getValueAt(i,0).toString());
        alamat.setText(model.getValueAt(i,1).toString());
        email.setText(model.getValueAt(i,2).toString());
        username.setText(model.getValueAt(i,3).toString());
    }//GEN-LAST:event_userTableMouseClicked

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int i = userTable.getSelectedRow();
        if (i == -1) {
            return;
        }
        String name = nama.getText();
        int pernyataan = JOptionPane.showConfirmDialog(null, "Yakin Data Akan Dihapus","Konfirmasi", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (pernyataan== JOptionPane.OK_OPTION) {
            try {
                String sql = "DELETE FROM user WHERE nama = ?";
                PreparedStatement pst = c.prepareStatement(sql);
                pst.setString(1, name);
                pst.executeUpdate();
                pst.close();
                DefaultTableModel model = (DefaultTableModel)userTable.getModel();
                model.setRowCount(0);
                showUser();
                JOptionPane.showMessageDialog(null, "Data Terhapus");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data Gagal Terhapus");
            } finally {
                nama.setText("");
                alamat.setText("");
                email.setText("");
                username.setText("");
            }
        }
        if (pernyataan == JOptionPane.CANCEL_OPTION) {
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListUsers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addDesktopBtn;
    private javax.swing.JLabel addLaptopBtn;
    private javax.swing.JTextField alamat;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoutBtn;
    private javax.swing.JTextField nama;
    private javax.swing.JTable userTable;
    private javax.swing.JTextField username;
    private javax.swing.JLabel usersListBtn;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jframe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author lethi
 */
public class BookPenaltyForm extends javax.swing.JFrame {
    DefaultTableModel model;

    /**
     * Creates new form IssueBookDetails
     */
    public BookPenaltyForm() {
        initComponents();
        setIssueBookDetailsToTable();
        importDataToCombobox(); // Populate the combobox
        setBookPenaltyDetailsToTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbl_penalty = new rojeru_san.complementos.RSTableMetro();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        txt_money = new java.awt.TextField();
        studentCombobox = new javax.swing.JComboBox<>();
        btnTaoPhieu = new javax.swing.JButton();
        txt_penaltyID = new java.awt.TextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbl_issueBookDetails1 = new rojeru_san.complementos.RSTableMetro();
        btnLamMoi = new javax.swing.JButton();
        date_collectDate = new rojeru_san.componentes.RSDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(102, 102, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Phiếu thu tiền phạt");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 320, 50));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 400, 10));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/51516_arrow_back_left_icon.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 110));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_penalty.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phiếu", "Mã sinh viên", "Tổng tiền thu", "Ngày thu"
            }
        ));
        tbl_penalty.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        tbl_penalty.setColorBordeHead(new java.awt.Color(255, 255, 255));
        tbl_penalty.setRowHeight(30);
        tbl_penalty.setShowGrid(false);
        tbl_penalty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_penaltyMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tbl_penalty);

        jPanel2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 620, 190));

        label1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        label1.setText("Mã phiếu");
        jPanel2.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 120, 40));

        label2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        label2.setText("Mã sinh viên");
        jPanel2.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 120, 40));

        label3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        label3.setText("Tổng tiền thu");
        jPanel2.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 120, 40));

        label4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        label4.setText("Ngày thu");
        jPanel2.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 120, 40));

        txt_money.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel2.add(txt_money, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 320, 40));

        studentCombobox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        studentCombobox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                studentComboboxPopupMenuWillBecomeVisible(evt);
            }
        });
        studentCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentComboboxActionPerformed(evt);
            }
        });
        jPanel2.add(studentCombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 320, 40));

        btnTaoPhieu.setBackground(new java.awt.Color(102, 153, 255));
        btnTaoPhieu.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btnTaoPhieu.setForeground(new java.awt.Color(255, 255, 255));
        btnTaoPhieu.setText("Tạo phiếu");
        btnTaoPhieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoPhieuActionPerformed(evt);
            }
        });
        jPanel2.add(btnTaoPhieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 250, 140, 50));

        txt_penaltyID.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel2.add(txt_penaltyID, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 320, 40));

        tbl_issueBookDetails1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sách", "Tên sách", "Mã sinh viên", "Tên sinh viên", "Trạng thái"
            }
        ));
        tbl_issueBookDetails1.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        tbl_issueBookDetails1.setColorBordeHead(new java.awt.Color(255, 255, 255));
        tbl_issueBookDetails1.setRowHeight(30);
        tbl_issueBookDetails1.setShowGrid(false);
        tbl_issueBookDetails1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_issueBookDetails1MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tbl_issueBookDetails1);

        jPanel2.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 1280, 270));

        btnLamMoi.setBackground(new java.awt.Color(102, 153, 255));
        btnLamMoi.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btnLamMoi.setForeground(new java.awt.Color(255, 255, 255));
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });
        jPanel2.add(btnLamMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 250, 140, 50));

        date_collectDate.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        date_collectDate.setFuente(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        date_collectDate.setPlaceholder("Chọn ngày thu tiền");
        jPanel2.add(date_collectDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 300, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1380, 690));

        setSize(new java.awt.Dimension(1394, 867));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void setIssueBookDetailsToTable() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlythuvien", "root", "");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from issue_book_details where status = 'đã mất'");

            while (rs.next()) {
               
                String bookID = rs.getString("bookID");
                String bookName = rs.getString("bookName");
                String studentID = rs.getString("studentID");
                String studentName = rs.getString("StudentName");
                
                String status = rs.getString("status");
                
                Object[] obj = { bookID, bookName,studentID, studentName, status };
                model = (DefaultTableModel) tbl_issueBookDetails1.getModel();
                model.addRow(obj);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void clearTable(){
        DefaultTableModel model = (DefaultTableModel) tbl_penalty.getModel();
        model.setRowCount(0);
    }
    
    public void setBookPenaltyDetailsToTable() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlythuvien", "root", "");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from penalty");

            while (rs.next()) {
               
                String penaltyID = rs.getString("penaltyID");
                String studentID = rs.getString("studentID");
                String money = rs.getString("money");
                String date = rs.getString("date");
                
                Object[] obj = { penaltyID, studentID, money, date };
                model = (DefaultTableModel) tbl_penalty.getModel();
                model.addRow(obj);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void importDataToCombobox(){
        studentCombobox.removeAllItems();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlythuvien", "root", "");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select studentID, studentName from issue_book_details where status = 'đã mất'");

            while (rs.next()) {
                String studentID = rs.getString("studentID");
                String studentName = rs.getString("StudentName");
                studentCombobox.addItem(studentID + " - " + studentName);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public int moneyPenalty(String studentId) {
    int totalPenalty = 0;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlythuvien", "root", "");
        Statement st = conn.createStatement();
        String query = "SELECT SUM(b.price) AS total_penalty " +
                       "FROM book_details b " +
                       "JOIN issue_book_details i ON b.bookID = i.bookID " +
                       "WHERE i.studentID = '" + studentId + "' AND i.status = 'đã mất'";
        ResultSet rs = st.executeQuery(query);

        if (rs.next()) {
            totalPenalty = rs.getInt("total_penalty");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return totalPenalty;
    }


    public boolean addPenalty(){
    boolean isAdded = false;
    
    Date collectDate = date_collectDate.getDatoFecha();
    long l1 = collectDate.getTime();
    java.sql.Date sqlCollectDate = new java.sql.Date(l1);
    
    String penaltyID = txt_penaltyID.getText();
    String selectedItem = (String) studentCombobox.getSelectedItem();
    if (selectedItem == null) {
        JOptionPane.showMessageDialog(this, "Please select a student.");
        return false;
    }
    String studentId = selectedItem.split(" - ")[0];
    int totalPenalty = moneyPenalty(studentId);
    
    try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlythuvien", "root", "");
        String sql = "insert into penalty(penaltyID, studentID, money, date) values(?, ?, ?, ?)";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, penaltyID);
        pst.setString(2, studentId);
        pst.setInt(3, totalPenalty);
        pst.setDate(4, sqlCollectDate);
        
        int rowCount = pst.executeUpdate();
        if (rowCount > 0) {
            isAdded = true;
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return isAdded;
    }
    
    public void clearFormInput(){
        txt_penaltyID.setText("");
        txt_money.setText("");
    }

    private void tbl_penaltyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_penaltyMouseClicked

    }//GEN-LAST:event_tbl_penaltyMouseClicked

    private void tbl_issueBookDetails1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_issueBookDetails1MouseClicked
        clearTable();
        setIssueBookDetailsToTable();
    }//GEN-LAST:event_tbl_issueBookDetails1MouseClicked

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
       clearTable();
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void studentComboboxPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_studentComboboxPopupMenuWillBecomeVisible
        importDataToCombobox();
    }//GEN-LAST:event_studentComboboxPopupMenuWillBecomeVisible

    private void studentComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentComboboxActionPerformed
        // Lấy chuỗi được chọn từ combo box
        String selectedItem = (String) studentCombobox.getSelectedItem();
        if (selectedItem != null) {
            // Tách mã sinh viên từ chuỗi
            String studentId = selectedItem.split(" - ")[0];
            // Truyền mã sinh viên vào hàm tính tiền
            int totalPenalty = moneyPenalty(studentId);
            // Gán giá trị tiền phạt cho txt_money
            txt_money.setText(String.valueOf(totalPenalty));
        }
    }//GEN-LAST:event_studentComboboxActionPerformed

    private void btnTaoPhieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoPhieuActionPerformed
        if (addPenalty()) {
        JOptionPane.showMessageDialog(this, "Thêm phiếu phạt thành công");
        clearTable();
        setBookPenaltyDetailsToTable();
        clearFormInput();
    } else {
        JOptionPane.showMessageDialog(this, "Thêm phiếu phạt thất bại");
    }
    }//GEN-LAST:event_btnTaoPhieuActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        HomePage hp = new HomePage();
        hp.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

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
            java.util.logging.Logger.getLogger(BookPenaltyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookPenaltyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookPenaltyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookPenaltyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookPenaltyForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnTaoPhieu;
    private rojeru_san.componentes.RSDateChooser date_collectDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private javax.swing.JComboBox<String> studentCombobox;
    private rojeru_san.complementos.RSTableMetro tbl_issueBookDetails1;
    private rojeru_san.complementos.RSTableMetro tbl_penalty;
    private java.awt.TextField txt_money;
    private java.awt.TextField txt_penaltyID;
    // End of variables declaration//GEN-END:variables
}
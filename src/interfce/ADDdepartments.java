
package interfce;

import codes.DBconnect;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class ADDdepartments extends javax.swing.JFrame {

         Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
    public ADDdepartments() {
        initComponents();
         conn = DBconnect.connect();
         table3load();
    }
    
    public void table3load(){
        try {
            String sql = "SELECT deptID,deptName FROM departments";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void table3data(){
        int r = jTable1.getSelectedRow();
        String id = jTable1.getValueAt(r, 0).toString();
        String name = jTable1.getValueAt(r,1).toString();
       
        
        deptbox.setText(id);
        ddeptName.setText(name);
        
    }
    
    public void update(){
        String id = deptbox.getText();
        String updept = ddeptName.getText();
       
        
        
        try {
            String sql = " UPDATE departments SET deptName='"+updept+"' WHERE deptID='"+id+"'";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated Successfully");
        } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);

        }
        
        
    }
    public void clear(){
        deptbox.setText("Department ID");
        ddeptName.setText("");
        
        
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ddeptName = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        updtdeptbtn = new javax.swing.JButton();
        deletdept = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        deptbox = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        updtempbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ADD a Department");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 210, 50));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Department Name");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));
        jPanel3.add(ddeptName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 190, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 360, 110));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        jButton1.setText("ADD Department");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jButton2.setText("Clear Form");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 110, -1));

        updtdeptbtn.setText("Update");
        updtdeptbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updtdeptbtnActionPerformed(evt);
            }
        });
        jPanel4.add(updtdeptbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 100, -1));

        deletdept.setText("Delete Department");
        deletdept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletdeptActionPerformed(evt);
            }
        });
        jPanel4.add(deletdept, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 140, 20));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 390, 120));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Department ID");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        deptbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptboxActionPerformed(evt);
            }
        });
        jPanel6.add(deptbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 110, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 270, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 500));

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(204, 204, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Department ID", "DepatmentName"
            }
        ));
        jTable1.setShowGrid(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 370, 500));

        updtempbtn.setText("Update");
        jPanel5.add(updtempbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 130, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 370, 500));

        setSize(new java.awt.Dimension(913, 509));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String dept;
        
        dept = ddeptName.getText();
        
        try {
            String sql = "INSERT INTO departments (deptName) VALUES('"+dept+"')";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Department Added Successfully");
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
        table3load();
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void updtdeptbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updtdeptbtnActionPerformed
        update();
        table3load();
        
    }//GEN-LAST:event_updtdeptbtnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        table3data();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        table3data();
    }//GEN-LAST:event_jTable1KeyReleased

    private void deptboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deptboxActionPerformed

    private void deletdeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletdeptActionPerformed
        
        int check = JOptionPane.showConfirmDialog(null, "Confirm");
        
        if(check==0){
            String id = deptbox.getText();
            try {
                String sql = " DELETE FROM departments WHERE deptID = '"+id+"'";
                pst = (PreparedStatement) conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Successfully Deleted");
                     
            } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, e);
            }
            table3load();
        }
        
    }//GEN-LAST:event_deletdeptActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        clear();
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public static void main(String args[]) {
    
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ADDdepartments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ddeptName;
    private javax.swing.JButton deletdept;
    private javax.swing.JTextField deptbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton updtdeptbtn;
    private javax.swing.JButton updtempbtn;
    // End of variables declaration//GEN-END:variables
}

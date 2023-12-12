package interfce;
import codes.DBconnect;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class AddHRAssistance extends javax.swing.JFrame {
     Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
   
    public AddHRAssistance() {
        initComponents();
        conn = DBconnect.connect();
        table2load();
    }
    
    public void table2load(){
        try {
            String sql = "SELECT assistID,name,phone,address FROM hrassistance";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();
            Table2.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void table2data(){
        int r = Table2.getSelectedRow();
        String id = Table2.getValueAt(r, 0).toString();
        String name = Table2.getValueAt(r,1).toString();
        String phone = Table2.getValueAt(r,2).toString();
        String address = Table2.getValueAt(r,3).toString();
        
        assistIDbox.setText(id);
        aNamebox.setText(name);
        aPhonebox.setText(phone);
        aAddressbox.setText(address);
       
    }
    
    public void update(){
        String id = assistIDbox.getText();
        String upname = aNamebox.getText();
        String upphone = aPhonebox.getText();
        String updaddress = aAddressbox.getText();
        
        
        try {
            String sql = " UPDATE hrassistance SET name='"+upname+"', phone='"+upphone+"', address='"+updaddress+"' WHERE assistID='"+id+"'";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated Successfully");
        } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);

        }
        
        
    }
    public void clear(){
        assistIDbox.setText("Assistant ID");
        aNamebox.setText("");
        aPhonebox.setText("");
        aAddressbox.setText("");
        
    }
    
    
        

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        aNamebox = new javax.swing.JTextField();
        aPhonebox = new javax.swing.JTextField();
        aAddressbox = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        hrAddbtn = new javax.swing.JButton();
        Clearform = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        updtasistbtn = new javax.swing.JButton();
        deleteHRAssist = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        assistIDbox = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ADD HR ASSISTANCE");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 270, 70));

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Name");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel3.setText("Address");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel4.setText("Phone Number");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        aNamebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aNameboxActionPerformed(evt);
            }
        });
        jPanel3.add(aNamebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 210, -1));
        jPanel3.add(aPhonebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 210, -1));
        jPanel3.add(aAddressbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 210, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 430, 160));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hrAddbtn.setText("ADD");
        hrAddbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hrAddbtnActionPerformed(evt);
            }
        });
        jPanel4.add(hrAddbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Clearform.setText("Clear Form");
        Clearform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearformActionPerformed(evt);
            }
        });
        jPanel4.add(Clearform, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        updtasistbtn.setText("Update");
        updtasistbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updtasistbtnActionPerformed(evt);
            }
        });
        jPanel4.add(updtasistbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, -1));

        deleteHRAssist.setText("Delete HR Assist");
        deleteHRAssist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteHRAssistActionPerformed(evt);
            }
        });
        jPanel4.add(deleteHRAssist, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 260, 100));

        jLabel5.setText("Assist ID");

        assistIDbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assistIDboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(assistIDbox, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(assistIDbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 190, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        jPanel5.setBackground(new java.awt.Color(255, 255, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Table2.setAutoCreateRowSorter(true);
        Table2.setBackground(new java.awt.Color(255, 204, 204));
        Table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "AssistID", "Name", "Phone Number", "Address"
            }
        ));
        Table2.setShowGrid(true);
        Table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table2MouseClicked(evt);
            }
        });
        Table2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Table2KeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(Table2);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 430));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 380, 430));

        setSize(new java.awt.Dimension(964, 443));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void aNameboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aNameboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aNameboxActionPerformed

    private void hrAddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hrAddbtnActionPerformed
        String name;
        int phone;
        String address;
        
        name = aNamebox.getText();
        phone = Integer.parseInt(aPhonebox.getText());
        address = aAddressbox.getText();
        
        try {
            String sql = "INSERT INTO hrassistance (name,phone,address) VALUES('"+name+"','"+phone+"','"+address+"')";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "HR Assistant Added Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        table2load();
        
        
        
    }//GEN-LAST:event_hrAddbtnActionPerformed

    private void Table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table2MouseClicked
        table2data();
    }//GEN-LAST:event_Table2MouseClicked

    private void Table2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Table2KeyReleased
        table2data();
    }//GEN-LAST:event_Table2KeyReleased

    private void assistIDboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assistIDboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_assistIDboxActionPerformed

    private void updtasistbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updtasistbtnActionPerformed
        update();
        table2load();
        
    }//GEN-LAST:event_updtasistbtnActionPerformed

    private void deleteHRAssistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteHRAssistActionPerformed
        
        
        int check = JOptionPane.showConfirmDialog(null, "Confirm");
        
        if(check==0){
            String id = assistIDbox.getText();
            try {
                String sql = " DELETE FROM hrassistance WHERE assistID = '"+id+"'";
                pst = (PreparedStatement) conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Successfully Deleted");
                     
            } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, e);
            }
            table2load();
            clear();
        }
        
        
        
        
        
    }//GEN-LAST:event_deleteHRAssistActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ClearformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearformActionPerformed
       clear();
    }//GEN-LAST:event_ClearformActionPerformed

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
            java.util.logging.Logger.getLogger(AddHRAssistance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddHRAssistance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddHRAssistance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddHRAssistance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddHRAssistance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clearform;
    private javax.swing.JTable Table2;
    private javax.swing.JTextField aAddressbox;
    private javax.swing.JTextField aNamebox;
    private javax.swing.JTextField aPhonebox;
    private javax.swing.JTextField assistIDbox;
    private javax.swing.JButton deleteHRAssist;
    private javax.swing.JButton hrAddbtn;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton updtasistbtn;
    // End of variables declaration//GEN-END:variables
}

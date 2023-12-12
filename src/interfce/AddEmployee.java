
package interfce;

import codes.DBconnect;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class AddEmployee extends javax.swing.JFrame {
    
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    
    public AddEmployee() {
        initComponents();
        conn = DBconnect.connect();
        table2load();
    }
    
    
    public void table2load(){
        try {
            String sql = "SELECT epfnb,name,phone,department,designation FROM employee";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();
            Table2.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    public void table2data(){
        int r = Table2.getSelectedRow();
        String epfnb = Table2.getValueAt(r, 0).toString();
        String name = Table2.getValueAt(r,1).toString();
        String phone = Table2.getValueAt(r,2).toString();
        String department = Table2.getValueAt(r,3).toString();
        String designation = Table2.getValueAt(r,4).toString();
        
        
        epfbox.setText(epfnb);
        enamebox.setText(name);
        ephonebox.setText(phone);
        edesigbox.setText(designation);
        edeptbox.setSelectedItem(department);
    }

    public void update(){
        String id = epfbox.getText();
        String upname = enamebox.getText();
        String upphone = ephonebox.getText();
        String updesignation = edesigbox.getText();
        String updepartment = edeptbox.getSelectedItem().toString();
        
        try {
            String sql = " UPDATE employee SET name='"+upname+"', phone='"+upphone+"', department='"+updepartment+"', designation ='"+updesignation+"' WHERE epfnb='"+id+"'";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated Successfully");
        } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);

        }
        
        
    }
    
    public void clear(){
        epfbox.setText("EPF Number");
        enamebox.setText("");
        ephonebox.setText("");
        edesigbox.setText("");
        edeptbox.setSelectedIndex(0);
    }
     public void search(){
        String srch = seaarchemp.getText();
        
        try {
            String sql = "SELECT name,phone,department,designation FROM employee WHERE epfnb LIKE '%"+srch+"%' OR name LIKE '%"+srch+"%'";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();
            searchTable.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    
        
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        addnewempbtn = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        enamebox = new javax.swing.JTextField();
        edesigbox = new javax.swing.JTextField();
        edeptbox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ephonebox = new javax.swing.JTextField();
        updtempbtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        epfbox = new javax.swing.JTextField();
        deleteempbtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        seaarchemp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addnewempbtn.setText("ADD Employee");
        addnewempbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addnewempbtnActionPerformed(evt);
            }
        });
        jPanel1.add(addnewempbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        clearbtn.setText("Clear Form");
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });
        jPanel1.add(clearbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 110, -1));

        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("ADD Employee");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 120, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 250, 50));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enamebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enameboxActionPerformed(evt);
            }
        });
        jPanel3.add(enamebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 160, -1));
        jPanel3.add(edesigbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 160, -1));

        edeptbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "IT", "Design", "Business Development", "Marketing", "Finances" }));
        jPanel3.add(edeptbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 120, -1));

        jLabel1.setText("Name");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setText("Designation");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel3.setText("Department");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel5.setText("Phone Number");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        jPanel3.add(ephonebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 160, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 340, 220));

        updtempbtn.setText("Update");
        updtempbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updtempbtnActionPerformed(evt);
            }
        });
        jPanel1.add(updtempbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 130, -1));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("EPFnb");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        jPanel4.add(epfbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 80, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 190, 40));

        deleteempbtn.setText("Delete Employee");
        deleteempbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteempbtnActionPerformed(evt);
            }
        });
        jPanel1.add(deleteempbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 130, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Search"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        seaarchemp.setToolTipText("Search By EPF Number");
        seaarchemp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seaarchempMouseClicked(evt);
            }
        });
        seaarchemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seaarchempActionPerformed(evt);
            }
        });
        seaarchemp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                seaarchempKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                seaarchempKeyReleased(evt);
            }
        });
        jPanel5.add(seaarchemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 120, 20));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 220, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 470));

        searchTable.setBackground(new java.awt.Color(102, 255, 204));
        searchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "EPFnb", "Name", "PhoneNumber", "Department ", "Designation"
            }
        ));
        searchTable.setToolTipText("Search By EPF Number");
        searchTable.setShowGrid(true);
        searchTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchTableMouseClicked(evt);
            }
        });
        searchTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(searchTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 410, 230));

        Table2.setBackground(new java.awt.Color(102, 255, 204));
        Table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "EPFnb", "Name", "PhoneNumber", "Department ", "Designation"
            }
        ));
        Table2.setToolTipText("Search By EPF Number");
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

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 410, 240));

        setSize(new java.awt.Dimension(838, 481));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void enameboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enameboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enameboxActionPerformed

    private void addnewempbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addnewempbtnActionPerformed
       
        String name;
        int phone;
        String designation;
        String department;
        
        name = enamebox.getText();
        phone = Integer.parseInt(ephonebox.getText());
        designation = edesigbox.getText();
        department = edeptbox.getSelectedItem().toString();
        
        try {
            String sql = "INSERT INTO employee (name,phone,department,designation) VALUES('"+name+"','"+phone+"','"+department +"','"+designation+"')";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Employee Added Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        table2load();
        clear();
        
        
        
    }//GEN-LAST:event_addnewempbtnActionPerformed

    private void searchTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchTableMouseClicked
        table2data();
    }//GEN-LAST:event_searchTableMouseClicked

    private void searchTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTableKeyReleased
        table2data();
    }//GEN-LAST:event_searchTableKeyReleased

    private void updtempbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updtempbtnActionPerformed
        update();
        table2load();
        
    }//GEN-LAST:event_updtempbtnActionPerformed

    private void deleteempbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteempbtnActionPerformed
        int check = JOptionPane.showConfirmDialog(null, "Confirm");
        
        if(check==0){
            String id = epfbox.getText();
            try {
                String sql = " DELETE FROM employee WHERE epfnb = '"+id+"'";
                pst = (PreparedStatement) conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Successfully Deleted");
                     
            } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, e);
            }
            table2load();
            clear();
        }
        
    }//GEN-LAST:event_deleteempbtnActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        clear();
    }//GEN-LAST:event_clearbtnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void Table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table2MouseClicked
        table2data();
    }//GEN-LAST:event_Table2MouseClicked

    private void Table2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Table2KeyReleased
        table2data();
    }//GEN-LAST:event_Table2KeyReleased

    private void seaarchempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seaarchempActionPerformed
       search();
    }//GEN-LAST:event_seaarchempActionPerformed

    private void seaarchempMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seaarchempMouseClicked
        search();
    }//GEN-LAST:event_seaarchempMouseClicked

    private void seaarchempKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_seaarchempKeyReleased
        search();
    }//GEN-LAST:event_seaarchempKeyReleased

    private void seaarchempKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_seaarchempKeyPressed
        search();
    }//GEN-LAST:event_seaarchempKeyPressed

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
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table2;
    private javax.swing.JButton addnewempbtn;
    private javax.swing.JButton clearbtn;
    private javax.swing.JButton deleteempbtn;
    private javax.swing.JComboBox<String> edeptbox;
    private javax.swing.JTextField edesigbox;
    private javax.swing.JTextField enamebox;
    private javax.swing.JTextField epfbox;
    private javax.swing.JTextField ephonebox;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField seaarchemp;
    private javax.swing.JTable searchTable;
    private javax.swing.JButton updtempbtn;
    // End of variables declaration//GEN-END:variables
}

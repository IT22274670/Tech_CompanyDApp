
package interfce;

import codes.DBconnect;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Dr.Pc
 */
public class ManageEmployees extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    
    public ManageEmployees() {
        initComponents();
        conn = DBconnect.connect();
        table1load();
        table2load();
        table3load();
    }
    
    public void table1load(){
        try {
            String sql = "SELECT epfnb,name,phone,department,designation FROM employee";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();
            Table1.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
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
    public void table3load(){
        try {
            String sql = "SELECT deptID,deptName FROM departments";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();
            Table3.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void search(){
        String srch = serchbox.getText();
        
        try {
            String sql = "SELECT name,phone,department,designation FROM employee WHERE epfnb LIKE '%"+srch+"%' OR name LIKE '%"+srch+"%'";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();
            srchTable.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel14 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        serchbox = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        adddeptbtn = new javax.swing.JButton();
        addHRAssistbtn = new javax.swing.JButton();
        addempbtn = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        srchTable = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Table2 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Table3 = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Search Employee"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        serchbox.setToolTipText("Enter EPF Number");
        serchbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serchboxActionPerformed(evt);
            }
        });
        serchbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                serchboxKeyReleased(evt);
            }
        });
        jPanel3.add(serchbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 310, -1));

        jPanel6.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 410, 60));

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adddeptbtn.setText("ADD a Department");
        adddeptbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adddeptbtnActionPerformed(evt);
            }
        });
        jPanel4.add(adddeptbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        addHRAssistbtn.setText("ADD a HR Assistance");
        addHRAssistbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addHRAssistbtnActionPerformed(evt);
            }
        });
        jPanel4.add(addHRAssistbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        addempbtn.setText("Add an Employee");
        addempbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addempbtnActionPerformed(evt);
            }
        });
        jPanel4.add(addempbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 140, -1));

        jPanel6.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 420, 130));

        jPanel15.setBackground(new java.awt.Color(204, 255, 204));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        srchTable.setBackground(new java.awt.Color(204, 255, 204));
        srchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Department", "Designation"
            }
        ));
        jScrollPane5.setViewportView(srchTable);

        jPanel15.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 240));

        jPanel6.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 400, 240));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 620));

        jPanel7.setBackground(new java.awt.Color(255, 255, 153));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Table1.setBackground(new java.awt.Color(255, 153, 102));
        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "EPF Number", "Name", "Department", "Designation"
            }
        ));
        Table1.setCellSelectionEnabled(true);
        Table1.setEditingColumn(5);
        Table1.setShowGrid(true);
        jScrollPane2.setViewportView(Table1);
        Table1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jPanel7.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 190));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 400, 190));

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jScrollPane3.setViewportView(Table2);

        jPanel8.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 140));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 410, 140));

        jPanel9.setBackground(new java.awt.Color(0, 204, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Table3.setBackground(new java.awt.Color(204, 204, 255));
        Table3.setModel(new javax.swing.table.DefaultTableModel(
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
        Table3.setShowGrid(true);
        jScrollPane4.setViewportView(Table3);

        jPanel9.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 120));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, 410, 120));

        jPanel10.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setText("HR Assistants Details");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 210, 30));

        jPanel11.setBackground(new java.awt.Color(255, 102, 51));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Employees Details");
        jPanel11.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 130, 20));

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 210, 30));

        jPanel12.setBackground(new java.awt.Color(51, 255, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Departments");
        jPanel12.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 200, 30));

        jPanel13.setBackground(new java.awt.Color(255, 204, 204));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("All Details");
        jPanel13.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 190, 30));

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 280, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 620));

        setSize(new java.awt.Dimension(930, 626));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void serchboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serchboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serchboxActionPerformed

    private void adddeptbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adddeptbtnActionPerformed
        ADDdepartments d1 = new ADDdepartments();
            d1.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_adddeptbtnActionPerformed

    private void addHRAssistbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addHRAssistbtnActionPerformed
        AddHRAssistance a1 = new AddHRAssistance();
            a1.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_addHRAssistbtnActionPerformed

    private void addempbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addempbtnActionPerformed
        
        
        AddEmployee e1 = new AddEmployee();
            e1.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_addempbtnActionPerformed

    private void serchboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serchboxKeyReleased
        search();
    }//GEN-LAST:event_serchboxKeyReleased

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
            java.util.logging.Logger.getLogger(ManageEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageEmployees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table1;
    private javax.swing.JTable Table2;
    private javax.swing.JTable Table3;
    private javax.swing.JButton addHRAssistbtn;
    private javax.swing.JButton adddeptbtn;
    private javax.swing.JButton addempbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField serchbox;
    private javax.swing.JTable srchTable;
    // End of variables declaration//GEN-END:variables
}

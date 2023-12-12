
package interfce;

import javax.swing.JOptionPane;


public class login extends javax.swing.JFrame {

 
    public login() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        uname = new javax.swing.JLabel();
        uNameBox = new javax.swing.JTextField();
        pwd = new javax.swing.JLabel();
        pWordBox = new javax.swing.JPasswordField();
        loginButtonAssistance = new javax.swing.JButton();
        loginButtonManager = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Book", 3, 18)); // NOI18N
        jLabel1.setText("Tech Company Login ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, -1));

        uname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        uname.setText("USER NAME");
        jPanel1.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 200, 30));
        jPanel1.add(uNameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 280, 30));

        pwd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pwd.setText("PASSWORD");
        jPanel1.add(pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 200, 30));
        jPanel1.add(pWordBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 280, 30));

        loginButtonAssistance.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loginButtonAssistance.setText("LOGIN as HR Assistance");
        loginButtonAssistance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonAssistanceActionPerformed(evt);
            }
        });
        jPanel1.add(loginButtonAssistance, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 200, 40));

        loginButtonManager.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loginButtonManager.setText("LOGIN as HR Manager");
        loginButtonManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonManagerActionPerformed(evt);
            }
        });
        jPanel1.add(loginButtonManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 200, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 610));

        setSize(new java.awt.Dimension(932, 614));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonAssistanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonAssistanceActionPerformed
            String uname;
            String pwd;
            uname = uNameBox.getText();
            pwd = pWordBox.getText();
            
            if(uname.equals("assist") && pwd.equals("222")){
          AddEmployee e1 = new AddEmployee();
            e1.setVisible(true);
            this.dispose();
      }
            else{
          JOptionPane.showMessageDialog(null,"Incorrect Credentials");
      }
      
      
        
    }//GEN-LAST:event_loginButtonAssistanceActionPerformed

    private void loginButtonManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonManagerActionPerformed
       
      String uname;
      String pwd;
      
      uname = uNameBox.getText();
      pwd = pWordBox.getText();
      if(uname.equals("manager") && pwd.equals("111")){
            ManageEmployees m1 = new ManageEmployees();
            m1.setVisible(true);
            this.dispose();
        }     
      else{
          JOptionPane.showMessageDialog(null,"Incorrect Credentials");
      }
        
    }//GEN-LAST:event_loginButtonManagerActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButtonAssistance;
    private javax.swing.JButton loginButtonManager;
    private javax.swing.JPasswordField pWordBox;
    private javax.swing.JLabel pwd;
    private javax.swing.JTextField uNameBox;
    private javax.swing.JLabel uname;
    // End of variables declaration//GEN-END:variables
}

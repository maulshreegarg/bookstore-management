package connectmysql;
import java.awt.event.*;
import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class Login extends javax.swing.JFrame implements ActionListener
{
    public Login() 
    {
        initComponents();
        setTitle("login page");
         setLocation(150,120);
    }
    public void actionPerformed(ActionEvent ae)
    {
      
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        imageofbook = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        log_cross = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        log_pass = new javax.swing.JPasswordField();
        log_user = new javax.swing.JTextField();
        log_cat = new javax.swing.JComboBox<>();
        log_reset = new javax.swing.JLabel();
        log_log = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(106, 55, 207));
        jPanel1.setForeground(new java.awt.Color(51, 0, 204));

        imageofbook.setIcon(new javax.swing.ImageIcon("C:\\Users\\moone\\OneDrive\\Pictures\\java proj\\logo3.jpg")); // NOI18N

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Buy books in fair prices");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(imageofbook, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(imageofbook, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 36)); // NOI18N
        jLabel1.setText("Bookshop system");

        log_cross.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        log_cross.setForeground(new java.awt.Color(51, 0, 102));
        log_cross.setText("X");
        log_cross.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                log_crossMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 153));
        jLabel5.setText("Username");

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 153));
        jLabel6.setText("Password");

        log_pass.setText("jPasswordField1");

        log_user.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        log_user.setForeground(new java.awt.Color(51, 0, 153));
        log_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_userActionPerformed(evt);
            }
        });

        log_cat.setBackground(new java.awt.Color(51, 0, 204));
        log_cat.setForeground(new java.awt.Color(255, 255, 255));
        log_cat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Seller" }));
        log_cat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                log_catMouseClicked(evt);
            }
        });
        log_cat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_catActionPerformed(evt);
            }
        });

        log_reset.setBackground(new java.awt.Color(255, 255, 255));
        log_reset.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        log_reset.setForeground(new java.awt.Color(51, 0, 204));
        log_reset.setText("reset");
        log_reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                log_resetMouseClicked(evt);
            }
        });

        log_log.setBackground(new java.awt.Color(51, 0, 204));
        log_log.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        log_log.setForeground(new java.awt.Color(255, 255, 255));
        log_log.setText("login");
        log_log.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                log_logMouseClicked(evt);
            }
        });
        log_log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_logActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(log_cross))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(log_user, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(57, 57, 57))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(log_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(log_cat, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(log_log, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(log_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(log_cross)
                        .addGap(180, 180, 180))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(log_cat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(log_user, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(log_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(log_log, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(log_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void log_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_userActionPerformed
  
    }//GEN-LAST:event_log_userActionPerformed

    private void log_catActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_catActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_log_catActionPerformed

    private void log_logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_logActionPerformed
      
    }//GEN-LAST:event_log_logActionPerformed

    private void log_logMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_log_logMouseClicked
      if(evt.getSource()==log_log)
      {
          String un=log_user.getText();
          String pass;
          pass = String.valueOf(log_pass.getPassword());
          String c1=(String) log_cat.getSelectedItem();
          Connection c;
          Statement st;
          try
          {
              if(un.equals(""))
              {
                  JOptionPane.showMessageDialog(null,"name is required");
              }
              else if(!(pass.equals("pass1234")))
              {
                   JOptionPane.showMessageDialog(null,"incorrect password");
              }
              else
              {
                  //insert into signup values('un','pass','c1');
                  c=DriverManager.getConnection("jdbc:mysql://localhost:3306/booksystem?zeroDateTimeBehavior=CONVERT_TO_NULL","root","root");
                  st=c.createStatement();
                  String q1="insert into signup values('"+un+"', '"+pass+"', '"+c1+"')";//mysql query
                  st.executeUpdate(q1);
                  log_user.setText("");
                   log_pass.setText("");
                   JOptionPane.showMessageDialog(null,"name is entered successfully");
                   User a=new User();
                   a.setVisible(true);
                   this.dispose();
               
              }
          }
          catch(Exception e)
          {
              System.out.print(e);
          }
      }
    }//GEN-LAST:event_log_logMouseClicked

    private void log_resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_log_resetMouseClicked
         if(evt.getSource()==log_reset)
      {
          //text field
          log_user.setText("");
          log_pass.setText("");
      }
    }//GEN-LAST:event_log_resetMouseClicked

    private void log_catMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_log_catMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_log_catMouseClicked

    private void log_crossMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_log_crossMouseClicked
       System.exit(0);
    }//GEN-LAST:event_log_crossMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imageofbook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> log_cat;
    private javax.swing.JLabel log_cross;
    private javax.swing.JToggleButton log_log;
    private javax.swing.JPasswordField log_pass;
    private javax.swing.JLabel log_reset;
    private javax.swing.JTextField log_user;
    // End of variables declaration//GEN-END:variables


}    // End of variables declaration         


import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Basti Pogi
 */
public class AccountInfoFrame extends javax.swing.JFrame {

    /**
     * Creates new form AccountInfoFrame
     */
    private String id;
    private String username;
    private String password;
    private String name;
    private String lastname;
    private String access;
    private String department;
    int change = 1;
    int edit = 1;
    private String uAccess;
    DatabaseTransaction dt = new DatabaseTransaction();

    public AccountInfoFrame() {
        initComponents();
        usernameTF.setEditable(false);
        firstnameTF.setEditable(false);
        lastnameTF.setEditable(false);
        cPasswordL.setVisible(false);
        newPasswordTF.setVisible(false);
        cPasswordTF.setVisible(false);
        newPasswordL.setVisible(false);
        changepwB.setEnabled(false);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        usernameTF = new javax.swing.JTextField();
        departmentList = new javax.swing.JComboBox<>();
        userList = new javax.swing.JComboBox<>();
        saveB = new javax.swing.JButton();
        editB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        changepwB = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lastnameTF = new javax.swing.JTextField();
        firstnameTF = new javax.swing.JTextField();
        newPasswordL = new javax.swing.JLabel();
        cPasswordL = new javax.swing.JLabel();
        cPasswordTF = new javax.swing.JPasswordField();
        newPasswordTF = new javax.swing.JPasswordField();
        deleteB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Account information");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Username:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Department:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Access:");

        usernameTF.setBackground(new java.awt.Color(204, 204, 204));
        usernameTF.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        usernameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTFActionPerformed(evt);
            }
        });

        departmentList.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        departmentList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HRM", "Chem lab", "Supplies", "Bookstore", "Electronics lab" }));
        departmentList.setEnabled(false);

        userList.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        userList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SuperAdmin", "Admin", "User", "InActive" }));
        userList.setEnabled(false);

        saveB.setBackground(new java.awt.Color(255, 255, 204));
        saveB.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        saveB.setText("Save");
        saveB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBActionPerformed(evt);
            }
        });

        editB.setBackground(new java.awt.Color(255, 255, 204));
        editB.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        editB.setText("Edit");
        editB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Password:");

        changepwB.setBackground(new java.awt.Color(255, 255, 204));
        changepwB.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        changepwB.setText("Change Password");
        changepwB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changepwBActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Lastname:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Firstname:");

        lastnameTF.setEditable(false);
        lastnameTF.setBackground(new java.awt.Color(204, 204, 204));
        lastnameTF.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lastnameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameTFActionPerformed(evt);
            }
        });

        firstnameTF.setEditable(false);
        firstnameTF.setBackground(new java.awt.Color(204, 204, 204));
        firstnameTF.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        firstnameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameTFActionPerformed(evt);
            }
        });

        newPasswordL.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        newPasswordL.setText("New Password:");

        cPasswordL.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cPasswordL.setText("Confirm Password:");

        cPasswordTF.setBackground(new java.awt.Color(255, 255, 204));

        newPasswordTF.setBackground(new java.awt.Color(255, 255, 204));

        deleteB.setBackground(new java.awt.Color(255, 255, 204));
        deleteB.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        deleteB.setText("Delete");
        deleteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(saveB, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editB, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteB, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(firstnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(changepwB)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(userList, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(newPasswordL, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cPasswordL, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cPasswordTF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(newPasswordTF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(departmentList, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 93, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(departmentList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newPasswordL, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newPasswordTF, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changepwB)
                    .addComponent(cPasswordL, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cPasswordTF, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveB)
                    .addComponent(editB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTFActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        userList.setEnabled(false);
        departmentList.setEnabled(false);

    }//GEN-LAST:event_formWindowClosed

    private void saveBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBActionPerformed
        // TODO add your handling code here:
        String p = password;

        if (newPasswordTF.getText().equals(cPasswordTF.getText())) {
            p = newPasswordTF.getText();
            int ans = JOptionPane.YES_NO_OPTION;
            JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING", ans);
            if (ans == JOptionPane.YES_OPTION) {

                if (p.isEmpty() || p.length() < 1) {
                    dt.editUser(id, firstnameTF.getText(), lastnameTF.getText(), userList.getSelectedItem().toString(), departmentList.getSelectedItem().toString(), password);
                    JOptionPane.showMessageDialog(null, "Changes saved!");
                } else {
                    dt.editUser(id, firstnameTF.getText(), lastnameTF.getText(), userList.getSelectedItem().toString(), departmentList.getSelectedItem().toString(), p);
                    JOptionPane.showMessageDialog(null, "Changes saved!");
                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "Password not match!");
        }


    }//GEN-LAST:event_saveBActionPerformed

    private void editBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBActionPerformed
        // TODO add your handling code here:

        if (uAccess.equals("SuperAdmin")) {
            superAdminEdit();
        } else {
            adminEdit();
        }


    }//GEN-LAST:event_editBActionPerformed

    private void lastnameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameTFActionPerformed

    private void firstnameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameTFActionPerformed

    private void changepwBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changepwBActionPerformed
        // TODO add your handling code here:
        change++;
        if (change % 2 == 0) {
            cPasswordL.setVisible(true);
            newPasswordTF.setVisible(true);
            cPasswordTF.setVisible(true);
            newPasswordL.setVisible(true);
        } else {
            cPasswordL.setVisible(false);
            newPasswordTF.setVisible(false);
            cPasswordTF.setVisible(false);
            newPasswordL.setVisible(false);
        }

    }//GEN-LAST:event_changepwBActionPerformed

    private void deleteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBActionPerformed
        // TODO add your handling code here:

        if (access.equals("InActive")) {
            int ans = JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING", JOptionPane.YES_NO_OPTION);
            if (ans == JOptionPane.YES_NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Account deleted");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Only disabled accounts can be deleted");
        }
    }//GEN-LAST:event_deleteBActionPerformed
    public void initializeFields(String id, String username, String name, String lastname, String password, String access, String department, String uAccess) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.lastname = lastname;
        this.password = password;
        this.access = access;
        this.department = department;
        this.uAccess = uAccess;

        usernameTF.setText(username);
        firstnameTF.setText(name);
        lastnameTF.setText(lastname);

        if (access.equals("SuperAdmin")) {
            userList.setSelectedIndex(0);
        } else {
            userList.removeAllItems();
            userList.addItem("Admin");
            userList.addItem("Encoder");
            userList.addItem("InActive");
        }
        if (access.equals("Admin")) {
            userList.setSelectedIndex(0);
        } else if (access.equals("Encoder")) {
            userList.setSelectedIndex(1);
        } else if (access.equals("InActive")) {
            userList.setSelectedIndex(2);
        }

        if (department.equals("HRM")) {
            departmentList.setSelectedIndex(0);
        } else if (department.equals("Chem lab")) {
            departmentList.setSelectedIndex(1);
        } else if (department.equals("Supplies")) {
            departmentList.setSelectedIndex(2);
        } else if (department.equals("Bookstore")) {
            departmentList.setSelectedIndex(3);
        } else if (department.equals("Electronics lab")) {
            departmentList.setSelectedIndex(4);
        }

    }

    public void superAdminEdit() {
        edit++;
        if (edit % 2 == 0) {
            firstnameTF.setEditable(true);
            lastnameTF.setEditable(true);
            firstnameTF.setBackground(new java.awt.Color(255, 255, 204));
            lastnameTF.setBackground(new java.awt.Color(255, 255, 204));
            changepwB.setEnabled(true);
            lastnameTF.setEditable(true);
            changepwB.setEnabled(true);
            userList.setEnabled(true);
            departmentList.setEnabled(true);

        } else {

            firstnameTF.setEditable(false);
            lastnameTF.setEditable(false);
            firstnameTF.setBackground(new java.awt.Color(204, 204, 204));
            lastnameTF.setBackground(new java.awt.Color(204, 204, 204));
            changepwB.setEnabled(false);
            userList.setEnabled(false);
            departmentList.setEnabled(false);
        }
    }

    public void adminEdit() {
        edit++;
        if (edit % 2 == 0) {
            firstnameTF.setEditable(true);
            lastnameTF.setEditable(true);
            firstnameTF.setBackground(new java.awt.Color(255, 255, 204));
            lastnameTF.setBackground(new java.awt.Color(255, 255, 204));
            changepwB.setEnabled(true);
            lastnameTF.setEditable(true);
            changepwB.setEnabled(true);
            userList.setEnabled(true);

        } else {

            firstnameTF.setEditable(false);
            lastnameTF.setEditable(false);
            firstnameTF.setBackground(new java.awt.Color(204, 204, 204));
            lastnameTF.setBackground(new java.awt.Color(204, 204, 204));
            changepwB.setEnabled(false);
            userList.setEnabled(false);

        }
    }

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
            java.util.logging.Logger.getLogger(AccountInfoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountInfoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountInfoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountInfoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountInfoFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cPasswordL;
    private javax.swing.JPasswordField cPasswordTF;
    private javax.swing.JButton changepwB;
    private javax.swing.JButton deleteB;
    private javax.swing.JComboBox<String> departmentList;
    private javax.swing.JButton editB;
    private javax.swing.JTextField firstnameTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastnameTF;
    private javax.swing.JLabel newPasswordL;
    private javax.swing.JPasswordField newPasswordTF;
    private javax.swing.JButton saveB;
    private javax.swing.JComboBox<String> userList;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables
}
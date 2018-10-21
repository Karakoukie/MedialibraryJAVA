package dialogs.users;

import controllers.UserModuleController;
import java.awt.Frame;
import static java.awt.Frame.getFrames;
import java.awt.MediaTracker;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class UsersModuleDialog extends javax.swing.JFrame {

    public UsersModuleDialog() {
        initComponents();
        this.setLocationRelativeTo(this.getParent());
        setIcon();
    }
    
    private void setIcon() {
        ImageIcon icon = new ImageIcon("icon.png");
        if (icon.getImageLoadStatus() == MediaTracker.COMPLETE) {
            setIconImage(icon.getImage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchFiltersPanel = new javax.swing.JPanel();
        emailSearchFilterField = new javax.swing.JTextField();
        loginSearchFilterLabel = new javax.swing.JLabel();
        resultsNumberField = new javax.swing.JSpinner();
        resultNumberLabel = new javax.swing.JLabel();
        displayButton = new javax.swing.JButton();
        previousButton = new javax.swing.JButton();
        tablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();
        addUserButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        searchFiltersPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Filtres de recherche", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        emailSearchFilterField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emailSearchFilterField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        loginSearchFilterLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loginSearchFilterLabel.setText("Email: ");

        resultsNumberField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        resultsNumberField.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(5), Integer.valueOf(1), null, Integer.valueOf(1)));
        resultsNumberField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        resultNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        resultNumberLabel.setText("Nombre de résultats: ");

        javax.swing.GroupLayout searchFiltersPanelLayout = new javax.swing.GroupLayout(searchFiltersPanel);
        searchFiltersPanel.setLayout(searchFiltersPanelLayout);
        searchFiltersPanelLayout.setHorizontalGroup(
            searchFiltersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchFiltersPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(loginSearchFilterLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailSearchFilterField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resultNumberLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultsNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        searchFiltersPanelLayout.setVerticalGroup(
            searchFiltersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchFiltersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchFiltersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailSearchFilterField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginSearchFilterLabel)
                    .addComponent(resultsNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultNumberLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        displayButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        displayButton.setText("Afficher les utilisateurs");
        displayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayButtonActionPerformed(evt);
            }
        });

        previousButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        previousButton.setText("Retour");
        previousButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousButtonActionPerformed(evt);
            }
        });

        tablePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Filtres de recherche", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        usersTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        usersTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "email", "statut", "nom"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        usersTable.getTableHeader().setReorderingAllowed(false);
        usersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(usersTable);

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
                .addContainerGap())
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                .addContainerGap())
        );

        addUserButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addUserButton.setText("Ajouter un utilisateur");
        addUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchFiltersPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(displayButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(previousButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addUserButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchFiltersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayButton)
                .addGap(1, 1, 1)
                .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(previousButton)
                    .addComponent(addUserButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void previousButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousButtonActionPerformed
        UserModuleController.previousDialog();
    }//GEN-LAST:event_previousButtonActionPerformed

    private void displayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayButtonActionPerformed
        String emailSearchFilter = this.emailSearchFilterField.getText();
        int resultNumber = Integer.parseInt(this.resultsNumberField.getValue().toString());
        JTable usersTable = this.usersTable;

        UserModuleController.displayUsers(emailSearchFilter, resultNumber, usersTable);
    }//GEN-LAST:event_displayButtonActionPerformed

    private void addUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserButtonActionPerformed
        UserModuleController.openAddUserDialog();
    }//GEN-LAST:event_addUserButtonActionPerformed

    private void usersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) this.usersTable.getModel();
        int selectedUserID = Integer.parseInt(model.getValueAt(this.usersTable.getSelectedRow(), 0).toString());
        UserModuleController.setSelectedUser(selectedUserID);
        UserModuleController.openModifyUserDialog();
    }//GEN-LAST:event_usersTableMouseClicked

    public static void main(String args[]) {
        try {
            String systemLookAndFeel = UIManager.getSystemLookAndFeelClassName();
            UIManager.setLookAndFeel(systemLookAndFeel);
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsersModuleDialog().setVisible(true);
            }
        });
    }

    public static void close() {
        Frame[] frames = getFrames();

        for (Frame frame : frames) {
            frame.dispose();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addUserButton;
    private javax.swing.JButton displayButton;
    private javax.swing.JTextField emailSearchFilterField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loginSearchFilterLabel;
    private javax.swing.JButton previousButton;
    private javax.swing.JLabel resultNumberLabel;
    private javax.swing.JSpinner resultsNumberField;
    private javax.swing.JPanel searchFiltersPanel;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JTable usersTable;
    // End of variables declaration//GEN-END:variables

}

package dialogs.commands;

import controllers.CommandsModuleController;
import entities.CommandEntity;
import java.awt.Frame;
import java.awt.MediaTracker;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class CommandsModuleDialog extends javax.swing.JFrame {

    public CommandsModuleDialog() {
        initComponents();
        this.setLocationRelativeTo(this.getParent());
        setIcon();
        
        ArrayList<CommandEntity> commandsList = CommandEntity.select("", "", 100);
        if (commandsList.size() > 0) {
            for (CommandEntity commandEntity : commandsList) {
                this.dateSearchField.addItem(commandEntity.getCommand_date());
                this.userSearchField.addItem(commandEntity.getCommand_user().getUser_person().getPerson_name());
            }
        }
        else {
            this.dateSearchField.addItem("");
            this.userSearchField.addItem("");
        }
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        resultNumberField = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        userSearchField = new javax.swing.JComboBox<>();
        dateSearchField = new javax.swing.JComboBox<>();
        displayButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        commandsTable = new javax.swing.JTable();
        previousButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtres de recherche", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Date: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre de résultats: ");

        resultNumberField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        resultNumberField.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Utilisateur: ");

        userSearchField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userSearchField.setToolTipText("Sélectionnez l'utilisateur ayant passé les commandes à afficher");

        dateSearchField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dateSearchField.setToolTipText("Sélectionnez la date des commandes à afficher");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(resultNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(userSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        displayButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        displayButton.setText("Afficher les commandes");
        displayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayButtonActionPerformed(evt);
            }
        });

        commandsTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        commandsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Utilisateur", "Quantité d'articles"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(commandsTable);

        previousButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        previousButton.setText("Retour");
        previousButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(displayButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(previousButton, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(previousButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void previousButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousButtonActionPerformed
        CommandsModuleController.openPreviousDialog();
    }//GEN-LAST:event_previousButtonActionPerformed

    private void displayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayButtonActionPerformed
        String date = this.dateSearchField.getSelectedItem().toString();
        String user = this.userSearchField.getSelectedItem().toString();
        int resultQuantity = (int) this.resultNumberField.getValue();
        
        CommandsModuleController.displayCommands("", "", resultQuantity, this.commandsTable);
    }//GEN-LAST:event_displayButtonActionPerformed

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
                new CommandsModuleDialog().setVisible(true);
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
    private javax.swing.JTable commandsTable;
    private javax.swing.JComboBox<String> dateSearchField;
    private javax.swing.JButton displayButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton previousButton;
    private javax.swing.JSpinner resultNumberField;
    private javax.swing.JComboBox<String> userSearchField;
    // End of variables declaration//GEN-END:variables

}

package dialogs;

import controllers.ModulesController;
import java.awt.Frame;
import static java.awt.Frame.getFrames;
import java.awt.MediaTracker;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class ModulesDialog extends javax.swing.JFrame {

    public ModulesDialog() {
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

        modulesPanel = new javax.swing.JPanel();
        usersButton = new javax.swing.JButton();
        comandsButton = new javax.swing.JButton();
        articlesButton = new javax.swing.JButton();
        previousButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        modulesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Modules", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        usersButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usersButton.setText("Utilisateurs");
        usersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usersButtonActionPerformed(evt);
            }
        });

        comandsButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comandsButton.setText("Commandes");
        comandsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comandsButtonActionPerformed(evt);
            }
        });

        articlesButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        articlesButton.setText("Articles");
        articlesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                articlesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout modulesPanelLayout = new javax.swing.GroupLayout(modulesPanel);
        modulesPanel.setLayout(modulesPanelLayout);
        modulesPanelLayout.setHorizontalGroup(
            modulesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modulesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usersButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comandsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(articlesButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        modulesPanelLayout.setVerticalGroup(
            modulesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modulesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(modulesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usersButton)
                    .addComponent(comandsButton)
                    .addComponent(articlesButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
                .addComponent(modulesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(previousButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(modulesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(previousButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void previousButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousButtonActionPerformed
        ModulesController.previousDialog();
    }//GEN-LAST:event_previousButtonActionPerformed

    private void usersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usersButtonActionPerformed
        ModulesController.openUsersModuleDialog();
    }//GEN-LAST:event_usersButtonActionPerformed

    private void articlesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_articlesButtonActionPerformed
        ModulesController.openArticlesModuleDialog();
    }//GEN-LAST:event_articlesButtonActionPerformed

    private void comandsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comandsButtonActionPerformed
        ModulesController.openCommandsModuleDialog();
    }//GEN-LAST:event_comandsButtonActionPerformed

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
                new ModulesDialog().setVisible(true);
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
    private javax.swing.JButton articlesButton;
    private javax.swing.JButton comandsButton;
    private javax.swing.JPanel modulesPanel;
    private javax.swing.JButton previousButton;
    private javax.swing.JButton usersButton;
    // End of variables declaration//GEN-END:variables

}

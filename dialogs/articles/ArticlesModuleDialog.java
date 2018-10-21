package dialogs.articles;

import controllers.ArticlesModuleController;
import java.awt.Frame;
import static java.awt.Frame.getFrames;
import java.awt.MediaTracker;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class ArticlesModuleDialog extends javax.swing.JFrame {

    public ArticlesModuleDialog() {
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

        jPanel1 = new javax.swing.JPanel();
        moviesButton = new javax.swing.JButton();
        musicsButton = new javax.swing.JButton();
        booksButton = new javax.swing.JButton();
        previousButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Articles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        moviesButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        moviesButton.setText("Films");
        moviesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moviesButtonActionPerformed(evt);
            }
        });

        musicsButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        musicsButton.setText("Musiques");
        musicsButton.setEnabled(false);
        musicsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musicsButtonActionPerformed(evt);
            }
        });

        booksButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        booksButton.setText("Livres");
        booksButton.setEnabled(false);
        booksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booksButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(moviesButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(musicsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(booksButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moviesButton)
                    .addComponent(musicsButton)
                    .addComponent(booksButton))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(previousButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(previousButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void previousButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousButtonActionPerformed
        ArticlesModuleController.previousDialog();
    }//GEN-LAST:event_previousButtonActionPerformed

    private void moviesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moviesButtonActionPerformed
        ArticlesModuleController.openMoviesArticleModuleDialog();
    }//GEN-LAST:event_moviesButtonActionPerformed

    private void musicsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musicsButtonActionPerformed

    }//GEN-LAST:event_musicsButtonActionPerformed

    private void booksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booksButtonActionPerformed

    }//GEN-LAST:event_booksButtonActionPerformed

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
                new ArticlesModuleDialog().setVisible(true);
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
    private javax.swing.JButton booksButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton moviesButton;
    private javax.swing.JButton musicsButton;
    private javax.swing.JButton previousButton;
    // End of variables declaration//GEN-END:variables
}

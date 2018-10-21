package dialogs;

import controllers.ConnectionController;
import java.awt.Frame;
import java.awt.MediaTracker;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class ConnectionDialog extends javax.swing.JFrame {

    private ConnectionDialog currentDialog;

    public ConnectionDialog() {
        //changeLookAndFeel();
        initComponents();
        this.setLocationRelativeTo(this.getParent());
        setIcon();
        
        String databaseAddress = ConnectionController.getDatabaseAddress();
        this.databaseAddressField.setText(databaseAddress);
    }
    
    private void changeLookAndFeel() {
        try {
            javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void setIcon() {
        ImageIcon icon = new ImageIcon("src/icon.png");
        if (icon.getImageLoadStatus() == MediaTracker.COMPLETE) {
            setIconImage(icon.getImage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        statutPanel = new javax.swing.JPanel();
        statutLabel = new javax.swing.JLabel();
        formPanel = new javax.swing.JPanel();
        databaseAddressField = new javax.swing.JTextField();
        databaseAddressLabel = new javax.swing.JLabel();
        validateButton = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mediathèque CRUD");
        setIconImages(null);
        setResizable(false);

        statutPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Statut", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        statutLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        statutLabel.setText("Entrez l'adresse de la base de donnée de la médiathèque");

        javax.swing.GroupLayout statutPanelLayout = new javax.swing.GroupLayout(statutPanel);
        statutPanel.setLayout(statutPanelLayout);
        statutPanelLayout.setHorizontalGroup(
            statutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statutPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(statutLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        statutPanelLayout.setVerticalGroup(
            statutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statutPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(statutLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addContainerGap())
        );

        formPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Connexion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        databaseAddressField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        databaseAddressField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        databaseAddressLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        databaseAddressLabel.setText("Adresse de la base de donnée: ");

        javax.swing.GroupLayout formPanelLayout = new javax.swing.GroupLayout(formPanel);
        formPanel.setLayout(formPanelLayout);
        formPanelLayout.setHorizontalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(databaseAddressLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(databaseAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        formPanelLayout.setVerticalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addComponent(databaseAddressLabel)
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addComponent(databaseAddressField))
                .addContainerGap())
        );

        validateButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        validateButton.setText("Valider");
        validateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(formPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(statutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(validateButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(validateButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void validateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validateButtonActionPerformed
        String databaseAddress = this.databaseAddressField.getText();
        ConnectionController.setDatabaseAddress(databaseAddress);

        if (ConnectionController.testDatabaseConnection()) {
            ConnectionController.nextDialog();
        }
        else {
            this.statutLabel.setText("Erreur: Connection impossible");
        }
    }//GEN-LAST:event_validateButtonActionPerformed

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
                new ConnectionDialog().setVisible(true);
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
    private javax.swing.JTextField databaseAddressField;
    private javax.swing.JLabel databaseAddressLabel;
    private javax.swing.JPanel formPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel statutLabel;
    private javax.swing.JPanel statutPanel;
    private javax.swing.JButton validateButton;
    // End of variables declaration//GEN-END:variables

}

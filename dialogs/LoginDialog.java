package dialogs;

import controllers.LoginController;
import java.awt.Frame;
import static java.awt.Frame.getFrames;
import java.awt.MediaTracker;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class LoginDialog extends javax.swing.JFrame {

    public LoginDialog() {
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

        loginPanel = new javax.swing.JPanel();
        emailField = new javax.swing.JTextField();
        loginLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        passwordLabel = new javax.swing.JLabel();
        statutPanel = new javax.swing.JPanel();
        statutLabel = new javax.swing.JLabel();
        validateButton = new javax.swing.JButton();
        previousButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        loginPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Statut", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        emailField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emailField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        loginLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loginLabel.setText("E-mail: ");

        passwordField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passwordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        passwordLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passwordLabel.setText("Mot de passe: ");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loginLabel)
                    .addComponent(passwordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(emailField)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginLabel)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        statutPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Statut", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        statutLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        statutLabel.setText("Entrez-votre email et mot de passe");

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
                .addComponent(statutLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        validateButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        validateButton.setText("Valider");
        validateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validateButtonActionPerformed(evt);
            }
        });
        validateButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                validateButtonKeyPressed(evt);
            }
        });

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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(previousButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(validateButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(statutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(validateButton)
                    .addComponent(previousButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void previousButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousButtonActionPerformed
        LoginController.previousDialog();
    }//GEN-LAST:event_previousButtonActionPerformed

    private void validateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validateButtonActionPerformed
        String login = this.emailField.getText();

        String password = "";
        for (char character : this.passwordField.getPassword()) {
            password += character;
        }

        if (LoginController.identify(login, password)) {
            LoginController.nextDialog();
        }
        else {
            this.statutLabel.setText("Erreur: Identification impossible");
        }
    }//GEN-LAST:event_validateButtonActionPerformed

    private void validateButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_validateButtonKeyPressed
        String login = this.emailField.getText();

        String password = "";
        for (char character : this.passwordField.getPassword()) {
            password += character;
        }

        if (LoginController.identify(login, password)) {
            LoginController.nextDialog();
        }
        else {
            this.statutLabel.setText("Erreur: Identification impossible");
        }
    }//GEN-LAST:event_validateButtonKeyPressed

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
                new LoginDialog().setVisible(true);
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
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton previousButton;
    private javax.swing.JLabel statutLabel;
    private javax.swing.JPanel statutPanel;
    private javax.swing.JButton validateButton;
    // End of variables declaration//GEN-END:variables

}

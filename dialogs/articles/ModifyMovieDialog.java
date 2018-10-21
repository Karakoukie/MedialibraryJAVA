package dialogs.articles;

import controllers.MoviesArticleModuleController;
import entities.ArticleStateEntity;
import entities.ArticleSupportEntity;
import entities.MovieFormatEntity;
import entities.MovieTypeEntity;
import entities.PersonEntity;
import java.awt.Frame;
import java.awt.MediaTracker;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class ModifyMovieDialog extends javax.swing.JFrame {

    public ModifyMovieDialog() {
        initComponents();
        this.setLocationRelativeTo(this.getParent());
        this.updateFields();
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
        jLabel1 = new javax.swing.JLabel();
        titleField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        priceField = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        stateField = new javax.swing.JComboBox();
        yearField = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        stockField = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        supportField = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        imageField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        durationField = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        formatField = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        directorField = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        gendersFields = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        selectedGendersList = new javax.swing.JList();
        selectGenderButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        deselectGenderButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        selectActorButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        selectedActorList = new javax.swing.JList();
        deselectActorButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        actorsFields = new javax.swing.JList();
        validateButton = new javax.swing.JButton();
        previousButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Ajouter un film", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Titre: ");

        titleField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Prix: ");

        priceField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        priceField.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Etat: ");

        stateField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        yearField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        yearField.setModel(new javax.swing.SpinnerNumberModel(2018, null, null, 1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Année: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Stock: ");

        stockField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        stockField.setModel(new javax.swing.SpinnerNumberModel());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Support: ");

        supportField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Image: ");

        imageField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        imageField.setText("image.png");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Durée: ");

        durationField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Format: ");

        formatField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Réalisateur: ");

        directorField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Genres:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        gendersFields.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(gendersFields);

        selectedGendersList.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(selectedGendersList);

        selectGenderButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        selectGenderButton.setText("Selectionner");
        selectGenderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectGenderButtonActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Genres disponibles :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Genres sélectionnés");

        deselectGenderButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deselectGenderButton.setText("Déselectionner");
        deselectGenderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deselectGenderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(deselectGenderButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selectGenderButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(selectGenderButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deselectGenderButton)
                        .addGap(57, 57, 57))))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Acteurs", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Acteurs sélectionnés");

        selectActorButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        selectActorButton.setText("Selectionner");
        selectActorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActorButtonActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Acteurs disponibles :");

        selectedActorList.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane4.setViewportView(selectedActorList);

        deselectActorButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deselectActorButton.setText("Déselectionner");
        deselectActorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deselectActorButtonActionPerformed(evt);
            }
        });

        actorsFields.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane3.setViewportView(actorsFields);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(deselectActorButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selectActorButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(selectActorButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deselectActorButton)
                        .addGap(35, 35, 35)))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(supportField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imageField, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yearField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stockField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(durationField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(formatField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(directorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(stateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(yearField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(stockField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(supportField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(imageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(durationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(formatField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(directorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        validateButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        validateButton.setText("Modifier");
        validateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validateButtonActionPerformed(evt);
            }
        });

        previousButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        previousButton.setText("Annuler");
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
                        .addComponent(previousButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(validateButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(validateButton)
                    .addComponent(previousButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void previousButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_previousButtonActionPerformed

    private void validateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validateButtonActionPerformed
        String title = this.titleField.getText();
        float price = Float.parseFloat(this.priceField.getValue().toString());
        String state = this.stateField.getModel().getSelectedItem().toString();
        int year = Integer.parseInt(this.yearField.getValue().toString());
        int stock = Integer.parseInt(this.stockField.getValue().toString());
        String supportName = this.supportField.getSelectedItem().toString();
        String image = this.imageField.getText();
        int duration = Integer.parseInt(this.durationField.getValue().toString());
        String formatName = this.formatField.getSelectedItem().toString();
        String directorName = this.directorField.getSelectedItem().toString();
        
        String[] genders = new String[this.selectedGendersList.getModel().getSize()];
        for (int i = 0; i < genders.length; i++) {
            genders[i] = this.selectedGendersList.getModel().getElementAt(i).toString();
        }
        
        String[] actors = new String[this.selectedActorList.getModel().getSize()];
        for (int i = 0; i < actors.length; i++) {
            actors[i] = this.selectedActorList.getModel().getElementAt(i).toString();
        }
        
        MoviesArticleModuleController.modifySelectedMovie(title, price, state, year, stock, supportName, image, duration, formatName, directorName, genders, actors);
        this.dispose();
    }//GEN-LAST:event_validateButtonActionPerformed

    private void selectGenderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectGenderButtonActionPerformed
        List selectedGenders = this.gendersFields.getSelectedValuesList();
        DefaultListModel model = new DefaultListModel();
        
        for (int i = 0; i < this.selectedGendersList.getModel().getSize(); i++) {
            model.addElement(this.selectedGendersList.getModel().getElementAt(i));
        }
        
        selectedGenders.stream().forEach((selectedGender) -> {
            model.addElement(selectedGender);
        });
        
        this.selectedGendersList.setModel(model);
    }//GEN-LAST:event_selectGenderButtonActionPerformed

    private void deselectGenderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deselectGenderButtonActionPerformed
        List selectedGenders = this.selectedGendersList.getSelectedValuesList();
        DefaultListModel model = new DefaultListModel();
        
        for (int i = 0; i < this.selectedGendersList.getModel().getSize(); i++) {
            model.addElement(this.selectedGendersList.getModel().getElementAt(i));
        }
        
        selectedGenders.stream().forEach((selectedGender) -> {
            model.removeElement(selectedGender);
        });
        
        this.selectedGendersList.setModel(model);
    }//GEN-LAST:event_deselectGenderButtonActionPerformed

    private void selectActorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActorButtonActionPerformed
        List selectedActors = this.actorsFields.getSelectedValuesList();
        DefaultListModel model = new DefaultListModel();
        
        for (int i = 0; i < this.selectedActorList.getModel().getSize(); i++) {
            model.addElement(this.selectedActorList.getModel().getElementAt(i));
        }
        
        selectedActors.stream().forEach((selectedActor) -> {
            model.addElement(selectedActor);
        });
        
        this.selectedActorList.setModel(model);
    }//GEN-LAST:event_selectActorButtonActionPerformed

    private void deselectActorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deselectActorButtonActionPerformed
        List selectedActors = this.selectedActorList.getSelectedValuesList();
        DefaultListModel model = new DefaultListModel();
        
        for (int i = 0; i < this.selectedActorList.getModel().getSize(); i++) {
            model.addElement(this.selectedActorList.getModel().getElementAt(i));
        }
        
        selectedActors.stream().forEach((selectedActor) -> {
            model.removeElement(selectedActor);
        });
        
        this.selectedActorList.setModel(model);
    }//GEN-LAST:event_deselectActorButtonActionPerformed

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
                new ModifyMovieDialog().setVisible(true);
            }
        });
    }
    
    public void updateFields() {
        ArrayList<ArticleStateEntity> statesList = ArticleStateEntity.select("", "", 100);
        statesList.stream().forEach((support) -> {
            this.stateField.addItem(support.getArticle_state_name());
        });
        this.stateField.setSelectedIndex(0);
        
        ArrayList<ArticleSupportEntity> supportList = ArticleSupportEntity.select("", "", 100);
        
        supportList.stream().forEach((support) -> {
            this.supportField.addItem(support.getArticle_support_name());
        });
        
        this.supportField.setSelectedIndex(0);
        
        
        ArrayList<MovieFormatEntity> formatList = MovieFormatEntity.select("", "", 100);
        
        formatList.stream().forEach((format) -> {
            this.formatField.addItem(format.getMovie_format_name());
        });
        
        this.formatField.setSelectedIndex(0);
        
        
        ArrayList<PersonEntity> personsList = PersonEntity.select("", "", 100);
        
        DefaultListModel actorsFieldModel = new DefaultListModel();
        
        personsList.stream().forEach((person) -> {
            this.directorField.addItem(person.getPerson_name());
            actorsFieldModel.addElement(person.getPerson_name());
        });
        
        this.actorsFields.setModel(actorsFieldModel);
        this.directorField.setSelectedIndex(0);
        
        
        ArrayList<MovieTypeEntity> gendersList = MovieTypeEntity.select("", "", 100);
        
        DefaultListModel genderFieldModel = new DefaultListModel();
        
        gendersList.stream().forEach((gender) -> {
            genderFieldModel.addElement(gender.getName());
        });
        
        this.gendersFields.setModel(genderFieldModel);
        this.gendersFields.setSelectedIndex(0);
    }

    public static void close() {
        Frame[] frames = getFrames();
        
        for (Frame frame : frames) {
            frame.dispose();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList actorsFields;
    private javax.swing.JButton deselectActorButton;
    private javax.swing.JButton deselectGenderButton;
    private javax.swing.JComboBox directorField;
    private javax.swing.JSpinner durationField;
    private javax.swing.JComboBox formatField;
    private javax.swing.JList gendersFields;
    private javax.swing.JTextField imageField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton previousButton;
    private javax.swing.JSpinner priceField;
    private javax.swing.JButton selectActorButton;
    private javax.swing.JButton selectGenderButton;
    private javax.swing.JList selectedActorList;
    private javax.swing.JList selectedGendersList;
    private javax.swing.JComboBox stateField;
    private javax.swing.JSpinner stockField;
    private javax.swing.JComboBox supportField;
    private javax.swing.JTextField titleField;
    private javax.swing.JButton validateButton;
    private javax.swing.JSpinner yearField;
    // End of variables declaration//GEN-END:variables

}

package com.calendar;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DeleteEventForm extends javax.swing.JFrame {
    
    private Month july;
    
    public DeleteEventForm(Month month) {
        this.july = month;
        initComponents();
        ImageIcon icon = new ImageIcon(getClass().getResource("/icon.png"));
        setIconImage(icon.getImage());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        txtTitle = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Delete Event");

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DELETE EVENT");
        jLabel1.setOpaque(true);

        lblTitle.setBackground(new java.awt.Color(153, 153, 153));
        lblTitle.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblTitle.setText("ENTER EVENT TITLE         ");

        lblDate.setBackground(new java.awt.Color(255, 51, 51));
        lblDate.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblDate.setText("ENTER DATE (2024-07-XX) :");

        txtDate.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        txtDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDate.setText("2024-07-");
        txtDate.setToolTipText("");

        txtTitle.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        txtTitle.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnDelete.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnDelete.setForeground(java.awt.Color.red);
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTitle))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDate)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            String date = txtDate.getText();
            String title = txtTitle.getText().toUpperCase();
            
            LocalDate eventDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-M-d"));
            String fDate = eventDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
            //Validate date
            if(eventDate.getMonthValue() != 7 || eventDate.getYear() != 2024 || eventDate.getDayOfMonth() < 1 || eventDate.getDayOfMonth() > 31){
                throw new Exception("Date must be in July 2024");
            }
            
            Days day = july.getDay(fDate);
            
            boolean status = false;
            for(Events event : day.getEvents()) {
                if (event.getEventTitle().equals(title)) {
                    status = true;
                    break;
                }
            }
            if(!status){
            JOptionPane.showMessageDialog(this, "Event not found.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
            }
            boolean isRecurring = july.recurranceCheck(title);
            if (isRecurring) {
                int response = JOptionPane.showConfirmDialog(this, "This is a recurring event. Do you want to delete all instances?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    //Delete All events
                    
                    july.deleteRecurringEvent(title);
                } else {
                    // Delete only the single  of the event
                    day.deleteEventByName(title);
                }
            } else {
                // Delete if event isn't reccuring
                day.deleteEventByName(title);
            }

            JOptionPane.showMessageDialog(this, "Event deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteEventForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteEventForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteEventForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteEventForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new DeleteEventForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}

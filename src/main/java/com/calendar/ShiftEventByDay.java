package com.calendar;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ShiftEventByDay extends javax.swing.JFrame {

    private Month july;
    public ShiftEventByDay(Month month) {
        this.july = month;
        initComponents();
        ImageIcon icon = new ImageIcon(getClass().getResource("/icon.png"));
        setIconImage(icon.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEH = new javax.swing.JTextField();
        lblDate = new javax.swing.JLabel();
        txtOldDate = new javax.swing.JTextField();
        txtTitle = new javax.swing.JTextField();
        lblEM = new javax.swing.JLabel();
        lblSH = new javax.swing.JLabel();
        txtEM = new javax.swing.JTextField();
        txtSH = new javax.swing.JTextField();
        btnShift = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblSM = new javax.swing.JLabel();
        txtSM = new javax.swing.JTextField();
        lblEH = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblDate1 = new javax.swing.JLabel();
        txtNewDate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Shift Event");

        txtEH.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        txtEH.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblDate.setBackground(new java.awt.Color(255, 51, 51));
        lblDate.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblDate.setText("OLD DATE (2024-07-XX)");

        txtOldDate.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        txtOldDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOldDate.setText("2024-07-");
        txtOldDate.setToolTipText("");

        txtTitle.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        txtTitle.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblEM.setBackground(new java.awt.Color(153, 153, 153));
        lblEM.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblEM.setForeground(java.awt.Color.red);
        lblEM.setText("ENTER NEW END MINUTE");

        lblSH.setBackground(new java.awt.Color(153, 153, 153));
        lblSH.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblSH.setForeground(java.awt.Color.red);
        lblSH.setText("ENTER NEW START HOUR");

        txtEM.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        txtEM.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtSH.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        txtSH.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnShift.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnShift.setForeground(java.awt.Color.red);
        btnShift.setText("SHIFT");
        btnShift.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShiftActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblSM.setBackground(new java.awt.Color(153, 153, 153));
        lblSM.setFont(new java.awt.Font("sansserif", 1, 11)); // NOI18N
        lblSM.setForeground(java.awt.Color.red);
        lblSM.setText("ENTER NEW START MINUTE");

        txtSM.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        txtSM.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblEH.setBackground(new java.awt.Color(153, 153, 153));
        lblEH.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblEH.setForeground(java.awt.Color.red);
        lblEH.setText("ENTER NEW END HOUR");
        lblEH.setMaximumSize(new java.awt.Dimension(139, 16));
        lblEH.setMinimumSize(new java.awt.Dimension(139, 16));
        lblEH.setPreferredSize(new java.awt.Dimension(139, 16));

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SHIFT EVENT BY DAY");
        jLabel1.setOpaque(true);

        lblTitle.setBackground(new java.awt.Color(153, 153, 153));
        lblTitle.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblTitle.setText("ENTER EVENT TITLE         ");

        lblDate1.setBackground(new java.awt.Color(255, 255, 255));
        lblDate1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblDate1.setForeground(java.awt.Color.red);
        lblDate1.setText("NEW DATE (2024-07-XX) ");

        txtNewDate.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        txtNewDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNewDate.setText("2024-07-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnShift, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTitle)
                            .addComponent(txtOldDate)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSH, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblEM, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblEH, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEM, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
                            .addComponent(txtEH)
                            .addComponent(txtSH, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSM)
                            .addComponent(txtNewDate, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOldDate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNewDate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSH, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSH, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSM, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(lblSM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEH, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(lblEH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEM, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEM, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnShift, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnShiftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShiftActionPerformed
        try {
            String oldDate = txtOldDate.getText();
            String newDate = txtNewDate.getText();
            String title = txtTitle.getText().toUpperCase();
            int sH, sM, eH, eM;
            try{
                sH = Integer.parseInt(txtSH.getText());
                sM = Integer.parseInt(txtSM.getText());
                eH = Integer.parseInt(txtEH.getText());
                eM = Integer.parseInt(txtEM.getText());

            }catch(Exception e){
                throw new Exception("Invalid. Hours and minutes must be integers.");
            }

            LocalDate oldEventDate = LocalDate.parse(oldDate, DateTimeFormatter.ofPattern("yyyy-M-d"));
            String converetdOldDate = oldEventDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
            if(oldEventDate.getMonthValue()!=7 || oldEventDate.getYear()!=2024 || oldEventDate.getDayOfMonth()<1 || oldEventDate.getDayOfMonth()>31){
                throw new Exception("Old Date must be in July 2024");
            }
            
            LocalDate newEventDate = LocalDate.parse(newDate, DateTimeFormatter.ofPattern("yyyy-M-d"));
            String converetdNewDate = newEventDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
            if(newEventDate.getMonthValue()!=7 || newEventDate.getYear()!=2024 || newEventDate.getDayOfMonth()<1 || newEventDate.getDayOfMonth()>31){
                throw new Exception("New Date must be in July 2024");
            }

            if(sH < 0 || sH > 23 || eH < 0 || eH > 23 || (sM != 0 && sM != 30) || (eM != 0 && eM != 30)){
                throw new IllegalArgumentException("Invalid. Hours must be between 0 and 23 and minutes should be either 0 or 30.");
            }
            if(sH > eH ){
                throw new Exception("Invalid. Cannot Book Overnight events.");
            }

            Days day = july.getDay(converetdOldDate);

            boolean status = false;
            for (Events event : day.getEvents()) {
                if (event.getEventTitle().equals(title)) {
                    status = true;
                    break;
                }
            }
            if(!status) {
                JOptionPane.showMessageDialog(this, "Event not found.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (july.isWeekend(converetdNewDate)) {
                int response = JOptionPane.showConfirmDialog(this, "The selected date is a weekend. Want to schedule meeting?", "Weekend Event", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (response == JOptionPane.NO_OPTION) {
                    txtOldDate.setText("2024-07-");
                    txtNewDate.setText("2024-07-");
                    txtTitle.setText("");
                    txtSH.setText("");
                    txtSM.setText("");
                    txtEH.setText("");
                    txtEM.setText("");
                    return;
                }
            }

            if(july.shiftEventNewDay(converetdOldDate, title, converetdNewDate, sH, sM, eH, eM)){
                JOptionPane.showMessageDialog(this, "Event shifted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Time slot is not available.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnShiftActionPerformed

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
            java.util.logging.Logger.getLogger(ShiftEventByDay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShiftEventByDay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShiftEventByDay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShiftEventByDay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ShiftEventByDay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnShift;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDate1;
    private javax.swing.JLabel lblEH;
    private javax.swing.JLabel lblEM;
    private javax.swing.JLabel lblSH;
    private javax.swing.JLabel lblSM;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtEH;
    private javax.swing.JTextField txtEM;
    private javax.swing.JTextField txtNewDate;
    private javax.swing.JTextField txtOldDate;
    private javax.swing.JTextField txtSH;
    private javax.swing.JTextField txtSM;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}

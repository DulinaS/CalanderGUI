package com.calendar;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AddEventForm extends javax.swing.JFrame {

    private ButtonGroup grp;
    private Month july;
    
    public AddEventForm(Month month) {
        this.july = month;
        initComponents();
        grp = new ButtonGroup();
        grp.add(rbtnSingle);
        grp.add(rbtnDaily);
        grp.add(rbtnWeekly);
        ImageIcon icon = new ImageIcon(getClass().getResource("/icon.png"));
        setIconImage(icon.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblStartHour = new javax.swing.JLabel();
        lblStartHour1 = new javax.swing.JLabel();
        lblStartHour2 = new javax.swing.JLabel();
        lblStartHour3 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        txtTitle = new javax.swing.JTextField();
        txtStartHour = new javax.swing.JTextField();
        txtStartMinute = new javax.swing.JTextField();
        txtEndHour = new javax.swing.JTextField();
        txtEndMinute = new javax.swing.JTextField();
        lblReccuring = new javax.swing.JLabel();
        rbtnSingle = new javax.swing.JRadioButton();
        rbtnDaily = new javax.swing.JRadioButton();
        rbtnWeekly = new javax.swing.JRadioButton();
        btnAddEvent = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Event");

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADD EVENT");
        jLabel1.setOpaque(true);

        lblTitle.setBackground(new java.awt.Color(153, 153, 153));
        lblTitle.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblTitle.setText("ENTER EVENT TITLE         ");

        lblDate.setBackground(new java.awt.Color(255, 51, 51));
        lblDate.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblDate.setText("ENTER DATE (2024-07-XX) :");

        lblStartHour.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        lblStartHour.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblStartHour.setText("ENTER ENDING HOUR   ");

        lblStartHour1.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        lblStartHour1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblStartHour1.setText("ENTER STARTING HOUR   ");

        lblStartHour2.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        lblStartHour2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblStartHour2.setText("ENTER STARTING MINUTE   ");

        lblStartHour3.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        lblStartHour3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblStartHour3.setText("ENTER ENDING MINUTE   ");

        txtDate.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        txtDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDate.setText("2024-07-");
        txtDate.setToolTipText("");

        txtTitle.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        txtTitle.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtStartHour.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        txtStartHour.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtStartMinute.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        txtStartMinute.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtEndHour.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        txtEndHour.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtEndMinute.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        txtEndMinute.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblReccuring.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblReccuring.setText("RECCURANCE PATTERN");

        rbtnSingle.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        rbtnSingle.setForeground(java.awt.Color.red);
        rbtnSingle.setText("SINGLE");

        rbtnDaily.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        rbtnDaily.setForeground(java.awt.Color.red);
        rbtnDaily.setText("DAILY");

        rbtnWeekly.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        rbtnWeekly.setForeground(java.awt.Color.red);
        rbtnWeekly.setText("WEEKLY");

        btnAddEvent.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnAddEvent.setForeground(java.awt.Color.red);
        btnAddEvent.setText("ADD");
        btnAddEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEventActionPerformed(evt);
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblStartHour3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblStartHour2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(lblDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblStartHour1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblStartHour, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTitle)
                            .addComponent(txtDate)
                            .addComponent(txtStartHour)
                            .addComponent(txtStartMinute)
                            .addComponent(txtEndHour)
                            .addComponent(txtEndMinute)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAddEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblReccuring, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtnSingle, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rbtnDaily, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rbtnWeekly, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtStartHour)
                    .addComponent(lblStartHour1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtStartMinute)
                    .addComponent(lblStartHour2, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblStartHour, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(txtEndHour))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblStartHour3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEndMinute, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReccuring, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnSingle)
                    .addComponent(rbtnDaily)
                    .addComponent(rbtnWeekly))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddEvent, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEventActionPerformed
        try{
            String date = txtDate.getText();
            String title = txtTitle.getText().toUpperCase();
            int sH, sM, eH, eM;
            try{
                sH = Integer.parseInt(txtStartHour.getText());
                sM = Integer.parseInt(txtStartMinute.getText());
                eH = Integer.parseInt(txtEndHour.getText());
                eM = Integer.parseInt(txtEndMinute.getText());
                
            }catch(Exception e){
                throw new Exception("Invalid. Hours and minutes must be integers.");
            }
            //Check these part
            //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
            LocalDate eventDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-M-d"));
            String fDate = eventDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
            if(eventDate.getMonthValue() != 7 || eventDate.getYear() != 2024 || eventDate.getDayOfMonth() < 1 || eventDate.getDayOfMonth() > 31){
                throw new Exception("Date must be in July 2024");
            }
            
            if(sH < 0 || sH > 23 || eH < 0 || eH > 23 || (sM != 0 && sM != 30) || (eM != 0 && eM != 30)){
                throw new IllegalArgumentException("Invalid. Hours must be between 0 and 23 and minutes should be either 0 or 30.");
            }
            if(sH > eH ){
                throw new Exception("Invalid. Cannot Book Overnight events.");
            }
            
            Events newEvent = new Events(title, sH, sM, eH,eM);
            String pattern;
            
            if(rbtnSingle.isSelected()){
                pattern = "SINGLE";
            }else if(rbtnDaily.isSelected()){
                pattern = "DAILY";
            }else if(rbtnWeekly.isSelected()){
                pattern = "WEEKLY";
            }else{
                throw new Exception("Select a recurrence pattern");
            }
            
            if (july.isWeekend(fDate)) {
                int response = JOptionPane.showConfirmDialog(this, "The selected date is a weekend. Want to schedule meeting?", "Weekend Event", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (response == JOptionPane.NO_OPTION) {
                    txtDate.setText("");
                    txtTitle.setText("");
                    txtStartHour.setText("");
                    txtStartMinute.setText("");
                    txtEndHour.setText("");
                    txtEndMinute.setText("");
                    return;
                }
            }
            
            if(!july.bookRecurringEvent(fDate, newEvent, pattern)) {
                JOptionPane.showMessageDialog(this, "Event overlaps or slot not available", "Error", JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Event successfully added", "Success", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddEventActionPerformed

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
            java.util.logging.Logger.getLogger(AddEventForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEventForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEventForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEventForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AddEventForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEvent;
    private javax.swing.JButton btnCancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblReccuring;
    private javax.swing.JLabel lblStartHour;
    private javax.swing.JLabel lblStartHour1;
    private javax.swing.JLabel lblStartHour2;
    private javax.swing.JLabel lblStartHour3;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JRadioButton rbtnDaily;
    private javax.swing.JRadioButton rbtnSingle;
    private javax.swing.JRadioButton rbtnWeekly;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEndHour;
    private javax.swing.JTextField txtEndMinute;
    private javax.swing.JTextField txtStartHour;
    private javax.swing.JTextField txtStartMinute;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}

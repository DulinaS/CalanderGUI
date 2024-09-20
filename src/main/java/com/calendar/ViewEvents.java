package com.calendar;

import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

    
public class ViewEvents extends javax.swing.JFrame {
    
    //private List<Events> events;
    private Map<String, List<Events>> events;
    
    public ViewEvents(Map<String, List<Events>> events) {
        this.events = events;
        initComponents();
        filltable(events);
        ImageIcon icon = new ImageIcon(getClass().getResource("/icon.png"));
        setIconImage(icon.getImage());
        //setHeader(title);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeader = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEvents = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Events");
        setBackground(new java.awt.Color(255, 255, 255));

        lblHeader.setBackground(new java.awt.Color(153, 153, 255));
        lblHeader.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setOpaque(true);

        tblEvents.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        tblEvents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Event Name", "Start Time", "End Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEvents);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void filltable(Map<String, List<Events>> events) {
        DefaultTableModel dtm = (DefaultTableModel) tblEvents.getModel();
        dtm.setRowCount(0);
        if(events != null){
            for(Map.Entry<String, List<Events>> set : events.entrySet()){
                
                String eventDate = set.getKey();
                List<Events> list = set.getValue(); 
                
                for(Events e : list) {
                    String title = e.getEventTitle();
                    String startTime = String.format("%02d:%02d", e.getStartHour(), e.getStartMinute());
                    String endTime = String.format("%02d:%02d", e.getEndHour(), e.getEndMinute());
                    Object[] rowData = {eventDate, title, startTime, endTime};
                    dtm.addRow(rowData);
                }
            }
        }
    }
    
    public void setHeader(String title){
        lblHeader.setText(title);
    }
    
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
            java.util.logging.Logger.getLogger(ViewEvents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewEvents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewEvents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewEvents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ViewEvents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JTable tblEvents;
    // End of variables declaration//GEN-END:variables

    
}

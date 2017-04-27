/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Frames;

import Application.Controller;

import java.sql.SQLException;

/**
 *
 * @author LPNielsen
 */
public class ArrangementFrame extends javax.swing.JInternalFrame {

    Controller con = new Controller();
    /**
     * Creates new form ArrangementFrame
     */
    public ArrangementFrame() {
        try{
            con.viewArrangement();
        }catch (SQLException e){

        }
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        arrView = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        arrTable = new javax.swing.JTable();
        arrFieldArrID = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        arrFieldName = new javax.swing.JTextField();
        arrButtonCreate = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        arrFieldArrID2 = new javax.swing.JTextField();
        arrButtonDelete = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        arrFieldDate = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Arrangement");
        setPreferredSize(new java.awt.Dimension(1200, 779));

        arrTable.setModel(new javax.swing.table.DefaultTableModel(

                con.arrangementView,
            new String [] {
                "Arrangement ID", "Customer Name", "Staff Name", "Arrangement Date", "Event Date", "Room(s)", "Price", "Paid"
            }
        ) {
            Class[] types = new Class [] {
                Integer.class, String.class, String.class, String.class, String.class, Object.class, Double.class, Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false, false, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        arrTable.setColumnSelectionAllowed(true);
        arrTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(arrTable);
        arrTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        arrFieldArrID.setText("Arrangement ID");
        arrFieldArrID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                arrFieldArrIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                arrFieldArrIDFocusLost(evt);
            }
        });

        jLabel19.setText("Arrangement ID:");

        jLabel20.setText("Name: ");

        arrFieldName.setText("Name");
        arrFieldName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                arrFieldNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                arrFieldNameFocusLost(evt);
            }
        });

        arrButtonCreate.setText("Search");
        arrButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arrButtonCreateActionPerformed(evt);
            }
        });

        jLabel22.setText("Arrangement ID:");

        arrFieldArrID2.setText("Arrangement ID");
        arrFieldArrID2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                arrFieldArrID2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                arrFieldArrID2FocusLost(evt);
            }
        });

        arrButtonDelete.setText("Delete");
        arrButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arrButtonDeleteActionPerformed(evt);
            }
        });

        jLabel21.setText("Date:");

        arrFieldDate.setText("yyyy-mm-dd");
        arrFieldDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                arrFieldDateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                arrFieldDateFocusLost(evt);
            }
        });

        javax.swing.GroupLayout arrViewLayout = new javax.swing.GroupLayout(arrView);
        arrView.setLayout(arrViewLayout);
        arrViewLayout.setHorizontalGroup(
            arrViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, arrViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(arrViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, arrViewLayout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(20, 20, 20)
                        .addGroup(arrViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(arrButtonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(arrFieldArrID2, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, arrViewLayout.createSequentialGroup()
                        .addGroup(arrViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addGap(20, 20, 20)
                        .addGroup(arrViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(arrFieldDate)
                            .addComponent(arrFieldArrID, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(arrFieldName)
                            .addComponent(arrButtonCreate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 905, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        arrViewLayout.setVerticalGroup(
            arrViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(arrViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(arrViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arrFieldArrID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(arrViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(arrFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(arrViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(arrFieldDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(arrButtonCreate)
                .addGap(98, 98, 98)
                .addGroup(arrViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(arrFieldArrID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(arrButtonDelete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(arrViewLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(arrView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(arrView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void arrFieldArrIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_arrFieldArrIDFocusGained
        // TODO add your handling code here:
        if (arrFieldArrID.getText().equals("Arrangement ID")){
            arrFieldArrID.setText("");
        }
    }//GEN-LAST:event_arrFieldArrIDFocusGained

    private void arrFieldArrIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_arrFieldArrIDFocusLost
        // TODO add your handling code here:
        if (arrFieldArrID.getText().equals("")){
            arrFieldArrID.setText("Arrangement ID");
        }
    }//GEN-LAST:event_arrFieldArrIDFocusLost

    private void arrFieldNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_arrFieldNameFocusGained
        // TODO add your handling code here:
        if (arrFieldName.getText().equals("Name")){
            arrFieldName.setText("");
        }
    }//GEN-LAST:event_arrFieldNameFocusGained

    private void arrFieldNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_arrFieldNameFocusLost
        if (arrFieldName.getText().equals("")){
            arrFieldName.setText("Name");
        }
    }//GEN-LAST:event_arrFieldNameFocusLost

    private void arrFieldArrID2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_arrFieldArrID2FocusGained
        if (arrFieldArrID2.getText().equals("Arrangement ID")){
            arrFieldArrID2.setText("");
        }
    }//GEN-LAST:event_arrFieldArrID2FocusGained

    private void arrFieldArrID2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_arrFieldArrID2FocusLost
        if (arrFieldArrID2.getText().equals("")){
            arrFieldArrID2.setText("Arrangement ID");
        }
    }//GEN-LAST:event_arrFieldArrID2FocusLost

    private void arrFieldDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_arrFieldDateFocusGained
        // TODO add your handling code here:
        if (arrFieldDate.getText().equals("yyyy-mm-dd")){
            arrFieldDate.setText("");
        }
    }//GEN-LAST:event_arrFieldDateFocusGained

    private void arrFieldDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_arrFieldDateFocusLost
        // TODO add your handling code here:
        if (arrFieldDate.getText().equals("")){
            arrFieldDate.setText("yyyy-mm-dd");
        }
    }//GEN-LAST:event_arrFieldDateFocusLost

    private void arrButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrButtonDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arrButtonDeleteActionPerformed

    private void arrButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrButtonCreateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arrButtonCreateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton arrButtonCreate;
    private javax.swing.JButton arrButtonDelete;
    private javax.swing.JTextField arrFieldArrID;
    private javax.swing.JTextField arrFieldArrID2;
    private javax.swing.JTextField arrFieldDate;
    private javax.swing.JTextField arrFieldName;
    private javax.swing.JTable arrTable;
    private javax.swing.JPanel arrView;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}

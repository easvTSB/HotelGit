/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Frames;

import Application.Controller;
import Domain.Food;

import java.sql.SQLException;

/**
 * @author LPNielsen
 */
public class MenuFrame extends javax.swing.JInternalFrame {
    private Controller con;

    /**
     * Creates new form RestaurantFrame
     */
    public MenuFrame(Controller con) {
        this.con = con;
        try {
            con.viewFood();
        } catch (SQLException e) {
            e.printStackTrace();
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

        menuView = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        menuTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        menuFieldPrice = new javax.swing.JTextField();
        menuButtonCreate = new javax.swing.JButton();
        menuFieldFoodIDDelete = new javax.swing.JTextField();
        menuButtonDelete = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        menuFieldName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        menuTAreaDesc = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Menu");
        setPreferredSize(new java.awt.Dimension(1200, 779));

        menuTable.setModel(new javax.swing.table.DefaultTableModel(
                con.foodMenu,
                new String[]{
                        "Name", "Description", "Price"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
        menuTable.setColumnSelectionAllowed(true);
        menuTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(menuTable);
        menuTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (menuTable.getColumnModel().getColumnCount() > 0) {
            menuTable.getColumnModel().getColumn(0).setResizable(false);
            menuTable.getColumnModel().getColumn(0).setPreferredWidth(30);
            menuTable.getColumnModel().getColumn(1).setResizable(false);
            menuTable.getColumnModel().getColumn(1).setPreferredWidth(350);
            menuTable.getColumnModel().getColumn(2).setResizable(false);
            menuTable.getColumnModel().getColumn(2).setPreferredWidth(30);
        }

        jLabel24.setText("Food Name:");

        jLabel27.setText("Price:");

        menuFieldPrice.setText("Price");
        menuFieldPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                menuFieldPriceFocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                menuFieldPriceFocusLost(evt);
            }
        });

        menuButtonCreate.setText("Create");
        menuButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonCreateActionPerformed(evt);
            }
        });

        menuFieldFoodIDDelete.setText("Name");
        menuFieldFoodIDDelete.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                menuFieldFoodIDDeleteFocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                menuFieldFoodIDDeleteFocusLost(evt);
            }
        });

        menuButtonDelete.setText("Delete");
        menuButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonDeleteActionPerformed(evt);
            }
        });

        jLabel25.setText("Name:");

        menuFieldName.setText("Name");
        menuFieldName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                menuFieldNameFocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                menuFieldNameFocusLost(evt);
            }
        });

        menuTAreaDesc.setColumns(20);
        menuTAreaDesc.setRows(5);
        jScrollPane1.setViewportView(menuTAreaDesc);

        jLabel1.setText("Description:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel24)
                                                        .addComponent(jLabel27))
                                                .addGap(29, 29, 29)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(menuFieldPrice)
                                                        .addComponent(menuFieldName, javax.swing.GroupLayout.Alignment.TRAILING)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel25)
                                                .addGap(29, 29, 29)
                                                .addComponent(menuFieldFoodIDDelete))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(menuButtonCreate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(menuButtonDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel24)
                                        .addComponent(menuFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel27)
                                        .addComponent(menuFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(menuButtonCreate)
                                .addGap(126, 126, 126)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel25)
                                        .addComponent(menuFieldFoodIDDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(menuButtonDelete)
                                .addContainerGap(184, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout menuViewLayout = new javax.swing.GroupLayout(menuView);
        menuView.setLayout(menuViewLayout);
        menuViewLayout.setHorizontalGroup(
                menuViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuViewLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        menuViewLayout.setVerticalGroup(
                menuViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(menuViewLayout.createSequentialGroup()
                                .addGroup(menuViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(menuViewLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(menuViewLayout.createSequentialGroup()
                                                .addGap(37, 37, 37)
                                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(menuView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(menuView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuFieldNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_menuFieldNameFocusGained
        // TODO add your handling code here:
        if (menuFieldName.getText().equals("Name")) {
            menuFieldName.setText("");
        }
    }//GEN-LAST:event_menuFieldNameFocusGained

    private void menuFieldNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_menuFieldNameFocusLost
        if (menuFieldName.getText().equals("")) {
            menuFieldName.setText("Name");
        }
    }//GEN-LAST:event_menuFieldNameFocusLost

    private void menuFieldFoodIDDeleteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_menuFieldFoodIDDeleteFocusGained
        if (menuFieldFoodIDDelete.getText().equals("Name")) {
            menuFieldFoodIDDelete.setText("");
        }
    }//GEN-LAST:event_menuFieldFoodIDDeleteFocusGained

    private void menuFieldFoodIDDeleteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_menuFieldFoodIDDeleteFocusLost
        if (menuFieldFoodIDDelete.getText().equals("")) {
            menuFieldFoodIDDelete.setText("Name");
        }
    }//GEN-LAST:event_menuFieldFoodIDDeleteFocusLost

    private void menuFieldPriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_menuFieldPriceFocusGained
        // TODO add your handling code here:
        if (menuFieldPrice.getText().equals("Price")) {
            menuFieldPrice.setText("");
        }
    }//GEN-LAST:event_menuFieldPriceFocusGained

    private void menuFieldPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_menuFieldPriceFocusLost
        // TODO add your handling code here:
        if (menuFieldPrice.getText().equals("")) {
            menuFieldPrice.setText("Price");
        }
    }//GEN-LAST:event_menuFieldPriceFocusLost

    private void menuButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonDeleteActionPerformed
        con.foodDelete(menuFieldFoodIDDelete.getText());
        updateTable();
        menuFieldFoodIDDelete.setText("");
    }

    private void menuButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonCreateActionPerformed
        // TODO add your handling code here:
        double price = Double.parseDouble(menuFieldPrice.getText().toString());
        con.foodCreate(menuFieldName.getText(), menuTAreaDesc.getText(), price);
        updateTable();
        menuFieldName.setText("Name");
        menuFieldPrice.setText("Price");
        menuTAreaDesc.setText("");
    }

    private void updateTable() {
        try {
            con.viewFood();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        menuTable.setModel(new javax.swing.table.DefaultTableModel(
                con.foodMenu,
                new String[]{
                        "Name", "Description", "Price"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
        menuTable.setColumnSelectionAllowed(true);
        menuTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(menuTable);
        menuTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (menuTable.getColumnModel().getColumnCount() > 0) {
            menuTable.getColumnModel().getColumn(0).setResizable(false);
            menuTable.getColumnModel().getColumn(0).setPreferredWidth(30);
            menuTable.getColumnModel().getColumn(1).setResizable(false);
            menuTable.getColumnModel().getColumn(1).setPreferredWidth(350);
            menuTable.getColumnModel().getColumn(2).setResizable(false);
            menuTable.getColumnModel().getColumn(2).setPreferredWidth(30);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton menuButtonCreate;
    private javax.swing.JButton menuButtonDelete;
    private javax.swing.JTextField menuFieldFoodIDDelete;
    private javax.swing.JTextField menuFieldName;
    private javax.swing.JTextField menuFieldPrice;
    private javax.swing.JTextArea menuTAreaDesc;
    private javax.swing.JTable menuTable;
    private javax.swing.JPanel menuView;
    // End of variables declaration//GEN-END:variables
}

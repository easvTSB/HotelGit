/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Frames;

import Application.Controller;

import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.sql.SQLException;

/**
 *
 * @author LPNielsen
 */
public class ServiceFrame extends javax.swing.JInternalFrame {
    private Controller con;

    /**
     * Creates new form ServiceFrame
     */
    public ServiceFrame(Controller con) {
        this.con = con;
        try {
            con.viewFood();
            con.viewService();
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        servCreate = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        servFieldRoomNo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        servTableService = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        servTableFood = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        servButtonAddFood = new javax.swing.JButton();
        servButtonAddService = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        servTableOverview = new javax.swing.JTable();
        servButtonCreate = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        servLabelTotalPrice = new javax.swing.JLabel();
        servView = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        servTableView = new javax.swing.JTable();
        servFieldRoomNo2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        servFieldName2 = new javax.swing.JTextField();
        empButtonSearch = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        servFieldOrderID = new javax.swing.JTextField();
        empButtonDelete = new javax.swing.JButton();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(1200, 779));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Select Room:");

        servFieldRoomNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        servFieldRoomNo.setText("Room No");
        servFieldRoomNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                servFieldRoomNoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                servFieldRoomNoFocusLost(evt);
            }
        });

        servTableService.setModel(new javax.swing.table.DefaultTableModel(
                con.service,
                new String[]{
                        "Name", "Description", "Price"
                }
        ) {
            Class[] types = new Class [] {
                String.class, String.class, Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(servTableService);
        if (servTableService.getColumnModel().getColumnCount() > 0) {
            servTableService.getColumnModel().getColumn(0).setResizable(false);
            servTableService.getColumnModel().getColumn(0).setPreferredWidth(40);
            servTableService.getColumnModel().getColumn(1).setResizable(false);
            servTableService.getColumnModel().getColumn(1).setPreferredWidth(200);
            servTableService.getColumnModel().getColumn(2).setResizable(false);
            servTableService.getColumnModel().getColumn(2).setPreferredWidth(10);
        }

        servTableFood.setModel(new javax.swing.table.DefaultTableModel(
                con.foodMenu,
                new String[]{
                        "Name", "Description", "Price"
                }
        ) {
            Class[] types = new Class [] {
                String.class, String.class, Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(servTableFood);
        if (servTableFood.getColumnModel().getColumnCount() > 0) {
            servTableFood.getColumnModel().getColumn(0).setResizable(false);
            servTableFood.getColumnModel().getColumn(0).setPreferredWidth(40);
            servTableFood.getColumnModel().getColumn(1).setResizable(false);
            servTableFood.getColumnModel().getColumn(1).setPreferredWidth(200);
            servTableFood.getColumnModel().getColumn(2).setResizable(false);
            servTableFood.getColumnModel().getColumn(2).setPreferredWidth(10);
        }

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Services");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Food");

        servButtonAddFood.setText("Add");
        servButtonAddFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servButtonAddFoodActionPerformed(evt);
            }
        });

        servButtonAddService.setText("Add");
        servButtonAddService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servButtonAddServiceActionPerformed(evt);
            }
        });

        servTableOverview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Name", "Description", "Price", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                String.class, String.class, Double.class, Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(servTableOverview);
        if (servTableOverview.getColumnModel().getColumnCount() > 0) {
            servTableOverview.getColumnModel().getColumn(0).setResizable(false);
            servTableOverview.getColumnModel().getColumn(0).setPreferredWidth(30);
            servTableOverview.getColumnModel().getColumn(1).setResizable(false);
            servTableOverview.getColumnModel().getColumn(1).setPreferredWidth(350);
            servTableOverview.getColumnModel().getColumn(2).setPreferredWidth(30);
            servTableOverview.getColumnModel().getColumn(3).setResizable(false);
            servTableOverview.getColumnModel().getColumn(3).setPreferredWidth(30);
        }

        servButtonCreate.setText("Create");
        servButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servButtonCreateActionPerformed(evt);
            }
        });

        jLabel4.setText("Overview");

        jLabel5.setText("Total Price:");

        servLabelTotalPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        servLabelTotalPrice.setText("0");

        javax.swing.GroupLayout servCreateLayout = new javax.swing.GroupLayout(servCreate);
        servCreate.setLayout(servCreateLayout);
        servCreateLayout.setHorizontalGroup(
            servCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(servCreateLayout.createSequentialGroup()
                .addGap(492, 492, 492)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(servFieldRoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, servCreateLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(servCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(servCreateLayout.createSequentialGroup()
                        .addGroup(servCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(servCreateLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(servLabelTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(servButtonCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(servCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, servCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(servButtonAddService, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(servButtonAddFood, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(41, 41, 41))
        );
        servCreateLayout.setVerticalGroup(
            servCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(servCreateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(servCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(servFieldRoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(servCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(servCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(servCreateLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(servButtonAddFood)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(servCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(servButtonAddService)
                    .addComponent(servButtonCreate)
                    .addComponent(jLabel5)
                    .addComponent(servLabelTotalPrice))
                .addGap(31, 31, 31))
        );

        jTabbedPane1.addTab("Create", servCreate);

        servTableView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Name", "Room No", "Date", "Time", "Price"
            }
        ) {
            Class[] types = new Class [] {
                Integer.class, String.class, String.class, String.class, String.class, Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        servTableView.setColumnSelectionAllowed(true);
        servTableView.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(servTableView);
        servTableView.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (servTableView.getColumnModel().getColumnCount() > 0) {
            servTableView.getColumnModel().getColumn(0).setResizable(false);
            servTableView.getColumnModel().getColumn(1).setResizable(false);
            servTableView.getColumnModel().getColumn(2).setResizable(false);
            servTableView.getColumnModel().getColumn(3).setResizable(false);
            servTableView.getColumnModel().getColumn(4).setResizable(false);
            servTableView.getColumnModel().getColumn(5).setResizable(false);
        }

        servFieldRoomNo2.setText("Room No");
        servFieldRoomNo2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                servFieldRoomNo2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                servFieldRoomNo2FocusLost(evt);
            }
        });

        jLabel21.setText("Room No:");

        jLabel24.setText("Email:");

        servFieldName2.setText("Email");
        servFieldName2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                servFieldName2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                servFieldName2FocusLost(evt);
            }
        });

        empButtonSearch.setText("Search");
        empButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empButtonSearchjButton1ActionPerformed(evt);
            }
        });

        jLabel25.setText("Order ID:");

        servFieldOrderID.setText("Order ID");
        servFieldOrderID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                servFieldOrderIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                servFieldOrderIDFocusLost(evt);
            }
        });

        empButtonDelete.setText("Delete");
        empButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empButtonDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout servViewLayout = new javax.swing.GroupLayout(servView);
        servView.setLayout(servViewLayout);
        servViewLayout.setHorizontalGroup(
            servViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, servViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(servViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, servViewLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(servViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(servFieldOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(empButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(servViewLayout.createSequentialGroup()
                        .addGroup(servViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(44, 44, 44)
                        .addGroup(servViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empButtonSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(servFieldRoomNo2, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(servFieldName2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 955, Short.MAX_VALUE))
        );
        servViewLayout.setVerticalGroup(
            servViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(servViewLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(servViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(servViewLayout.createSequentialGroup()
                        .addGroup(servViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(servFieldRoomNo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(servViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(servFieldName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(empButtonSearch)
                        .addGap(83, 83, 83)
                        .addGroup(servViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(servFieldOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(empButtonDelete)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("View", servView);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void servButtonAddFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servButtonAddFoodActionPerformed
        // TODO add your handling code here:
        TableModel model1 = servTableFood.getModel();

        int[] indexs = servTableFood.getSelectedRows();

        Object[] row = new Object[4];

        DefaultTableModel model2 = (DefaultTableModel) servTableOverview.getModel();

        for(int i = 0; i < indexs.length; i++)
        {
            row[0] = model1.getValueAt(indexs[i], 0);

            row[1] = model1.getValueAt(indexs[i], 1);

            row[2] = model1.getValueAt(indexs[i], 2);

            row[3] = 1;

            model2.addRow(row);
        }
        servTableFood.clearSelection();
    }//GEN-LAST:event_servButtonAddFoodActionPerformed

    private void servButtonAddServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servButtonAddServiceActionPerformed
        // TODO add your handling code here:
        TableModel model1 = servTableService.getModel();

        int[] indexs = servTableService.getSelectedRows();

        Object[] row = new Object[4];

        DefaultTableModel model2 = (DefaultTableModel) servTableOverview.getModel();

        for(int i = 0; i < indexs.length; i++)
        {
            row[0] = model1.getValueAt(indexs[i], 0);

            row[1] = model1.getValueAt(indexs[i], 1);

            row[2] = model1.getValueAt(indexs[i], 2);

            row[3] = 1;

            model2.addRow(row);
        }
        servTableService.clearSelection();
    }//GEN-LAST:event_servButtonAddServiceActionPerformed

    private void servButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servButtonCreateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_servButtonCreateActionPerformed

    private void servFieldOrderIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_servFieldOrderIDFocusLost
        if (servFieldOrderID.getText().equals("")) {
            servFieldOrderID.setText("Order ID");
        }
    }//GEN-LAST:event_servFieldOrderIDFocusLost

    private void servFieldOrderIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_servFieldOrderIDFocusGained
        if (servFieldOrderID.getText().equals("Order ID")) {
            servFieldOrderID.setText("");
        }
    }//GEN-LAST:event_servFieldOrderIDFocusGained

    private void empButtonSearchjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empButtonSearchjButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empButtonSearchjButton1ActionPerformed

    private void servFieldName2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_servFieldName2FocusLost
        if (servFieldName2.getText().equals("")) {
            servFieldName2.setText("Email");
        }
    }//GEN-LAST:event_servFieldName2FocusLost

    private void servFieldName2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_servFieldName2FocusGained
        // TODO add your handling code here:
        if (servFieldName2.getText().equals("Email")) {
            servFieldName2.setText("");
        }
    }//GEN-LAST:event_servFieldName2FocusGained

    private void servFieldRoomNo2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_servFieldRoomNo2FocusLost
        // TODO add your handling code here:
        if (servFieldRoomNo2.getText().equals("")) {
            servFieldRoomNo2.setText("Room No");
        }
    }//GEN-LAST:event_servFieldRoomNo2FocusLost

    private void servFieldRoomNo2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_servFieldRoomNo2FocusGained
        // TODO add your handling code here:
        if (servFieldRoomNo2.getText().equals("Room No")) {
            servFieldRoomNo2.setText("");
        }
    }//GEN-LAST:event_servFieldRoomNo2FocusGained

    private void empButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empButtonDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empButtonDeleteActionPerformed

    private void servFieldRoomNoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_servFieldRoomNoFocusGained
        // TODO add your handling code here:
        if (servFieldRoomNo.getText().equals("Room No")) {
            servFieldRoomNo.setText("");
        }
    }//GEN-LAST:event_servFieldRoomNoFocusGained

    private void servFieldRoomNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_servFieldRoomNoFocusLost
        // TODO add your handling code here:
        if (servFieldRoomNo.getText().equals("")) {
            servFieldRoomNo.setText("Room No");
        }
    }//GEN-LAST:event_servFieldRoomNoFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton empButtonDelete;
    private javax.swing.JButton empButtonSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton servButtonAddFood;
    private javax.swing.JButton servButtonAddService;
    private javax.swing.JButton servButtonCreate;
    private javax.swing.JPanel servCreate;
    private javax.swing.JTextField servFieldName2;
    private javax.swing.JTextField servFieldOrderID;
    private javax.swing.JTextField servFieldRoomNo;
    private javax.swing.JTextField servFieldRoomNo2;
    private javax.swing.JLabel servLabelTotalPrice;
    private javax.swing.JTable servTableFood;
    private javax.swing.JTable servTableOverview;
    private javax.swing.JTable servTableService;
    private javax.swing.JTable servTableView;
    private javax.swing.JPanel servView;
    // End of variables declaration//GEN-END:variables
}

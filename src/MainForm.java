
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SoloCode JSHDVR
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public MainForm() {
        initComponents();
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGPanel = new javax.swing.JPanel();
        topBarPanel = new javax.swing.JPanel();
        exitLabel = new javax.swing.JLabel();
        minimizeLabel = new javax.swing.JLabel();
        mainFormPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inventoryTable = new javax.swing.JTable();
        propertiesPanel = new javax.swing.JPanel();
        itemQuantity = new javax.swing.JTextField();
        itemNameField = new javax.swing.JTextField();
        itemPrice = new javax.swing.JTextField();
        expirationDate = new javax.swing.JTextField();
        deliverDate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        inventoryId = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        deleteItemButton = new javax.swing.JButton();
        editItemButton = new javax.swing.JButton();
        addItemButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        clearButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        inventoryPerson = new javax.swing.JLabel();
        logOutLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BGPanel.setBackground(new java.awt.Color(0, 0, 0));
        BGPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        topBarPanel.setBackground(new java.awt.Color(204, 204, 255));
        topBarPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                topBarPanelMouseDragged(evt);
            }
        });
        topBarPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                topBarPanelMousePressed(evt);
            }
        });
        topBarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exitLabel.setText("X");
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });
        topBarPanel.add(exitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, -1, -1));

        minimizeLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        minimizeLabel.setText("_");
        minimizeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeLabelMouseClicked(evt);
            }
        });
        topBarPanel.add(minimizeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, -1, -1));

        BGPanel.add(topBarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 30));

        mainFormPanel.setBackground(new java.awt.Color(204, 204, 255));
        mainFormPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inventoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Inventory id", "Item name", "Quantity", "Cost", "Delivery date", "Expiration date"
            }
        ));
        inventoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventoryTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(inventoryTable);

        mainFormPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 570, 320));

        propertiesPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        itemQuantity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        itemQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                itemQuantityKeyTyped(evt);
            }
        });
        propertiesPanel.add(itemQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 100, -1));

        itemNameField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        propertiesPanel.add(itemNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 210, -1));

        itemPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        itemPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPriceActionPerformed(evt);
            }
        });
        itemPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                itemPriceKeyTyped(evt);
            }
        });
        propertiesPanel.add(itemPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 100, -1));

        expirationDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        propertiesPanel.add(expirationDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 210, -1));

        deliverDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deliverDate.setToolTipText("MM");
        propertiesPanel.add(deliverDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 210, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Delivery date");
        propertiesPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        inventoryId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        inventoryId.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        inventoryId.setText("ID");
        propertiesPanel.add(inventoryId, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 10, 140, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("(mm/dd/yyyy)");
        propertiesPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Item quantity");
        propertiesPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Item price");
        propertiesPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        deleteItemButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deleteItemButton.setText("DELETE ITEM");
        deleteItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteItemButtonActionPerformed(evt);
            }
        });
        propertiesPanel.add(deleteItemButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 210, 30));

        editItemButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        editItemButton.setText("EDIT ITEM");
        editItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editItemButtonActionPerformed(evt);
            }
        });
        propertiesPanel.add(editItemButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 210, 30));

        addItemButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addItemButton.setText("ADD ITEM");
        addItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemButtonActionPerformed(evt);
            }
        });
        propertiesPanel.add(addItemButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 210, 30));
        propertiesPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 210, 10));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Item name");
        propertiesPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Expiration date");
        propertiesPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("(mm/dd/yyyy)");
        propertiesPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        clearButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clearButton.setText("CLEAR");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        propertiesPanel.add(clearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 210, 30));

        mainFormPanel.add(propertiesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 230, 360));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel6.setText("DJQ INVENTORY MEATSHOP ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        mainFormPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 570, 60));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inventoryPerson.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        inventoryPerson.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inventoryPerson.setText("USER NAME");
        jPanel2.add(inventoryPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 30));

        logOutLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        logOutLabel.setText("LOGOUT");
        logOutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutLabelMouseClicked(evt);
            }
        });
        jPanel2.add(logOutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 60, 30));

        mainFormPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 230, 30));

        BGPanel.add(mainFormPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 830, 420));

        getContentPane().add(BGPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logOutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutLabelMouseClicked
        // TODO add your handling code here:
        LoginForm login = new LoginForm();

        login.setVisible(true);
        login.pack();
        login.setLocationRelativeTo(null);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.dispose();
    }//GEN-LAST:event_logOutLabelMouseClicked
    private int mousePositionX, mousePositionY;

    private void topBarPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topBarPanelMouseDragged
        // TODO add your handling code here:
        int positionX = evt.getXOnScreen();
        int positionY = evt.getYOnScreen();

        this.setLocation(positionX - mousePositionX, positionY - mousePositionY);
    }//GEN-LAST:event_topBarPanelMouseDragged

    private void topBarPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topBarPanelMousePressed

        mousePositionX = evt.getX();
        mousePositionY = evt.getY();
        // TODO add your handling code here:
    }//GEN-LAST:event_topBarPanelMousePressed

    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitLabelMouseClicked

    private void minimizeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeLabelMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeLabelMouseClicked

    private void inventoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryTableMouseClicked
        // TODO add your handling code here:
        int column = 0;
        int row = inventoryTable.getSelectedRow();
        int cost = Integer.parseInt(inventoryTable.getModel().getValueAt(row, 3).toString());
        int quantity = Integer.parseInt(inventoryTable.getModel().getValueAt(row, 2).toString());
        int price = cost / quantity;
        itemNameField.setText(inventoryTable.getModel().getValueAt(row, 1).toString());
        itemQuantity.setText(inventoryTable.getModel().getValueAt(row, 2).toString());
        itemPrice.setText(String.valueOf(price));
        inventoryId.setText(inventoryTable.getModel().getValueAt(row, 0).toString());
        deliverDate.setText(inventoryTable.getModel().getValueAt(row, 4).toString());
        expirationDate.setText(inventoryTable.getModel().getValueAt(row, 5).toString());


    }//GEN-LAST:event_inventoryTableMouseClicked

    private void addItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemButtonActionPerformed
        // TODO add your handling code here:
        getFiedlInfo();
        if (invalidInput()) {
            JOptionPane.showMessageDialog(null, "Pls complete input field");
        } else {
            function.addItem(item_name, delivery_date, expiration_date, item_price, item_quantity, inventory_person);
            clearInventoryTable();
            populateTable();
            clearInputField();
        }

    }//GEN-LAST:event_addItemButtonActionPerformed

    private void itemQuantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemQuantityKeyTyped
        // TODO add your handling code here:
        numberOnly(evt);
    }//GEN-LAST:event_itemQuantityKeyTyped

    private void itemPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemPriceKeyTyped
        numberOnly(evt);
    }//GEN-LAST:event_itemPriceKeyTyped

    private void itemPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemPriceActionPerformed

    private void editItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editItemButtonActionPerformed
        getFiedlInfo();

        if (invalidInput()) {
            JOptionPane.showMessageDialog(null, "Pls complete input field");
        } else {
            function.updateItem(item_name, delivery_date, expiration_date, item_price, item_quantity, inventory_person, inventory_id);
            clearInventoryTable();
            populateTable();
            clearInputField();
        }

    }//GEN-LAST:event_editItemButtonActionPerformed

    private void deleteItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteItemButtonActionPerformed
        // TODO add your handling code here:
        int input = JOptionPane.showConfirmDialog(null, "Are you sure you want to dellete this item?");
        // 0=yes, 1=no, 2=cancel
        if (input == 0) {
            getFiedlInfo();
            function.deleteItem(inventory_id);
            clearInventoryTable();
            populateTable();
            clearInputField();
        }
    }//GEN-LAST:event_deleteItemButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        clearInputField();
    }//GEN-LAST:event_clearButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BGPanel;
    private javax.swing.JButton addItemButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton deleteItemButton;
    private javax.swing.JTextField deliverDate;
    private javax.swing.JButton editItemButton;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JTextField expirationDate;
    private javax.swing.JLabel inventoryId;
    private javax.swing.JLabel inventoryPerson;
    private javax.swing.JTable inventoryTable;
    private javax.swing.JTextField itemNameField;
    private javax.swing.JTextField itemPrice;
    private javax.swing.JTextField itemQuantity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logOutLabel;
    private javax.swing.JPanel mainFormPanel;
    private javax.swing.JLabel minimizeLabel;
    private javax.swing.JPanel propertiesPanel;
    private javax.swing.JPanel topBarPanel;
    // End of variables declaration//GEN-END:variables
    BackendFunctions function = new BackendFunctions();

    private void populateTable() {

        function.inventoryList().clear();
        ArrayList<Inventory> list = function.inventoryList();

        DefaultTableModel model = (DefaultTableModel) inventoryTable.getModel();

        Object[] row = new Object[6];

        for (int i = 0; i < list.size(); i++) {

            int price = Integer.parseInt(list.get(i).getItem_price());
            int quantity = Integer.parseInt(list.get(i).getItem_quantity());

            row[0] = list.get(i).getInventory_id();
            row[1] = list.get(i).getItem_name();
            row[2] = list.get(i).getItem_quantity();
            row[3] = price * quantity;
            row[4] = list.get(i).getDelivery_date();
            row[5] = list.get(i).getExpiration_date();

            model.fireTableStructureChanged();
            model.fireTableDataChanged();
            model.addRow(row);

        }
        System.out.println(model.getRowCount());
        list.clear();
    }

    private void getFieldInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void clearInventoryTable() {

        DefaultTableModel model = (DefaultTableModel) inventoryTable.getModel();
        int tableCount = inventoryTable.getRowCount();

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

    }

    private void numberOnly(KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }
    String item_name, delivery_date, expiration_date, item_price, item_quantity, inventory_person, inventory_id;

    private void getFiedlInfo() {
        this.item_name = itemNameField.getText();
        this.delivery_date = deliverDate.getText();
        this.expiration_date = expirationDate.getText();
        this.item_price = itemPrice.getText();
        this.item_quantity = itemQuantity.getText();
        this.inventory_person = inventoryPerson.getText();
        this.inventory_id = inventoryId.getText();
    }

    private boolean invalidInput() {
        return item_name.equals("") || delivery_date.equals("") || expiration_date.equals("") || item_price.equals("") || item_quantity.equals("") || inventory_person.equals("");
    }

    private void clearInputField() {
        inventoryId.setText("");
        itemNameField.setText("");
        deliverDate.setText("");
        expirationDate.setText("");
        itemQuantity.setText("");
        itemPrice.setText("");
    }
}
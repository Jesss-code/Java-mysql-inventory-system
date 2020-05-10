
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SoloCode JSHDVR
 */
public class BackendFunctions {

    public static String databaseName = "inventory_system";
    PreparedStatement ps;
    ResultSet rs;

    //functon to create to connect to the database
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + databaseName, "root", "");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "INVALID INPUT");
        }
        return con;
    }

    public ArrayList<Inventory> inventoryList() {

        ArrayList<Inventory> inventory = new ArrayList<>();
        String sortGradesQuery = "SELECT * FROM `inventory_table`";
        Inventory inventoryItem;

        try {
            ps = getConnection().prepareStatement(sortGradesQuery);
            rs = ps.executeQuery();
            while (rs.next()) {
                inventoryItem = new Inventory(
                        rs.getString("inventory_id"),
                        rs.getString("item_name"),
                        rs.getString("delivery_date"),
                        rs.getString("expiration_date"),
                        rs.getString("item_price"),
                        rs.getString("item_quantity"),
                        rs.getString("inventory_person"));
                inventory.add(inventoryItem);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return inventory;
    }

    public void addItem(String item_name, String delivery_date, String expiration_date, String item_price, String item_quantity, String inventory_person) {
        String Addquery = "INSERT INTO `inventory_table` (`item_name`, `delivery_date`, `expiration_date`, `item_price`, `item_quantity`, `inventory_person`) VALUES (?,?,?,?,?,?);";
        try {
            ps = getConnection().prepareStatement(Addquery);
            ps.setString(1, item_name);
            ps.setString(2, delivery_date);
            ps.setString(3, expiration_date);
            ps.setString(4, item_price);
            ps.setString(5, item_quantity);
            ps.setString(6, inventory_person);
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "New item: " + item_name);
            } else {
                JOptionPane.showMessageDialog(null, "Adding item error");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("shits");
            JOptionPane.showMessageDialog(null, "SQLException");
        }
    }

    public void updateItem(String item_name, String delivery_date, String expiration_date, String item_price, String item_quantity, String inventory_person, String inventory_id) {

        String UpdateQuery = "UPDATE `inventory_table` SET `item_name`=?,`delivery_date`=?,`expiration_date`=?,`item_price`=?,`item_quantity`=?,`inventory_person`=? WHERE `inventory_id`= ?;";

        try {
            ps = getConnection().prepareStatement(UpdateQuery);
            ps.setString(1, item_name);
            ps.setString(2, delivery_date);
            ps.setString(3, expiration_date);
            ps.setString(4, item_price);
            ps.setString(5, item_quantity);
            ps.setString(6, inventory_person);
            ps.setString(7, inventory_id);
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "UPDATED");
            } else {
                JOptionPane.showMessageDialog(null, "UPDATED ERROR");
            }
        } catch (SQLException ex) {
            System.out.println(ex);

        }
    }

    public void deleteItem(String inventory_id) {
        String deleteQuery = "DELETE FROM `inventory_table` WHERE `inventory_id` =" + inventory_id + ";";
        try {
            ps = getConnection().prepareStatement(deleteQuery);
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "DELETED");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
//end of code
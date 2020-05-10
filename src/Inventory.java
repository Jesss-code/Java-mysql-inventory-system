/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SoloCode JSHDVR
 */
public class Inventory {
    private String inventory_id,item_name,delivery_date,expiration_date,item_price,item_quantity,inventory_person;

    public Inventory(String inventory_id, String item_name, String delivery_date, String expiration_date, String item_price, String item_quantity, String inventory_person) {
        this.inventory_id = inventory_id;
        this.item_name = item_name;
        this.delivery_date = delivery_date;
        this.expiration_date = expiration_date;
        this.item_price = item_price;
        this.item_quantity = item_quantity;
        this.inventory_person = inventory_person;
    }

    public String getInventory_id() {
        return inventory_id;
    }

    public String getItem_name() {
        return item_name;
    }

    public String getDelivery_date() {
        return delivery_date;
    }

    public String getExpiration_date() {
        return expiration_date;
    }

    public String getItem_price() {
        return item_price;
    }

    public String getItem_quantity() {
        return item_quantity;
    }

    public String getInventory_person() {
        return inventory_person;
    }

    public void setInventory_id(String inventory_id) {
        this.inventory_id = inventory_id;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public void setDelivery_date(String delivery_date) {
        this.delivery_date = delivery_date;
    }

    public void setExpiration_date(String expiration_date) {
        this.expiration_date = expiration_date;
    }

    public void setItem_price(String item_price) {
        this.item_price = item_price;
    }

    public void setItem_quantity(String item_quantity) {
        this.item_quantity = item_quantity;
    }

    public void setInventory_person(String inventory_person) {
        this.inventory_person = inventory_person;
    }

}

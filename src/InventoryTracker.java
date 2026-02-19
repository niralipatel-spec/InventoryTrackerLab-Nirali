/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nirali
 */
public class InventoryTracker {

    public void displayInfo() {
        System.out.println("InventoryTracker running...");
    }
    public int checkStockLevel(String productName) {
        return 1000; // dummy value
    }
     public String alertLowStock(String productName, int stockLevel) {
        if (stockLevel < 10) {
            return "ALERT: Low stock for " + productName;
        }
        return "Stock is sufficient for " + productName;
    }
}


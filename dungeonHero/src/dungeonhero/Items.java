/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonhero;


import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Dylan
 */
public class Items implements Serializable {
    
    private String inventoryType;
    private double quantity;
    private double amountRequired;

    public Items() {
    }

    
    
    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getAmountRequired() {
        return amountRequired;
    }

    public void setAmountRequired(double amountRequired) {
        this.amountRequired = amountRequired;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.inventoryType);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.quantity) ^ (Double.doubleToLongBits(this.quantity) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.amountRequired) ^ (Double.doubleToLongBits(this.amountRequired) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Items{" + "inventoryType=" + inventoryType + ", quantity=" + quantity + ", amountRequired=" + amountRequired + '}';
    }

    
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Items other = (Items) obj;
        if (Double.doubleToLongBits(this.quantity) != Double.doubleToLongBits(other.quantity)) {
            return false;
        }
        if (Double.doubleToLongBits(this.amountRequired) != Double.doubleToLongBits(other.amountRequired)) {
            return false;
        }
        if (!Objects.equals(this.inventoryType, other.inventoryType)) {
            return false;
        }
        return true;
    }
    
    
}

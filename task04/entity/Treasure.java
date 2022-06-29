package by.epam.task04.entity;

import java.util.ArrayList;

public class Treasure{

    private String description;
    private String material;
    private int price;
    private ArrayList <Treasure> treasures;

    public Treasure(){

    }

    public Treasure(String description, String material, int price){
        this.description = description;
        this.material = material;
        this.price = price;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getMaterial(){
        return material;
    }

    public void setMaterial(String material){
        this.material = material;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Treasure)) return false;

        Treasure treasure = (Treasure)o;

        if(Double.compare(treasure.getPrice(), getPrice()) != 0) return false;
        if(getDescription() != null ? !getDescription().equals(treasure.getDescription()) : treasure.getDescription() != null)
            return false;
        return getMaterial() != null ? getMaterial().equals(treasure.getMaterial()) : treasure.getMaterial() == null;
    }

    @Override
    public int hashCode(){
        int result;
        long temp;
        result = getDescription() != null ? getDescription().hashCode() : 0;
        result = 31 * result + (getMaterial() != null ? getMaterial().hashCode() : 0);
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int)(temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString(){
        return "-description  " + description + "\n" +
                "-material  " + material + "\n" +
                "-price  " + price + " $";
    }
}
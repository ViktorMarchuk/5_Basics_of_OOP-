package by.epam.task05.entity;

import java.util.Arrays;

public class Gift{
    private String pack;
    private String[] sweets;
    private int[] price;

    public Gift(){
    }

    public Gift(String pack, String[] sweets, int[] price){
        this.pack = pack;
        this.sweets = sweets;
        this.price = price;
    }

    public String getPack(){
        return pack;
    }

    public void setPack(String pack){
        this.pack = pack;
    }

    public String[] getSweets(){
        return sweets;
    }

    public void setSweets(String[] sweets){
        this.sweets = sweets;
    }

    public int[] getPrice(){
        return price;
    }

    public void setPrice(int[] price){
        this.price = price;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Gift)) return false;

        Gift gift = (Gift)o;

        if(getPack() != null ? !getPack().equals(gift.getPack()) : gift.getPack() != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if(!Arrays.equals(getSweets(), gift.getSweets())) return false;
        return Arrays.equals(getPrice(), gift.getPrice());
    }

    @Override
    public int hashCode(){
        int result = getPack() != null ? getPack().hashCode() : 0;
        result = 31 * result + Arrays.hashCode(getSweets());
        result = 31 * result + Arrays.hashCode(getPrice());
        return result;
    }

    @Override
    public String toString(){
        return "The list of sweets " +
                "pack='" + pack + '\'' +
                ", sweets=" + Arrays.toString(sweets) +
                ", price=" + Arrays.toString(price) +
                '}';
    }
}

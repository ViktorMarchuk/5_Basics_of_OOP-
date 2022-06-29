package by.epam.task05.logic;

import by.epam.task05.entity.*;

public class Select{
    public static GiftFactory selectGift(String word){
        if(word.equalsIgnoreCase("adult")){
            return new GiftForAdultFactory();
        }else if(word.equalsIgnoreCase("children")){
            return new GiftForChildrenFactory();
        }else {
            throw new RuntimeException("There is no given type");
        }
    }
}
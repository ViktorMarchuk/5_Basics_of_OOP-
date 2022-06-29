package by.epam.task04.logic;

import by.epam.task04.entity.Treasure;

import java.util.ArrayList;

public class ChooseTreasure{
    public void getTreasure(ArrayList <Treasure> list){
        System.out.println("Most expensive treasure");
        int price = Integer.MIN_VALUE;
        Treasure expensive = null;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getPrice() > price){
                price = list.get(i).getPrice();
                expensive = list.get(i);
            }
        }
        System.out.println(expensive);
    }
}
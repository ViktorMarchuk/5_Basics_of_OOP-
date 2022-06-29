package by.epam.task04.logic;

import by.epam.task04.entity.Treasure;

import java.util.ArrayList;

public class SelectionByAmount{

    public void getTreasure(ArrayList <Treasure> treasures, int amount){
        System.out.println("Choosing a treasure for a given amount");
        for(Treasure treasure: treasures){
            System.out.println("____________");
            amount -= treasures.size();
            if(amount >= 0){
                System.out.println(treasure.toString());
            }
        }
    }
}


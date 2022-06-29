package by.epam.task04.view;

import by.epam.task04.entity.Treasure;

import java.util.ArrayList;

public class Display{
    public void getInfo(ArrayList <Treasure> treasures){
        System.out.println("View of treasure");
        for(Treasure i: treasures){
            System.out.println("____________________");
            System.out.println(i.toString());
        }
    }
}
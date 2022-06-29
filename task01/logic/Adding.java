package by.epam.task01.logic;

import by.epam.task01.entity.TextFile;

import java.util.ArrayList;

public class Adding{
    public void addTextFromArray(TextFile textFile){
        ArrayList <TextFile> list = new ArrayList <>();
        list.add(textFile);
        System.out.println(list);
    }
}
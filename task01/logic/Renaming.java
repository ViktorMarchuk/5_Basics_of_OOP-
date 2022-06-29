package by.epam.task01.logic;

import by.epam.task01.entity.Directory;
import by.epam.task01.entity.File;

public class Renaming{
    public void renameDirectory(String s){
        Directory directory = new Directory();
        if(s.equals(directory.getName())){
            System.out.println("This directory name exist already");
        }
    }

    public void renameFile(String s){
        File file = new File();
        if(s.equals(file.getName())){
            System.out.println("This file name exist already");
        }
    }
}

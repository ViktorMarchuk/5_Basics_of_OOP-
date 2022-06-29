package by.epam.task01.logic;

import by.epam.task01.entity.TextFile;

import java.util.ArrayList;

public class Removing{
    public void removeTextFile(TextFile textFile){
        ArrayList <TextFile> textFiles = new ArrayList <>();
        textFiles.remove(textFiles);
        for(TextFile text: textFiles)
            System.out.println(text);
    }
}

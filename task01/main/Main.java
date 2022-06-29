package by.epam.task01.main;
/*
    Задача 1.
    Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
    вывести на консоль содержимое, дополнить, удалить.
 */


import by.epam.task01.entity.Directory;
import by.epam.task01.entity.File;
import by.epam.task01.entity.TextFile;
import by.epam.task01.logic.Adding;
import by.epam.task01.logic.Removing;
import by.epam.task01.logic.Renaming;
import by.epam.task01.view.DisplayToConsole;

import java.util.*;

public class Main{
    public static void main(String[] args){
        Directory dir = new Directory("<Music>");
        File file = new File("<Song>");
        ArrayList <TextFile> textFiles = new ArrayList <TextFile>();
        TextFile textFile1 = new TextFile("<I want to break free>", "I want to break free\n" +
                "I want to break free,\n" +
                "I want to break free from your lies,");
        TextFile textFile2 = new TextFile("you’re so self satisfied, I don’t need you..");
        TextFile textFile3 = new TextFile("I've got to break free");
        Adding adding = new Adding();
        Renaming renaming = new Renaming();
        Removing removing = new Removing();
        DisplayToConsole display = new DisplayToConsole();

        display.createAndDisplayDirectory(dir);
        display.createAndDisplayFile(file);
        adding.addTextFromArray(textFile1);
        adding.addTextFromArray(textFile2);
        adding.addTextFromArray(textFile3);
        removing.removeTextFile(textFile3);
    }
}
/*
The directory name is <Music>
The file name is <Song>
The text is
[I want to break free
I want to break free,
I want to break free from your lies,]
[you’re so self satisfied, I don’t need you..]
[I've got to break free]
 */
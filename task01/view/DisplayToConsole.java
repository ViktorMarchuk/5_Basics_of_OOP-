package by.epam.task01.view;

import by.epam.task01.entity.Directory;
import by.epam.task01.entity.File;

public class DisplayToConsole{
    public void createAndDisplayDirectory(Directory directory){
        System.out.println("The directory name is " + directory.getName());
    }

    public void createAndDisplayFile(File file){
        System.out.println("The file name is " + file.getName() + "\n" + "The text is ");
    }
}

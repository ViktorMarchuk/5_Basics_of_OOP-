package by.epam.task04.main;

/* Задача 4.
Создать консольное приложение, удовлетворяющее следующим требованиям:
• Приложение должно быть объектно-, а не процедурно-ориентированным.
• Каждый класс должен иметь отражающее смысл название и информативный состав.
• Наследование должно применяться только тогда, когда это имеет смысл.
• При кодировании должны быть использованы соглашения об оформлении кода java code convention.
• Классы должны быть грамотно разложены по пакетам.
• Консольное меню должно быть минимальным.
• Для хранения данных можно использовать файлы.
Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
дракона. Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
выбора сокровищ на заданную сумму.
 */

import by.epam.task04.entity.Treasure;
import by.epam.task04.logic.ChooseTreasure;
import by.epam.task04.logic.SelectionByAmount;
import by.epam.task04.view.Display;

import java.util.ArrayList;


public class Main{
    public static void main(String[] args){
        ArrayList<Treasure> treasures=new ArrayList<>();
        treasures.add(new Treasure("coin","gold",2));
        treasures.add(new Treasure("ring","silver",5));
        treasures.add(new Treasure("coin","gold",7));
        treasures.add((new Treasure("necklace","gold", 6)));

        Display display = new Display();
        SelectionByAmount selection=new SelectionByAmount();
        ChooseTreasure chooseTreasure = new ChooseTreasure();

        display.getInfo(treasures);
        System.out.println("____________________");
        chooseTreasure.getTreasure(treasures);
        System.out.println("____________________");
        selection.getTreasure(treasures,14);




    }
}


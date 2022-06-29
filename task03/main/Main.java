package by.epam.task03.main;

import by.epam.task03.entity.Calendar;
import by.epam.task03.view.OutputToConsole;


/* Задача 3
Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
выходных и праздничных днях
 */
public class Main{
    public static void main(String[] args){
        OutputToConsole console = new OutputToConsole();
        Calendar calendar = new Calendar("2021");
        Calendar.Month month = new Calendar.Month("1 January", "New year");
        Calendar.Month month1 = new Calendar.Month("8 March", "Woman day");
        Calendar calendar1 = new Calendar("2022");
        Calendar.Month month2 = new Calendar.Month("13 and 14 June", "weekends");

        console.getEvent(calendar, month);
        console.getEvent(calendar, month1);
        console.getEvent(calendar1, month2);
    }
}
/*
In 2021 year the event on 1 January is New year
In 2021 year the event on 8 March is Woman day
In 2022 year the event on 13 and 14 June is weekends
 */
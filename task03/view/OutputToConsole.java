package by.epam.task03.view;

import by.epam.task03.entity.Calendar;

public class OutputToConsole{
    public void getEvent(Calendar calendar, Calendar.Month month){
        System.out.println("In " + calendar.getYear() + " year" + " the event on " + month.getDay() + " is " + month.getEvent());
    }
}

package by.epam.task02.main;
/*
Задача 2.
Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
нескольких товаров.
 */


import by.epam.task02.entity.Payment;
import by.epam.task02.view.Display;


public class Main{
    public static void main(String[] args){
        Display display = new Display();
        Payment payment = new Payment("Card");
        Payment payment1 = new Payment("Cash");
        Payment.Product product1 = new Payment.Product("Milk", "Savushkin produkt", 2.56);
        Payment.Product product2 = new Payment.Product("Bread", "Avangard", 1.23);

        display.outputWayPayment(payment);
        display.outputListToConsole(product1);
        System.out.println("___________________");
        display.outputWayPayment(payment1);
        display.outputListToConsole(product2);
    }
}
/*
Payment- Card
List of goods
Product name -Milk
Manufacturer -Savushkin produkt
Price 2.56 BYN
___________________
Payment- Cash
List of goods
Product name -Bread
Manufacturer -Avangard
Price 1.23 BYN
 */

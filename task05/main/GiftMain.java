package by.epam.task05.main;
/*
Задача 5.
Создать консольное приложение, удовлетворяющее следующим требованиям:
• Корректно спроектируйте и реализуйте предметную область задачи.
• Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов
проектирования.
• Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
• для проверки корректности переданных данных можно применить регулярные выражения.
• Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
• Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
Вариант A. Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции
(объект, представляющий собой цветочную композицию). Составляющими цветочной композиции являются цветы
и упаковка.
Вариант B. Подарки. Реализовать приложение, позволяющее создавать подарки (объект, представляющий собой
подарок). Составляющими целого подарка являются сладости и упаковка.
 */

import by.epam.task05.entity.*;
import by.epam.task05.logic.Select;

public class GiftMain{
    public static void main(String[] args){

        Gift adult = new GiftForAdult(" blue plastic box", new String[]{"cake", "chocolate", "cookies"}, new int[]{4, 6, 9});
        Gift children = new GiftForChildren("red paper box", new String[]{"candy", "chewing gum", "chocolate hare"}, new int[]{3, 5, 23});

        GiftFactory giftFactory = Select.selectGift("children");
        System.out.println(giftFactory.createGift().addDrink());

        ActionWithGift actionWithGift = giftFactory.createGift();
        actionWithGift.calculatePrice(children.getPrice());
        actionWithGift.getList(children.getSweets());

    }
}
/*
For children need add 1 bottle of Pepsi
The cost of the sweets = 31 BYN
The list of sweets
-candy
-chewing gum
-chocolate hare
 */

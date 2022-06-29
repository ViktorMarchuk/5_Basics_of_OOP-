package by.epam.task02.view;

import by.epam.task02.entity.Payment;

public class Display{
    public void outputListToConsole(Payment.Product product){
        System.out.println("List of goods " + "\n" + "Product name -" + product.getProductName() + "\n" + "Manufacturer -"
                + product.getManufacturer() + "\n" + "Price " + product.getPrice() + " BYN");
    }

    public void outputWayPayment(Payment payment){
        System.out.println("Payment- " + payment.getType_Of_payment());
    }

}


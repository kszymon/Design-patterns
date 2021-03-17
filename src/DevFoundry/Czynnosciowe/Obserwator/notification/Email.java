package DevFoundry.Czynnosciowe.Obserwator.notification;

import DevFoundry.Czynnosciowe.Obserwator.order.Order;

public class Email implements Observer{

    public void update(Order order){
        System.out.println("E-mail - zamówienie number: " + order.getOrderNumber() + " zmieniło status na: " + order.getOrderStatus());
    }
}

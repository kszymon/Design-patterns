package DevFoundry.Czynnosciowe.Obserwator.notification;

//import DevFoundry.Czynnosciowe.Observer.notification.Observer.notification.order.Order;
import DevFoundry.Czynnosciowe.Obserwator.order.Order;

public class MobileApp implements Observer {

    public void update(Order order){
        System.out.println("Aplikacja mobilna - zamówienie number: " + order.getOrderNumber() + " zmieniło status na: " + order.getOrderStatus());
    }
}

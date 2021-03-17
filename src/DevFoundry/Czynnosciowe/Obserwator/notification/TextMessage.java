package DevFoundry.Czynnosciowe.Obserwator.notification;

//import DevFoundry.Czynnosciowe.Observer.notification.Observer.order.Order;
import DevFoundry.Czynnosciowe.Obserwator.order.Order;

public class TextMessage implements Observer {

    public void update(Order order){
        System.out.println("SMS - zamówienie number: " + order.getOrderNumber() + " zmieniło status na: " + order.getOrderStatus());
    }
}

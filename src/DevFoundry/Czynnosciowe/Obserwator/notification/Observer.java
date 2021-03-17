package DevFoundry.Czynnosciowe.Obserwator.notification;

//import DevFoundry.Czynnosciowe.Observer.notification.Observer.notification.order.Order;
import DevFoundry.Czynnosciowe.Obserwator.order.Order;

public interface Observer {

    void update(Order order);
}

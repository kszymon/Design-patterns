package DevFoundry.Czynnosciowe.Obserwator;

import DevFoundry.Czynnosciowe.Obserwator.notification.Email;
import DevFoundry.Czynnosciowe.Obserwator.notification.MobileApp;
import DevFoundry.Czynnosciowe.Obserwator.notification.TextMessage;
import DevFoundry.Czynnosciowe.Obserwator.order.Order;
import DevFoundry.Czynnosciowe.Obserwator.order.OrderStatus;

public class Main {

    public static void main(String[] args){

        Order order = new Order(110L, OrderStatus.ZAREJESTROWANE);

        TextMessage textMessage = new TextMessage();
        MobileApp mobileApp = new MobileApp();
        Email email = new Email();

//        textMessage.updateOrderStatus(order);
//        mobileApp.updateOrderStatus(order);
//        email.updateOrderStatus(order);

        order.registerObserver(textMessage);
        order.registerObserver(mobileApp);
        order.registerObserver(email);

        order.notifyObservers();

        System.out.println("-------------------------------");

        order.changeOrderStatus(OrderStatus.WYSLANE);

        order.unregisterObserver(email);

        System.out.println("-------------------------------");

        order.changeOrderStatus(OrderStatus.ODEBRANE);
    }
}

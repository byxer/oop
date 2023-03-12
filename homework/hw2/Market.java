package homework.hw2;

import java.util.*;

public class Market implements QueueBehaviour ,MarketBehaviour{
    List <Buyer> actors = new ArrayList<>();
    Queue<Buyer> actrosQueue = new ArrayDeque<>();

    @Override
    public void acceptToMarket(Buyer actor) {
        System.out.println(actor.getName() + " зашел в магазин");
        actors.add(actor);
    }

    @Override
    public void replaceFromMarket(Buyer actor) {
        System.out.println(actor.getName() + " вышел из магазина");
        actors.remove(0);
    }

    @Override
    public void update() {
    }
 
    public void update(Buyer actor) {
        acceptToMarket(actor);
        takeInQueue(actor);
        takeOrders();
        giveOrders();
        replaceFromQueue();
        replaceFromMarket(actor);
    }

    @Override
    public void takeInQueue(Buyer actor) {
        System.out.println(actor.getName() + " встал в очередь");
        actrosQueue.add(actor);
    }

    @Override
    public void takeOrders() {
        actrosQueue.element().isTakeOrder();
        System.out.println(actrosQueue.element().getName() + " оформил заказ");
    }

    @Override
    public void giveOrders() {
        actrosQueue.element().setMakeOrder();
        System.out.println(actrosQueue.element().getName() + " забрал заказ");

    }

    @Override
    public void replaceFromQueue() {
        System.out.println(actrosQueue.poll().getName() + " покинул очередь");
    }
}

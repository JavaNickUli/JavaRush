package com.javarush.task.task17.task1712;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Manager {

    private static Manager ourInstance = new Manager();
    private final List<Table> restaurantTables = new ArrayList<Table>(10);
    private int currentIndex = 0;
    private final Queue<Order> orderQueue = new ConcurrentLinkedQueue<Order>();
    private final Queue<Dishes> dishesQueue = new ConcurrentLinkedQueue<Dishes>();

    public synchronized static Manager getInstance() {
        return ourInstance;
    }

    private Manager() {
        for (int i = 0; i < 10; i++) {
            restaurantTables.add(new Table());
        }
    }

    public synchronized Table getNextTable() {
        Table table = restaurantTables.get(currentIndex);
        currentIndex = (currentIndex + 1) % 10;
        return table;
    }

    public Queue<Order> getOrderQueue() {
        return orderQueue;
    }

    public Queue<Dishes> getDishesQueue() {
        return dishesQueue;
    }
}

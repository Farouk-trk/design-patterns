package observer;

import java.util.ArrayList;

public class Professor implements Subject {
    private String name;
    private ArrayList<Observer> observers;
    private String announcement ="";

    public Professor(String name){
        // Creates an ArrayList to hold all observers
        this.name=name;
        observers=new ArrayList<Observer>();
    }
    public String getName(){return this.name; }

    public void setAnnouncement(String announcement) {
        this.announcement = announcement;
        notifyObserver();
    }

    @Override
    public void register(Observer o) {
        // Adds a new observer to the ArrayList
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        int observerIndex= observers.indexOf(o);
        observers.remove(observerIndex);
    }


    @Override
    public void notifyObserver() {
        // Update all observers and notifies them of the new tax and exchange rate
        for(Observer observer : observers){
            observer.update(announcement);
        }

    }
}

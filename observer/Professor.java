package observer;

import java.util.ArrayList;

public class Professor implements Subject {
    private String name;
    private ArrayList<Observer> observers; //holds all observers
    private String announcement ="";

    public Professor(String name){
        this.name=name;
        // Creates an ArrayList to hold all observers
        observers=new ArrayList<Observer>();
    }

    public String getName(){return this.name; }

    //creates new announcement
    public void setAnnouncement(String announcement) {
        this.announcement = announcement;
        notifyObserver();
    }

    // Adds a new observer to the ArrayList
    public void register(Observer o) {
        // Adds a new observer to the ArrayList
        observers.add(o);
    }

    //deleting an observer from the ArrayList
    public void unregister(Observer o) {
        int observerIndex= observers.indexOf(o); //get the index of the observer to delete
        observers.remove(observerIndex);
    }

    // Update all observers and notifies them of the new tax and exchange rate
    public void notifyObserver() {
        for(Observer observer : observers){
            observer.update(announcement);
        }

    }
}

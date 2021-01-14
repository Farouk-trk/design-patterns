package memento;

import java.util.ArrayList;

//this is the caretaker class
public class Versions {

    //an array list where all mementos are saved
    private ArrayList<Memento> mementos = new ArrayList<>();

    //adds memento to the array list
    public void addMemento(Memento m) {
        mementos.add(m);
    }

    //returns the mementos
    public ArrayList<Memento> getMementos() {
        return mementos;

    }
}


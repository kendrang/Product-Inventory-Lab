package services;

import models.Sneaker;

import java.util.ArrayList;

public class SneakerService {
    private static int nextId = 1;  // (1)

    static ArrayList<Sneaker> inventory = new ArrayList<>();  // (2)

    public static Sneaker create(String name, String brand, String sport, int size, int qty, float price) {

        Sneaker createdSneaker = new Sneaker(nextId++, name, brand, sport, size, qty, price);

        inventory.add(createdSneaker);

        return createdSneaker;
    }

    //read
    public Sneaker findSneaker(int id) {
        // should take an int and return an object with that id, if exists
        return inventory.get(id);

    }

    //read all
    public Sneaker[] findAll() {
        // should return a basic array copy of the ArrayList
        return (Sneaker[]) inventory.toArray();
    }

    //delete
    public boolean delete(int id) {
        // should remove the object with this id from the ArrayList if exits and return true.
        // Otherwise return false
   inventory.remove(id);
   if (inventory.contains(id)){
       return false;
   }return true;

    }
}
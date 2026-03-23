/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lasantha
 */
import java.util.ArrayList;
import java.util.List;

public class LibraryBook implements Subject {
    private String title;
    private boolean available;
    private List<Observer> observers;

    public LibraryBook(String title) {
        this.title = title;
        this.available = false;
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
        System.out.println("Observer added for book: " + title);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        System.out.println("Observer removed from book: " + title);
    }

    @Override
    public void notifyObservers() {
        String message = "The book \"" + title + "\" is now available.";
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void setAvailable(boolean available) {
        this.available = available;
        if (available) {
            notifyObservers();
        }
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }
}
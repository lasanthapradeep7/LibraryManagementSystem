/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lasantha
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("===== Library Management Notification System =====\n");

        User user1 = UserFactory.createUser("student", "Alice");
        User user2 = UserFactory.createUser("faculty", "Dr. Perera");

        user1.showRole();
        System.out.println(user1.getUserDetails());

        user2.showRole();
        System.out.println(user2.getUserDetails());

        System.out.println("\n===== Observer Pattern Demo =====\n");

        LibraryBook book = new LibraryBook("Design Patterns in Java");

        Observer observer1 = new LibraryUser("Alice");
        Observer observer2 = new LibraryUser("Bob");
        Observer observer3 = new LibraryUser("Dr. Silva");

        book.addObserver(observer1);
        book.addObserver(observer2);
        book.addObserver(observer3);

        System.out.println("\nBook availability updated...\n");

        book.setAvailable(true);
    }
}
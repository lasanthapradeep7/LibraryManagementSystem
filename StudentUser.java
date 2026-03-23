/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lasantha
 */
public class StudentUser implements User {
    private String name;

    public StudentUser(String name) {
        this.name = name;
    }

    @Override
    public void showRole() {
        System.out.println("Student user created.");
    }

    @Override
    public String getUserDetails() {
        return "Student: " + name;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lasantha
 */
public class FacultyUser implements User {
    private String name;

    public FacultyUser(String name) {
        this.name = name;
    }

    @Override
    public void showRole() {
        System.out.println("Faculty user created.");
    }

    @Override
    public String getUserDetails() {
        return "Faculty: " + name;
    }
}
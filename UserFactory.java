/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lasantha
 */
public class UserFactory {

    public static User createUser(String type, String name) {
        if (type == null || name == null || type.trim().isEmpty() || name.trim().isEmpty()) {
            throw new IllegalArgumentException("User type and name cannot be empty.");
        }

        if (type.equalsIgnoreCase("student")) {
            return new StudentUser(name);
        } else if (type.equalsIgnoreCase("faculty")) {
            return new FacultyUser(name);
        } else {
            throw new IllegalArgumentException("Invalid user type: " + type);
        }
    }
}
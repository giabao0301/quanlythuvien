/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import java.util.Date;

/**
 *
 * @author lethi
 */
public class Student {
    private String studentID;
    private String name;
    private String gender;
    private Date birthday;
    private String email;
    private String major;

    // Constructor
    public Student(String studentID, String name, String gender, Date birthday, String email, String major) {
        this.studentID = studentID;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.email = email;
        this.major = major;
    }

    // Getters
    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getEmail() {
        return email;
    }

    public String getMajor() {
        return major;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentlist;

/**
 *
 * @author soky4
 */
public class Course {
    private final Student[] students;
    
    public Course() {
        this.students = new Student[10];
}
    
    public void enrollStudent(Student s1) {
        for (int s = 0; s <= students.length - 1; s++) {
            if (students[s] == null) {
                this.students[s] = s1;
            }
        }
    }
    
    public void printClass() {
        for (Student s : students) {
            if (s != null) {
                System.out.print("Student Name: " + s.getName() + "\n");
                System.out.print("Student ID: " + s.getId() + "\n");
                System.out.print("Student Address: " + s.getAddress() + "\n");
                System.out.print("\n");
            }
        }
        
    }
    
}

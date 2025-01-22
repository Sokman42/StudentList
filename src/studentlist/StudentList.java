/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentlist;

/**
 *
 * @author fagun
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student[] studentList = new Student[4];//change size before running
        Student s1 = new Student();
        s1.setName("Fagun Vankawala");
        s1.setId(1);
        Student s2 = new Student();
        s2.setName("Super Beans");
        s2.setId(7);
        Student s3 = new Student();
        s3.setName("Megh Vankawala");
        s3.setId(5);
        Student s4 = new Student();
        s4.setName("Austin Sinclair");
       
        studentList[0] = s1;
        studentList[1] = s2;
        studentList[2] = s3;
        studentList[3] = s4;
        
        //fill in 4 student names before running
        for (Student s : studentList) {
            System.out.println("ID: " + s.studentID + " | Name: " + s.getName());
        }
        
        Course java = new Course();
        java.enrollStudent(s1);
        java.enrollStudent(s4);
        java.enrollStudent(s3);
        java.enrollStudent(s2);
        
        java.printClass();
    }   

}

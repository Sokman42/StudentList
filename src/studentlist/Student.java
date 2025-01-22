/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentlist;

/**
 *
 * @author fagun
 * Date: Jan 22 2025
 */
public class Student {
    private String name;
    public int studentID;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getId() {
        return studentID;
    }
    
    public void setId(int id) {
        this.studentID = id;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String addr){
        this.address = addr;
    }
}

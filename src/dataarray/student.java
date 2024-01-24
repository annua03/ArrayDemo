/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataarray;

/**
 *
 * @author arman
 */
public class student {
    private int std;
    private String sname;
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
    public student(int std, String sname) {
        this.std = std;
        this.sname = sname;
    }
    
    
    public int getStd() {
        return std;
    }

    public void setStd(int std) {
        this.std = std;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
    
}

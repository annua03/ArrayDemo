/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataarray;

/**
 *
 * @author arman
 */
public class StudentList {
   public static void main(String[] args){
      student s1 = new student(1, "Ronak");
      student[] StudentList = new student[3];
      StudentList[0] = s1;
      student s2 = new student(2, "abc");
      student s3 = new student(3, "xyz");
      
      for(int i=0;i<StudentList.length;i++)
      {
          System.out.println(StudentList[i].getSname());
      }
   } 
}

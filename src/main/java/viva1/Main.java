/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva1;

/**
 *
 * @author Izzat
 */
public class Main {
    public static void main(String[] args) {
        
    
    Course le1 = new LectureCourse("WIA1002","DATA STRUCTURE","PROF ZAINAB",3);
    Course le2 = new LectureCourse("WIE2003","PSYCHOLOGY","PROF SARAH",2);
    
    Course lb1 = new LabCourse("WID3006","MACHINE LEARNING","PROF IZZAT",2.5,2);
    Course lb2 = new LabCourse("WIA1003","COMPUTER SYSTEM ARCHITECTURE","PROF TEY",2,3);
    
    CourseManager<Course> cm = new CourseManager<>() ;
    cm.addCourse(le1);
    cm.addCourse(le2);
    cm.addCourse(lb1);
    cm.addCourse(lb2);
    
        System.out.println("The details of the course with highest total workload : ");
        cm.getCoursesWithHighestWorkload().printCourseDetails();
        System.out.println();
        
        cm.sortCoursesByWorkload();
        System.out.println("The courses sorted in ascending order of total workload/semester :");
        cm.printAllCourses();
        
        String courseDeleted = "WIA1003";
        cm.removeCourse(courseDeleted);
        System.out.println("The remaining course details after delete : "+ courseDeleted);
        cm.printAllCourses();
    
}
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva1;

/**
 *
 * @author Izzat
 */
 interface Course {
    
/*Gets the course's unique code
  @Return the String code for the course*/   
 String getCourseCode();

/*Gets the course's title 
 @Return the String title for the course*/
 String getCourseTitle();

/*Gets the total workload hours for the course per semester
 @Return the integer hour's workload of the course per semester*/
 int calculateTotalWorkload();

/*Gets the name of instructor of the lecture/lab
 @Return the name of the instructor in String*/
 String getInstructorName();

/*Display all the relevant Information ( course code , course title , total workload ,  Instructor name )
 @Print all the information here (VOID type return)*/
 void printCourseDetails();
    
}

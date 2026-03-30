/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva1;

import java.util.ArrayList;

    /**
     *
     * @author Izzat
     */ 
public class CourseManager<T extends Course>  {
  
    private ArrayList<T> collection ;
    
    public CourseManager (){
       collection = new ArrayList<>();
    }
    
    public void addCourse(T course){
        collection.add(course);
    }
    
    public void removeCourse(String courseCode){
        for (int i = 0; i < collection.size(); i++) {
            if(collection.get(i).getCourseCode().equals(courseCode)){
                collection.remove(i);
                break;
            }
        }
    }
    
    public T getCoursesWithHighestWorkload(){
        T max = collection.get(0);
        for (int i = 1; i < collection.size(); i++) {
            if(collection.get(i).calculateTotalWorkload()>max.calculateTotalWorkload()){
                max = collection.get(i);
            }
        }
        return max; 
    }
    
    public void sortCoursesByWorkload(){
        for (int i = 0; i < collection.size()-1; i++) {
            for (int j = 0; j < collection.size()-1-i; j++) {
                if(collection.get(j).calculateTotalWorkload()>collection.get(j+1).calculateTotalWorkload()){
                    T temp = collection.get(j);
                    collection.set(j, collection.get(j+1));
                    collection.set(j+1, temp);
                }
            }
        }
    }
    
    public void printAllCourses(){
        for (int i = 0; i < collection.size(); i++) {
            collection.get(i).printCourseDetails();
            System.out.println();
        }
    }
    
    
 
}

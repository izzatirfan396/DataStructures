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
    
    public void addCourse(T course){ // add course (wither lecture or lab type)
        collection.add(course);
    }
    
    public T removeCourse(String courseCode){ // remove specify course that is asked by user
        T remove = null;
        for (int i = 0; i < collection.size(); i++) {
            if(collection.get(i).getCourseCode().equals(courseCode)){
                remove = collection.get(i);
                collection.remove(i);
                break;
            }
            
        }
        return remove;
    }
    
    public T getCoursesWithHighestWorkload(){ 
        T max = collection.get(0); //set as first course as highest workload
        for (int i = 1; i < collection.size(); i++) { 
            if(collection.get(i).calculateTotalWorkload()>max.calculateTotalWorkload()){ //compare between next indexes
                max = collection.get(i);
            }
        }
        return max; 
    }
    
    public void sortCoursesByWorkload(){ //sort by bubble sort 
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
    
    public void printAllCourses(){ //print all courses
        for (int i = 0; i < collection.size(); i++) {
            collection.get(i).printCourseDetails();
            System.out.println();
        }
    }
    
    
 
}

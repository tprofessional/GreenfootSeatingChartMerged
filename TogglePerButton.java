import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;  //import java.util library in order to use ArrayList
/**
 * Write a description of class TogglePerButton here.
 * 
 * @author Trisha Moorkoth 
 * @version 1.0
 */
public class TogglePerButton extends Actor

{
    /**
     * Act - do whatever the TogglePerButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int currentPeriod;
    private ArrayList<Student> students;
    public int getCurrPeriod() {
        return currentPeriod;
        }
    public void setPeriod(int period) {
        if (getCurrPeriod() == 2) {
            
        }
        this.currentPeriod = period;
        //for Student
    }
    private void togglePer() {
        students = new students.getStudents();
        if(Greenfoot.mouseClicked(this)) {
            for(Student student: students) {
            }
        }
        
    }
    public void act() 
    {
        GreenfootImage btn = new GreenfootImage("images/button.png");
        setImage(btn);
        
    }    
}

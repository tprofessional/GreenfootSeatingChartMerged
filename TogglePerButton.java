import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
    public int getCurrPeriod() {
        return currentPeriod;
        }
    public void setPeriod(int period) {
        this.currentPeriod = period;
        //for Student
    }
    private void switchPer() {
        if(Greenfoot.mouseClicked(this)) {
            
        }
        
    }
    public void act() 
    {
        GreenfootImage btn = new GreenfootImage("images/button.png");
        setImage(btn);
        
    }    
}

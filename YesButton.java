import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YesButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YesButton extends Actor
{
    /**
     * Act - do whatever the YesButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public YesButton(){
        getImage().scale(135, 65);
    }
    public void act()
    {
        if (Greenfoot.mouseClicked(this)){ 
            Greenfoot.setWorld(new start());
        }
    }
}

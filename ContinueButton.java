import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ContinueButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ContinueButton extends Actor
{
    /**
     * Act - do whatever the ContinueButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public ContinueButton(){
        getImage().scale(150, 50);
    }
    
    public void act()
    {
        if (Greenfoot.mouseClicked(this)){             
            Greenfoot.setWorld(getMySpace());
            
        }    
    }
    
    public space getMySpace(){
        return new space();
    }
}

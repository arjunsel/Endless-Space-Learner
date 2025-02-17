import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import  javax.swing.JOptionPane;
/**
 * Write a description of class play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class play extends Actor
{
    public play()
    {
        getImage().scale(250, 50);
    }
    /**
     * Act - do whatever the play wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        if (Greenfoot.mouseClicked(this))
        {   
            String name = JOptionPane.showInputDialog("Enter Your Name:");
            Greenfoot.setWorld(new space(name));
        }
    }
}

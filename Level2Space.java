import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2Space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2Space extends space
{

    /**
     * Constructor for objects of class Level2Space.
     * 
     */
    public Level2Space()
    {
        super();           
    }
    
    @Override
    public void prepare(){    
        ship = new Level2Ship();  
        addObject(ship,50,50);
        
    }
}

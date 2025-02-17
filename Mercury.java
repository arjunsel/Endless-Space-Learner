import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mercury here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mercury extends Planets
{

    /**
     * Constructor for objects of class Mercury.
     * 
     */
    
    protected String fact =
        "                              You have Discovered the Planet Mercury\n" +
        "                         Mercury is the First planet in our Solar System\n" +
        "Mercury is the smallest planet in our solar system slightly larger than earths moon.\n";
    public Mercury()
    {
    
    }
    

    
    @Override
    public String getfact(){
        return fact;
    }
    
}   


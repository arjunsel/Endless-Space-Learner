import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Earth here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Earth extends Planets
{
    protected String fact =
        "                                      You have Discovered the Planet Earth\n" +
        "                                 Earth is the Third planet in our Solar System\n" +
        "       Earth is slighty bigger than Venus and is the only planet known to support Life\n";
    /**
     * Constructor for objects of class Earth.
     * 
     */
    public Earth()
    {
    }
    @Override
    public String getfact(){
        return fact;
    }
}

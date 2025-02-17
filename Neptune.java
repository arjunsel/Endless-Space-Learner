import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Neptune here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Neptune extends Planets
{
protected String fact =
        "                            You have Discovered the Planet Neptune\n" +
        "                 Neptune is the Eighth planet in our Solar System\n" +
        "              The blue color of Neptune comes from methane in its atmosphere\n" + 
        "     Neptune has a set of faint rings composed mainly of dust particles and small rocks. ";
    /**
     * Constructor for objects of class Neptune.
     * 
     */
    public Neptune()
    {
    }
    @Override
    public ContinueButton getMyButton(){
       return new Level2ContinueButton();
    }
    @Override
    public String getfact(){
        return fact;
    }
}

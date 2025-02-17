import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Uranus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Uranus extends Planets
{
protected String fact =
        "                                You have Discovered the Planet Uranus\n" +
        "                    Uranus is the Seventh planet in our Solar System\n" +
        "                           Uranus is a very cold and windy ice giant\n" + 
        "              Uranus is surrounded by 13 faint rings and 28 small moons";
    /**
     * Constructor for objects of class Uranus.
     * 
     */
    public Uranus()
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

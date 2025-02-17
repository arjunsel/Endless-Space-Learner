import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mars here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mars extends Planets
{

    /**
     * Constructor for objects of class Mars.
     * 
     */
    protected String fact =
        "                                    You have Discovered the Planet Mars\n" +
        "                            Mars is the Fourth planet in our Solar System\n" +
        "      Mars is known as the Red Planet and can have huge dust storms which last for months\n";
    
    public Mars()
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

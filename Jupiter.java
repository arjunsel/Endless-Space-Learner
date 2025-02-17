import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jupiter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jupiter extends Planets
{

    /**
     * Constructor for objects of class Jupiter.
     * 
     */
    protected String fact =
        "                                You have Discovered the Planet Jupiter\n" +
        "                         Jupiter is the Fifth planet in our Solar System\n" +
        "Jupiter also is the oldest and largest planet, formed from left over dust and gases";
    public Jupiter()
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

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Saturn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Saturn extends Planets
{

    protected String fact =
        "                                     You have Discovered the Planet Saturn\n" +
        "                                 Saturn is the Sixth planet in our Solar System\n" +
        "                                   Saturn has many rings that are not solid\n" + 
                                                                                                             "Saturn has the most moons than any other planet in our Solar System";
    public Saturn()
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

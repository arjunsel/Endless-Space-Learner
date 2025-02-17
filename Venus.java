import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Venus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Venus extends Planets
{
    private String fact =
        "                                You have Discovered the Planet Venus\n" +
        "                          Venus is the Second planet in our Solar System\n" +
        "                          Venus is similar in structure and size to Earth \n" +
        "Venus has a thick athmosphere making it the hottest planet in our Solar System";
    /**
     * Constructor for objects of class Venus.
     * 
     */
    public Venus()
    {
    }

    @Override
    public String getfact(){
        return fact;
    }
}

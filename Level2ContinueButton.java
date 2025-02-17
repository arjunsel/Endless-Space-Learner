import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2ContinueButton extends ContinueButton
{
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    //public Level2ContinueButton(){
      //  getImage().scale(150, 50);

    //}
    
    
    @Override
    public space getMySpace(){
        return new Level2Space();
    }
}

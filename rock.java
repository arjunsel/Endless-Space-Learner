import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rock extends Actor
{
    int counter = 0;
    int speed = 2;
    public void act()
    {
        counter++;
        setLocation(getX()-speed, getY());
        if (counter % 50 == 0){
            speed += 8;
        }
    }
}

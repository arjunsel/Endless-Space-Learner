import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bullet extends Actor
{
    /**
     * Act - do whatever the bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(10);
        remove();

        
    }
    public void remove(){
        rock r = (rock)getOneIntersectingObject(rock.class);
        if (r != null){
            getWorld().removeObject(r);
            getWorld().removeObject(this);
            ((space) getWorld()).score +=2;
        } 
        else if (getX() > 550){
          getWorld().removeObject(this);
        }
    }
}

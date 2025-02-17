import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2Bullet extends bullet
{
    public Level2Bullet(){
        getImage().scale(80, 100);
    }
    public void remove(){
        rock r = (rock)getOneIntersectingObject(rock.class);
        if (r != null){
            getWorld().removeObject(r);
            ((space) getWorld()).score +=2;
        } 
        else if (getX() > 600){
          getWorld().removeObject(this);
        }
    }
    
}

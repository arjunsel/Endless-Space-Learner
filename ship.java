import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ship extends Actor
{
    bullet bullet;
    public ship()
    {
        setRotation(90);
        getImage().scale(40, 60);
    }

    public void act()
    {
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY()-6);
        }
        if (Greenfoot.isKeyDown("down")) { 
            setLocation(getX(), getY()+6);
        }
        shoot();
    }
    public boolean hit()
    {
        if (isTouching(rock.class)) {
            getImage().setTransparency(0);
            getWorld().showText("Game Over", 300, 200);
            return true;
        }

        return false;

    }
    public void shoot(){
        if("space".equals(Greenfoot.getKey())){            
            makeMyBullet();
            getWorld().addObject(bullet, getX(), getY());
    
        }
    }
    
    public void makeMyBullet(){
        bullet = new bullet();
    }
}

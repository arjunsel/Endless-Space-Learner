import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2Ship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2Ship extends ship
{
  @Override  
  public void makeMyBullet(){
        bullet = new Level2Bullet();
  }

}

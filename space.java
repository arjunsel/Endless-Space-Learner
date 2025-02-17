import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class space extends World
{
    
    /**
     * Constructor for objects of class space.
     * 
     */
    boolean gameover = false;
    public static int score = 0;
    int counter = 0;
    public static int timer = 0;
    
    ship ship ;
       
    
    GreenfootSound backgroundMusic = new GreenfootSound("music.mp3");
    
    public static ArrayList<String> nameList = new ArrayList<String>();
    public static ArrayList<Integer> scoreList = new ArrayList<Integer>();
    
    public space(String name)
    {    
    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 700, 1, false); 
        nameList.add(name);
        prepare();
        backgroundMusic.playLoop();
    }
    
    public space(){
        super(800, 700, 1, false); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public void prepare()
    {
        ship = new ship();
        addObject(ship,50,50);

    }
    public rock lastSpawned;
    public void act()
    {
        int minimumGap = 100;
        if (lastSpawned == null || lastSpawned.getX() < getWidth()-minimumGap+20)
        {
            if (Greenfoot.getRandomNumber(100) > 10)
            {
                lastSpawned = new rock();
                addObject(lastSpawned, getWidth()+20, (Greenfoot.getRandomNumber(400)));
            }
        }
        if (counter % 100 == 0)
        {
            score++;
        }
        showText("Score:" + score, 370, 50);
        if (!ship.hit() && !gameover)
        {
            counter++;
        } else
        {
            gameover = true;
            scoreList.add(score);
            score = 0;
            timer = 0;
            Greenfoot.setWorld(new GameOver(scoreList,nameList));
        }
        showText("Timer: " + timer/60, 600,50);
        if (timer/60 == 5){
            //System.out.println("Testing - Working");
            timer+=60;
            Planets m = new Mercury();
            Greenfoot.setWorld(m);
            
        } else if (timer/60 == 10){
            timer+=60;
            Planets v = new Venus();
            Greenfoot.setWorld(v);
        }else if (timer/60 == 15){
            timer+=60;
            Planets e = new Earth();
            Greenfoot.setWorld(e);
        }else if(timer/60 == 20){
            timer+=60;
            Planets ma = new Mars();
            Greenfoot.setWorld(ma);
        }else if(timer/60 == 25){
            timer+=60;
            Planets j =new Jupiter();
            Greenfoot.setWorld(j);
            
        }else if(timer/60 == 30){
            timer+=60;
            Planets s = new Saturn();
            Greenfoot.setWorld(s);
            
        }else if(timer/60 == 35){
            timer+=60;
            Planets u = new Uranus();
            Greenfoot.setWorld(u);
        }else if(timer/60 ==40){
            timer+=60;
            Planets n = new Neptune();
            Greenfoot.setWorld(n);
        }
        timer++;
        }

    }



import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{

    /**
     * Constructor for objects of class GameOver.
     * 
     */
    YesButton yes = new YesButton();
    public static void scoreLabel(World t){
        t.showText(("Recent Scores:").toUpperCase(), 95,10);
    }
    public GameOver(ArrayList<Integer> slist, ArrayList<String> nameList)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 700, 1); 
        addObject(yes, 400,420);
        scoreBoard(slist,nameList);

    }
    public void scoreBoard(ArrayList<Integer> slist,ArrayList<String> nameList){
        int x = 45;
        int y = 30;
        int y1 = 30;
        int count = 1;
        GameOver.scoreLabel(this);
        for(String name:nameList){
            showText(name.concat(":"), x,y);
            y+=20;
        }
        for (Integer i: slist){
            //showText("Play " + count+ ": ",x,y);
            y+=20;
            showText(String.valueOf(i), x+55,y1);
            y1+=20;
            count += 1;
        }
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Planets here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Planets extends World
{

    /**
     * Constructor for objects of class Planets.
     * 
     */

    StationShip ship = new StationShip();
    ContinueButton button ;
    private String fact = " ";
    private int currentIndex = 0; 
    private boolean textDisplayed = false;
    private boolean spaceVisible = false;
    private int spaceBlinkCount = 0;
    private int spaceBlinkInterval = 30;
    private int timer = 0;
    private int delay = 3;
   public Planets()
   {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 700, 1, false); 
        addObject(ship, 50,50);
        addObject(getMyButton(), 700,50);
   }
   
   public ContinueButton getMyButton(){
       return new ContinueButton();
   }
   
   public void act()
    {
        if (!textDisplayed)
        {
            if (timer % delay == 0 && currentIndex <= getfact().length())
            {
                displayTextEffect();
            }
            if (currentIndex > getfact().length())
            {
                textDisplayed = true;
                spaceVisible = true;
            }
        }
        if (textDisplayed)
        {
            blinkSpaceText();
        }
        timer++;
    }
    
    private void displayTextEffect()
    {

        GreenfootImage background = getBackground();
        background.setColor(Color.WHITE);
        background.setFont(new Font("Cambria", 16));
        int x = 110;
        int y = 590;
        background.drawString(getfact().substring(0, currentIndex), x, y);
        currentIndex++;
    }
    
    private void blinkSpaceText()
    {
        spaceBlinkCount++;
        if (spaceBlinkCount >= spaceBlinkInterval)
        {
            spaceVisible = !spaceVisible;
            spaceBlinkCount = 0;
        }
    }
    public String getfact(){
        return fact;
    }
    public void setfact(String fact){
        this.fact = fact;
    }
}

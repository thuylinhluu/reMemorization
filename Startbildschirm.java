import greenfoot.*;  

public class Startbildschirm extends World
{
    private GreenfootSound backgroundMusic = new GreenfootSound("Start.mp3");
    
    public Startbildschirm()
    {    
        super(600, 400, 1); 
        //backgroundMusic.playLoop();
    }
    
    
    public void act()
    {
    if(Greenfoot.isKeyDown("enter"))
    Greenfoot.setWorld(new Wald1());
    
    }
}

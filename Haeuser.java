import greenfoot.*;  

public class Haeuser extends World
{
    private GreenfootSound backgroundMusic = new GreenfootSound("Huette.mp3");
    private GreenfootImage holzboden = new GreenfootImage("Holzboden.png");
    
    public Haeuser()
    {    
        super(600, 400, 1); 
        setBackground(holzboden);
    }
}
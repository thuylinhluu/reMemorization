import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Haus1 extends Haeuser
{
    public Haus1()
    {
        Fussmatte fussmatte = new Fussmatte();
        addObject(fussmatte, 300, 383);
        
        for (int i = 0; i<5; i++)
        {
            addObject(new InsZentrumElshin(), (300+(7*i)), 380);
            Tisch tisch = new Tisch();
            addObject(tisch, 306, 214);
        }
    }
}

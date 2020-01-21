import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Taverne extends Haeuser
{
    ElshinZentrum elshinZentrum;
    public Taverne(ElshinZentrum ez)
    {
        elshinZentrum = ez;
        Deko tisch = new Deko("Tisch.png");
        addObject(tisch, 500, 150);
        Deko tisch2 = new Deko("Tisch.png");
        addObject(tisch2, 100, 150);
        Deko tisch3 = new Deko("Tisch.png");
        addObject(tisch3, 500, 300);
        Deko tisch4 = new Deko("Tisch.png");
        addObject(tisch4, 100, 300);
        Deko theke = new Deko("Theke.PNG");
        addObject(theke, 312, 44);
        Deko hocker = new Deko("Hocker.PNG");
        addObject(hocker, 425, 30);
        Deko fussmatte = new Deko("Fußmatte.png");
        addObject(fussmatte, 300, 383);
        Deko fussmatte2 = new Deko("Fußmatte.png");
        addObject(fussmatte2, 514, 17);
        // NPC barkeeper = new NPC("Barkeeper.png");
        // addObject(barkeeper,289, 16);
        Hindernis unsichtbar = new Hindernis();
        addObject(unsichtbar, 389, 17);
        for (int i = 0; i<3; i++)
        {
            addObject(new Deko("Hocker.PNG"), 240+(50*i), 104);
        } 
        
        for (int i = 0; i<2; i++)
        {
            addObject(new Deko("Hocker.PNG"), 471+(70*i), 359);
            addObject(new Deko("Hocker.PNG"), 471+(70*i), 203);
            addObject(new Deko("Hocker.PNG"), 65+(70*i), 359);
            addObject(new Deko("Hocker.PNG"), 65+(70*i), 203);
        }
        Zimmer zimmer = new Zimmer(this);
        for (int i = 0; i<5; i++)
        {
            Portale ezPortal = new Portale(this, elshinZentrum);
            ezPortal.setPortalFix(280,350);
            addObject(ezPortal, (300+(7*i)), 380);
            Portale zimmerPortal = new Portale(this, zimmer);
            zimmerPortal.setPortalFix(300,300);
            addObject(zimmerPortal, (479+(7*i)), 12);
            addObject(new Hindernis(), (48+(25*i)), 116);
            addObject(new Hindernis(), (48+(25*i)), 164);
            addObject(new Hindernis(), (447+(25*i)), 116);
            addObject(new Hindernis(), (447+(25*i)), 164);
            addObject(new Hindernis(), (48+(25*i)), 266);
            addObject(new Hindernis(), (447+(25*i)), 266);
            addObject(new Hindernis(), (48+(25*i)), 314);
            addObject(new Hindernis(), (447+(25*i)), 314);
            addObject(new Hindernis(), (229+(40*i)), 41);
            addObject(new Hindernis(), (229+(40*i)), 77);
        }
    }
}

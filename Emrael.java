import greenfoot.*; 

public class Emrael extends Actor
{
    private GreenfootImage up = new GreenfootImage("Emrael_hl.png");
    private GreenfootImage down = new GreenfootImage("Emrael_vl.png");
    private GreenfootImage left = new GreenfootImage("Emrael_lige.png");
    private GreenfootImage right = new GreenfootImage("Emrael_rege.png");
    Lebensleiste lebensleiste;
    public Phase phase;
    private int leben;
    private int schaden;
    private int schnelligkeit;
    private int rüstung;
    private boolean bewegungBlockiert;
    
    public Emrael() {
        lebensleiste = new Lebensleiste();
        phase = Phase.Wald1Einfuehrung;
        bewegungBlockiert = true;
    }
    
    public void setBild(String bild) {
        setImage(bild);
    }
    
    public Lebensleiste getLebensleiste() {
        return lebensleiste;
    }
    
    public Emrael(Emrael alterEmrael) {
        lebensleiste = alterEmrael.getLebensleiste();
        phase = alterEmrael.phase;
    }
    
    public void setBewegungBlockiert(boolean b) {
        bewegungBlockiert = b;
    }

    private void setImage(){
        if(Greenfoot.isKeyDown("left")) 
            setImage(left);
        if(Greenfoot.isKeyDown("right"))
            setImage(right);
        if(Greenfoot.isKeyDown("up"))
            setImage(up);
        if(Greenfoot.isKeyDown("down"))
            setImage(down);
        
        if(Greenfoot.isKeyDown("a"))
        setImage(left);
        if(Greenfoot.isKeyDown("d"))
            setImage(right);
        if(Greenfoot.isKeyDown("w"))
            setImage(up);
        if(Greenfoot.isKeyDown("s"))
            setImage(down);
    }

    public void act(){
        if (bewegungBlockiert) 
            return;
            
        setImage();
        int lastX = getX();
        int lastY = getY();
            
        if(Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a"))
            setLocation(getX()-3, getY());
        if(Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d"))
            setLocation(getX()+3, getY());
        if(Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("w"))
            setLocation(getX(), getY()-3);
        if(Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("s"))
            setLocation(getX(), getY()+3);
               
        if (isTouching(Hindernis.class)) 
        {
            setLocation(lastX, lastY);
        }   
        if (isTouching(NPC.class)) 
        {
            setLocation(lastX, lastY);
        }   
        if (getY()<16 || getY()>382 || getX()<17 || getX()>583)
        {
            setLocation(lastX, lastY);
        }  
        
   }
   
   public int getXNachPortal() {
       if (getX() < 60)
           return 540;
       if  (getX() > 540)
           return 60;
       return getX();
    }
    
   public int getYNachPortal() {
       if (getY() < 60)
           return 340;
       if (getY() > 340)
           return 60;
       return getY();
    }

    public enum Phase {
        Wald1Einfuehrung,
        ErsterHuettenbesuch,
        Wald1ZumZweitenMal,
        Wald2VorMobs,
        Wald2Tutorial,
        Wald2Beeren,
        WaldBeerenGegessen,
        WaldBeerenErklaert
    }
}

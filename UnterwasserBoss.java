import greenfoot.*;  

public class UnterwasserBoss extends Unterwasser
{
    Emrael emrael;
    UnterwasserEingang unterwasserEingang;
    
    public UnterwasserBoss(UnterwasserEingang uwe)
    {   
        unterwasserEingang = uwe;
        Hydreix hydreix = new Hydreix();
        addObject(hydreix, 490, 178);
        for (int i = 0; i<13; i++)
        {
            addObject(new Fels(), (21+(45*i)), 382);
            addObject(new Fels(), (21+(45*i)), 19);
        } 
        
        for (int i = 0; i<7; i++)
        {
            addObject(new Fels(), (561), 64+(45*i));
        } 
        
        for (int i = 0; i<20; i++)
        {
            Portale zumUnterwasserEingang = new Portale(this, uwe);
            zumUnterwasserEingang.setPortalFix(480, 236);
            addObject(zumUnterwasserEingang,(30), 30+(20*i));
        }
        
        prepare();
    }
    

    private void prepare()
    {

        
    }
}

import greenfoot.*;  
import java.util.List; 

public class Wald1 extends Wald
{
    Emrael emrael;
    Textbox textbox;
    
    public Wald1()
    {    
        prepare();
    }
    
    
    private void prepare()
    {
        emrael = new Emrael();
        addObject(emrael, 433, 239);
        emrael.addLebensleiste();
        
        Hutte hutte = new Hutte();
        addObject(hutte, 210, 140);
        ZurHuette zurHuette = new ZurHuette(this);
        addObject(zurHuette, 246, 179);
        for (int i = 0; i<10; i++)
        {
            addObject(new Baum(), (30+(61*i)), 488);
            addObject(new Baum(), (30+(61*i)), 30);
        } 
        
        for (int i = 0; i<5; i++)
        {
            addObject(new Baum(), (30), 101+(71*i));
        } 
        
        for (int i = 0; i<5; i++)
        {
            addObject(new Unsichtbar(), 130+(20*i), 200);
        }
        
        for (int i = 0; i<8; i++)
        {
            addObject(new Unsichtbar(), 130+(20*i), 157);
        }
        Unsichtbar unsichtbar = new Unsichtbar();
        addObject(unsichtbar, 130, 180);
        Unsichtbar unsichtbar2 = new Unsichtbar();
        addObject(unsichtbar2, 285, 180);
        Unsichtbar unsichtbar3 = new Unsichtbar();
        addObject(unsichtbar3, 285, 200);
        
        starteSkripte();
    }
    
    public void starteSkripte() {
         switch(emrael.phase) {
         case Wald1Einfuehrung:
            skriptWald1Einleitung();
         }
    }
    
    public void setzePortalNachWald2() {
        if (getObjects(NachWald2.class).size() == 0) {
            Wald2 wald2 = new Wald2(emrael, this);
            for (int i = 0; i<20; i++) {
                addObject(new NachWald2(this, wald2), (570), 30+(20*i));
            }
            emrael.addLebensleiste();
        }
    }
    
    private void skriptWald1Einleitung() {
        textbox = new Wald1Einleitung(emrael);
        addObject(textbox, 300, 350);
    }

}

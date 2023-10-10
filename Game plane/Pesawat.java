import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pesawat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pesawat extends Actor
{
    /**
     * Act - do whatever the Pesawat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int belok=0;
    public void act()
    {
        kontrolkeyboard();
        Ambil();
        
    }
    
    public void kontrolkeyboard()
    {
        if(Greenfoot.isKeyDown("up"))
        {
            move(5);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            move(-5);
        }
        
        if(Greenfoot.isKeyDown("right"))
        {
            belok+=2;
            setRotation(belok);
        }
        
        if(Greenfoot.isKeyDown("left"))
        {
            belok-=2;
            setRotation(belok);
        }
        
    }
    public void Ambil()
    {
        if (isTouching(Balon.class))
        {
            removeTouching(Balon.class);
        }
    }
}

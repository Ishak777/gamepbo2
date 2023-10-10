import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels
        super(800, 600, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is : create the initial objects and add them to the world.
     */
     private void prepare()
     {
         Pesawat Pesawat = new Pesawat();
         addObject(Pesawat,115,111);
         Balon Balon = new Balon();
         addObject(Balon,510,99);
         Balon Balon2 = new Balon();
         addObject(Balon2,518,367);
         Balon Balon3 = new Balon();
         addObject(Balon3,162,389);
         Balon Balon4 = new Balon();
         addObject(Balon4,520,227);
         Balon Balon5 = new Balon();
         addObject(Balon5,327,388);
         Balon Balon6 = new Balon();
         addObject(Balon6,676,89);
         Balon Balon7 = new Balon();
         addObject(Balon7,682,219);
         Balon Balon8 = new Balon();
         addObject(Balon8,686,364);
         Balon Balon9 = new Balon();
         addObject(Balon9,528,497);
         Balon Balon10 = new Balon();
         addObject(Balon10,310,500);
     }
}

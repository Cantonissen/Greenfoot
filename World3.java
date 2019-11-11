import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World3 extends World
{

    /**
     * Constructor for objects of class World3.
     * 
     */
    public World3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ground ground = new Ground();
        addObject(ground,80,392);
        Player player = new Player();
        addObject(player,64,359);
        ground.setLocation(113,397);
        Ground ground2 = new Ground();
        addObject(ground2,274,475);
        ground2.setLocation(281,483);
        Ground ground3 = new Ground();
        addObject(ground3,475,542);
        Ground ground4 = new Ground();
        addObject(ground4,705,489);
        Ground ground5 = new Ground();
        addObject(ground5,576,356);
        Ground ground6 = new Ground();
        addObject(ground6,984,353);
        ground6.setLocation(879,288);
        ground6.setLocation(876,277);
        Ground ground7 = new Ground();
        addObject(ground7,1035,175);
        Ground ground8 = new Ground();
        addObject(ground8,834,95);
        Ground ground9 = new Ground();
        addObject(ground9,560,131);
        ground9.setLocation(595,162);
        Ground ground10 = new Ground();
        addObject(ground10,368,176);
        ground10.setLocation(357,188);
        Ground ground11 = new Ground();
        addObject(ground11,141,75);
        ground11.setLocation(143,103);
        Gem2 gem2 = new Gem2();
        addObject(gem2,99,54);
        removeObject(gem2);
        Gem3 gem3 = new Gem3();
        addObject(gem3,87,66);
        ground6.setLocation(754,312);
        ground7.setLocation(992,215);
        player.setLocation(53,364);
        ground6.setLocation(780,288);
    }
}

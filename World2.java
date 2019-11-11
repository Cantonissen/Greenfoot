import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World2 extends World
{
    int worldnumber = 2;
    /**
     * Constructor for objects of class World2.
     * 
     */
    public World2()
    {    

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
        addObject(ground,199,580);
        ground.setLocation(910,576);
        Player player = new Player();
        addObject(player,927,529);
        player.setLocation(915,543);
        ground.setLocation(77,581);
        player.setLocation(81,547);
        Ground ground2 = new Ground();
        addObject(ground2,348,584);
        ground2.setLocation(316,585);
        Ground ground3 = new Ground();
        addObject(ground3,535,588);
        ground3.setLocation(549,586);
        Ground ground4 = new Ground();
        addObject(ground4,788,581);
        ground4.setLocation(805,587);
        ground4.setLocation(780,528);
        Ground ground5 = new Ground();
        addObject(ground5,964,459);
        Ground ground6 = new Ground();
        addObject(ground6,761,392);
        Ground ground7 = new Ground();
        addObject(ground7,592,329);
        ground7.setLocation(596,339);
        Ground ground8 = new Ground();
        addObject(ground8,375,415);
        Ground ground9 = new Ground();
        addObject(ground9,140,323);
        ground9.setLocation(163,336);
        Ground ground10 = new Ground();
        addObject(ground10,362,239);
        Ground ground11 = new Ground();
        addObject(ground11,603,161);
        Gem gem = new Gem();
        addObject(gem,656,123);
        ground8.setLocation(365,402);
        ground9.setLocation(152,315);
        ground7.setLocation(537,308);
        ground6.setLocation(794,328);
        ground7.setLocation(570,293);
        ground11.setLocation(665,135);
        ground11.setLocation(692,95);
        ground10.setLocation(408,187);
        ground9.setLocation(187,273);
        ground7.setLocation(551,290);
        ground11.setLocation(587,140);
        gem.setLocation(691,100);
        ground8.setLocation(315,371);
        ground8.setLocation(387,378);
        gem.setLocation(650,100);
        Gem2 gem2 = new Gem2();
        addObject(gem2,611,95);
        removeObject(gem);
        gem2.setLocation(648,99);
    }
}

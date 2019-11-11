import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int worldnumber = 1;
    
    public int getWorldNumber() {
        return this.worldnumber;
    }
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
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
        addObject(ground,223,687);
        Ground ground2 = new Ground();
        addObject(ground2,504,614);
        Ground ground3 = new Ground();
        addObject(ground3,750,500);
        ground2.setLocation(499,632);
        ground3.setLocation(660,551);
        Ground ground4 = new Ground();
        addObject(ground4,499,440);
        Ground ground5 = new Ground();
        addObject(ground5,328,304);
        ground5.setLocation(377,356);
        Ground ground6 = new Ground();
        addObject(ground6,651,288);
        ground6.setLocation(642,270);
        Gem gem = new Gem();
        addObject(gem,676,212);
        Player player = new Player();
        addObject(player,288,628);
        player.setLocation(232,634);
        player.setLocation(232,658);
        ground2.setLocation(483,560);
        ground.setLocation(216,547);
        ground3.setLocation(840,489);
        ground4.setLocation(577,393);
        ground2.setLocation(545,544);
        ground3.setLocation(724,513);
        ground2.setLocation(476,556);
        ground5.setLocation(328,270);
        ground5.setLocation(348,312);
        gem.setLocation(744,152);
        ground6.setLocation(728,202);
        ground6.setLocation(609,244);
        gem.setLocation(672,204);
        gem.setLocation(652,201);
        player.setLocation(226,476);
        player.setLocation(156,496);
        player.setLocation(158,496);
        player.setLocation(163,516);
        ground4.setLocation(546,361);
        ground3.setLocation(704,479);
        ground5.setLocation(347,258);
        gem.setLocation(743,137);
        ground6.setLocation(724,190);
        gem.setLocation(635,127);
        ground6.setLocation(584,181);
        ground3.setLocation(684,507);
        ground3.setLocation(630,532);
        ground4.setLocation(584,436);
        ground5.setLocation(404,348);
        ground6.setLocation(629,225);
        gem.setLocation(668,186);
        ground4.setLocation(534,409);
        ground5.setLocation(426,306);
        ground3.setLocation(666,544);
        ground4.setLocation(532,348);
        ground5.setLocation(355,255);
        ground4.setLocation(486,376);
        ground3.setLocation(692,502);
        ground6.setLocation(587,190);
        ground6.setLocation(665,153);
        gem.setLocation(709,111);
        ground6.setLocation(555,184);
        gem.setLocation(676,141);
        ground6.setLocation(580,175);
        gem.setLocation(648,138);
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gem2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gem2 extends Actor
{
    /**
     * Act - do whatever the Gem2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (getX () == 0){
            getWorld().removeObject(this);
        }
    }    
}

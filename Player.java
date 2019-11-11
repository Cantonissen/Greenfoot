import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private int vSpeed = 0;
    private int acceleration = 1;
    private int jumpHeight = -16;
    private int collect = 0;
    private static int inWorld = 1;
    private GreenfootImage imageLeft;
    private GreenfootImage imageRight;
    //private GreenfootSound Dead;
    
    public Player(){
        imageLeft = new GreenfootImage("imageLeft.png");
        imageRight = new GreenfootImage("imageRight.png");
        //Dead = new GreenfootSound("Dead.wav");
    }
    

    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movement();
        checkFalling();
        collect();
        GameOver();
        nextWorld();
        if (bumpHead()) {
            vSpeed *= -1;   
        }
    }

    private void fall(){
        setLocation (getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
    }

    public void movement(){
        if(Greenfoot.isKeyDown("d")){
            //if(getImage() == imageLeft){
                //setImage("imageRight.png");
            //}
            move (4);
        }
        if(Greenfoot.isKeyDown("a")){
            //if(getImage() == imageRight) {
                
           //}
            move (-4);
            
        }   
        if(Greenfoot.isKeyDown("space") && onGround()){
            vSpeed = jumpHeight;
            fall();
        }
        if(Greenfoot.isKeyDown("p")){
            setImage(new GreenfootImage ("Garpleft"));
            move (-4);
            //forced crash
        }
        
    }

    boolean onGround(){
        Actor under = getOneObjectAtOffset(0,getImage().getHeight()/2, Ground.class);
        return under != null;
    }

    boolean bumpHead(){
        Actor under = getOneObjectAtOffset(0,-getImage().getHeight()/2, Ground.class);
        return under != null;
    }

    private void checkFalling(){
        if(!onGround())
        {
            fall();
        }
        if (onGround()) {
            vSpeed = 0;
            fall();
        }
    }

    public void collect(){
        Actor Gem = getOneIntersectingObject(Gem.class);
        Actor Gem2 = getOneIntersectingObject(Gem2.class);
        Actor Gem3 = getOneIntersectingObject(Gem3.class);
        if (Gem!=null){
            getWorld().removeObject(Gem);
            collect++;
            if(collect == 1)
            {
                Greenfoot.setWorld(new World2());
            }
        }
        else {
            if (Gem2!=null){
                getWorld().removeObject(Gem2);
                collect++;
                if(collect == 1){
                    Greenfoot.setWorld(new World3());
                }
        }
        else {
            if (Gem3!=null){
                getWorld().removeObject(Gem3);
                collect++;
                if(collect == 1) {
                    Greenfoot.setWorld(new Win());
                    Greenfoot.stop();
                    
                }
            }
        }
    }
}

    public void GameOver() {
        if(getY() == getWorld().getHeight() - 1) {
            World myWorld = getWorld();
            GameOver gameover = new GameOver();
            myWorld.addObject(gameover, myWorld.getWidth()/2,myWorld.getHeight()/2);
            Greenfoot.stop();   
            //Greenfoot.playSound("Dead.wav");
        } 
    }
    
 
    private void nextWorld(){
        if(isTouching(Gem.class)){
            if (inWorld == 1) {
                inWorld++;
                Greenfoot.setWorld(new World2());
            } else if (inWorld == 2) {
                inWorld++;
                Greenfoot.setWorld(new World3());
            }
        }
    }
    //System.out.println("hi");
}



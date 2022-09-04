import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pelota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pelota extends Actor
{
    /**
     * Act - do whatever the pelota wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public boolean atEdgeTop(int y)
    {
        if(y<35)
        {
           return true; 
        }
        return false;
    }
     public boolean atEdgeBottom(int y)
    {
        if(y>375)
        {
           return true; 
        }
        return false;
    }
     public boolean atEdgeLeft(int x)
    {
        if(x<35)
        {
           return true; 
        }
        return false;
    }
     public boolean atEdgeRight(int x)
    {
        if(x>575)
        {
           return true; 
        }
        return false;
    }
    int facX=5,facY=5;
    int ban=0;
    //NOTA LOS GRADOS VAN EN SENTIDO CONTRARIO
    public void act()
    {
        // Add your action code here.
        int x,y;
        x=getX();
        y=getY();
        setLocation(x+facX,y+facY); //no se mueve
        //bandera de inicializacion
        if(ban==9) //intento con rotaciones
        {
            turn(45);
            ban=1;
        }
        
    
        if(atEdgeTop(getY()))
        {
            facY*=-1;
        }
        if(atEdgeBottom(getY()))
        {
           facY*=-1;
        }
        if(atEdgeLeft(getX()))
        {
            facX*=-1;
        }
        if(atEdgeRight(getX()))
        {
           facX*=-1;
        }
    }
}

/**
 * An example of a method - replace this comment with your own
 *
 * @param  y  a sample parameter for a method
 * @return    the sum of x and y
 */



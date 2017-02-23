package becker;

import becker.robots.*;

public class GoAroundRoadBlock
{
   public static void main(String[] args)
   {
      // Set up the initial situation
      City ny = new City();
      Wall blockAve0 = new Wall(ny, 0, 2, Direction.WEST);
      Wall blockAve1 = new Wall(ny, 1, 2, Direction.WEST);
      Wall blockAve2 = new Wall(ny, 4, 5, Direction.NORTH);
      Robot mark = new Robot(ny, 0, 2, Direction.WEST);
      Robot ann = new Robot(ny, 0, 1, Direction.EAST);


      // mark goes around the roadblock
      mark.turnLeft();
      mark.move();
      mark.move();
      mark.turnLeft();     // start turning right as three turn lefts
      mark.turnLeft();
      mark.turnLeft();     // finished turning right
      mark.move();

      // ann goes to meet mark
      ann.turnLeft();      // start turning right as three turn lefts
      ann.turnLeft();
      ann.turnLeft();      // finished turning right
     
      if(ann.frontIsClear())
          ann.move();
      
      ann.move();
      ann.turnLeft();
      
      
   }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5task;

enum Directions{
	  EAST, 
	  WEST, 
	  NORTH, 
	  SOUTH
}
public class Day5task
{
   Directions dir;
   public Day5task(Directions dir) {
      this.dir = dir;
   }
   public void getMyDirection() {
     switch (dir) {
       case EAST:
          System.out.println("In East Direction");
          break;
                    
       case WEST:
          System.out.println("In West Direction");
          break;
                         
       case NORTH: 
          System.out.println("In North Direction");
          break;
                        
       default:
          System.out.println("In South Direction");
          break;
     }
   }
    
    public static void main(String[] args) {
        Day5task obj1 = new Day5task(Directions.EAST);
        obj1.getMyDirection();
        Day5task obj2 = new Day5task(Directions.SOUTH);
        obj2.getMyDirection();
    }
}

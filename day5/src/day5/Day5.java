/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5;

enum Directions{
	  EAST, 
	  WEST, 
	  NORTH, 
	  SOUTH
}
public class Day5
{
   Directions dir;
   public Day5(Directions dir) {
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
        Day5 obj1 = new Day5(Directions.EAST);
        obj1.getMyDirection();
        Day5 obj2 = new Day5(Directions.SOUTH);
        obj2.getMyDirection();
    }
}
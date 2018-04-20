package cst8284.solidObject;

import java.util.ArrayList;

public class TestSolidObjects {
	
	static ArrayList<SolidObject<BasicShape>> solidObjects = new ArrayList<SolidObject<BasicShape>>();
	
   public static void main(String[] args){	   
	  
	   Circle circle2D = new Circle(3.0);
	   SolidObject<BasicShape> circle3D = new SolidObject<BasicShape>(circle2D, 5.0);
	   solidObjects.add(circle3D);
	   Rectangle rect2D = new Rectangle(10.0, 9.0);
	   SolidObject<BasicShape> rect3D = new SolidObject<BasicShape>(rect2D, 2.0);
	   solidObjects.add(rect3D);
	   Rectangle rect2D2 = new Rectangle(3.0, 6.0);
	   SolidObject<BasicShape> rect3D2 = new SolidObject<BasicShape>(rect2D2, 10.0);
	   solidObjects.add(rect3D2);
	   Square sq2D = new Square(6.0);
	   SolidObject<BasicShape> sq3D = new SolidObject<BasicShape>(sq2D);
	   solidObjects.add(sq3D);
 
	  displayVolumeComparison(solidObjects); 
      displaySurfaceAreaComparison(solidObjects);

   }
	
   public static boolean isVolumeEqual(SolidObject<BasicShape> obj1, SolidObject<BasicShape> obj2) {
	   if (obj1.getVolume() == obj2.getVolume()) {
		   return true;
	   } else {
		   return false;
	   }
   }
   
   public static boolean isSurfaceAreaEqual(SolidObject<BasicShape> obj1, SolidObject<BasicShape> obj2) {
	   if (obj1.getSurfaceArea() == obj2.getSurfaceArea()) {
		   return true;
	   } else {
		   return false;
	   }
   }
	
   public static void displayVolumeComparison(ArrayList<SolidObject<BasicShape>> arList){
		
      // Print out column header
      System.out.println("\n\nCompare the two object's volumes.  Are they equal?");
	  System.out.print("\t\t");
      for (SolidObject<BasicShape> columnHeader: arList)
         System.out.print("\t" + columnHeader);
		
	 // Print out each row,starting with the name of the object
	 for (SolidObject<BasicShape> solidObjRow: arList){
	    System.out.println();	// Next line
	    System.out.print(solidObjRow);
            for (SolidObject<BasicShape> solidObjColumn: arList)
               System.out.print("\t\t" + isVolumeEqual(solidObjColumn, solidObjRow));
         }    
      }
	
   public static void displaySurfaceAreaComparison(ArrayList<SolidObject<BasicShape>> arList){
      
	   System.out.println("\n\nCompare the two object's surface areas.  Are they equal?");  
	   // Print out the header
	   System.out.print("\t\t");
       for (SolidObject<BasicShape> columnHeader: arList)
         System.out.print("\t" + columnHeader);
		
      // Print out each row,starting with the name of the object
      for (SolidObject<BasicShape> solidObjRow: arList){
         System.out.println();	// Next line
         System.out.print(solidObjRow);
         for (SolidObject<BasicShape> solidObjColumn: arList)
            System.out.print("\t\t" + isSurfaceAreaEqual(solidObjColumn, solidObjRow));  
      }
   }
}


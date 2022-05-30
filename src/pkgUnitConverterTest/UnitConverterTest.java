/*
Student Name: Natalia Pirath
Student Number: #041046587
Course & Section #: 22S_CST8288_022
Declaration: This is my own original work and is free from Plagiarism.
*/
package pkgUnitConverterTest;

import pkgUnitConverter.*;
/**
 * main() program that exercises features of the class UnitConverter and related classes
 * @author kriger
 * @author Natalia Pirath
 */
public class UnitConverterTest {

    /**
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        
        
                UnitConverter u = new UnitConverter();
                u.convert(70.0);
                System.out.println(u);
               
                u.unitType(new FCconverter());
                u.convert(20.0);
                System.out.println(u);
                
                u.unitType(new KiloPoundConverter());
                u.convert(60.0);
                System.out.println(u);
                
                u.unitType(new PoundKiloConverter());
                u.convert(90.0);
                System.out.println(u);
                
	}

}

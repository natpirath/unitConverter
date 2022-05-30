/*
Student Name: Natalia Pirath
Student Number: #041046587
Course & Section #: 22S_CST8288_022
Declaration: This is my own original work and is free from Plagiarism.
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgUnitConverter;

/**
 * class to convert Pounds to Kilograms (Kg)
 * @author Natalia Pirath
 */
public class PoundKiloConverter implements UnitBehavior{
    	private final double convDif=2.20462262185;
        
	/**
	 * @param number value in Pounds to be converted to Kilograms (Kg)
	 * @return equivalent in Kilograms (Kg)
	 */
        @Override
	public double convert(double number) {
		return number/convDif;
	}
       
        /**
         *
         * @return
         */
        @Override
            public String UnitType(){
                    return "Kilograms to Pounds";
        }
    
}

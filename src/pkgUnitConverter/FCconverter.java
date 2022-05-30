/*
Student Name: Natalia Pirath
Student Number: #041046587
Course & Section #: 22S_CST8288_022
Declaration: This is my own original work and is free from Plagiarism.
*/
package pkgUnitConverter;
/**
 * class to convert Fahrenheit to Celsius
 * @author kriger
 * @author Natalia Pirath
 */
public class FCconverter implements UnitBehavior {
	private final double convFactor=1.8;
	private final double convOrigin=32.0;
	
	/**
	 * @param number value in Fahrenheit to be converted
	 * @return equivalent in Celsius
	 */
        @Override
	public double convert(double number) {
		return (number - convOrigin)/convFactor;
	}
        
        /**
         * 
         * @return
         */
        @Override
            public String UnitType(){
                    return "Fahrenheit to Celsius";
        }
}

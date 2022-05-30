/*
Student Name: Natalia Pirath
Student Number: #041046587
Course & Section #: 22S_CST8288_022
Declaration: This is my own original work and is free from Plagiarism.
*/
package pkgUnitConverter;
/**
 * class to convert Celsius to Fahrenheit
 * @author kriger
 * @author Natalia Pirath
 */
public class CFconverter implements UnitBehavior {
	private final double convFactor=1.8;
	private final double convOrigin=32.0;
        
	/**
	 * @param number value in Celsius to be converted
	 * @return equivalent in Fahrenheit
	 */
        @Override
	public double convert(double number) {
		return number*convFactor + convOrigin;
	}
       
        /**
         *
         * @return
         */
        @Override
            public String UnitType(){
                    return "Celsius to Fahrenheit";
        }
}

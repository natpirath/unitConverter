/*
Student Name: Natalia Pirath
Student Number: #041046587
Course & Section #: 22S_CST8288_022
Declaration:
This is my own original work and is free from Plagiarism.
*/
package pkgUnitConverter;

/**
 * class that represents the "context" in the Strategy Design Pattern
 * behavior is an abstraction from the interface unitBehaviour.
 * @author Natalia Pirath
 */
public class UnitConverter {
    
    private double value;
    private UnitBehavior behavior;
    
    /**
     * no-arg constructor initializes unitConverter behavior/strategy to that of a
     * CFConverter (Celsius to Fahrenheit).
     */
    public UnitConverter(){
		this.behavior = new CFconverter();
    }
    
    /**
     *
     * @return
     */
    public double getValue(){ return value; }
    
    /**
     * This method converter calls a converter from behavior that is set in.
     * @param number
     */
    public void convert(double number){
        value = this.behavior.convert(number);
    }
    
    /**
     * Return a unit converted
     * @return 
     */  
    public String getUnit(){
        return this.behavior.UnitType();
    }
    
    /**
     * this method changes the unit behavior 
     * @param unitBehavior
     */
    public void unitType(UnitBehavior unitBehavior){
		//Detect and prevent nulls
                try
                {
		this.behavior = unitBehavior;
                }
                catch(NullPointerException e)
                {
                    System.out.println("Exception handle, the method changeBehaviourTo() can not pass null value");
                }
    }
    
    /**
     *
     * @return
     */
    @Override
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("[")
		       .append(behavior.UnitType())
                       .append(": ")
		       .append(String.format("%.2f", value))
		       .append("]");
		return builder.toString();
	}
}

     

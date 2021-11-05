package com.java.cyclefactory;

public class CycleFactory {
    public Cycle buildCycle(String type)
    {
        if(type == null){
            return null;
        }
        else if( type.equalsIgnoreCase("unicycle")){
            return new Unicycle();
        }
        else if( type.equalsIgnoreCase("bicycle")){
            return new Bicycle();
        }
        else {
            return new Tricycle();
        }
    }
}

package conversion;

public class MeasurementUnitConversion {

    private final int FEET_TO_INCHES_CONSTANT = 12;
    private final int YARD_TO_FEET_CONSTANT = 3;
    private final double measurementValue;

    private final String YARD = "YARD";
    private final String INCHES = "INCHES";

    public MeasurementUnitConversion(String measurementUnit, double measurementValue) {
        this.measurementValue = toFeet(measurementUnit, measurementValue);
    }

    private double toFeet(String measurementUnit, double measurementValue){
        if(measurementUnit == YARD) return measurementValue * YARD_TO_FEET_CONSTANT;
        else if(measurementUnit == INCHES) return measurementValue / FEET_TO_INCHES_CONSTANT;
        else return measurementValue;
    }

    public double toYards(){
        return measurementValue / YARD_TO_FEET_CONSTANT;
    }

    public double toInches(){
        return measurementValue * FEET_TO_INCHES_CONSTANT;
    }

    public double toFeet(){
        return measurementValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MeasurementUnitConversion that = (MeasurementUnitConversion) o;
        return Double.compare(that.measurementValue, measurementValue) == 0;
    }
}

package conversion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MeasurementUnitConversionTest {

    @Test
    public void testFeetConversionToInches() {
        MeasurementUnitConversion measurementUnitConversion = new MeasurementUnitConversion("FEET", 0.5);
        assertEquals(6, measurementUnitConversion.toInches());
    }

    @Test
    public void testYardConversionToFeet() {
        MeasurementUnitConversion measurementUnitConversion = new MeasurementUnitConversion("YARD", 1);
        assertEquals(3, measurementUnitConversion.toFeet());
    }

    @Test
    public void testUnitEquality() {
        MeasurementUnitConversion measurementUnitConversion = new MeasurementUnitConversion("FEET", 1);
        assertEquals(new MeasurementUnitConversion("INCHES", 12), measurementUnitConversion);
    }

}
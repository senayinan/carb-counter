package org.senayinan.carbcounter.models;

public enum MeasurementType {
    CUP("Cup"),
    SLICE("Slice"),
    ROLL("Roll"),
    WHOLE("Whole"),
    PACKAGE("Package"),
    TABLESPOON("Tablespoon"),
    TEASPOON("Teaspoon"),
    STICK("Stick"),
    PIECE("Piece");
    private final String displayMeasurementType;
    MeasurementType(String displayMeasurementType)  {
        this.displayMeasurementType = displayMeasurementType;
    }
    public String getDisplayMeasurementType() {
        return displayMeasurementType;
    }
}

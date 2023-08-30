package com.nikhil.unitconverter.dataProviders;

import com.nikhil.unitconverter.R;
import com.nikhil.unitconverter.models.DataItemUnits;

import java.util.ArrayList;
import java.util.List;

public class UnitAreaDataProvider {

    public static List<DataItemUnits> dataItemUnitsList;

    static {
        dataItemUnitsList = new ArrayList<>();

        addItem(new DataItemUnits("unit_area_square_meter", R.string.string_units_list_area_square_meter, "[ m^2 ]", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_square_kilometer", R.string.string_units_list_area_square_kilometer, "[ km^2 ]", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_square_centimeter", R.string.string_units_list_area_square_centimeter, "[ cm^2 ]", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_square_millimeter", R.string.string_units_list_area_square_millimeter, "[ mm^2 ]", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_square_micrometer", R.string.string_units_list_area_square_micrometer, "[ μm^2 ]", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_hectare", R.string.string_units_list_area_hectare, "[ ha ]", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_acre", R.string.string_units_list_area_acre, "[ ac ]", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_square_mile", R.string.string_units_list_area_square_mile, "[ mi^2 ]", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_square_yard", R.string.string_units_list_area_square_yard, "[ yd^2 ]", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_square_foot", R.string.string_units_list_area_square_foot, "[ ft^2 ]", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_square_inch", R.string.string_units_list_area_square_inch, "[ in^2 ]", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_square_hectometer", R.string.string_units_list_area_square_hectometer, "[ hm^2 ]", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_square_dekameter", R.string.string_units_list_area_square_dekameter, "[ dam^2 ]", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_square_decimeter", R.string.string_units_list_area_square_decimeter, "[ dm^2 ]", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_square_nanometer", R.string.string_units_list_area_square_nanometer, "[ nm^2 ]", "quantities_area", "ic_quantities_area.png"));
    }

    private static void addItem(DataItemUnits item) {
        dataItemUnitsList.add(item);
    }
}
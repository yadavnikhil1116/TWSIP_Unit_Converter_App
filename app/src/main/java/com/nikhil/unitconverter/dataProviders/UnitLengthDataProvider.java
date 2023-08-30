package com.nikhil.unitconverter.dataProviders;

import com.nikhil.unitconverter.R;
import com.nikhil.unitconverter.models.DataItemUnits;

import java.util.ArrayList;
import java.util.List;

public class UnitLengthDataProvider {

    public static List<DataItemUnits> dataItemUnitsList;

    static {
        dataItemUnitsList = new ArrayList<>();

        addItem(new DataItemUnits("unit_length_meter", R.string.string_units_list_length_meter, "[ m ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_kilometer", R.string.string_units_list_length_kilometer, "[ km ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_decimeter", R.string.string_units_list_length_decimeter, "[ dm ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_centimeter", R.string.string_units_list_length_centimeter, "[ cm ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_millimeter", R.string.string_units_list_length_millimeter, "[ mm ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_micrometer", R.string.string_units_list_length_micrometer, "[ μm ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_nanometer", R.string.string_units_list_length_nanometer, "[ nm ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_mile", R.string.string_units_list_length_mile, "[ mi, mi(int) ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_yard", R.string.string_units_list_length_yard, "[ yd ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_foot", R.string.string_units_list_length_foot, "[ ft ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_inch", R.string.string_units_list_length_inch, "[ in ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_year", R.string.string_units_list_length_light_year, "[ ly ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_exameter", R.string.string_units_list_length_exameter, "[ Em ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_petameter", R.string.string_units_list_length_petameter, "[ Pm ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_terameter", R.string.string_units_list_length_terameter, "[ Tm ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_gigameter", R.string.string_units_list_length_gigameter, "[ Gm ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_megameter", R.string.string_units_list_length_megameter, "[ Mm ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_hectometer", R.string.string_units_list_length_hectometer, "[ hm ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_dekameter", R.string.string_units_list_length_dekameter, "[ dam ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_micron", R.string.string_units_list_length_micron, "[ μ ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_picometer", R.string.string_units_list_length_picometer, "[ pm ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_femtometer", R.string.string_units_list_length_femtometer, "[ fm ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_attometer", R.string.string_units_list_length_attometer, "[ am ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_megaparsec", R.string.string_units_list_length_megaparsec, "[ Mpc ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_kiloparsec", R.string.string_units_list_length_kiloparsec, "[ kpc ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_parsec", R.string.string_units_list_length_parsec, "[ pc ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_astronomical_unit", R.string.string_units_list_length_astronomical_unit, "[ AU, UA ]", "quantities_length", "ic_quantities_length.png"));
    }

    private static void addItem(DataItemUnits item) {
        dataItemUnitsList.add(item);
    }
}
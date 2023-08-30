package com.nikhil.unitconverter.dataProviders;

import com.nikhil.unitconverter.R;
import com.nikhil.unitconverter.models.DataItemQuantities;

import java.util.ArrayList;
import java.util.List;

public class QuantitiesDataProvider {

    public static List<DataItemQuantities> dataItemQuantitiesList;

    static {
        dataItemQuantitiesList = new ArrayList<>();

        addItem(new DataItemQuantities("quantities_length", R.string.string_quantities_list_length, "ic_quantities_length.png", false));
        addItem(new DataItemQuantities("quantities_area", R.string.string_quantities_list_area, "ic_quantities_area.png", false));
        addItem(new DataItemQuantities("quantities_weight", R.string.string_quantities_list_weight, "ic_quantities_weight.png", false));
        addItem(new DataItemQuantities("quantities_temperature", R.string.string_quantities_list_temperature, "ic_quantities_temperature.png", false));
        }

    private static void addItem(DataItemQuantities item) {
        dataItemQuantitiesList.add(item);
    }
}
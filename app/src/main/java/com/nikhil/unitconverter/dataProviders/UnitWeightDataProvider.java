package com.nikhil.unitconverter.dataProviders;

import com.nikhil.unitconverter.R;
import com.nikhil.unitconverter.models.DataItemUnits;

import java.util.ArrayList;
import java.util.List;

public class UnitWeightDataProvider {

    public static List<DataItemUnits> dataItemUnitsList;

    static {
        dataItemUnitsList = new ArrayList<>();

        addItem(new DataItemUnits("unit_weight_kilogram", R.string.string_units_list_weight_kilogram, "[ kg ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_gram", R.string.string_units_list_weight_gram, "[ g ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_milligram", R.string.string_units_list_weight_milligram, "[ mg ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_ton_metric", R.string.string_units_list_weight_ton_metric, "[ t ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_pound", R.string.string_units_list_weight_pound, "[ lbs ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_ounce", R.string.string_units_list_weight_ounce, "[ oz ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_carat", R.string.string_units_list_weight_carat, "[ car, ct ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_ton_short", R.string.string_units_list_weight_ton_short, "[ ton (US) ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_ton_long", R.string.string_units_list_weight_ton_long, "[ ton (UK) ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_atomic_mass_unit", R.string.string_units_list_weight_atomic_mass_unit, "[ u ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_exagram", R.string.string_units_list_weight_exagram, "[ Eg ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_petagram", R.string.string_units_list_weight_petagram, "[ Pg ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_teragram", R.string.string_units_list_weight_teragram, "[ Tg ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_gigagram", R.string.string_units_list_weight_gigagram, "[ Gg ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_megagram", R.string.string_units_list_weight_megagram, "[ Mg ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_hectogram", R.string.string_units_list_weight_hectogram, "[ hg ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_dekagram", R.string.string_units_list_weight_dekagram, "[ dag ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_decigram", R.string.string_units_list_weight_decigram, "[ dg ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_centigram", R.string.string_units_list_weight_centigram, "[ cg ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_microgram", R.string.string_units_list_weight_microgram, "[ μg ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_nanogram", R.string.string_units_list_weight_nanogram, "[ ng ]", "quantities_weight", "ic_quantities_weight.png"));
    }

    private static void addItem(DataItemUnits item) {
        dataItemUnitsList.add(item);
    }
}
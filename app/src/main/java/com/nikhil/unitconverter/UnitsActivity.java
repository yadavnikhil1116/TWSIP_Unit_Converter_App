package com.nikhil.unitconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.Toolbar;

import com.nikhil.unitconverter.adapters.QuantitiesAdapter;
import com.nikhil.unitconverter.adapters.UnitsAdapter;
import com.nikhil.unitconverter.dataProviders.UnitAreaDataProvider;
import com.nikhil.unitconverter.dataProviders.UnitLengthDataProvider;
import com.nikhil.unitconverter.dataProviders.UnitTemperatureDataProvider;
import com.nikhil.unitconverter.dataProviders.UnitWeightDataProvider;
import com.nikhil.unitconverter.models.DataItemQuantities;
import com.nikhil.unitconverter.models.DataItemUnits;

import java.util.List;
import java.util.Objects;

public class UnitsActivity extends AppCompatActivity {

    public DataItemQuantities itemQuantities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_units);
        Toolbar toolbar = findViewById(R.id.toolbar_units);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        itemQuantities = Objects.requireNonNull(getIntent().getExtras()).
                getParcelable(QuantitiesAdapter.ITEM_KEY);

        if (itemQuantities == null) {
            throw new AssertionError("Null data item received!");
        } else {
            unitsRecyclerViews();
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        super.onBackPressed();
        return false;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    private void unitsRecyclerViews() {
        RecyclerView unitsRV = findViewById(R.id.rv_units);

        //todo Update after adding a quantity
        switch (itemQuantities.getId()) {
            case "quantities_length":
                List<DataItemUnits> dataItemUnitLengthList = UnitLengthDataProvider.dataItemUnitsList;
                UnitsAdapter unitsAdapter = new UnitsAdapter(this, dataItemUnitLengthList, itemQuantities);
                unitsRV.setAdapter(unitsAdapter);
                break;
            case "quantities_area":
                List<DataItemUnits> dataItemUnitAreaList = UnitAreaDataProvider.dataItemUnitsList;
                unitsAdapter = new UnitsAdapter(this, dataItemUnitAreaList, itemQuantities);
                unitsRV.setAdapter(unitsAdapter);
                break;
            case "quantities_weight":
                List<DataItemUnits> dataItemUnitWeightList = UnitWeightDataProvider.dataItemUnitsList;
                unitsAdapter = new UnitsAdapter(this, dataItemUnitWeightList, itemQuantities);
                unitsRV.setAdapter(unitsAdapter);
                break;
            case "quantities_temperature":
                List<DataItemUnits> dataItemUnitTemperatureList = UnitTemperatureDataProvider.dataItemUnitsList;
                unitsAdapter = new UnitsAdapter(this, dataItemUnitTemperatureList, itemQuantities);
                unitsRV.setAdapter(unitsAdapter);
                break;
        }
    }
}
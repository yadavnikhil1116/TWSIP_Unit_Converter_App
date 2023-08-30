package com.nikhil.unitconverter.converters;

import android.content.Context;
import android.widget.TextView;

import com.nikhil.unitconverter.R;

public class WeightConverter {

    private final Context mContext;
    private final String fromUnit;
    private final String toUnit;
    private final double fromValue;
    private double toValue;
    private final TextView mToNumberTV;

    public WeightConverter(Context context, String fromUnit, String toUnit, double fromValue,
                           double toValue, TextView toNumberTV) {
        this.mContext = context;
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
        this.fromValue = fromValue;
        this.toValue = toValue;
        this.mToNumberTV = toNumberTV;
    }

    public void convert() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(fromUnit)) {
            weightKilogram();
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(fromUnit)) {
            weightGram();
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(fromUnit)) {
            weightMilligram();
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(fromUnit)) {
            weightTonMetric();
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(fromUnit)) {
            weightPound();
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(fromUnit)) {
            weightOunce();
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(fromUnit)) {
            weightCarat();
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(fromUnit)) {
            weightTonShort();
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(fromUnit)) {
            weightTonLong();
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(fromUnit)) {
            weightAtomicMassUnit();
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(fromUnit)) {
            weightExagram();
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(fromUnit)) {
            weightPetagram();
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(fromUnit)) {
            weightTeragram();
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(fromUnit)) {
            weightGigagram();
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(fromUnit)) {
            weightMegagram();
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(fromUnit)) {
            weightHectogram();
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(fromUnit)) {
            weightDekagram();
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(fromUnit)) {
            weightDecigram();
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(fromUnit)) {
            weightCentigram();
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(fromUnit)) {
            weightMicrogram();
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(fromUnit)) {
            weightNanogram();
        }
    }

    private void weightKilogram() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 2.2046226218d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 35.2739619496d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 5000d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 0.0011023113d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 0.0009842065d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 6.0221366516752E+26d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-15d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 1000000000000d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightGram() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 0.0022046226d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 0.0352739619d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 5d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 1.1023113109244E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 9.8420652761106E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 6.0221366516752E+23d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-18d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-15d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 1000000000d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightMilligram() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 2.2046226218488E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 3.5274E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 0.005d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 1.1023113109244E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 9.8420652761106E-10d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 6.0221366516752E+20d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-21d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-18d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 1.0E-15d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 1.0E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightTonMetric() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 2204.6226218488d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 35273.96194958d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 5000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 1.1023113109d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 0.9842065276d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 6.0221366516752E+29d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 10000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 100000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+15d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightPound() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 0.45359237d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 453.59237d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 453592.37d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 0.0004535924d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 16d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 2267.96185d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 0.0005d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 0.0004464286d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 2.7315952362972E+26d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 4.5359237E-16d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 4.5359237E-13d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 4.5359237E-10d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 4.5359237E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 0.0004535924d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 4.5359237d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 45.359237d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 4535.9237d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 45359.237d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 453592370d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 453592370000d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightOunce() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 0.0283495231d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 28.349523125d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 28349.523125d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 2.83495E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 0.0625d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 141.747615625d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 3.125E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 2.79018E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 1.7072470226858E+25d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 2.8349523125E-17d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 2.8349523125E-14d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 2.8349523125E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 2.8349523125E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 2.83495E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 0.2834952313d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 2.8349523125d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 283.49523125d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 2834.9523125d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 28349523.125d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 28349523125d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightCarat() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 0.0002d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 0.2d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 200d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 2.0E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 0.0004409245d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 0.0070547924d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 2.2046226218488E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 1.9684130552221E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 1.204427330335E+23d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 2.0E-19d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 2.0E-16d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 2.0E-13d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 2.0E-10d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 2.0E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 0.002d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 0.02d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 2d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 20d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 200000d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 200000000d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightTonShort() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 907.18474d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 907184.74d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 907184740d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 0.90718474d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 2000d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 32000d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 4535923.7d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 0.8928571429d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 5.4631904725944E+29d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 9.0718474E-13d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 9.0718474E-10d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 9.0718474E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 0.0009071847d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 0.90718474d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 9071.8474d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 90718.474d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 9071847.4d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 90718474d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 907184740000d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 9.0718474E+14d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightTonLong() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 1016.0469088d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 1016046.9088d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 1016046908.8d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 1.0160469088d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 2240d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 35840d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 5080234.544d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 1.12d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 6.1187733293058E+29d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.0160469088E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1.0160469088E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 1.0160469088E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 0.0010160469d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 1.0160469088d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 10160.469088d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 101604.69088d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 10160469.088d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 101604690.88d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 1016046908800d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 1.0160469088E+15d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightAtomicMassUnit() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 1.6605402E-27d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 1.6605402E-24d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 1.6605402E-21d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 1.6605402E-30d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 3.6608644894093E-27d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 5.8573831830548E-26d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 8.3027009999999E-24d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 1.8304322447046E-30d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 1.6343145042006E-30d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.6605402E-42d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1.6605402E-39d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 1.6605402E-36d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 1.6605402E-33d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 1.6605402E-30d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 1.6605402E-26d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 1.6605402E-25d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 1.6605402E-23d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 1.6605402E-22d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 1.6605402E-18d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 1.6605402E-15d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightExagram() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+15d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 1.0E+18d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 1.0E+21d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 2.2046226218488E+15d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 3.527396194958E+16d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 5.0E+18d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 1102311310924.4d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 984206527611.06d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 6.0221366516752E+41d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+16d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 1.0E+17d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 1.0E+19d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 1.0E+20d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 1.0E+24d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+27d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightPetagram() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 1.0E+15d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 1.0E+18d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 2204622621848.8d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 35273961949580d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 5.0E+15d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 1102311310.9244d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 984206527.61106d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 6.0221366516752E+38d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 10000000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 1.0E+14d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 1.0E+16d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 1.0E+17d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 1.0E+21d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+24d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightTeragram() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 1.0E+15d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 2204622621.8488d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 35273961949.58d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 5000000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 1102311.3109244d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 984206.52761106d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 6.0221366516752E+35d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 10000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 100000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 10000000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 1.0E+14d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 1.0E+18d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+21d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightGigagram() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 2204622.6218488d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 35273961.94958d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 5000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 1102.3113109244d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 984.2065276111d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 6.0221366516752E+32d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 10000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 100000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 10000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 100000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 1.0E+15d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+18d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightMegagram() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 2204.6226218488d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 35273.96194958d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 5000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 1.1023113109d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 0.9842065276d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 6.0221366516752E+29d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 10000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 100000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+15d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightHectogram() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 0.2204622622d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 3.527396195d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 500d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 0.0001102311d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 9.84207E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 6.0221366516752E+25d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-16d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-13d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 1.0E-10d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 100000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 100000000000d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightDekagram() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 1.0E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 0.0220462262d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 0.3527396195d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 50d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 1.10231E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 9.8420652761106E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 6.0221366516752E+24d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-17d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-14d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 1.0E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 10000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 10000000000d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightDecigram() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 1.0E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 0.0002204623d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 0.0035273962d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 0.5d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 1.1023113109244E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 9.8420652761106E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 6.0221366516752E+22d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-19d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-16d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 1.0E-13d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-10d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 100000000d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightCentigram() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 1.0E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 1.0E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 2.20462E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 0.0003527396d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 0.05d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 1.1023113109244E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 9.8420652761106E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 6.0221366516752E+21d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-20d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-17d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 1.0E-14d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 10000000d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightMicrogram() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 2.2046226218488E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 3.527396194958E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 5.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 1.1023113109244E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 9.8420652761106E-13d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 6.0221366516752E+17d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-24d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-21d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 1.0E-18d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-15d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 1.0E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 1.0E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 1000d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightNanogram() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 1.0E-15d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 2.2046226218488E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 3.527396194958E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 5.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 1.1023113109244E-15d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 9.8420652761106E-16d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 6.0221366516752E+14d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-27d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-24d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 1.0E-21d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-18d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-15d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 1.0E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-10d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 1.0E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 1.0E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }
}
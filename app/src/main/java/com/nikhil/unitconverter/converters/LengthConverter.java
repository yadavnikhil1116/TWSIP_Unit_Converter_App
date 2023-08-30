package com.nikhil.unitconverter.converters;

import android.content.Context;
import android.widget.TextView;

import com.nikhil.unitconverter.R;

public class LengthConverter {

    private final Context mContext;
    private final String fromUnit;
    private final String toUnit;
    private final double fromValue;
    private double toValue;
    private final TextView mToNumberTV;

    public LengthConverter(Context context, String fromUnit, String toUnit, double fromValue,
                           double toValue, TextView toNumberTV) {
        this.mContext = context;
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
        this.fromValue = fromValue;
        this.toValue = toValue;
        this.mToNumberTV = toNumberTV;
    }

    public void convert() {
        if (mContext.getString(R.string.string_units_list_length_meter).equals(fromUnit)) {
            lengthMeter();
        } else if (mContext.getString(R.string.string_units_list_length_kilometer).equals(fromUnit)) {
            lengthKilometer();
        } else if (mContext.getString(R.string.string_units_list_length_decimeter).equals(fromUnit)) {
            lengthDecimeter();
        } else if (mContext.getString(R.string.string_units_list_length_centimeter).equals(fromUnit)) {
            lengthCentimeter();
        } else if (mContext.getString(R.string.string_units_list_length_millimeter).equals(fromUnit)) {
            lengthMillimeter();
        } else if (mContext.getString(R.string.string_units_list_length_micrometer).equals(fromUnit)) {
            lengthMicrometer();
        } else if (mContext.getString(R.string.string_units_list_length_nanometer).equals(fromUnit)) {
            lengthNanometer();
        } else if (mContext.getString(R.string.string_units_list_length_mile).equals(fromUnit)) {
            lengthMile();
        } else if (mContext.getString(R.string.string_units_list_length_yard).equals(fromUnit)) {
            lengthYard();
        } else if (mContext.getString(R.string.string_units_list_length_foot).equals(fromUnit)) {
            lengthFoot();
        } else if (mContext.getString(R.string.string_units_list_length_inch).equals(fromUnit)) {
            lengthInch();
        } else if (mContext.getString(R.string.string_units_list_length_light_year).equals(fromUnit)) {
            lengthLightYear();
        } else if (mContext.getString(R.string.string_units_list_length_exameter).equals(fromUnit)) {
            lengthExameter();
        } else if (mContext.getString(R.string.string_units_list_length_petameter).equals(fromUnit)) {
            lengthPetameter();
        } else if (mContext.getString(R.string.string_units_list_length_terameter).equals(fromUnit)) {
            lengthTerameter();
        } else if (mContext.getString(R.string.string_units_list_length_gigameter).equals(fromUnit)) {
            lengthGigameter();
        } else if (mContext.getString(R.string.string_units_list_length_megameter).equals(fromUnit)) {
            lengthMegameter();
        } else if (mContext.getString(R.string.string_units_list_length_hectometer).equals(fromUnit)) {
            lengthHectometer();
        } else if (mContext.getString(R.string.string_units_list_length_dekameter).equals(fromUnit)) {
            lengthDekameter();
        } else if (mContext.getString(R.string.string_units_list_length_micron).equals(fromUnit)) {
            lengthMicron();
        } else if (mContext.getString(R.string.string_units_list_length_picometer).equals(fromUnit)) {
            lengthPicometer();
        } else if (mContext.getString(R.string.string_units_list_length_femtometer).equals(fromUnit)) {
            lengthFemtometer();
        } else if (mContext.getString(R.string.string_units_list_length_attometer).equals(fromUnit)) {
            lengthAttometer();
        } else if (mContext.getString(R.string.string_units_list_length_megaparsec).equals(fromUnit)) {
            lengthMegaparsec();
        } else if (mContext.getString(R.string.string_units_list_length_kiloparsec).equals(fromUnit)) {
            lengthKiloparsec();
        } else if (mContext.getString(R.string.string_units_list_length_parsec).equals(fromUnit)) {
            lengthParsec();
        } else if (mContext.getString(R.string.string_units_list_length_astronomical_unit).equals(fromUnit)) {
            lengthAstronomicalUnit();
        }
    }

    private void lengthMeter() {
        if (mContext.getString(R.string.string_units_list_length_meter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_length_kilometer).equals(toUnit)) {
            toValue = fromValue / 1000d;
        } else if (mContext.getString(R.string.string_units_list_length_decimeter).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_length_centimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_length_millimeter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_length_micrometer).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_length_nanometer).equals(toUnit)) {
            toValue = fromValue * 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_mile).equals(toUnit)) {
            toValue = fromValue / 1609.344d;
        } else if (mContext.getString(R.string.string_units_list_length_yard).equals(toUnit)) {
            toValue = fromValue * 1.09361d;
        } else if (mContext.getString(R.string.string_units_list_length_foot).equals(toUnit)) {
            toValue = fromValue * 3.28084d;
        } else if (mContext.getString(R.string.string_units_list_length_inch).equals(toUnit)) {
            toValue = fromValue * 39.37d;
        } else if (mContext.getString(R.string.string_units_list_length_light_year).equals(toUnit)) {
            toValue = fromValue / 9461000000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_exameter).equals(toUnit)) {
            toValue = fromValue / 1000000000000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_petameter).equals(toUnit)) {
            toValue = fromValue / 1000000000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_terameter).equals(toUnit)) {
            toValue = fromValue / 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_gigameter).equals(toUnit)) {
            toValue = fromValue / 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_megameter).equals(toUnit)) {
            toValue = fromValue / 1000000d;
        } else if (mContext.getString(R.string.string_units_list_length_hectometer).equals(toUnit)) {
            toValue = fromValue / 100d;
        } else if (mContext.getString(R.string.string_units_list_length_dekameter).equals(toUnit)) {
            toValue = fromValue / 10d;
        } else if (mContext.getString(R.string.string_units_list_length_micron).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_length_picometer).equals(toUnit)) {
            toValue = fromValue * 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_femtometer).equals(toUnit)) {
            toValue = fromValue * 1000000000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_attometer).equals(toUnit)) {
            toValue = fromValue * 1000000000000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_megaparsec).equals(toUnit)) {
            toValue = fromValue / 30860000000000000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_kiloparsec).equals(toUnit)) {
            toValue = fromValue / 30860000000000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_parsec).equals(toUnit)) {
            toValue = fromValue / 30860000000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_astronomical_unit).equals(toUnit)) {
            toValue = fromValue / 149600000000d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void lengthKilometer() {
        if (mContext.getString(R.string.string_units_list_length_meter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_length_kilometer).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_length_decimeter).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_length_centimeter).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_length_millimeter).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_length_micrometer).equals(toUnit)) {
            toValue = fromValue * 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_nanometer).equals(toUnit)) {
            toValue = fromValue * 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_mile).equals(toUnit)) {
            toValue = fromValue / 1.609344d;
        } else if (mContext.getString(R.string.string_units_list_length_yard).equals(toUnit)) {
            toValue = fromValue / 0.0009144d;
        } else if (mContext.getString(R.string.string_units_list_length_foot).equals(toUnit)) {
            toValue = fromValue / 0.0003048d;
        } else if (mContext.getString(R.string.string_units_list_length_inch).equals(toUnit)) {
            toValue = fromValue / 39370.078740157d;
        } else if (mContext.getString(R.string.string_units_list_length_light_year).equals(toUnit)) {
            toValue = fromValue / 9460730472580d;
        } else if (mContext.getString(R.string.string_units_list_length_exameter).equals(toUnit)) {
            toValue = fromValue / 1000000000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_petameter).equals(toUnit)) {
            toValue = fromValue / 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_terameter).equals(toUnit)) {
            toValue = fromValue / 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_gigameter).equals(toUnit)) {
            toValue = fromValue / 1000000d;
        } else if (mContext.getString(R.string.string_units_list_length_megameter).equals(toUnit)) {
            toValue = fromValue / 1000d;
        } else if (mContext.getString(R.string.string_units_list_length_hectometer).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_length_dekameter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_length_micron).equals(toUnit)) {
            toValue = fromValue * 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_picometer).equals(toUnit)) {
            toValue = fromValue * 1000000000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_femtometer).equals(toUnit)) {
            toValue = fromValue * 1000000000000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_attometer).equals(toUnit)) {
            toValue = fromValue * 1000000000000000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_megaparsec).equals(toUnit)) {
            toValue = fromValue / 30856775812800000000d;
        } else if (mContext.getString(R.string.string_units_list_length_kiloparsec).equals(toUnit)) {
            toValue = fromValue / 30856775812800000d;
        } else if (mContext.getString(R.string.string_units_list_length_parsec).equals(toUnit)) {
            toValue = fromValue / 30856775812800d;
        } else if (mContext.getString(R.string.string_units_list_length_astronomical_unit).equals(toUnit)) {
            toValue = fromValue / 149597870.691d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void lengthDecimeter() {
        if (mContext.getString(R.string.string_units_list_length_meter).equals(toUnit)) {
            toValue = fromValue / 10d;
        } else if (mContext.getString(R.string.string_units_list_length_kilometer).equals(toUnit)) {
            toValue = fromValue / 10000d;
        } else if (mContext.getString(R.string.string_units_list_length_decimeter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_length_centimeter).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_length_millimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_length_micrometer).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_length_nanometer).equals(toUnit)) {
            toValue = fromValue * 100000000d;
        } else if (mContext.getString(R.string.string_units_list_length_mile).equals(toUnit)) {
            toValue = fromValue / 16093.44d;
        } else if (mContext.getString(R.string.string_units_list_length_yard).equals(toUnit)) {
            toValue = fromValue / 9.144d;
        } else if (mContext.getString(R.string.string_units_list_length_foot).equals(toUnit)) {
            toValue = fromValue / 3.048d;
        } else if (mContext.getString(R.string.string_units_list_length_inch).equals(toUnit)) {
            toValue = fromValue / 0.254d;
        } else if (mContext.getString(R.string.string_units_list_length_light_year).equals(toUnit)) {
            toValue = fromValue / 9.46073047258E+16d;
        } else if (mContext.getString(R.string.string_units_list_length_exameter).equals(toUnit)) {
            toValue = fromValue / 1.0E+19d;
        } else if (mContext.getString(R.string.string_units_list_length_petameter).equals(toUnit)) {
            toValue = fromValue / 1.0E+16d;
        } else if (mContext.getString(R.string.string_units_list_length_terameter).equals(toUnit)) {
            toValue = fromValue / 10000000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_gigameter).equals(toUnit)) {
            toValue = fromValue / 10000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_megameter).equals(toUnit)) {
            toValue = fromValue / 10000000d;
        } else if (mContext.getString(R.string.string_units_list_length_hectometer).equals(toUnit)) {
            toValue = fromValue / 1000d;
        } else if (mContext.getString(R.string.string_units_list_length_dekameter).equals(toUnit)) {
            toValue = fromValue / 100d;
        } else if (mContext.getString(R.string.string_units_list_length_micron).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_length_picometer).equals(toUnit)) {
            toValue = fromValue * 100000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_femtometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+14d;
        } else if (mContext.getString(R.string.string_units_list_length_attometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+17d;
        } else if (mContext.getString(R.string.string_units_list_length_megaparsec).equals(toUnit)) {
            toValue = fromValue / 3.08567758128E+23d;
        } else if (mContext.getString(R.string.string_units_list_length_kiloparsec).equals(toUnit)) {
            toValue = fromValue / 3.08567758128E+20d;
        } else if (mContext.getString(R.string.string_units_list_length_parsec).equals(toUnit)) {
            toValue = fromValue / 3.08567758128E+17d;
        } else if (mContext.getString(R.string.string_units_list_length_astronomical_unit).equals(toUnit)) {
            toValue = fromValue / 1495978706910d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void lengthCentimeter() {
        if (mContext.getString(R.string.string_units_list_length_meter).equals(toUnit)) {
            toValue = fromValue / 100d;
        } else if (mContext.getString(R.string.string_units_list_length_kilometer).equals(toUnit)) {
            toValue = fromValue / 100000d;
        } else if (mContext.getString(R.string.string_units_list_length_decimeter).equals(toUnit)) {
            toValue = fromValue / 10d;
        } else if (mContext.getString(R.string.string_units_list_length_centimeter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_length_millimeter).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_length_micrometer).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_length_nanometer).equals(toUnit)) {
            toValue = fromValue * 10000000d;
        } else if (mContext.getString(R.string.string_units_list_length_mile).equals(toUnit)) {
            toValue = fromValue / 160934.4d;
        } else if (mContext.getString(R.string.string_units_list_length_yard).equals(toUnit)) {
            toValue = fromValue / 91.44d;
        } else if (mContext.getString(R.string.string_units_list_length_foot).equals(toUnit)) {
            toValue = fromValue / 30.48d;
        } else if (mContext.getString(R.string.string_units_list_length_inch).equals(toUnit)) {
            toValue = fromValue / 2.54d;
        } else if (mContext.getString(R.string.string_units_list_length_light_year).equals(toUnit)) {
            toValue = fromValue / 9.46073047258E+17d;
        } else if (mContext.getString(R.string.string_units_list_length_exameter).equals(toUnit)) {
            toValue = fromValue / 1.0E+20d;
        } else if (mContext.getString(R.string.string_units_list_length_petameter).equals(toUnit)) {
            toValue = fromValue / 1.0E+17d;
        } else if (mContext.getString(R.string.string_units_list_length_terameter).equals(toUnit)) {
            toValue = fromValue / 1.0E+14d;
        } else if (mContext.getString(R.string.string_units_list_length_gigameter).equals(toUnit)) {
            toValue = fromValue / 100000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_megameter).equals(toUnit)) {
            toValue = fromValue / 100000000d;
        } else if (mContext.getString(R.string.string_units_list_length_hectometer).equals(toUnit)) {
            toValue = fromValue / 10000d;
        } else if (mContext.getString(R.string.string_units_list_length_dekameter).equals(toUnit)) {
            toValue = fromValue / 1000d;
        } else if (mContext.getString(R.string.string_units_list_length_micron).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_length_picometer).equals(toUnit)) {
            toValue = fromValue * 10000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_femtometer).equals(toUnit)) {
            toValue = fromValue * 10000000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_attometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+16d;
        } else if (mContext.getString(R.string.string_units_list_length_megaparsec).equals(toUnit)) {
            toValue = fromValue / 3.08567758128E+24d;
        } else if (mContext.getString(R.string.string_units_list_length_kiloparsec).equals(toUnit)) {
            toValue = fromValue / 3.08567758128E+21d;
        } else if (mContext.getString(R.string.string_units_list_length_parsec).equals(toUnit)) {
            toValue = fromValue / 3.08567758128E+18d;
        } else if (mContext.getString(R.string.string_units_list_length_astronomical_unit).equals(toUnit)) {
            toValue = fromValue / 14959787069100d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void lengthMillimeter() {
        if (mContext.getString(R.string.string_units_list_length_meter).equals(toUnit)) {
            toValue = fromValue / 1000d;
        } else if (mContext.getString(R.string.string_units_list_length_kilometer).equals(toUnit)) {
            toValue = fromValue / 1000000d;
        } else if (mContext.getString(R.string.string_units_list_length_decimeter).equals(toUnit)) {
            toValue = fromValue / 100d;
        } else if (mContext.getString(R.string.string_units_list_length_centimeter).equals(toUnit)) {
            toValue = fromValue / 10d;
        } else if (mContext.getString(R.string.string_units_list_length_millimeter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_length_micrometer).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_length_nanometer).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_length_mile).equals(toUnit)) {
            toValue = fromValue / 1609344d;
        } else if (mContext.getString(R.string.string_units_list_length_yard).equals(toUnit)) {
            toValue = fromValue / 914.4d;
        } else if (mContext.getString(R.string.string_units_list_length_foot).equals(toUnit)) {
            toValue = fromValue / 304.8d;
        } else if (mContext.getString(R.string.string_units_list_length_inch).equals(toUnit)) {
            toValue = fromValue / 25.4d;
        } else if (mContext.getString(R.string.string_units_list_length_light_year).equals(toUnit)) {
            toValue = fromValue / 9.46073047258E+18d;
        } else if (mContext.getString(R.string.string_units_list_length_exameter).equals(toUnit)) {
            toValue = fromValue / 1.0E+21d;
        } else if (mContext.getString(R.string.string_units_list_length_petameter).equals(toUnit)) {
            toValue = fromValue / 1.0E+18d;
        } else if (mContext.getString(R.string.string_units_list_length_terameter).equals(toUnit)) {
            toValue = fromValue / 1.0E+15d;
        } else if (mContext.getString(R.string.string_units_list_length_gigameter).equals(toUnit)) {
            toValue = fromValue / 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_megameter).equals(toUnit)) {
            toValue = fromValue / 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_hectometer).equals(toUnit)) {
            toValue = fromValue / 100000d;
        } else if (mContext.getString(R.string.string_units_list_length_dekameter).equals(toUnit)) {
            toValue = fromValue / 10000d;
        } else if (mContext.getString(R.string.string_units_list_length_micron).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_length_picometer).equals(toUnit)) {
            toValue = fromValue * 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_femtometer).equals(toUnit)) {
            toValue = fromValue * 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_attometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+15d;
        } else if (mContext.getString(R.string.string_units_list_length_megaparsec).equals(toUnit)) {
            toValue = fromValue / 3.08567758128E+25d;
        } else if (mContext.getString(R.string.string_units_list_length_kiloparsec).equals(toUnit)) {
            toValue = fromValue / 3.08567758128E+22d;
        } else if (mContext.getString(R.string.string_units_list_length_parsec).equals(toUnit)) {
            toValue = fromValue / 3.08567758128E+19d;
        } else if (mContext.getString(R.string.string_units_list_length_astronomical_unit).equals(toUnit)) {
            toValue = fromValue / 1.49597870691E+14d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void lengthMicrometer() {
        if (mContext.getString(R.string.string_units_list_length_meter).equals(toUnit)) {
            toValue = fromValue / 1000000d;
        } else if (mContext.getString(R.string.string_units_list_length_kilometer).equals(toUnit)) {
            toValue = fromValue / 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_decimeter).equals(toUnit)) {
            toValue = fromValue / 100000d;
        } else if (mContext.getString(R.string.string_units_list_length_centimeter).equals(toUnit)) {
            toValue = fromValue / 10000d;
        } else if (mContext.getString(R.string.string_units_list_length_millimeter).equals(toUnit)) {
            toValue = fromValue / 1000d;
        } else if (mContext.getString(R.string.string_units_list_length_micrometer).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_length_nanometer).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_length_mile).equals(toUnit)) {
            toValue = fromValue / 1609344000d;
        } else if (mContext.getString(R.string.string_units_list_length_yard).equals(toUnit)) {
            toValue = fromValue / 914400d;
        } else if (mContext.getString(R.string.string_units_list_length_foot).equals(toUnit)) {
            toValue = fromValue / 304800d;
        } else if (mContext.getString(R.string.string_units_list_length_inch).equals(toUnit)) {
            toValue = fromValue / 25400d;
        } else if (mContext.getString(R.string.string_units_list_length_light_year).equals(toUnit)) {
            toValue = fromValue / 9.46073047258E+21d;
        } else if (mContext.getString(R.string.string_units_list_length_exameter).equals(toUnit)) {
            toValue = fromValue / 1.0E+24d;
        } else if (mContext.getString(R.string.string_units_list_length_petameter).equals(toUnit)) {
            toValue = fromValue / 1.0E+21d;
        } else if (mContext.getString(R.string.string_units_list_length_terameter).equals(toUnit)) {
            toValue = fromValue / 1.0E+18d;
        } else if (mContext.getString(R.string.string_units_list_length_gigameter).equals(toUnit)) {
            toValue = fromValue / 1.0E+15d;
        } else if (mContext.getString(R.string.string_units_list_length_megameter).equals(toUnit)) {
            toValue = fromValue / 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_hectometer).equals(toUnit)) {
            toValue = fromValue / 100000000d;
        } else if (mContext.getString(R.string.string_units_list_length_dekameter).equals(toUnit)) {
            toValue = fromValue / 10000000d;
        } else if (mContext.getString(R.string.string_units_list_length_micron).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_length_picometer).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_length_femtometer).equals(toUnit)) {
            toValue = fromValue * 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_attometer).equals(toUnit)) {
            toValue = fromValue * 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_megaparsec).equals(toUnit)) {
            toValue = fromValue / 3.08567758128E+28d;
        } else if (mContext.getString(R.string.string_units_list_length_kiloparsec).equals(toUnit)) {
            toValue = fromValue / 3.08567758128E+25d;
        } else if (mContext.getString(R.string.string_units_list_length_parsec).equals(toUnit)) {
            toValue = fromValue / 3.08567758128E+22d;
        } else if (mContext.getString(R.string.string_units_list_length_astronomical_unit).equals(toUnit)) {
            toValue = fromValue / 1.49597870691E+17d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void lengthNanometer() {
        if (mContext.getString(R.string.string_units_list_length_meter).equals(toUnit)) {
            toValue = fromValue / 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_kilometer).equals(toUnit)) {
            toValue = fromValue / 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_decimeter).equals(toUnit)) {
            toValue = fromValue / 100000000d;
        } else if (mContext.getString(R.string.string_units_list_length_centimeter).equals(toUnit)) {
            toValue = fromValue / 10000000d;
        } else if (mContext.getString(R.string.string_units_list_length_millimeter).equals(toUnit)) {
            toValue = fromValue / 1000000d;
        } else if (mContext.getString(R.string.string_units_list_length_micrometer).equals(toUnit)) {
            toValue = fromValue / 1000d;
        } else if (mContext.getString(R.string.string_units_list_length_nanometer).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_length_mile).equals(toUnit)) {
            toValue = fromValue / 1609344000000d;
        } else if (mContext.getString(R.string.string_units_list_length_yard).equals(toUnit)) {
            toValue = fromValue / 914400000d;
        } else if (mContext.getString(R.string.string_units_list_length_foot).equals(toUnit)) {
            toValue = fromValue / 304800000d;
        } else if (mContext.getString(R.string.string_units_list_length_inch).equals(toUnit)) {
            toValue = fromValue / 25400000d;
        } else if (mContext.getString(R.string.string_units_list_length_light_year).equals(toUnit)) {
            toValue = fromValue / 9.46073047258E+24d;
        } else if (mContext.getString(R.string.string_units_list_length_exameter).equals(toUnit)) {
            toValue = fromValue / 1.0E+27d;
        } else if (mContext.getString(R.string.string_units_list_length_petameter).equals(toUnit)) {
            toValue = fromValue / 1.0E+24d;
        } else if (mContext.getString(R.string.string_units_list_length_terameter).equals(toUnit)) {
            toValue = fromValue / 1.0E+21d;
        } else if (mContext.getString(R.string.string_units_list_length_gigameter).equals(toUnit)) {
            toValue = fromValue / 1.0E+18d;
        } else if (mContext.getString(R.string.string_units_list_length_megameter).equals(toUnit)) {
            toValue = fromValue / 1.0E+15d;
        } else if (mContext.getString(R.string.string_units_list_length_hectometer).equals(toUnit)) {
            toValue = fromValue / 100000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_dekameter).equals(toUnit)) {
            toValue = fromValue / 10000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_micron).equals(toUnit)) {
            toValue = fromValue / 1000d;
        } else if (mContext.getString(R.string.string_units_list_length_picometer).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_length_femtometer).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_length_attometer).equals(toUnit)) {
            toValue = fromValue * 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_megaparsec).equals(toUnit)) {
            toValue = fromValue / 3.08567758128E+31d;
        } else if (mContext.getString(R.string.string_units_list_length_kiloparsec).equals(toUnit)) {
            toValue = fromValue / 3.08567758128E+28d;
        } else if (mContext.getString(R.string.string_units_list_length_parsec).equals(toUnit)) {
            toValue = fromValue / 3.08567758128E+25d;
        } else if (mContext.getString(R.string.string_units_list_length_astronomical_unit).equals(toUnit)) {
            toValue = fromValue / 1.49597870691E+20d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void lengthMile() {
        if (mContext.getString(R.string.string_units_list_length_meter).equals(toUnit)) {
            toValue = fromValue * 1609.344d;
        } else if (mContext.getString(R.string.string_units_list_length_kilometer).equals(toUnit)) {
            toValue = fromValue * 1.609344d;
        } else if (mContext.getString(R.string.string_units_list_length_decimeter).equals(toUnit)) {
            toValue = fromValue * 16093.44d;
        } else if (mContext.getString(R.string.string_units_list_length_centimeter).equals(toUnit)) {
            toValue = fromValue * 160934.4d;
        } else if (mContext.getString(R.string.string_units_list_length_millimeter).equals(toUnit)) {
            toValue = fromValue * 1609344d;
        } else if (mContext.getString(R.string.string_units_list_length_micrometer).equals(toUnit)) {
            toValue = fromValue * 1609344000d;
        } else if (mContext.getString(R.string.string_units_list_length_nanometer).equals(toUnit)) {
            toValue = fromValue * 1609344000000d;
        } else if (mContext.getString(R.string.string_units_list_length_mile).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_length_yard).equals(toUnit)) {
            toValue = fromValue * 1760d;
        } else if (mContext.getString(R.string.string_units_list_length_foot).equals(toUnit)) {
            toValue = fromValue * 5280d;
        } else if (mContext.getString(R.string.string_units_list_length_inch).equals(toUnit)) {
            toValue = fromValue * 63360d;
        } else if (mContext.getString(R.string.string_units_list_length_light_year).equals(toUnit)) {
            toValue = fromValue / 5878625373183.1d;
        } else if (mContext.getString(R.string.string_units_list_length_exameter).equals(toUnit)) {
            toValue = fromValue / 6.2137119223733E+14d;
        } else if (mContext.getString(R.string.string_units_list_length_petameter).equals(toUnit)) {
            toValue = fromValue / 621371192237.33d;
        } else if (mContext.getString(R.string.string_units_list_length_terameter).equals(toUnit)) {
            toValue = fromValue / 621371192.23733d;
        } else if (mContext.getString(R.string.string_units_list_length_gigameter).equals(toUnit)) {
            toValue = fromValue / 621371.19223733d;
        } else if (mContext.getString(R.string.string_units_list_length_megameter).equals(toUnit)) {
            toValue = fromValue / 621.3711922373d;
        } else if (mContext.getString(R.string.string_units_list_length_hectometer).equals(toUnit)) {
            toValue = fromValue * 16.09344d;
        } else if (mContext.getString(R.string.string_units_list_length_dekameter).equals(toUnit)) {
            toValue = fromValue * 160.9344d;
        } else if (mContext.getString(R.string.string_units_list_length_micron).equals(toUnit)) {
            toValue = fromValue * 1609344000d;
        } else if (mContext.getString(R.string.string_units_list_length_picometer).equals(toUnit)) {
            toValue = fromValue * 1.609344E+15d;
        } else if (mContext.getString(R.string.string_units_list_length_femtometer).equals(toUnit)) {
            toValue = fromValue * 1.609344E+18d;
        } else if (mContext.getString(R.string.string_units_list_length_attometer).equals(toUnit)) {
            toValue = fromValue * 1.609344E+21d;
        } else if (mContext.getString(R.string.string_units_list_length_megaparsec).equals(toUnit)) {
            toValue = fromValue / 1.91735115754E+19d;
        } else if (mContext.getString(R.string.string_units_list_length_kiloparsec).equals(toUnit)) {
            toValue = fromValue / 1.91735115754E+16d;
        } else if (mContext.getString(R.string.string_units_list_length_parsec).equals(toUnit)) {
            toValue = fromValue / 19173511575400d;
        } else if (mContext.getString(R.string.string_units_list_length_astronomical_unit).equals(toUnit)) {
            toValue = fromValue / 92955807.267433d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void lengthYard() {
        if (mContext.getString(R.string.string_units_list_length_meter).equals(toUnit)) {
            toValue = fromValue / 1.0936132983d;
        } else if (mContext.getString(R.string.string_units_list_length_kilometer).equals(toUnit)) {
            toValue = fromValue / 1093.6132983377d;
        } else if (mContext.getString(R.string.string_units_list_length_decimeter).equals(toUnit)) {
            toValue = fromValue * 9.144d;
        } else if (mContext.getString(R.string.string_units_list_length_centimeter).equals(toUnit)) {
            toValue = fromValue * 91.44d;
        } else if (mContext.getString(R.string.string_units_list_length_millimeter).equals(toUnit)) {
            toValue = fromValue * 914.4d;
        } else if (mContext.getString(R.string.string_units_list_length_micrometer).equals(toUnit)) {
            toValue = fromValue * 914400d;
        } else if (mContext.getString(R.string.string_units_list_length_nanometer).equals(toUnit)) {
            toValue = fromValue * 914400000d;
        } else if (mContext.getString(R.string.string_units_list_length_mile).equals(toUnit)) {
            toValue = fromValue / 1760d;
        } else if (mContext.getString(R.string.string_units_list_length_yard).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_length_foot).equals(toUnit)) {
            toValue = fromValue * 3d;
        } else if (mContext.getString(R.string.string_units_list_length_inch).equals(toUnit)) {
            toValue = fromValue * 36d;
        } else if (mContext.getString(R.string.string_units_list_length_light_year).equals(toUnit)) {
            toValue = fromValue / 1.0346380656802E+16d;
        } else if (mContext.getString(R.string.string_units_list_length_exameter).equals(toUnit)) {
            toValue = fromValue / 1.0936132983377E+18d;
        } else if (mContext.getString(R.string.string_units_list_length_petameter).equals(toUnit)) {
            toValue = fromValue / 1.0936132983377E+15d;
        } else if (mContext.getString(R.string.string_units_list_length_terameter).equals(toUnit)) {
            toValue = fromValue / 1093613298337.7d;
        } else if (mContext.getString(R.string.string_units_list_length_gigameter).equals(toUnit)) {
            toValue = fromValue / 1093613298.3377d;
        } else if (mContext.getString(R.string.string_units_list_length_megameter).equals(toUnit)) {
            toValue = fromValue / 1093613.2983377d;
        } else if (mContext.getString(R.string.string_units_list_length_hectometer).equals(toUnit)) {
            toValue = fromValue / 109.3613298338d;
        } else if (mContext.getString(R.string.string_units_list_length_dekameter).equals(toUnit)) {
            toValue = fromValue / 10.9361329834d;
        } else if (mContext.getString(R.string.string_units_list_length_micron).equals(toUnit)) {
            toValue = fromValue * 914400d;
        } else if (mContext.getString(R.string.string_units_list_length_picometer).equals(toUnit)) {
            toValue = fromValue * 914400000000d;
        } else if (mContext.getString(R.string.string_units_list_length_femtometer).equals(toUnit)) {
            toValue = fromValue * 9.144E+14d;
        } else if (mContext.getString(R.string.string_units_list_length_attometer).equals(toUnit)) {
            toValue = fromValue * 9.144E+17d;
        } else if (mContext.getString(R.string.string_units_list_length_megaparsec).equals(toUnit)) {
            toValue = fromValue / 3.3745380372703E+22d;
        } else if (mContext.getString(R.string.string_units_list_length_kiloparsec).equals(toUnit)) {
            toValue = fromValue / 3.3745380372703E+19d;
        } else if (mContext.getString(R.string.string_units_list_length_parsec).equals(toUnit)) {
            toValue = fromValue / 3.3745380372703E+16d;
        } else if (mContext.getString(R.string.string_units_list_length_astronomical_unit).equals(toUnit)) {
            toValue = fromValue / 163602220790.68d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void lengthFoot() {
        if (mContext.getString(R.string.string_units_list_length_meter).equals(toUnit)) {
            toValue = fromValue / 3.280839895d;
        } else if (mContext.getString(R.string.string_units_list_length_kilometer).equals(toUnit)) {
            toValue = fromValue / 3280.8398950131d;
        } else if (mContext.getString(R.string.string_units_list_length_decimeter).equals(toUnit)) {
            toValue = fromValue * 3.048d;
        } else if (mContext.getString(R.string.string_units_list_length_centimeter).equals(toUnit)) {
            toValue = fromValue * 30.48d;
        } else if (mContext.getString(R.string.string_units_list_length_millimeter).equals(toUnit)) {
            toValue = fromValue * 304.8d;
        } else if (mContext.getString(R.string.string_units_list_length_micrometer).equals(toUnit)) {
            toValue = fromValue * 304800d;
        } else if (mContext.getString(R.string.string_units_list_length_nanometer).equals(toUnit)) {
            toValue = fromValue * 304800000d;
        } else if (mContext.getString(R.string.string_units_list_length_mile).equals(toUnit)) {
            toValue = fromValue / 5280d;
        } else if (mContext.getString(R.string.string_units_list_length_yard).equals(toUnit)) {
            toValue = fromValue / 3d;
        } else if (mContext.getString(R.string.string_units_list_length_foot).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_length_inch).equals(toUnit)) {
            toValue = fromValue * 12d;
        } else if (mContext.getString(R.string.string_units_list_length_light_year).equals(toUnit)) {
            toValue = fromValue / 3.1039141970407E+16d;
        } else if (mContext.getString(R.string.string_units_list_length_exameter).equals(toUnit)) {
            toValue = fromValue / 3.2808398950131E+18d;
        } else if (mContext.getString(R.string.string_units_list_length_petameter).equals(toUnit)) {
            toValue = fromValue / 3.2808398950131E+15d;
        } else if (mContext.getString(R.string.string_units_list_length_terameter).equals(toUnit)) {
            toValue = fromValue / 3280839895013.1d;
        } else if (mContext.getString(R.string.string_units_list_length_gigameter).equals(toUnit)) {
            toValue = fromValue / 3280839895.0131d;
        } else if (mContext.getString(R.string.string_units_list_length_megameter).equals(toUnit)) {
            toValue = fromValue / 3280839.8950131d;
        } else if (mContext.getString(R.string.string_units_list_length_hectometer).equals(toUnit)) {
            toValue = fromValue / 328.0839895013d;
        } else if (mContext.getString(R.string.string_units_list_length_dekameter).equals(toUnit)) {
            toValue = fromValue / 32.8083989501d;
        } else if (mContext.getString(R.string.string_units_list_length_micron).equals(toUnit)) {
            toValue = fromValue * 304800d;
        } else if (mContext.getString(R.string.string_units_list_length_picometer).equals(toUnit)) {
            toValue = fromValue * 304800000000d;
        } else if (mContext.getString(R.string.string_units_list_length_femtometer).equals(toUnit)) {
            toValue = fromValue * 3.048E+14d;
        } else if (mContext.getString(R.string.string_units_list_length_attometer).equals(toUnit)) {
            toValue = fromValue * 3.048E+17d;
        } else if (mContext.getString(R.string.string_units_list_length_megaparsec).equals(toUnit)) {
            toValue = fromValue / 1.0123614111811E+23d;
        } else if (mContext.getString(R.string.string_units_list_length_kiloparsec).equals(toUnit)) {
            toValue = fromValue / 1.0123614111811E+20d;
        } else if (mContext.getString(R.string.string_units_list_length_parsec).equals(toUnit)) {
            toValue = fromValue / 1.0123614111811E+17d;
        } else if (mContext.getString(R.string.string_units_list_length_astronomical_unit).equals(toUnit)) {
            toValue = fromValue / 490806662372.05d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void lengthInch() {
        if (mContext.getString(R.string.string_units_list_length_meter).equals(toUnit)) {
            toValue = fromValue / 39.3700787402d;
        } else if (mContext.getString(R.string.string_units_list_length_kilometer).equals(toUnit)) {
            toValue = fromValue / 39370.078740157d;
        } else if (mContext.getString(R.string.string_units_list_length_decimeter).equals(toUnit)) {
            toValue = fromValue / 3.937007874d;
        } else if (mContext.getString(R.string.string_units_list_length_centimeter).equals(toUnit)) {
            toValue = fromValue * 2.54d;
        } else if (mContext.getString(R.string.string_units_list_length_millimeter).equals(toUnit)) {
            toValue = fromValue * 25.4d;
        } else if (mContext.getString(R.string.string_units_list_length_micrometer).equals(toUnit)) {
            toValue = fromValue * 25400d;
        } else if (mContext.getString(R.string.string_units_list_length_nanometer).equals(toUnit)) {
            toValue = fromValue * 25400000d;
        } else if (mContext.getString(R.string.string_units_list_length_mile).equals(toUnit)) {
            toValue = fromValue * 63360d;
        } else if (mContext.getString(R.string.string_units_list_length_yard).equals(toUnit)) {
            toValue = fromValue * 36d;
        } else if (mContext.getString(R.string.string_units_list_length_foot).equals(toUnit)) {
            toValue = fromValue / 12d;
        } else if (mContext.getString(R.string.string_units_list_length_inch).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_length_light_year).equals(toUnit)) {
            toValue = fromValue / 3.7246970364488E+17d;
        } else if (mContext.getString(R.string.string_units_list_length_exameter).equals(toUnit)) {
            toValue = fromValue / 3.9370078740157E+19d;
        } else if (mContext.getString(R.string.string_units_list_length_petameter).equals(toUnit)) {
            toValue = fromValue / 3.9370078740157E+16d;
        } else if (mContext.getString(R.string.string_units_list_length_terameter).equals(toUnit)) {
            toValue = fromValue / 39370078740158d;
        } else if (mContext.getString(R.string.string_units_list_length_gigameter).equals(toUnit)) {
            toValue = fromValue / 39370078740.158d;
        } else if (mContext.getString(R.string.string_units_list_length_megameter).equals(toUnit)) {
            toValue = fromValue / 39370078.740157d;
        } else if (mContext.getString(R.string.string_units_list_length_hectometer).equals(toUnit)) {
            toValue = fromValue / 3937.0078740158d;
        } else if (mContext.getString(R.string.string_units_list_length_dekameter).equals(toUnit)) {
            toValue = fromValue / 393.7007874016d;
        } else if (mContext.getString(R.string.string_units_list_length_micron).equals(toUnit)) {
            toValue = fromValue * 25400d;
        } else if (mContext.getString(R.string.string_units_list_length_picometer).equals(toUnit)) {
            toValue = fromValue * 25400000000d;
        } else if (mContext.getString(R.string.string_units_list_length_femtometer).equals(toUnit)) {
            toValue = fromValue * 25400000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_attometer).equals(toUnit)) {
            toValue = fromValue * 2.54E+16d;
        } else if (mContext.getString(R.string.string_units_list_length_megaparsec).equals(toUnit)) {
            toValue = fromValue / 1.2148336934173E+24d;
        } else if (mContext.getString(R.string.string_units_list_length_kiloparsec).equals(toUnit)) {
            toValue = fromValue / 1.2148336934173E+21d;
        } else if (mContext.getString(R.string.string_units_list_length_parsec).equals(toUnit)) {
            toValue = fromValue / 1.2148336934173E+18d;
        } else if (mContext.getString(R.string.string_units_list_length_astronomical_unit).equals(toUnit)) {
            toValue = fromValue / 5889679948464.6d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void lengthLightYear() {
        if (mContext.getString(R.string.string_units_list_length_meter).equals(toUnit)) {
            toValue = fromValue * 9.46073047258E+15d;
        } else if (mContext.getString(R.string.string_units_list_length_kilometer).equals(toUnit)) {
            toValue = fromValue * 9460730472580d;
        } else if (mContext.getString(R.string.string_units_list_length_decimeter).equals(toUnit)) {
            toValue = fromValue * 9.46073047258E+16d;
        } else if (mContext.getString(R.string.string_units_list_length_centimeter).equals(toUnit)) {
            toValue = fromValue * 9.46073047258E+17d;
        } else if (mContext.getString(R.string.string_units_list_length_millimeter).equals(toUnit)) {
            toValue = fromValue * 9.46073047258E+18d;
        } else if (mContext.getString(R.string.string_units_list_length_micrometer).equals(toUnit)) {
            toValue = fromValue * 9.46073047258E+21d;
        } else if (mContext.getString(R.string.string_units_list_length_nanometer).equals(toUnit)) {
            toValue = fromValue * 9.46073047258E+24d;
        } else if (mContext.getString(R.string.string_units_list_length_mile).equals(toUnit)) {
            toValue = fromValue * 5878625373183.1d;
        } else if (mContext.getString(R.string.string_units_list_length_yard).equals(toUnit)) {
            toValue = fromValue * 1.0346380656802E+16d;
        } else if (mContext.getString(R.string.string_units_list_length_foot).equals(toUnit)) {
            toValue = fromValue * 3.1039141970407E+16d;
        } else if (mContext.getString(R.string.string_units_list_length_inch).equals(toUnit)) {
            toValue = fromValue * 3.7246970364488E+17d;
        } else if (mContext.getString(R.string.string_units_list_length_light_year).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_length_exameter).equals(toUnit)) {
            toValue = fromValue / 105.7000834025d;
        } else if (mContext.getString(R.string.string_units_list_length_petameter).equals(toUnit)) {
            toValue = fromValue * 9.4607304726d;
        } else if (mContext.getString(R.string.string_units_list_length_terameter).equals(toUnit)) {
            toValue = fromValue * 9460.73047258d;
        } else if (mContext.getString(R.string.string_units_list_length_gigameter).equals(toUnit)) {
            toValue = fromValue * 9460730.47258d;
        } else if (mContext.getString(R.string.string_units_list_length_megameter).equals(toUnit)) {
            toValue = fromValue * 9460730472.58d;
        } else if (mContext.getString(R.string.string_units_list_length_hectometer).equals(toUnit)) {
            toValue = fromValue * 94607304725800d;
        } else if (mContext.getString(R.string.string_units_list_length_dekameter).equals(toUnit)) {
            toValue = fromValue * 9.46073047258E+14d;
        } else if (mContext.getString(R.string.string_units_list_length_micron).equals(toUnit)) {
            toValue = fromValue * 9.46073047258E+21d;
        } else if (mContext.getString(R.string.string_units_list_length_picometer).equals(toUnit)) {
            toValue = fromValue * 9.46073047258E+27d;
        } else if (mContext.getString(R.string.string_units_list_length_femtometer).equals(toUnit)) {
            toValue = fromValue * 9.46073047258E+30d;
        } else if (mContext.getString(R.string.string_units_list_length_attometer).equals(toUnit)) {
            toValue = fromValue * 9.46073047258E+33d;
        } else if (mContext.getString(R.string.string_units_list_length_megaparsec).equals(toUnit)) {
            toValue = fromValue / 3261563.7769443d;
        } else if (mContext.getString(R.string.string_units_list_length_kiloparsec).equals(toUnit)) {
            toValue = fromValue / 3261.5637769443d;
        } else if (mContext.getString(R.string.string_units_list_length_parsec).equals(toUnit)) {
            toValue = fromValue / 3.2615637769d;
        } else if (mContext.getString(R.string.string_units_list_length_astronomical_unit).equals(toUnit)) {
            toValue = fromValue * 63241.077088066d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void lengthExameter() {
        if (mContext.getString(R.string.string_units_list_length_meter).equals(toUnit)) {
            toValue = fromValue * 1.0E+18d;
        } else if (mContext.getString(R.string.string_units_list_length_kilometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+15d;
        } else if (mContext.getString(R.string.string_units_list_length_decimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+19d;
        } else if (mContext.getString(R.string.string_units_list_length_centimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+20d;
        } else if (mContext.getString(R.string.string_units_list_length_millimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+21d;
        } else if (mContext.getString(R.string.string_units_list_length_micrometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+24d;
        } else if (mContext.getString(R.string.string_units_list_length_nanometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+27d;
        } else if (mContext.getString(R.string.string_units_list_length_mile).equals(toUnit)) {
            toValue = fromValue * 6.2137119223733E+14d;
        } else if (mContext.getString(R.string.string_units_list_length_yard).equals(toUnit)) {
            toValue = fromValue * 1.0936132983377E+18d;
        } else if (mContext.getString(R.string.string_units_list_length_foot).equals(toUnit)) {
            toValue = fromValue * 3.2808398950131E+18d;
        } else if (mContext.getString(R.string.string_units_list_length_inch).equals(toUnit)) {
            toValue = fromValue * 3.9370078740157E+19d;
        } else if (mContext.getString(R.string.string_units_list_length_light_year).equals(toUnit)) {
            toValue = fromValue * 105.7000834025d;
        } else if (mContext.getString(R.string.string_units_list_length_exameter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_length_petameter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_length_terameter).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_length_gigameter).equals(toUnit)) {
            toValue = fromValue * 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_megameter).equals(toUnit)) {
            toValue = fromValue * 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_hectometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+16d;
        } else if (mContext.getString(R.string.string_units_list_length_dekameter).equals(toUnit)) {
            toValue = fromValue * 1.0E+17d;
        } else if (mContext.getString(R.string.string_units_list_length_micron).equals(toUnit)) {
            toValue = fromValue * 1.0E+24d;
        } else if (mContext.getString(R.string.string_units_list_length_picometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+30d;
        } else if (mContext.getString(R.string.string_units_list_length_femtometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+33d;
        } else if (mContext.getString(R.string.string_units_list_length_attometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+36d;
        } else if (mContext.getString(R.string.string_units_list_length_megaparsec).equals(toUnit)) {
            toValue = fromValue / 30856.7758128d;
        } else if (mContext.getString(R.string.string_units_list_length_kiloparsec).equals(toUnit)) {
            toValue = fromValue / 30.8567758128d;
        } else if (mContext.getString(R.string.string_units_list_length_parsec).equals(toUnit)) {
            toValue = fromValue * 32.4077928967d;
        } else if (mContext.getString(R.string.string_units_list_length_astronomical_unit).equals(toUnit)) {
            toValue = fromValue * 6684587.1226706d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void lengthPetameter() {
        if (mContext.getString(R.string.string_units_list_length_meter).equals(toUnit)) {
            toValue = fromValue * 1.0E+15d;
        } else if (mContext.getString(R.string.string_units_list_length_kilometer).equals(toUnit)) {
            toValue = fromValue * 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_decimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+16d;
        } else if (mContext.getString(R.string.string_units_list_length_centimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+17d;
        } else if (mContext.getString(R.string.string_units_list_length_millimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+18d;
        } else if (mContext.getString(R.string.string_units_list_length_micrometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+15d;
        } else if (mContext.getString(R.string.string_units_list_length_nanometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+24d;
        } else if (mContext.getString(R.string.string_units_list_length_mile).equals(toUnit)) {
            toValue = fromValue * 621371192237.33d;
        } else if (mContext.getString(R.string.string_units_list_length_yard).equals(toUnit)) {
            toValue = fromValue * 1.0936132983377E+15d;
        } else if (mContext.getString(R.string.string_units_list_length_foot).equals(toUnit)) {
            toValue = fromValue * 3.2808398950131E+15d;
        } else if (mContext.getString(R.string.string_units_list_length_inch).equals(toUnit)) {
            toValue = fromValue * 3.9370078740157E+16d;
        } else if (mContext.getString(R.string.string_units_list_length_light_year).equals(toUnit)) {
            toValue = fromValue / 9.4607304726d;
        } else if (mContext.getString(R.string.string_units_list_length_exameter).equals(toUnit)) {
            toValue = fromValue / 1000d;
        } else if (mContext.getString(R.string.string_units_list_length_petameter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_length_terameter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_length_gigameter).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_length_megameter).equals(toUnit)) {
            toValue = fromValue * 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_hectometer).equals(toUnit)) {
            toValue = fromValue * 10000000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_dekameter).equals(toUnit)) {
            toValue = fromValue * 1.0E+14d;
        } else if (mContext.getString(R.string.string_units_list_length_micron).equals(toUnit)) {
            toValue = fromValue * 1.0E+21d;
        } else if (mContext.getString(R.string.string_units_list_length_picometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+27d;
        } else if (mContext.getString(R.string.string_units_list_length_femtometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+30d;
        } else if (mContext.getString(R.string.string_units_list_length_attometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+33d;
        } else if (mContext.getString(R.string.string_units_list_length_megaparsec).equals(toUnit)) {
            toValue = fromValue / 30856775.8128d;
        } else if (mContext.getString(R.string.string_units_list_length_kiloparsec).equals(toUnit)) {
            toValue = fromValue / 30856.7758128d;
        } else if (mContext.getString(R.string.string_units_list_length_parsec).equals(toUnit)) {
            toValue = fromValue / 30.8567758128d;
        } else if (mContext.getString(R.string.string_units_list_length_astronomical_unit).equals(toUnit)) {
            toValue = fromValue * 6684.5871226706d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void lengthTerameter() {
        if (mContext.getString(R.string.string_units_list_length_meter).equals(toUnit)) {
            toValue = fromValue * 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_kilometer).equals(toUnit)) {
            toValue = fromValue * 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_decimeter).equals(toUnit)) {
            toValue = fromValue * 10000000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_centimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+14d;
        } else if (mContext.getString(R.string.string_units_list_length_millimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+15d;
        } else if (mContext.getString(R.string.string_units_list_length_micrometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+18d;
        } else if (mContext.getString(R.string.string_units_list_length_nanometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+21d;
        } else if (mContext.getString(R.string.string_units_list_length_mile).equals(toUnit)) {
            toValue = fromValue * 621371192.23733d;
        } else if (mContext.getString(R.string.string_units_list_length_yard).equals(toUnit)) {
            toValue = fromValue * 1093613298337.7d;
        } else if (mContext.getString(R.string.string_units_list_length_foot).equals(toUnit)) {
            toValue = fromValue * 3280839895013.1d;
        } else if (mContext.getString(R.string.string_units_list_length_inch).equals(toUnit)) {
            toValue = fromValue * 39370078740158d;
        } else if (mContext.getString(R.string.string_units_list_length_light_year).equals(toUnit)) {
            toValue = fromValue / 9460.73047258d;
        } else if (mContext.getString(R.string.string_units_list_length_exameter).equals(toUnit)) {
            toValue = fromValue / 1000000d;
        } else if (mContext.getString(R.string.string_units_list_length_petameter).equals(toUnit)) {
            toValue = fromValue / 1000d;
        } else if (mContext.getString(R.string.string_units_list_length_terameter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_length_gigameter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_length_megameter).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_length_hectometer).equals(toUnit)) {
            toValue = fromValue * 10000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_dekameter).equals(toUnit)) {
            toValue = fromValue * 100000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_micron).equals(toUnit)) {
            toValue = fromValue * 1.0E+18d;
        } else if (mContext.getString(R.string.string_units_list_length_picometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+24d;
        } else if (mContext.getString(R.string.string_units_list_length_femtometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+27d;
        } else if (mContext.getString(R.string.string_units_list_length_attometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+30d;
        } else if (mContext.getString(R.string.string_units_list_length_megaparsec).equals(toUnit)) {
            toValue = fromValue * 3.2407792896664E-11d;
        } else if (mContext.getString(R.string.string_units_list_length_kiloparsec).equals(toUnit)) {
            toValue = fromValue * 3.2407792896664E-8d;
        } else if (mContext.getString(R.string.string_units_list_length_parsec).equals(toUnit)) {
            toValue = fromValue * 3.24078E-5d;
        } else if (mContext.getString(R.string.string_units_list_length_astronomical_unit).equals(toUnit)) {
            toValue = fromValue * 6.6845871227d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void lengthGigameter() {
        if (mContext.getString(R.string.string_units_list_length_meter).equals(toUnit)) {
            toValue = fromValue * 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_kilometer).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_length_decimeter).equals(toUnit)) {
            toValue = fromValue * 10000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_centimeter).equals(toUnit)) {
            toValue = fromValue * 100000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_millimeter).equals(toUnit)) {
            toValue = fromValue * 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_micrometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+15d;
        } else if (mContext.getString(R.string.string_units_list_length_nanometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+18d;
        } else if (mContext.getString(R.string.string_units_list_length_mile).equals(toUnit)) {
            toValue = fromValue * 621371.19223733d;
        } else if (mContext.getString(R.string.string_units_list_length_yard).equals(toUnit)) {
            toValue = fromValue * 1093613298.3377d;
        } else if (mContext.getString(R.string.string_units_list_length_foot).equals(toUnit)) {
            toValue = fromValue * 3280839895.0131d;
        } else if (mContext.getString(R.string.string_units_list_length_inch).equals(toUnit)) {
            toValue = fromValue * 39370078740.158d;
        } else if (mContext.getString(R.string.string_units_list_length_light_year).equals(toUnit)) {
            toValue = fromValue * 1.0570008340247E-7d;
        } else if (mContext.getString(R.string.string_units_list_length_exameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_length_petameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_length_terameter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_length_gigameter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_length_megameter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_length_hectometer).equals(toUnit)) {
            toValue = fromValue * 10000000d;
        } else if (mContext.getString(R.string.string_units_list_length_dekameter).equals(toUnit)) {
            toValue = fromValue * 100000000d;
        } else if (mContext.getString(R.string.string_units_list_length_micron).equals(toUnit)) {
            toValue = fromValue * 1.0E+15d;
        } else if (mContext.getString(R.string.string_units_list_length_picometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+21d;
        } else if (mContext.getString(R.string.string_units_list_length_femtometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+24d;
        } else if (mContext.getString(R.string.string_units_list_length_attometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+27d;
        } else if (mContext.getString(R.string.string_units_list_length_megaparsec).equals(toUnit)) {
            toValue = fromValue * 3.2407792896664E-14d;
        } else if (mContext.getString(R.string.string_units_list_length_kiloparsec).equals(toUnit)) {
            toValue = fromValue * 3.2407792896664E-11d;
        } else if (mContext.getString(R.string.string_units_list_length_parsec).equals(toUnit)) {
            toValue = fromValue * 3.2407792896664E-8d;
        } else if (mContext.getString(R.string.string_units_list_length_astronomical_unit).equals(toUnit)) {
            toValue = fromValue * 0.0066845871d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void lengthMegameter() {
        if (mContext.getString(R.string.string_units_list_length_meter).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_length_kilometer).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_length_decimeter).equals(toUnit)) {
            toValue = fromValue * 10000000d;
        } else if (mContext.getString(R.string.string_units_list_length_centimeter).equals(toUnit)) {
            toValue = fromValue * 100000000d;
        } else if (mContext.getString(R.string.string_units_list_length_millimeter).equals(toUnit)) {
            toValue = fromValue * 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_micrometer).equals(toUnit)) {
            toValue = fromValue * 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_nanometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+15d;
        } else if (mContext.getString(R.string.string_units_list_length_mile).equals(toUnit)) {
            toValue = fromValue * 621.3711922373d;
        } else if (mContext.getString(R.string.string_units_list_length_yard).equals(toUnit)) {
            toValue = fromValue * 1093613.2983377d;
        } else if (mContext.getString(R.string.string_units_list_length_foot).equals(toUnit)) {
            toValue = fromValue * 3280839.8950131d;
        } else if (mContext.getString(R.string.string_units_list_length_inch).equals(toUnit)) {
            toValue = fromValue * 39370078.740157d;
        } else if (mContext.getString(R.string.string_units_list_length_light_year).equals(toUnit)) {
            toValue = fromValue * 1.0570008340247E-10d;
        } else if (mContext.getString(R.string.string_units_list_length_exameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_length_petameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_length_terameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_length_gigameter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_length_megameter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_length_hectometer).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_length_dekameter).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_length_micron).equals(toUnit)) {
            toValue = fromValue * 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_picometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+18d;
        } else if (mContext.getString(R.string.string_units_list_length_femtometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+21d;
        } else if (mContext.getString(R.string.string_units_list_length_attometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+24d;
        } else if (mContext.getString(R.string.string_units_list_length_megaparsec).equals(toUnit)) {
            toValue = fromValue * 3.2407792896664E-17d;
        } else if (mContext.getString(R.string.string_units_list_length_kiloparsec).equals(toUnit)) {
            toValue = fromValue * 3.2407792896664E-14d;
        } else if (mContext.getString(R.string.string_units_list_length_parsec).equals(toUnit)) {
            toValue = fromValue * 3.2407792896664E-11d;
        } else if (mContext.getString(R.string.string_units_list_length_astronomical_unit).equals(toUnit)) {
            toValue = fromValue * 6.6845871226706E-6d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void lengthHectometer() {
        if (mContext.getString(R.string.string_units_list_length_meter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_length_kilometer).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_length_decimeter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_length_centimeter).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_length_millimeter).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_length_micrometer).equals(toUnit)) {
            toValue = fromValue * 100000000d;
        } else if (mContext.getString(R.string.string_units_list_length_nanometer).equals(toUnit)) {
            toValue = fromValue * 100000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_mile).equals(toUnit)) {
            toValue = fromValue * 0.0621371192d;
        } else if (mContext.getString(R.string.string_units_list_length_yard).equals(toUnit)) {
            toValue = fromValue * 109.3613298338d;
        } else if (mContext.getString(R.string.string_units_list_length_foot).equals(toUnit)) {
            toValue = fromValue * 328.0839895013d;
        } else if (mContext.getString(R.string.string_units_list_length_inch).equals(toUnit)) {
            toValue = fromValue * 3937.0078740158d;
        } else if (mContext.getString(R.string.string_units_list_length_light_year).equals(toUnit)) {
            toValue = fromValue * 1.0570008340247E-14d;
        } else if (mContext.getString(R.string.string_units_list_length_exameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-16d;
        } else if (mContext.getString(R.string.string_units_list_length_petameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-13d;
        } else if (mContext.getString(R.string.string_units_list_length_terameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-10d;
        } else if (mContext.getString(R.string.string_units_list_length_gigameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-7d;
        } else if (mContext.getString(R.string.string_units_list_length_megameter).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_length_hectometer).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_length_dekameter).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_length_micron).equals(toUnit)) {
            toValue = fromValue * 100000000d;
        } else if (mContext.getString(R.string.string_units_list_length_picometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+14d;
        } else if (mContext.getString(R.string.string_units_list_length_femtometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+17d;
        } else if (mContext.getString(R.string.string_units_list_length_attometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+20d;
        } else if (mContext.getString(R.string.string_units_list_length_megaparsec).equals(toUnit)) {
            toValue = fromValue * 3.2407792896664E-21d;
        } else if (mContext.getString(R.string.string_units_list_length_kiloparsec).equals(toUnit)) {
            toValue = fromValue * 3.2407792896664E-18d;
        } else if (mContext.getString(R.string.string_units_list_length_parsec).equals(toUnit)) {
            toValue = fromValue * 3.2407792896664E-15d;
        } else if (mContext.getString(R.string.string_units_list_length_astronomical_unit).equals(toUnit)) {
            toValue = fromValue * 6.6845871226706E-10d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void lengthDekameter() {
        if (mContext.getString(R.string.string_units_list_length_meter).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_length_kilometer).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_length_decimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_length_centimeter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_length_millimeter).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_length_micrometer).equals(toUnit)) {
            toValue = fromValue * 10000000d;
        } else if (mContext.getString(R.string.string_units_list_length_nanometer).equals(toUnit)) {
            toValue = fromValue * 10000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_mile).equals(toUnit)) {
            toValue = fromValue * 0.0062137119d;
        } else if (mContext.getString(R.string.string_units_list_length_yard).equals(toUnit)) {
            toValue = fromValue * 10.9361329834d;
        } else if (mContext.getString(R.string.string_units_list_length_foot).equals(toUnit)) {
            toValue = fromValue * 32.8083989501d;
        } else if (mContext.getString(R.string.string_units_list_length_inch).equals(toUnit)) {
            toValue = fromValue * 393.7007874016d;
        } else if (mContext.getString(R.string.string_units_list_length_light_year).equals(toUnit)) {
            toValue = fromValue * 1.0570008340247E-15d;
        } else if (mContext.getString(R.string.string_units_list_length_exameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-17d;
        } else if (mContext.getString(R.string.string_units_list_length_petameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-14d;
        } else if (mContext.getString(R.string.string_units_list_length_terameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-11d;
        } else if (mContext.getString(R.string.string_units_list_length_gigameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-8d;
        } else if (mContext.getString(R.string.string_units_list_length_megameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-5d;
        } else if (mContext.getString(R.string.string_units_list_length_hectometer).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_length_dekameter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_length_micron).equals(toUnit)) {
            toValue = fromValue * 10000000d;
        } else if (mContext.getString(R.string.string_units_list_length_picometer).equals(toUnit)) {
            toValue = fromValue * 10000000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_femtometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+16d;
        } else if (mContext.getString(R.string.string_units_list_length_attometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+19d;
        } else if (mContext.getString(R.string.string_units_list_length_megaparsec).equals(toUnit)) {
            toValue = fromValue * 3.2407792896664E-22d;
        } else if (mContext.getString(R.string.string_units_list_length_kiloparsec).equals(toUnit)) {
            toValue = fromValue * 3.2407792896664E-19d;
        } else if (mContext.getString(R.string.string_units_list_length_parsec).equals(toUnit)) {
            toValue = fromValue * 3.2407792896664E-16d;
        } else if (mContext.getString(R.string.string_units_list_length_astronomical_unit).equals(toUnit)) {
            toValue = fromValue * 6.6845871226706E-11d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void lengthMicron() {
        if (mContext.getString(R.string.string_units_list_length_meter).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_length_kilometer).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_length_decimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E-5d;
        } else if (mContext.getString(R.string.string_units_list_length_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_length_millimeter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_length_micrometer).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_length_nanometer).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_length_mile).equals(toUnit)) {
            toValue = fromValue * 6.2137119223733E-10d;
        } else if (mContext.getString(R.string.string_units_list_length_yard).equals(toUnit)) {
            toValue = fromValue * 1.0936132983377E-6d;
        } else if (mContext.getString(R.string.string_units_list_length_foot).equals(toUnit)) {
            toValue = fromValue * 3.2808398950131E-6d;
        } else if (mContext.getString(R.string.string_units_list_length_inch).equals(toUnit)) {
            toValue = fromValue * 3.93701E-5d;
        } else if (mContext.getString(R.string.string_units_list_length_light_year).equals(toUnit)) {
            toValue = fromValue * 1.0570008340247E-22d;
        } else if (mContext.getString(R.string.string_units_list_length_exameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-24d;
        } else if (mContext.getString(R.string.string_units_list_length_petameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-24d;
        } else if (mContext.getString(R.string.string_units_list_length_terameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-18d;
        } else if (mContext.getString(R.string.string_units_list_length_gigameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-15d;
        } else if (mContext.getString(R.string.string_units_list_length_megameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_length_hectometer).equals(toUnit)) {
            toValue = fromValue * 1.0E-8d;
        } else if (mContext.getString(R.string.string_units_list_length_dekameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-7d;
        } else if (mContext.getString(R.string.string_units_list_length_micron).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_length_picometer).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_length_femtometer).equals(toUnit)) {
            toValue = fromValue * 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_attometer).equals(toUnit)) {
            toValue = fromValue * 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_length_megaparsec).equals(toUnit)) {
            toValue = fromValue * 3.2407792896664E-29d;
        } else if (mContext.getString(R.string.string_units_list_length_kiloparsec).equals(toUnit)) {
            toValue = fromValue * 3.2407792896664E-26d;
        } else if (mContext.getString(R.string.string_units_list_length_parsec).equals(toUnit)) {
            toValue = fromValue * 3.2407792896664E-23d;
        } else if (mContext.getString(R.string.string_units_list_length_astronomical_unit).equals(toUnit)) {
            toValue = fromValue * 6.6845871226706E-18d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void lengthPicometer() {
        if (mContext.getString(R.string.string_units_list_length_meter).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_length_kilometer).equals(toUnit)) {
            toValue = fromValue * 1.0E-15d;
        } else if (mContext.getString(R.string.string_units_list_length_decimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E-11d;
        } else if (mContext.getString(R.string.string_units_list_length_centimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E-10d;
        } else if (mContext.getString(R.string.string_units_list_length_millimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_length_micrometer).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_length_nanometer).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_length_mile).equals(toUnit)) {
            toValue = fromValue * 6.2137119223733E-16d;
        } else if (mContext.getString(R.string.string_units_list_length_yard).equals(toUnit)) {
            toValue = fromValue * 1.0936132983377E-12d;
        } else if (mContext.getString(R.string.string_units_list_length_foot).equals(toUnit)) {
            toValue = fromValue * 3.2808398950131E-12d;
        } else if (mContext.getString(R.string.string_units_list_length_inch).equals(toUnit)) {
            toValue = fromValue * 3.9370078740157E-11d;
        } else if (mContext.getString(R.string.string_units_list_length_light_year).equals(toUnit)) {
            toValue = fromValue * 1.0570008340247E-28d;
        } else if (mContext.getString(R.string.string_units_list_length_exameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-30d;
        } else if (mContext.getString(R.string.string_units_list_length_petameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-27d;
        } else if (mContext.getString(R.string.string_units_list_length_terameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-24d;
        } else if (mContext.getString(R.string.string_units_list_length_gigameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-21d;
        } else if (mContext.getString(R.string.string_units_list_length_megameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-18d;
        } else if (mContext.getString(R.string.string_units_list_length_hectometer).equals(toUnit)) {
            toValue = fromValue * 1.0E-14d;
        } else if (mContext.getString(R.string.string_units_list_length_dekameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-13d;
        } else if (mContext.getString(R.string.string_units_list_length_micron).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_length_picometer).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_length_femtometer).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_length_attometer).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_length_megaparsec).equals(toUnit)) {
            toValue = fromValue * 3.2407792896664E-35d;
        } else if (mContext.getString(R.string.string_units_list_length_kiloparsec).equals(toUnit)) {
            toValue = fromValue * 3.2407792896664E-32d;
        } else if (mContext.getString(R.string.string_units_list_length_parsec).equals(toUnit)) {
            toValue = fromValue * 3.2407792896664E-29d;
        } else if (mContext.getString(R.string.string_units_list_length_astronomical_unit).equals(toUnit)) {
            toValue = fromValue * 6.6845871226706E-24d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void lengthFemtometer() {
        if (mContext.getString(R.string.string_units_list_length_meter).equals(toUnit)) {
            toValue = fromValue * 1.0E-15d;
        } else if (mContext.getString(R.string.string_units_list_length_kilometer).equals(toUnit)) {
            toValue = fromValue * 1.0E-18d;
        } else if (mContext.getString(R.string.string_units_list_length_decimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E-14d;
        } else if (mContext.getString(R.string.string_units_list_length_centimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E-13d;
        } else if (mContext.getString(R.string.string_units_list_length_millimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_length_micrometer).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_length_nanometer).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_length_mile).equals(toUnit)) {
            toValue = fromValue * 6.2137119223733E-19d;
        } else if (mContext.getString(R.string.string_units_list_length_yard).equals(toUnit)) {
            toValue = fromValue * 1.0936132983377E-15d;
        } else if (mContext.getString(R.string.string_units_list_length_foot).equals(toUnit)) {
            toValue = fromValue * 3.2808398950131E-15d;
        } else if (mContext.getString(R.string.string_units_list_length_inch).equals(toUnit)) {
            toValue = fromValue * 3.9370078740158E-14d;
        } else if (mContext.getString(R.string.string_units_list_length_light_year).equals(toUnit)) {
            toValue = fromValue * 1.0570008340247E-31d;
        } else if (mContext.getString(R.string.string_units_list_length_exameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-33d;
        } else if (mContext.getString(R.string.string_units_list_length_petameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-30d;
        } else if (mContext.getString(R.string.string_units_list_length_terameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-27d;
        } else if (mContext.getString(R.string.string_units_list_length_gigameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-24d;
        } else if (mContext.getString(R.string.string_units_list_length_megameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-21d;
        } else if (mContext.getString(R.string.string_units_list_length_hectometer).equals(toUnit)) {
            toValue = fromValue * 1.0E-17d;
        } else if (mContext.getString(R.string.string_units_list_length_dekameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-16d;
        } else if (mContext.getString(R.string.string_units_list_length_micron).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_length_picometer).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_length_femtometer).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_length_attometer).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_length_megaparsec).equals(toUnit)) {
            toValue = fromValue * 3.2407792896664E-38d;
        } else if (mContext.getString(R.string.string_units_list_length_kiloparsec).equals(toUnit)) {
            toValue = fromValue * 3.2407792896664E-35d;
        } else if (mContext.getString(R.string.string_units_list_length_parsec).equals(toUnit)) {
            toValue = fromValue * 3.2407792896664E-32d;
        } else if (mContext.getString(R.string.string_units_list_length_astronomical_unit).equals(toUnit)) {
            toValue = fromValue * 6.6845871226706E-27d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void lengthAttometer() {
        if (mContext.getString(R.string.string_units_list_length_meter).equals(toUnit)) {
            toValue = fromValue * 1.0E-18d;
        } else if (mContext.getString(R.string.string_units_list_length_kilometer).equals(toUnit)) {
            toValue = fromValue * 1.0E-21d;
        } else if (mContext.getString(R.string.string_units_list_length_decimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E-17d;
        } else if (mContext.getString(R.string.string_units_list_length_centimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E-16d;
        } else if (mContext.getString(R.string.string_units_list_length_millimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E-15d;
        } else if (mContext.getString(R.string.string_units_list_length_micrometer).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_length_nanometer).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_length_mile).equals(toUnit)) {
            toValue = fromValue * 6.2137119223733E-22d;
        } else if (mContext.getString(R.string.string_units_list_length_yard).equals(toUnit)) {
            toValue = fromValue * 1.0936132983377E-18d;
        } else if (mContext.getString(R.string.string_units_list_length_foot).equals(toUnit)) {
            toValue = fromValue * 3.2808398950131E-18d;
        } else if (mContext.getString(R.string.string_units_list_length_inch).equals(toUnit)) {
            toValue = fromValue * 3.9370078740158E-17d;
        } else if (mContext.getString(R.string.string_units_list_length_light_year).equals(toUnit)) {
            toValue = fromValue * 1.0570008340247E-34d;
        } else if (mContext.getString(R.string.string_units_list_length_exameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-36d;
        } else if (mContext.getString(R.string.string_units_list_length_petameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-33d;
        } else if (mContext.getString(R.string.string_units_list_length_terameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-30d;
        } else if (mContext.getString(R.string.string_units_list_length_gigameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-27d;
        } else if (mContext.getString(R.string.string_units_list_length_megameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-24d;
        } else if (mContext.getString(R.string.string_units_list_length_hectometer).equals(toUnit)) {
            toValue = fromValue * 1.0E-20d;
        } else if (mContext.getString(R.string.string_units_list_length_dekameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-19d;
        } else if (mContext.getString(R.string.string_units_list_length_micron).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_length_picometer).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_length_femtometer).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_length_attometer).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_length_megaparsec).equals(toUnit)) {
            toValue = fromValue * 3.2407792896664E-41d;
        } else if (mContext.getString(R.string.string_units_list_length_kiloparsec).equals(toUnit)) {
            toValue = fromValue * 3.2407792896664E-38d;
        } else if (mContext.getString(R.string.string_units_list_length_parsec).equals(toUnit)) {
            toValue = fromValue * 3.2407792896664E-35d;
        } else if (mContext.getString(R.string.string_units_list_length_astronomical_unit).equals(toUnit)) {
            toValue = fromValue * 6.6845871226706E-30d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void lengthMegaparsec() {
        if (mContext.getString(R.string.string_units_list_length_meter).equals(toUnit)) {
            toValue = fromValue * 3.08567758128E+22d;
        } else if (mContext.getString(R.string.string_units_list_length_kilometer).equals(toUnit)) {
            toValue = fromValue * 3.08567758128E+19d;
        } else if (mContext.getString(R.string.string_units_list_length_decimeter).equals(toUnit)) {
            toValue = fromValue * 3.08567758128E+23d;
        } else if (mContext.getString(R.string.string_units_list_length_centimeter).equals(toUnit)) {
            toValue = fromValue * 3.08567758128E+24d;
        } else if (mContext.getString(R.string.string_units_list_length_millimeter).equals(toUnit)) {
            toValue = fromValue * 3.08567758128E+25d;
        } else if (mContext.getString(R.string.string_units_list_length_micrometer).equals(toUnit)) {
            toValue = fromValue * 3.08567758128E+28d;
        } else if (mContext.getString(R.string.string_units_list_length_nanometer).equals(toUnit)) {
            toValue = fromValue * 3.08567758128E+31d;
        } else if (mContext.getString(R.string.string_units_list_length_mile).equals(toUnit)) {
            toValue = fromValue * 1.91735115754E+19d;
        } else if (mContext.getString(R.string.string_units_list_length_yard).equals(toUnit)) {
            toValue = fromValue * 3.3745380372703E+22d;
        } else if (mContext.getString(R.string.string_units_list_length_foot).equals(toUnit)) {
            toValue = fromValue * 1.0123614111811E+23d;
        } else if (mContext.getString(R.string.string_units_list_length_inch).equals(toUnit)) {
            toValue = fromValue * 1.2148336934173E+24d;
        } else if (mContext.getString(R.string.string_units_list_length_light_year).equals(toUnit)) {
            toValue = fromValue * 3261563.7769443d;
        } else if (mContext.getString(R.string.string_units_list_length_exameter).equals(toUnit)) {
            toValue = fromValue * 30856.7758128d;
        } else if (mContext.getString(R.string.string_units_list_length_petameter).equals(toUnit)) {
            toValue = fromValue * 30856775.8128d;
        } else if (mContext.getString(R.string.string_units_list_length_terameter).equals(toUnit)) {
            toValue = fromValue * 30856775812.8d;
        } else if (mContext.getString(R.string.string_units_list_length_gigameter).equals(toUnit)) {
            toValue = fromValue * 30856775812800d;
        } else if (mContext.getString(R.string.string_units_list_length_megameter).equals(toUnit)) {
            toValue = fromValue * 3.08567758128E+16d;
        } else if (mContext.getString(R.string.string_units_list_length_hectometer).equals(toUnit)) {
            toValue = fromValue * 3.08567758128E+20d;
        } else if (mContext.getString(R.string.string_units_list_length_dekameter).equals(toUnit)) {
            toValue = fromValue * 3.08567758128E+21d;
        } else if (mContext.getString(R.string.string_units_list_length_micron).equals(toUnit)) {
            toValue = fromValue * 3.08567758128E+28d;
        } else if (mContext.getString(R.string.string_units_list_length_picometer).equals(toUnit)) {
            toValue = fromValue * 3.08567758128E+34d;
        } else if (mContext.getString(R.string.string_units_list_length_femtometer).equals(toUnit)) {
            toValue = fromValue * 3.08567758128E+37d;
        } else if (mContext.getString(R.string.string_units_list_length_attometer).equals(toUnit)) {
            toValue = fromValue * 3.08567758128E+40d;
        } else if (mContext.getString(R.string.string_units_list_length_megaparsec).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_length_kiloparsec).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_length_parsec).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_length_astronomical_unit).equals(toUnit)) {
            toValue = fromValue * 206264806245.38d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void lengthKiloparsec() {
        if (mContext.getString(R.string.string_units_list_length_meter).equals(toUnit)) {
            toValue = fromValue * 3.08567758128E+19d;
        } else if (mContext.getString(R.string.string_units_list_length_kilometer).equals(toUnit)) {
            toValue = fromValue * 3.08567758128E+16d;
        } else if (mContext.getString(R.string.string_units_list_length_decimeter).equals(toUnit)) {
            toValue = fromValue * 3.08567758128E+20d;
        } else if (mContext.getString(R.string.string_units_list_length_centimeter).equals(toUnit)) {
            toValue = fromValue * 3.08567758128E+21d;
        } else if (mContext.getString(R.string.string_units_list_length_millimeter).equals(toUnit)) {
            toValue = fromValue * 3.08567758128E+22d;
        } else if (mContext.getString(R.string.string_units_list_length_micrometer).equals(toUnit)) {
            toValue = fromValue * 3.08567758128E+25d;
        } else if (mContext.getString(R.string.string_units_list_length_nanometer).equals(toUnit)) {
            toValue = fromValue * 3.08567758128E+28d;
        } else if (mContext.getString(R.string.string_units_list_length_mile).equals(toUnit)) {
            toValue = fromValue * 1.91735115754E+16d;
        } else if (mContext.getString(R.string.string_units_list_length_yard).equals(toUnit)) {
            toValue = fromValue * 3.3745380372703E+19d;
        } else if (mContext.getString(R.string.string_units_list_length_foot).equals(toUnit)) {
            toValue = fromValue * 1.0123614111811E+20d;
        } else if (mContext.getString(R.string.string_units_list_length_inch).equals(toUnit)) {
            toValue = fromValue * 1.2148336934173E+21d;
        } else if (mContext.getString(R.string.string_units_list_length_light_year).equals(toUnit)) {
            toValue = fromValue * 3261.5637769443d;
        } else if (mContext.getString(R.string.string_units_list_length_exameter).equals(toUnit)) {
            toValue = fromValue * 30.8567758128d;
        } else if (mContext.getString(R.string.string_units_list_length_petameter).equals(toUnit)) {
            toValue = fromValue * 30856.7758128d;
        } else if (mContext.getString(R.string.string_units_list_length_terameter).equals(toUnit)) {
            toValue = fromValue * 30856775.8128d;
        } else if (mContext.getString(R.string.string_units_list_length_gigameter).equals(toUnit)) {
            toValue = fromValue * 30856775812.8d;
        } else if (mContext.getString(R.string.string_units_list_length_megameter).equals(toUnit)) {
            toValue = fromValue * 30856775812800d;
        } else if (mContext.getString(R.string.string_units_list_length_hectometer).equals(toUnit)) {
            toValue = fromValue * 3.08567758128E+17d;
        } else if (mContext.getString(R.string.string_units_list_length_dekameter).equals(toUnit)) {
            toValue = fromValue * 3.08567758128E+18d;
        } else if (mContext.getString(R.string.string_units_list_length_micron).equals(toUnit)) {
            toValue = fromValue * 3.08567758128E+25d;
        } else if (mContext.getString(R.string.string_units_list_length_picometer).equals(toUnit)) {
            toValue = fromValue * 3.08567758128E+31d;
        } else if (mContext.getString(R.string.string_units_list_length_femtometer).equals(toUnit)) {
            toValue = fromValue * 3.08567758128E+34d;
        } else if (mContext.getString(R.string.string_units_list_length_attometer).equals(toUnit)) {
            toValue = fromValue * 3.08567758128E+37d;
        } else if (mContext.getString(R.string.string_units_list_length_megaparsec).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_length_kiloparsec).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_length_parsec).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_length_astronomical_unit).equals(toUnit)) {
            toValue = fromValue * 206264806.24538d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void lengthParsec() {
        if (mContext.getString(R.string.string_units_list_length_meter).equals(toUnit)) {
            toValue = fromValue * 3.08567758128E+16d;
        } else if (mContext.getString(R.string.string_units_list_length_kilometer).equals(toUnit)) {
            toValue = fromValue * 30856775812800d;
        } else if (mContext.getString(R.string.string_units_list_length_decimeter).equals(toUnit)) {
            toValue = fromValue * 3.08567758128E+17d;
        } else if (mContext.getString(R.string.string_units_list_length_centimeter).equals(toUnit)) {
            toValue = fromValue * 3.08567758128E+18d;
        } else if (mContext.getString(R.string.string_units_list_length_millimeter).equals(toUnit)) {
            toValue = fromValue * 3.08567758128E+19d;
        } else if (mContext.getString(R.string.string_units_list_length_micrometer).equals(toUnit)) {
            toValue = fromValue * 3.08567758128E+22d;
        } else if (mContext.getString(R.string.string_units_list_length_nanometer).equals(toUnit)) {
            toValue = fromValue * 3.08567758128E+25d;
        } else if (mContext.getString(R.string.string_units_list_length_mile).equals(toUnit)) {
            toValue = fromValue * 19173511575400d;
        } else if (mContext.getString(R.string.string_units_list_length_yard).equals(toUnit)) {
            toValue = fromValue * 3.3745380372703E+16d;
        } else if (mContext.getString(R.string.string_units_list_length_foot).equals(toUnit)) {
            toValue = fromValue * 1.0123614111811E+17d;
        } else if (mContext.getString(R.string.string_units_list_length_inch).equals(toUnit)) {
            toValue = fromValue * 1.2148336934173E+18d;
        } else if (mContext.getString(R.string.string_units_list_length_light_year).equals(toUnit)) {
            toValue = fromValue * 3.2615637769d;
        } else if (mContext.getString(R.string.string_units_list_length_exameter).equals(toUnit)) {
            toValue = fromValue * 0.0308567758d;
        } else if (mContext.getString(R.string.string_units_list_length_petameter).equals(toUnit)) {
            toValue = fromValue * 30.8567758128d;
        } else if (mContext.getString(R.string.string_units_list_length_terameter).equals(toUnit)) {
            toValue = fromValue * 30856.7758128d;
        } else if (mContext.getString(R.string.string_units_list_length_gigameter).equals(toUnit)) {
            toValue = fromValue * 30856775.8128d;
        } else if (mContext.getString(R.string.string_units_list_length_megameter).equals(toUnit)) {
            toValue = fromValue * 30856775812.8d;
        } else if (mContext.getString(R.string.string_units_list_length_hectometer).equals(toUnit)) {
            toValue = fromValue * 3.08567758128E+14d;
        } else if (mContext.getString(R.string.string_units_list_length_dekameter).equals(toUnit)) {
            toValue = fromValue * 3.08567758128E+15d;
        } else if (mContext.getString(R.string.string_units_list_length_micron).equals(toUnit)) {
            toValue = fromValue * 3.08567758128E+22d;
        } else if (mContext.getString(R.string.string_units_list_length_picometer).equals(toUnit)) {
            toValue = fromValue * 3.08567758128E+28d;
        } else if (mContext.getString(R.string.string_units_list_length_femtometer).equals(toUnit)) {
            toValue = fromValue * 3.08567758128E+31d;
        } else if (mContext.getString(R.string.string_units_list_length_attometer).equals(toUnit)) {
            toValue = fromValue * 3.08567758128E+34d;
        } else if (mContext.getString(R.string.string_units_list_length_megaparsec).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_length_kiloparsec).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_length_parsec).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_length_astronomical_unit).equals(toUnit)) {
            toValue = fromValue * 206264.80624538d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void lengthAstronomicalUnit() {
        if (mContext.getString(R.string.string_units_list_length_meter).equals(toUnit)) {
            toValue = fromValue * 149597870691d;
        } else if (mContext.getString(R.string.string_units_list_length_kilometer).equals(toUnit)) {
            toValue = fromValue * 149597870.691d;
        } else if (mContext.getString(R.string.string_units_list_length_decimeter).equals(toUnit)) {
            toValue = fromValue * 1495978706910d;
        } else if (mContext.getString(R.string.string_units_list_length_centimeter).equals(toUnit)) {
            toValue = fromValue * 14959787069100d;
        } else if (mContext.getString(R.string.string_units_list_length_millimeter).equals(toUnit)) {
            toValue = fromValue * 1.49597870691E+14d;
        } else if (mContext.getString(R.string.string_units_list_length_micrometer).equals(toUnit)) {
            toValue = fromValue * 1.49597870691E+17d;
        } else if (mContext.getString(R.string.string_units_list_length_nanometer).equals(toUnit)) {
            toValue = fromValue * 1.49597870691E+20d;
        } else if (mContext.getString(R.string.string_units_list_length_mile).equals(toUnit)) {
            toValue = fromValue * 92955807.267433d;
        } else if (mContext.getString(R.string.string_units_list_length_yard).equals(toUnit)) {
            toValue = fromValue * 163602220790.68d;
        } else if (mContext.getString(R.string.string_units_list_length_foot).equals(toUnit)) {
            toValue = fromValue * 490806662372.05d;
        } else if (mContext.getString(R.string.string_units_list_length_inch).equals(toUnit)) {
            toValue = fromValue * 5889679948464.6d;
        } else if (mContext.getString(R.string.string_units_list_length_light_year).equals(toUnit)) {
            toValue = fromValue * 1.58125E-5d;
        } else if (mContext.getString(R.string.string_units_list_length_exameter).equals(toUnit)) {
            toValue = fromValue * 1.49597870691E-7d;
        } else if (mContext.getString(R.string.string_units_list_length_petameter).equals(toUnit)) {
            toValue = fromValue * 0.0001495979d;
        } else if (mContext.getString(R.string.string_units_list_length_terameter).equals(toUnit)) {
            toValue = fromValue * 0.1495978707d;
        } else if (mContext.getString(R.string.string_units_list_length_gigameter).equals(toUnit)) {
            toValue = fromValue * 149.597870691d;
        } else if (mContext.getString(R.string.string_units_list_length_megameter).equals(toUnit)) {
            toValue = fromValue * 149597.870691d;
        } else if (mContext.getString(R.string.string_units_list_length_hectometer).equals(toUnit)) {
            toValue = fromValue * 1495978706.91d;
        } else if (mContext.getString(R.string.string_units_list_length_dekameter).equals(toUnit)) {
            toValue = fromValue * 14959787069.1d;
        } else if (mContext.getString(R.string.string_units_list_length_micron).equals(toUnit)) {
            toValue = fromValue * 1.49597870691E+17d;
        } else if (mContext.getString(R.string.string_units_list_length_picometer).equals(toUnit)) {
            toValue = fromValue * 1.49597870691E+23d;
        } else if (mContext.getString(R.string.string_units_list_length_femtometer).equals(toUnit)) {
            toValue = fromValue * 1.49597870691E+26d;
        } else if (mContext.getString(R.string.string_units_list_length_attometer).equals(toUnit)) {
            toValue = fromValue * 1.49597870691E+29d;
        } else if (mContext.getString(R.string.string_units_list_length_megaparsec).equals(toUnit)) {
            toValue = fromValue * 4.8481368111358E-12d;
        } else if (mContext.getString(R.string.string_units_list_length_kiloparsec).equals(toUnit)) {
            toValue = fromValue * 4.8481368111358E-9d;
        } else if (mContext.getString(R.string.string_units_list_length_parsec).equals(toUnit)) {
            toValue = fromValue * 4.8481368111358E-6d;
        } else if (mContext.getString(R.string.string_units_list_length_astronomical_unit).equals(toUnit)) {
            toValue = fromValue;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }
}
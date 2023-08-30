package com.nikhil.unitconverter.converters;

import android.content.Context;
import android.widget.TextView;

import com.nikhil.unitconverter.R;

public class AreaConverter {

    private final Context mContext;
    private final String fromUnit;
    private final String toUnit;
    private final double fromValue;
    private double toValue;
    private final TextView mToNumberTV;

    public AreaConverter(Context context, String fromUnit, String toUnit, double fromValue,
                         double toValue, TextView toNumberTV) {
        this.mContext = context;
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
        this.fromValue = fromValue;
        this.toValue = toValue;
        this.mToNumberTV = toNumberTV;
    }

    public void convert() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(fromUnit)) {
            areaSquareMeter();
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(fromUnit)) {
            areaSquareKilometer();
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(fromUnit)) {
            areaSquareCentimeter();
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(fromUnit)) {
            areaSquareMillimeter();
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(fromUnit)) {
            areaSquareMicrometer();
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(fromUnit)) {
            areaHectare();
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(fromUnit)) {
            areaAcre();
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(fromUnit)) {
            areaSquareMile();
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(fromUnit)) {
            areaSquareYard();
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(fromUnit)) {
            areaSquareFoot();
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(fromUnit)) {
            areaSquareInch();
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(fromUnit)) {
            areaSquareHectometer();
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(fromUnit)) {
            areaSquareDekameter();
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(fromUnit)) {
            areaSquareDecimeter();
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(fromUnit)) {
            areaSquareNanometer();
        }
    }

    private void areaSquareMeter() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 0.0002471054d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 3.8610215854245E-7d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 1.1959900463d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 10.7639104167d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 1550.0031000062d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+18d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaSquareKilometer() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 10000000000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+18d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 247.1053814672d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 0.3861021585d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 1195990.0463011d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 10763910.41671d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 1550003100.0062d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 100000000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+24d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaSquareCentimeter() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 1.0E-10d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 100000000d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 1.0E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 2.4710538146716E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 3.8610215854245E-11d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 0.000119599d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 0.001076391d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 0.15500031d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 1.0E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+14d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaSquareMillimeter() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 1.0E-10d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 2.4710538146717E-10d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 3.8610215854245E-13d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 1.1959900463011E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 1.07639E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 0.0015500031d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 1.0E-10d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 1000000000000d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaSquareMicrometer() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 1.0E-18d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 1.0E-16d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 2.4710538146717E-16d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 3.8610215854245E-19d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 1.1959900463011E-12d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 1.076391041671E-11d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 1.5500031000062E-9d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 1.0E-16d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-14d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E-10d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaHectare() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 100000000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 10000000000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+16d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 2.4710538147d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 0.0038610216d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 11959.900463011d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 107639.1041671d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 15500031.000062d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+22d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaAcre() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 4046.8564224d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 0.0040468564d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 40468564.224d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 4046856422.4d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 4.0468564224E+15d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 0.4046856422d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 0.0015625d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 4840d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 43560d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 6272640d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 0.4046856422d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 40.468564224d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 404685.64224d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 4.0468564224E+21d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaSquareMile() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 2589988.110336d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 2.5899881103d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 25899881103.36d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 2589988110336d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 2.589988110336E+18d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 258.9988110336d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 640d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 3097600d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 27878400d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 4014489600d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 258.9988110336d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 25899.88110336d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 258998811.0336d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 2.589988110336E+24d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaSquareYard() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 0.83612736d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 8.3612736E-7d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 8361.2736d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 836127.36d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 836127360000d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 8.36127E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 0.0002066116d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 3.228305785124E-7d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 9d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 1296d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 8.36127E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 0.0083612736d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 83.612736d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 8.3612736E+17d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaSquareFoot() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 0.09290304d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 9.290304E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 929.0304d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 92903.04d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 92903040000d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 9.290304E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 2.29568E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 3.5870064279155E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 0.1111111111d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 144d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 9.290304E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 0.0009290304d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 9.290304d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 9.290304E+16d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaSquareInch() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 0.00064516d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 6.4516E-10d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 6.4516d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 645.16d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 645160000d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 6.4516E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 1.5942250790736E-7d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 2.4909766860524E-10d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 0.0007716049d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 0.0069444444d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 6.4516E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 6.4516E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 0.064516d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 6.4516E+14d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaSquareHectometer() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 100000000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 10000000000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+16d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 2.4710538147d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 0.0038610216d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 11959.900463011d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 107639.1041671d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 15500031.000062d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+22d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaSquareDekameter() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 100000000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+14d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 0.0247105381d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 3.86102E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 119.5990046301d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 1076.391041671d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 155000.31000062d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+20d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaSquareDecimeter() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 1.0E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 10000000000d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 2.4710538146717E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 3.8610215854245E-9d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 0.0119599005d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 0.1076391042d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 15.5000310001d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+16d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaSquareNanometer() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 1.0E-18d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 1.0E-24d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E-14d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 1.0E-22d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 2.4710538146717E-22d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 3.8610215854245E-25d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 1.1959900463011E-18d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 1.076391041671E-17d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 1.5500031000062E-15d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 1.0E-22d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-20d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E-16d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }
}
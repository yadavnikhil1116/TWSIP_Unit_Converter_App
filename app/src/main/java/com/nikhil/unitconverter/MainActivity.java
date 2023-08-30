package com.nikhil.unitconverter;

import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.nikhil.unitconverter.database.DataSource;
import com.nikhil.unitconverter.fragments.QuantitiesFragment;

public class MainActivity extends AppCompatActivity {

    public static final String DEVICE_INFORMATION = "Device model: " +
            Build.MODEL + "\nAndroid version: " + Build.VERSION.RELEASE;
    public static String APP_VERSION;
    public static String BACK_FROM_CHILD_KEY = "quantities_fragment";

    private DataSource mDataSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);
        mDataSource = new DataSource(this);
        mDataSource.open();
        fragmentsSwitch();

        try {
            APP_VERSION = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        mDataSource.close();
    }

    @Override
    public void onResume() {
        super.onResume();
        mDataSource.open();
    }

    private void fragmentsSwitch() {
        switch (BACK_FROM_CHILD_KEY) {
            case "quantities_fragment":
                getSupportFragmentManager().beginTransaction().replace(
                        R.id.fl_main, new QuantitiesFragment(), "quantities_fragment").commit();
                setTitle(R.string.app_name);
                BACK_FROM_CHILD_KEY = "quantities_fragment";
                break;
        }
    }
}
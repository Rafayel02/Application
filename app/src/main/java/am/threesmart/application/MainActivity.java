package am.threesmart.application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import am.threesmart.beacon_scanner.BeaconScanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("Before start: " + BeaconScanner.healthCheck());
        BeaconScanner.start();
        System.out.println("After start: " + BeaconScanner.healthCheck());
    }
}
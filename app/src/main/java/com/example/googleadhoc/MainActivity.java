package com.example.googleadhoc;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, initializationStatus -> {
            // You can add initialization callbacks here if needed.
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        // Create a new AdView object
        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-3940256099942544/6300978111");

        // Add the adView to your view hierarchy (e.g., if you want to add it to a LinearLayout)
        LinearLayout adLayout = findViewById(R.id.adLayout); // Replace with your layout ID
        adLayout.addView(adView);

        // Load the ad
        AdRequest adRequestForBanner = new AdRequest.Builder().build();
        adView.loadAd(adRequestForBanner);
    }
}

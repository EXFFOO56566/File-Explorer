package dev.tochy.tochyapps.tochyexplorer;

import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import dev.tochy.tochyapps.tochyexplorer.common.ActionBarActivity;

import static dev.tochy.tochyapps.tochyexplorer.misc.Utils.INTERSTITIAL_APP_UNIT_ID;

public abstract class AboutVariantFlavour extends ActionBarActivity {

    private InterstitialAd mInterstitialAd;
    
    protected void initAd() {
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId(INTERSTITIAL_APP_UNIT_ID);
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                loadAd();
            }

        });
        loadAd();
    }


    protected void loadAd(){
        if(null != mInterstitialAd) {
            mInterstitialAd.loadAd(new AdRequest.Builder().build());
        }
    }

    protected void showAd() {
        if (mInterstitialAd != null && mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            Toast.makeText(this, "No sponsor available", Toast.LENGTH_SHORT).show();
            loadAd();
        }
    }
}

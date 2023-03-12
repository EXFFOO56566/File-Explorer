package dev.tochy.tochyapps.tochyexplorer.common;

import android.os.Bundle;

public abstract class SettingsCommonActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
    }
}

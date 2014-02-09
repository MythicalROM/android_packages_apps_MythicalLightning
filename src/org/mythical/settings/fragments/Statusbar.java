package org.mythical.settings.fragments;

import android.app.Activity;
import org.mythical.settings.SettingsPreferenceFragment;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.Preference.OnPreferenceChangeListener;
import android.os.Bundle;

import org.mythical.settings.R;

public class Statusbar extends SettingsPreferenceFragment implements OnPreferenceChangeListener {

    private static final String TAG = "Statusbar";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.title_statusbar);

        addPreferencesFromResource(R.xml.status_bar_settings);
    }

    @Override
    public boolean onPreferenceChange(Preference preference, Object newValue) {
        return true;
    }
}

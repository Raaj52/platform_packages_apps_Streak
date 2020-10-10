package com.streak.settings.fragments;

import androidx.appcompat.app.AppCompatActivity;
import android.content.ContentResolver;
import android.content.res.Resources;
import android.content.Context;
import android.os.Bundle;
import android.os.UserHandle;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.Preference.OnPreferenceChangeListener;
import androidx.preference.SwitchPreference;
import android.provider.Settings;

import com.android.settings.R;

import com.android.settings.SettingsPreferenceFragment;
import com.streak.settings.preferences.CustomSeekBarPreference;
import com.streak.settings.preferences.SystemSettingSwitchPreference;
import com.streak.settings.preferences.SystemSettingListPreference;
import com.android.settings.Utils;
import android.util.Log;

import com.android.internal.logging.nano.MetricsProto;

public class StatusBarSettings extends SettingsPreferenceFragment implements
        Preference.OnPreferenceChangeListener{

    private CustomSeekBarPreference mThreshold;
    private SystemSettingSwitchPreference mNetMonitor;

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        addPreferencesFromResource(R.xml.streak_settings_statusbar);

        final PreferenceScreen prefScreen = getPreferenceScreen();
    }

    public boolean onPreferenceChange(Preference preference, Object newValue) {
        ContentResolver resolver = getActivity().getContentResolver();
		
        return false;
    }

    @Override
    public int getMetricsCategory() {
        return MetricsProto.MetricsEvent.STREAK_SETTINGS;
    }

}

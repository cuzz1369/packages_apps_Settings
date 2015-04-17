package com.android.settings.candy;
import android.content.ContentResolver;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.PreferenceScreen;
import android.provider.Settings;
import android.widget.Toast;
import com.android.settings.R;
import com.android.settings.SettingsPreferenceFragment;

public class Team extends SettingsPreferenceFragment implements
Preference.OnPreferenceChangeListener {
private static final String TAG = "CandyRomsTeam";
Preference mMatthew0776;
Preference mMar5hal;
Preference mCyberScopes;
Preference mGimmeitorilltell;
Preference mBMP7777;
Preference mTr1gg3r84;
Preference mRc420head;
Preference mFlashalot;
Preference mVenomtester;
Preference mCuzz1369;
Preference mDarknites;
Preference mRapier;
Preference mjavelinanddart;
@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
ContentResolver resolver = getActivity().getContentResolver();
// Load the preferences from an XML resource
addPreferencesFromResource(R.xml.candyteam);
PreferenceScreen prefSet = getPreferenceScreen();
mMatthew0776 = prefSet.findPreference("candy_matthew0776");
mMar5hal = prefSet.findPreference("candy_mar5hal");
mCyberScopes = prefSet.findPreference("candy_CyberScopes");
mGimmeitorilltell = prefSet.findPreference("candy_gimmeitorilltell");
mBMP7777 = prefSet.findPreference("candy_BMP7777");
mTr1gg3r84 = prefSet.findPreference("candy_tr1gg3r84");
mRc420head = prefSet.findPreference("candy_rc420head");
mFlashalot = prefSet.findPreference("candy_flashalot");
mVenomtester = prefSet.findPreference("candy_venomtester");
mCuzz1369 = prefSet.findPreference("candy_cuzz1369");
mDarknites = prefSet.findPreference("candy_darknites");
mRapier = prefSet.findPreference("candy_rapier");
mjavelinanddart = prefSet.findPreference("candy_javelinanddart");
}
@Override
public void onResume() {
super.onResume();
}
@Override
public void onDestroy() {
super.onDestroy();
}
@Override
public boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference) {
ContentResolver resolver = getActivity().getContentResolver();
boolean value;
if (preference == mMatthew0776) {
Toast.makeText(getActivity(), "Co-Owner Of CandyRoms, Loves Making Icon Packs With Eclipse",
Toast.LENGTH_LONG).show();
} else if (preference == mMar5hal) {
Toast.makeText(getActivity(), "Co-Owner Of CandyRoms, Much cool such dev wow :)",
Toast.LENGTH_LONG).show();
} else if (preference == mCyberScopes) {
Toast.makeText(getActivity(), "Theamer for CandyRoms, Part Time Slave To School",
Toast.LENGTH_LONG).show();
} else if (preference == mGimmeitorilltell) {
Toast.makeText(getActivity(), "Rom Mantaner for CandyRoms, KeyWords Damint Bobby",
Toast.LENGTH_LONG).show();
} else if (preference == mBMP7777) {
Toast.makeText(getActivity(), "Rom Mantaner for CandyRoms, LOVES The Samsung Galaxay Tab 3 7.0 Sprint",
Toast.LENGTH_LONG).show();
} else if (preference == mTr1gg3r84) {
Toast.makeText(getActivity(), "Rom Mantaner for CandyRoms, The BIGGEST GIMP!!! :P",
Toast.LENGTH_LONG).show();
} else if (preference == mRc420head) {
Toast.makeText(getActivity(), "Rom Mantaner for CandyRoms, Did Someone Say Pot?!?!",
Toast.LENGTH_LONG).show();
} else if (preference == mFlashalot) {
Toast.makeText(getActivity(), "Rom Mantaner for CandyRoms, Dont Test His Zips",
Toast.LENGTH_LONG).show();
} else if (preference == mVenomtester) {
Toast.makeText(getActivity(), "Theamer for CandyRoms, Loves To Break Clocks with his themes",
Toast.LENGTH_LONG).show();
} else if (preference == mCuzz1369) {
Toast.makeText(getActivity(), "Rom Mantaner for CandyRoms, Not Batman",
Toast.LENGTH_LONG).show();
} else if (preference == mDarknites) {
Toast.makeText(getActivity(), "Tester/Themer for CandyRoms, Holo is the name Holo is the game",
Toast.LENGTH_LONG).show();
} else if (preference == mRapier) {
Toast.makeText(getActivity(), "Master Tester for CandyRoms, You forgot something @Rc420head",
Toast.LENGTH_LONG).show();
} else if (preference == mjavelinanddart) {
Toast.makeText(getActivity(), "ROM Maintainer for CandyRoms, Known for loving shi*** devices",
Toast.LENGTH_LONG).show();
} else {
return super.onPreferenceTreeClick(preferenceScreen, preference);
}
return true;
}
@Override
public boolean onPreferenceChange(Preference preference, Object objValue) {
ContentResolver resolver = getActivity().getContentResolver();
final String key = preference.getKey();
return true;
}
}

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
Preference mRc420head;
Preference mFlashalot;
Preference mVenomtester;
Preference mCuzz1369;
Preference mDarknites;
Preference mRapier;
Preference mjavelinanddart;
Preference mcalebcabob;
Preference mtimmytim;
Preference mp70shooter;
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
mRc420head = prefSet.findPreference("candy_rc420head");
mFlashalot = prefSet.findPreference("candy_flashalot");
mVenomtester = prefSet.findPreference("candy_venomtester");
mCuzz1369 = prefSet.findPreference("candy_cuzz1369");
mDarknites = prefSet.findPreference("candy_darknites");
mRapier = prefSet.findPreference("candy_rapier");
mjavelinanddart = prefSet.findPreference("candy_javelinanddart");
mcalebcabob = prefSet.findPreference("candy_calebcabob");
mtimmytim = prefSet.findPreference("candy_timmytim");
mp70shooter = prefSet.findPreference("candy_p70shooter");
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
Toast.makeText(getActivity(), "Co-Owner Of CandyRoms, Gimme all yo candy b*tches, Asian with a white boy name",
Toast.LENGTH_LONG).show();
} else if (preference == mMar5hal) {
Toast.makeText(getActivity(), "Co-Owner Of CandyRoms, Much cool such dev wow :)",
Toast.LENGTH_LONG).show();
} else if (preference == mCyberScopes) {
Toast.makeText(getActivity(), "Themer for CandyRoms, Part Time Slave To School",
Toast.LENGTH_LONG).show();
} else if (preference == mGimmeitorilltell) {
Toast.makeText(getActivity(), "ROM Mantainer for CandyRoms, Keywords: Dammit Bobby",
Toast.LENGTH_LONG).show();
} else if (preference == mRc420head) {
Toast.makeText(getActivity(), "ROM Mantainer for CandyRoms, Did Someone Say Pot?!?!",
Toast.LENGTH_LONG).show();
} else if (preference == mFlashalot) {
Toast.makeText(getActivity(), "ROM Mantainer for CandyRoms, Don't Test His Zips",
Toast.LENGTH_LONG).show();
} else if (preference == mVenomtester) {
Toast.makeText(getActivity(), "Themer for CandyRoms, Loves To Break Clocks with his themes",
Toast.LENGTH_LONG).show();
} else if (preference == mCuzz1369) {
Toast.makeText(getActivity(), "ROM Mantainer for CandyRoms, NOT Batman",
Toast.LENGTH_LONG).show();
} else if (preference == mDarknites) {
Toast.makeText(getActivity(), "Tester/Themer for CandyRoms, Holo is the name Holo is the game",
Toast.LENGTH_LONG).show();
} else if (preference == mRapier) {
Toast.makeText(getActivity(), "Master Tester for CandyRoms, You forgot something @Rc420head",
Toast.LENGTH_LONG).show();
} else if (preference == mjavelinanddart) {
Toast.makeText(getActivity(), "Device Maintainer Team Lead",
Toast.LENGTH_LONG).show();
} else if (preference == mcalebcabob) {
Toast.makeText(getActivity(), "Git Commit Search Engine aka DJ aka Tester for CandyRoms",
Toast.LENGTH_LONG).show();
} else if (preference == mtimmytim) {
Toast.makeText(getActivity(), "ROM Builder, If I was a Ninja Turtle...I would be Leonardo of course!!!",
Toast.LENGTH_LONG).show();
} else if (preference == mp70shooter) {
Toast.makeText(getActivity(), "Deals with the noobs so we don't have to",
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

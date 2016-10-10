package me.khrystal.circlerecyclerviewdemo;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;

public class MainActivity extends FragmentActivity {

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("lxtest","onCreate");
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        MultiModeFragment fragment = MultiModeFragment.newInstance(ModeType.TYPE_SCALEX);
        fragmentTransaction.add(R.id.fragment_container, fragment);
        fragmentTransaction.commitAllowingStateLoss();
    }

}

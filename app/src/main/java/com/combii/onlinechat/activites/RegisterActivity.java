package com.combii.onlinechat.activites;

import android.support.v4.app.Fragment;

import com.combii.onlinechat.fragments.RegisterFragment;



public class RegisterActivity extends BaseFragmentActivity {
    @Override
    Fragment createFragment() {
        return RegisterFragment.newInstance();
    }
}

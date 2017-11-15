package com.combii.onlinechat.activites;


import android.support.v4.app.Fragment;

import com.combii.onlinechat.fragments.LoginFragment;

public class LoginActivity extends BaseFragmentActivity {


    @Override
    Fragment createFragment() {
        return LoginFragment.newInstance();
    }
}








/* private Socket mSocket;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            mSocket = IO.socket(Constants.IP_LOCAL_HOST);
        } catch (URISyntaxException e) {
            Log.i(LoginActivity.class.getSimpleName(), e.getMessage());
            e.printStackTrace();
        }

        mSocket.connect();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mSocket.disconnect();
    }*/
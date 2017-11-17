package com.combii.onlinechat.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.combii.onlinechat.R;
import com.combii.onlinechat.R2;
import com.combii.onlinechat.utils.Constants;

import java.net.URISyntaxException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import io.socket.client.IO;
import io.socket.client.Socket;


public class RegisterFragment extends BaseFragment {

    @BindView(R2.id.fragment_register_userName)
    EditText mUserNameEt;

    @BindView(R2.id.fragment_register_userEmail)
    EditText mUserEmailEt;

    @BindView(R2.id.fragment_register_userPassword)
    EditText mUserPasswordEt;

    @BindView(R2.id.fragment_register_registerButton)
    Button mRegisterButton;

    @BindView(R2.id.fragment_register_LoginButton)
    Button mLoginButton;

    private Unbinder mUnbinder;
    private Socket mSocket;

    public static RegisterFragment newInstance() {
        return new RegisterFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            mSocket = IO.socket(Constants.IP_LOCAL_HOST);
        } catch (URISyntaxException e) {
            Log.i(RegisterFragment.class.getSimpleName(), e.getMessage());
            Toast.makeText(getActivity(), "Can't connect to the server", Toast.LENGTH_SHORT).show();
        }
        mSocket.connect();
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_register, container, false);
        mUnbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mUnbinder.unbind();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mSocket.disconnect();
    }
}

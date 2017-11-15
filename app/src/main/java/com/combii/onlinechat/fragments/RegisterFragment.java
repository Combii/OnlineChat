package com.combii.onlinechat.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.combii.onlinechat.R;
import com.combii.onlinechat.R2;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;


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

    public static RegisterFragment newInstance() {
        return new RegisterFragment();
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
}

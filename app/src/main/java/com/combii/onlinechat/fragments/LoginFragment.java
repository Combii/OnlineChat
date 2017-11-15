package com.combii.onlinechat.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.combii.onlinechat.R;
import com.combii.onlinechat.R2;
import com.combii.onlinechat.activites.RegisterActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by Combii on 15/11/2017.
 */

public class LoginFragment extends BaseFragment {

    @BindView(R2.id.fragment_login_userEmail)
    EditText mUserEmailEt;

    @BindView(R2.id.fragment_login_userPassword)
    EditText mUserPasswordEt;

    @BindView(R2.id.fragment_login_login_button)
    Button mLoginButton;

    @BindView(R2.id.fragment_login_register_button)
    Button mRegisterButton;

    private Unbinder mUnbinder;

    public static LoginFragment newInstance() {
        return new LoginFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_login, container, false);
        mUnbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @OnClick(R2.id.fragment_login_register_button)
    public void setMRegisterButton(){
        startActivity(new Intent(getActivity(), RegisterActivity.class));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mUnbinder.unbind();
    }
}

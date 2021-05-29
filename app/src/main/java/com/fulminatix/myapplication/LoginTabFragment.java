package com.fulminatix.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class LoginTabFragment extends Fragment {

    Button loginButton;
    EditText email, password;
    TextView forgotPassword;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.login_tab_fragment, container, false);

        email = root.findViewById(R.id.email);
        password = root.findViewById(R.id.password);
        loginButton = root.findViewById(R.id.button);
        forgotPassword = root.findViewById(R.id.forgot_password);

        email.setTranslationX(800);
        password.setTranslationX(800);
        forgotPassword.setTranslationX(800);
        loginButton.setTranslationY(0);

        email.setAlpha(0);
        password.setAlpha(0);
        forgotPassword.setAlpha(0);
        loginButton.setAlpha(0);

        email.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(300).start();
        password.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(500).start();
        forgotPassword.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(500).start();
        loginButton.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(700).start();


        return root;
    }
}

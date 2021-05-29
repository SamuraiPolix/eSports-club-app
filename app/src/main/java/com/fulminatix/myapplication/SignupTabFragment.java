package com.fulminatix.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import org.w3c.dom.Text;

public class SignupTabFragment extends Fragment {

    EditText email, password, confirmPassword, name;
    Button signupButton;
    float alpha = 0;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.signup_tab_fragment, container, false);

        email = root.findViewById(R.id.email);
        password = root.findViewById(R.id.password);
        confirmPassword = root.findViewById(R.id.confirm_password);
        name = root.findViewById(R.id.fullName);
        signupButton = root.findViewById(R.id.button);

        email.setTranslationX(800);
        password.setTranslationX(800);
        confirmPassword.setTranslationX(800);
        name.setTranslationX(800);
        signupButton.setTranslationY(0);

        email.setAlpha(0);
        password.setAlpha(0);
        confirmPassword.setAlpha(0);
        name.setAlpha(0);
        signupButton.setAlpha(0);

        name.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(200).start();
        email.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        password.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(600).start();
        confirmPassword.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(600).start();
        signupButton.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(800).start();



        return root;
    }
}

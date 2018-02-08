package com.example.br239.passwordvalidator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static int numOfValidation = 2;

    private TextView tvMessage;
    private EditText tbPassword;
    private Button btValidate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMessage = findViewById(R.id.tvMessage);
        tbPassword = findViewById(R.id.tbPassword);
        btValidate = findViewById(R.id.btValidate);
        btValidate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
            }
        });
    }

    public static int validatePassword(String password) {
        int result = 0;

        if (testForPasswordString(password)) {
            result++;
        }
        if (testForLength(password)){
            result++;
        }
        if (testForBlankSpace(password)){
            result++;
        }
        if (testForUppercase(password)){
            result++;
        }
        if (testForLowercase(password)){
            result++;
        }

        return result;
    }

    public static boolean testForPasswordString(String password) {
        if (password.equalsIgnoreCase("password")) {
            return false;
        }
        return true;
    }

    public static boolean testForLength(String password) {
        if (password.length() < 8){
            return false;
        }
        return true;
    }

    public static boolean testForBlankSpace(String password){
        if (password.contains(" ")) {
            return false;
        }
        return true;
    }

    public static boolean testForUppercase(String password){
        return !password.equals(password.toLowerCase());
    }

    public static boolean testForLowercase(String password){
        return !password.equals(password.toUpperCase());
    }

    public static boolean testForSpecial(String password) {
        return !password.matches("[A-Za-z0-9 ]*");
    }
}

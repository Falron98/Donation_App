package org.example.com.donation_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.res.Resources;

public class HomeScreen_Activity extends AppCompatActivity {

    String username = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);

        Button submit_button = findViewById(R.id.button_Submit);
        EditText user_name = findViewById(R.id.editText_PersonName);

        user_name.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(user_name.getText());
                username = String.valueOf(user_name.getText());
                Toast.makeText(HomeScreen_Activity.this, getResources().getString(R.string.welcoming)+" "+user_name.getText(), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(HomeScreen_Activity.this, Donate_Activity.class);
                intent.putExtra("username", username);
                startActivity(intent);
            }
        });
    }
}
package org.gottablast.gottablast;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by travis on 2/25/2017.
 */

public class SettingsActivity extends AppCompatActivity {

    public String name = "";
    public String email = "";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        name = getIntent().getStringExtra("name");
        email = getIntent().getStringExtra("email");
        TextView nameText = (TextView) findViewById(R.id.textViewName);
        TextView emailText = (TextView) findViewById(R.id.textViewEmail);
        nameText.setText(name);
        emailText.setText(email);
    }
}

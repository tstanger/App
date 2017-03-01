package org.gottablast.gottablast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public boolean misc = false;
    public boolean school = false;
    public boolean work = false;

    public String name = "";
    public String email = "";


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = getIntent().getStringExtra("name");
        email = getIntent().getStringExtra("email");
    }
    public void openSettings(View v) {
        Intent intent = new Intent(this, SettingsActivity.class);
        intent.putExtra("name", name);
        intent.putExtra("email", email);
        startActivity(intent);
    }
    public void setMiscTrue(View v) {
        misc = true;
        school = false;
        work = false;
    }

    public void setSchoolTrue(View v) {
        school = true;
        work = false;
        misc = false;
    }

    public void setWorkTrue(View v) {
        work = true;
        school = false;
        misc = false;
    }

    public void gotoPagetwo(View v) {
        Intent intent = new Intent(this, PagetwoActivity.class);
        intent.putExtra("work", work);
        intent.putExtra("school", school);
        intent.putExtra("misc", misc);
        startActivity(intent);
    }
}
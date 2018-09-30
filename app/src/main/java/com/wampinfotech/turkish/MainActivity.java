package com.wampinfotech.turkish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openNumbersList(View view) {
        startActivity(new Intent(this, NumbersActivity.class));
    }

    public void openFamilyList(View view) {
        startActivity(new Intent(this, FamilyActivity.class));
    }

    public void openColorsList(View view) {
        startActivity(new Intent(this, ColorsActivity.class));
    }

    public void openPhrasesList(View view) {
        startActivity(new Intent(this, PhrasesActivity.class));
    }


}

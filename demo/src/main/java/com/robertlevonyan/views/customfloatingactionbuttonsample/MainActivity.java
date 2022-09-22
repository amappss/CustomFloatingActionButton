package com.robertlevonyan.views.customfloatingactionbuttonsample;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.robertlevonyan.views.customfloatingactionbutton.FloatingActionButton;
import com.robertlevonyan.views.customfloatingactionbutton.FloatingActionLayout;
import com.robertlevonyan.views.customfloatingactionbutton.FloatingLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final FloatingActionButton fab1 = findViewById(R.id.fab1);
        fab1.setText("00:00");

        final FloatingActionButton floatingActionButton = findViewById(R.id.customFAB);
        final FloatingActionLayout floatingActionLayout = findViewById(R.id.customFABL);
        final FloatingLayout floatingLayout = findViewById(R.id.floating_layout);

        final String text = "Next";
        floatingActionButton.setText(text);
        floatingActionButton.setOnClickListener(view -> {
            floatingActionButton.setText("Clicked");
            Toast.makeText(MainActivity.this, "Clicked!", Toast.LENGTH_SHORT).show();
        });

        floatingActionLayout.setOnClickListener(view -> {

        });

        floatingLayout.setOnMenuExpandedListener(new FloatingLayout.OnMenuExpandedListener() {
            @Override
            public void onMenuExpanded() {
                Toast.makeText(MainActivity.this, "Expanded", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onMenuCollapsed() {
                Toast.makeText(MainActivity.this, "Collapsed", Toast.LENGTH_SHORT).show();
            }
        });
    }

}

package com.example.ketchapp;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;



import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Start_Page extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.Venner_Navigation);

    }

    Minner fragment_minner = new Minner();
    Venner fragment_venner = new Venner();
    Grupper fragment_grupper = new Grupper();
    Aktivitet fragment_aktivitet = new Aktivitet();



    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Minner_Navigation:
                getSupportFragmentManager().beginTransaction().replace(R.id.linearLayout, fragment_minner).commit();
                return true;

            case R.id.Venner_Navigation:
                getSupportFragmentManager().beginTransaction().replace(R.id.linearLayout, fragment_venner).commit();
                return true;

            case R.id.Grupper_Navigation:
                getSupportFragmentManager().beginTransaction().replace(R.id.linearLayout, fragment_grupper).commit();
                return true;

            case R.id.Aktivitet_Navigation:
                getSupportFragmentManager().beginTransaction().replace(R.id.linearLayout, fragment_aktivitet).commit();
                return true;
        }

        return false;
    }
}




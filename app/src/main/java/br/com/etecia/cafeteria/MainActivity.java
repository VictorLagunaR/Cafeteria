package br.com.etecia.cafeteria;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    CoffeeFragment coffeeFragment = new CoffeeFragment();
    MuffinFragment muffinFragment = new MuffinFragment();
    TeaFragment teaFragment = new TeaFragment();
    DonutsFragment donutsFragment = new DonutsFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        getSupportFragmentManager().
                beginTransaction().
                replace(R.id.idContainer, coffeeFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menuCoffee:
                        getSupportFragmentManager().
                                beginTransaction().
                                replace(R.id.idContainer, coffeeFragment).commit();
                        return true;
                    case R.id.menuMuffin:
                        getSupportFragmentManager().
                                beginTransaction().
                                replace(R.id.idContainer, muffinFragment).commit();
                        return true;
                    case R.id.menuTea:
                        getSupportFragmentManager().
                                beginTransaction().
                                replace(R.id.idContainer, teaFragment).commit();
                        return true;
                    case R.id.menuDonuts:
                        getSupportFragmentManager().
                                beginTransaction().
                                replace(R.id.idContainer, donutsFragment).commit();
                        return true;
                }

                return true;
            }
        });

    }

}
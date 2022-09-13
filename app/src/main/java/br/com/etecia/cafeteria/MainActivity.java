package br.com.etecia.cafeteria;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

//    HomeFragment homeFragment = new HomeFragment();
//    NotificationsFragment notificationsFragment = new NotificationsFragment();
//    SettingsFragment settingsFragment = new SettingsFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CoffeeFragment coffeeFragment = new CoffeeFragment();
        MuffinFragment muffinFragment = new MuffinFragment();
        TeaFragment teaFragment = new TeaFragment();
        DonutsFragment donutsFragment = new DonutsFragment();


        bottomNavigationView = findViewById(R.id.bottom_navigation);
        getSupportFragmentManager().
                beginTransaction().
                replace(R.id.idContainer, coffeeFragment).commit();

//            BadgeDrawable badgeDrawable = bottomNavigationView.getOrCreateBadge(R.id.mNotifications);
//         badgeDrawable.setvisible(true);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
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

                return false;
            }
        });


    }
}
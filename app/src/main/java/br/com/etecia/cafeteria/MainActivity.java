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
    List<Doces> doces = new ArrayList<>();

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

        public void criarFilmes() {
            //Criando a instância do objeto Filmes
            Filmes filmes = new Filmes("A bela e a fera", "Aventura", "1990");
            //Adicionando os valores no Array de Filmes
            this.listarFilmes.add(filmes);
            filmes = new Filmes("Feitiço do Tempo", "Comédia", "1993");
            this.listarFilmes.add(filmes);
            filmes = new Filmes("Jogo da Imitação", "Suspense", "2014");
            this.listarFilmes.add(filmes);
            filmes = new Filmes("O Poderoso Chefão", "Policial", "1972");
            this.listarFilmes.add(filmes);
            filmes = new Filmes("A Lista de Schindler", "Guerra", "2019");
            this.listarFilmes.add(filmes);
            filmes = new Filmes("Um Sonho de Liberdade", "Drama", "1995");
            this.listarFilmes.add(filmes);
            filmes = new Filmes("O Senhor dos Anéis - O Retorno do Rei", "Aventura", "2003");
            this.listarFilmes.add(filmes);
            filmes = new Filmes("O Rei Leão", "Animação", "2011");
            this.listarFilmes.add(filmes);
            filmes = new Filmes("Forrest Gump - O Contador de Histórias", "Romance", "1994");
            this.listarFilmes.add(filmes);
            filmes = new Filmes("À Espera de um Milagre", "Policial", "2000");
            this.listarFilmes.add(filmes);
            filmes = new Filmes("Intocáveis", "Comédia", "2012");
            this.listarFilmes.add(filmes);
            filmes = new Filmes("Alladim", "Aventura", "2019");
            this.listarFilmes.add(filmes);
            filmes = new Filmes("Aves de Rapina", "Ação", "2020");
            this.listarFilmes.add(filmes);

        }
    }



    }
}
package com.smartlocation.drawernew;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.DividerItemDecoration;

import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    Toolbar toolbar;
    NavigationView navView;
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        navView = findViewById(R.id.nav_view);
        drawerLayout = findViewById(R.id.drawerLayout);
        NavigationMenuView navMenuView = (NavigationMenuView) navView.getChildAt(0);
        navView.setNavigationItemSelectedListener(MainActivity.this);
        navMenuView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.setDrawerIndicatorEnabled(true);
        toggle.syncState();
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull final MenuItem menuItem) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                switch (menuItem.getItemId()) {
                    case R.id.nav_change_pin:
                        Toast.makeText(MainActivity.this, "change pin", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.nav_terms_condition:
                        Toast.makeText(MainActivity.this, " terms and condition", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.nav_atm:
                        Toast.makeText(MainActivity.this, " atm", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.nav_emi:
                        Toast.makeText(MainActivity.this, " emi", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.nav_contact:
                        Toast.makeText(MainActivity.this, " contact ", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.nav_settings:
                        Toast.makeText(MainActivity.this, "settings", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.nav_logout:
                        Toast.makeText(MainActivity.this, "logout", Toast.LENGTH_LONG).show();
                        break;
                }
            }
        }, 200);

        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

}

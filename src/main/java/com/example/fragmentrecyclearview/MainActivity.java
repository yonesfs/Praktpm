package com.example.fragmentrecyclearview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private BottomNavigationView navbar;
    LoginActivity login = new LoginActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
//        if (!login.savelogin) {
//            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
//            startActivity(intent);
//        } else {

            navbar = findViewById(R.id.main_navbar);
            navbar.setOnNavigationItemSelectedListener(this);

            loadFragment(new Fragment());
//        }

    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null){
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.main_frame, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;
        switch (item.getItemId()){
            case R.id.ic_gallery:
                fragment = new GalleryFragment();
                break;
            case R.id.ic_contact:
                fragment = new ContactFragment();
                break;
            case R.id.ic_info:
                fragment = new InfoFragment();
                break;
        }
        return loadFragment(fragment);
    }
}
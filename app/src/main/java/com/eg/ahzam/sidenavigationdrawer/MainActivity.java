package com.eg.ahzam.sidenavigationdrawer;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;

    //  Variable storing the Navigation Drawer button on ActionBar
    private ActionBarDrawerToggle mToggle;
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  Set new toolbar
        mToolbar = findViewById(R.id.nav_action);
        setSupportActionBar(mToolbar);

        mDrawerLayout = findViewById(R.id.drawerLayout);

        //  Constructs a new ActionBarToggle
        mToggle = new ActionBarDrawerToggle(MainActivity.this, mDrawerLayout, R.string.open, R.string.close);


        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();    // Conversion between back and burger icon

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    //  Allow buttons on ActionBar to function
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return mToggle.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
    }
}

package com.jdcoding.dashbord

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.jdcoding.dashbord.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val bottomNavBar: BottomNavigationView = findViewById(R.id.bottom_navigation)

        bottomNavBar.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    item.setCheckable(true)
                    item.setChecked(true)
                    // Navigate to HomeActivity
                    startActivity(Intent(this, MainActivity::class.java))
                    true
                }

                R.id.nav_profile -> {
                    // Navigate to ProfileActivity
                    startActivity(Intent(this, MainActivity2::class.java))
                    true
                }

                else -> false
            }
        }
    }
}
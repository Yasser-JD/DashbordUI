package com.jdcoding.dashbord

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)


        val bottomNavBar: BottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNavBar.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {

                    // Navigate to HomeActivity
                    startActivity(Intent(this, MainActivity::class.java))
                    true
                }

                R.id.nav_profile -> {
                    item.setCheckable(true)
                    item.setChecked(true)
                    // Navigate to ProfileActivity
                    startActivity(Intent(this, MainActivity2::class.java))
                    true
                }

                else -> false
            }
        }
    }
}
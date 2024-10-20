package com.project.navicamps

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.navigationrail.NavigationRailView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the NavigationRailView
        val navigationRailView = findViewById<NavigationRailView>(R.id.navigation_rail)

        // Handle menu item clicks
        navigationRailView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.map -> {
                    // Handle action for Maps item
                    Toast.makeText(this, "Maps clicked", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.emergency -> {
                    // Handle action for Emergency item
                    Toast.makeText(this, "Emergency clicked", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }
    }
}

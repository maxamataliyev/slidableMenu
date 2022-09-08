    package com.maxataliyev_01.slidablemenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import com.maxataliyev_01.slidablemenu.databinding.ActivityMainBinding

    class MainActivity : AppCompatActivity() {
    lateinit var toggle: ActionBarDrawerToggle
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        toggle= ActionBarDrawerToggle(this,binding.drawerLayout,R.string.open,R.string.close)
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.item1-> Toast.makeText(applicationContext, "Clicked Item1", Toast.LENGTH_SHORT).show()
                R.id.item2-> Toast.makeText(applicationContext, "Clicked Item2", Toast.LENGTH_SHORT).show()
                R.id.item3-> Toast.makeText(applicationContext, "Clicked Item3", Toast.LENGTH_SHORT).show()
                R.id.item4-> Toast.makeText(applicationContext, "Clicked Item4", Toast.LENGTH_SHORT).show()
            }
            true
        }
    }

        override fun onOptionsItemSelected(item: MenuItem): Boolean {
            if (toggle.onOptionsItemSelected(item)){
                return true
            }
            return super.onOptionsItemSelected(item)
        }
}
package com.example.recyclerview
// https://www.youtube.com/watch?v=4pevVON0v-U&list=PLmjT2NFTgg1fdHN-9Wn4XYr-IOuadxMm5&index=30
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Recycler View Main Activity"
    }

    fun onClick(view: View) {
        val intent = Intent(this, RecyclerViewActivity::class.java)
        startActivity(intent)
        }
    }
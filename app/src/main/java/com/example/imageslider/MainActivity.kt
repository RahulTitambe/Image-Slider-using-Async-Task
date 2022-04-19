package com.example.imageslider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(
            this,
        LinearLayoutManager.HORIZONTAL,
        false)

        var imagesList = ArrayList<ImageData>()

        for (i in 1..8) {
            if (i%2 == 0) {
                imagesList.add(ImageData(R.drawable.image_one))
                imagesList.add(ImageData(R.drawable.image_two))
                imagesList.add(ImageData(R.drawable.image_four))
                imagesList.add(ImageData(R.drawable.image_five))

            }
            else {

                imagesList.add(ImageData(R.drawable.image_three))
                imagesList.add(ImageData(R.drawable.image_six))
                imagesList.add(ImageData(R.drawable.image_seven))
                imagesList.add(ImageData(R.drawable.image_eight))
            }
        }

        val adapter = SliderAdapter(imagesList)
        recyclerView.adapter = adapter

        ImageDelay(recyclerView,imagesList.size).execute(null)

    }
}
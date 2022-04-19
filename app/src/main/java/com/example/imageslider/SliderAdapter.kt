package com.example.imageslider

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class SliderAdapter(private val imagesList : ArrayList<ImageData>) : RecyclerView.Adapter<SliderAdapter.ViewHolder>() {

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        var imgImageView : ImageView

        init {
            imgImageView = itemView.findViewById(R.id.imgSlidingImage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.slider_image,parent,false)

        return  ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ImageItem = imagesList[position]
        holder.imgImageView.setImageResource(ImageItem.image)

    }

    override fun getItemCount(): Int {
        return imagesList.size
    }
}
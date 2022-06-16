package com.example.weatherapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class KolnAdapter(): RecyclerView.Adapter<KolnAdapter.KolnViewHolder>() {

    class KolnViewHolder(wView: View):RecyclerView.ViewHolder(wView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KolnViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.wtem, parent, false)
        return KolnViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: KolnViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}
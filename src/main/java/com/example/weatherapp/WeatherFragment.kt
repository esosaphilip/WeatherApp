package com.example.weatherapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout


class WeatherFragment : Fragment() {
    private val viewModel: WeatherViewModel by viewModels()
   // private var _binding: WeatherFragmentBinding? = Null
    private lateinit var home:RelativeLayout
    private lateinit var loading:ProgressBar
    private lateinit var back : ImageView
    private lateinit var CityName: TextView
    private lateinit var ivIcon: ImageView
    private lateinit var IvSearch : ImageView
    private lateinit var RvWeather: RecyclerView
    private lateinit var TvTemperature: TextView
    private lateinit var TvCondition:TextView
    private lateinit var EtCity: TextInputEditText
    private lateinit var iLCity: TextInputLayout
    private lateinit var lin:LinearLayout





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_weather, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

}
package com.example.car_rental

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var carRecyclerView: RecyclerView
    private lateinit var carAdapter: CarAdapter
    private lateinit var carList: MutableList<Car>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        carRecyclerView = findViewById(R.id.car_list_recyclerview)
        carRecyclerView.layoutManager = LinearLayoutManager(this)

        carList = mutableListOf(
            Car("Mercedes S-Class", "Price: $300/day", R.drawable.car1),
            Car("Ferrari F8", "Price: $500/day", R.drawable.car2),
            Car("Bentley Continental GT", "Price: $400/day", R.drawable.car3),
            Car("BMW 7 Series", "Price: $350/day", R.drawable.car4),
            Car("Audi A8", "Price: $320/day", R.drawable.car5)
        )

        carAdapter = CarAdapter(carList)
        carRecyclerView.adapter = carAdapter
    }
}
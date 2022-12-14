package com.example.walmartstore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.walmartstore.adapter.CategoryAdapter
import com.example.walmartstore.data.Product
import kotlinx.android.synthetic.main.activity_electornics_category.*

class ElectronicsCategoryActivity : AppCompatActivity() {
    private val productList = mutableListOf(
        Product("HP Flyer Red 15.6 \" Laptop", "$435", "Red", R.drawable.laptop, 1236L, "Nice laptop Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the "),
        Product("RCA Voyager 7\" 16GB android tablet", "$35", "Blue", R.drawable.tablet, 123L, "Nice tablet Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the "),
        Product("Vizio 70\" class 4K", "$235", "Black", R.drawable.tv, 1234L, "Nice TV Screen Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the ."),
        Product("EPSON workforce WF-2750", "$135", "Black", R.drawable.scanner, 1235L, "Nice Scanner Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the .")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_electornics_category)
        recycler_view.layoutManager = LinearLayoutManager(this)
        val adapter = CategoryAdapter(this,productList )
        recycler_view.adapter = adapter
    }
}
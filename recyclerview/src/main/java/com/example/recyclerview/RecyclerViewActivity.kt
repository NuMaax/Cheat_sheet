package com.example.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityRecyclerViewBinding

class RecyclerViewActivity : AppCompatActivity() {
    lateinit var binding: ActivityRecyclerViewBinding
    private val adapter = PersonAdapter()
    private val personLists = PersonsLists()
    private var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Recycler View Activity"

        initRecyclerView()
    }

    private fun initRecyclerView() {
        adapter.addPerson(Person(R.drawable.andrey, "Name: Andrey", "Age: 25"))
        adapter.addPerson(Person(R.drawable.anna, "Name: Anna", "Age: 23"))
        adapter.addPerson(Person(R.drawable.igor, "Name: Igor", "Age: 28"))
        adapter.addPerson(Person(R.drawable.karina, "Name: Karina", "Age: 23"))
        adapter.addPerson(Person(R.drawable.mark, "Name: Mark", "Age: 33"))
        adapter.addPerson(Person(R.drawable.nella, "Name: Nella", "Age: 53"))
        adapter.addPerson(Person(R.drawable.sergey, "Name: Sergey", "Age: 48"))
        binding.rcPersons.layoutManager = LinearLayoutManager(this@RecyclerViewActivity)
        binding.rcPersons.adapter = adapter

/*            // для повторения от 1 до 25
        for (i in 1..25) {
            if (index > personLists.listOfImagesId.size - 1) index = 0
            val person = Person(
                personLists.listOfImagesId[index],
                personLists.listOfNames[index],
                personLists.listOfAges[index],
            )
            adapter.addPerson(person)
            index++
        }*/
    }
}
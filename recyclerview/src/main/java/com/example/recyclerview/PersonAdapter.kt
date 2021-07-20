package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.NamesItemBinding


class PersonAdapter : RecyclerView.Adapter<PersonAdapter.PersonHolder>() {

    // список/массив, откуда адаптер берет данные, может быть БД
    private val personList = ArrayList<Person>()

    // наполнение. изменить в "fun bind"
    class PersonHolder(item: View) : RecyclerView.ViewHolder(item) {

        private val binding = NamesItemBinding.bind(item)

        fun bind(person: Person) {
            binding.imPersonPic.setImageResource(person.imageId)
            binding.tvName.text = person.personName
            binding.tvAge.text = person.personAge
        }
    }

    // onCreateViewHolder() берет пустой шаблон и заполняет его
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.names_item, parent, false
        )
        return PersonHolder(view)
    }

    // связывает с PersonViewHolder()
    override fun onBindViewHolder(holder: PersonHolder, position: Int) {
        holder.bind(personList[position])
    }

    // изменить personList
    override fun getItemCount(): Int {
        return personList.size
    }

    // доп. ф-ция, добавляет элемент в массив, изменить (person: Person), personList
    fun addPerson(person: Person) {
        personList.add(person)
        notifyDataSetChanged()
    }

//    // https://youtu.be/4pevVON0v-U?list=PLmjT2NFTgg1fdHN-9Wn4XYr-IOuadxMm5&t=3291
//    // добавление целого списка сразу
//    fun addAll(list: List<Person>) {
//        personList.clear()
//        personList.addAll(list)
//        notifyDataSetChanged()
//    }
}
package com.example.appsem5_2_agendarecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    var contacts = ArrayList<Contact>()
    //Creando adapter
    var contactAdapter = ContactAdapter(contacts)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadContacts()
        initView()
    }

    private fun initView() {
        val rvContact = findViewById<RecyclerView>(R.id.rvContact)

        rvContact.adapter = contactAdapter
        rvContact.layoutManager = LinearLayoutManager(this)
    }

    private fun loadContacts() {
        contacts.add(Contact("Arturo B.", "123456789"))
        contacts.add(Contact("Bruno C.", "234567890"))
        contacts.add(Contact("Carla D.", "345678901"))
        contacts.add(Contact("Diana E.", "456789012"))
        contacts.add(Contact("Eduardo F.", "567890123"))
    }
}
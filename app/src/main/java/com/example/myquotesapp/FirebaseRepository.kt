package com.example.myquotesapp

import com.google.firebase.Firebase
import com.google.firebase.database.FirebaseDatabase
import kotlin.text.Typography.quote

object FirebaseRepository {
    private val db = FirebaseDatabase.getInstance().getReference("quotes")

    fun addQuote(quote: Quote){
        val id = db.push().key!!
        db.child(id).setValue(quote.copy(id = id))
    }

}
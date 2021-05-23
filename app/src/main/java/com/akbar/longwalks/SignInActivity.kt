package com.akbar.longwalks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SignInActivity : AppCompatActivity() {

    lateinit var btn_next: Button
    lateinit var firstname: EditText
    lateinit var lastname: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        btn_next = findViewById<Button>(R.id.btn_next)
        firstname = findViewById<EditText>(R.id.et_firstname)
        lastname = findViewById<EditText>(R.id.et_lastname)
        btn_next.setOnClickListener({
            this.chekcUser(firstname.text.toString(), lastname.text.toString())
        })
    }

    private fun chekcUser(first: String, last: String) {
        if (first.length > 10 || first.isEmpty()) {
            this.firstname.error = "firstname tidak boleh kosong atau lebih dari 10 karakter"
            return
        }

        if (last.length > 10 || last.isEmpty()) {
            this.lastname.error = "lastname tidak boleh kosong atau lebih dari 10 karakter"
            return
        }

        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}
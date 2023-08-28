package com.inovaupe.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val username = findViewById<EditText>(R.id.username)
       val password = findViewById<EditText>(R.id.password)
       val loginButton = findViewById<Button>(R.id.loginButton)

        loginButton.setOnClickListener(View.OnClickListener {
            if(username.text.toString() == "user" && password.text.toString() == "1234") {
                Toast.makeText(this@MainActivity, "Login feito!", Toast.LENGTH_SHORT).show()
            }else {
                Toast.makeText(this@MainActivity, "Login falhou!", Toast.LENGTH_SHORT).show()
            }

        })
    }
}
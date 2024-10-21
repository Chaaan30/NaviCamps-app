package com.project.navicamps

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val idNumber: EditText = findViewById(R.id.editTextIdNumber)
        val username: EditText = findViewById(R.id.editTextUsername)
        val password: EditText = findViewById(R.id.editTextPassword)
        val submitButton: Button = findViewById(R.id.submitButton)

        submitButton.setOnClickListener {
            val idNum = idNumber.text.toString()
            val user = username.text.toString()
            val pass = password.text.toString()

            // Add validation or handle the data as needed
            if (idNum.isNotEmpty() && user.isNotEmpty() && pass.isNotEmpty()) {
                Toast.makeText(this, "Registration Successful", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

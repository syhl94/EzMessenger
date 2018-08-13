package com.example.sam.ezmessenger

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login_button_login.setOnClickListener({
            performLogin()
        })

        back_to_register_textview.setOnClickListener({
            finish()
        })
    }

    private fun performLogin() {
        val email = email_edittext_login.text.toString()
        val password = password_edittext_login.text.toString()

        Log.d("LoginActivity", "Login button with email/pw: $email/$password")

        FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
                .addOnCompleteListener{
                    if (!it.isSuccessful) return@addOnCompleteListener

                    // Logged in successfully
                    Log.d("LoginActivity", "User logged in successfully")
                }
                .addOnFailureListener {
                    Log.d("LoginActivity", "User failed to login: ${it.message}")
                    Toast.makeText(this, "User failed to login: ${it.message}", Toast.LENGTH_SHORT).show()
                }
    }
}
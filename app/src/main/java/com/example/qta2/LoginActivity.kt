package com.example.qta2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.properties.Delegates

class LoginActivity : AppCompatActivity() {

    companion object{
        lateinit var userEmail : String
    }

    private var password by Delegates.notNull<String>()
    private var username by Delegates.notNull<String>()
    private lateinit var etEmail: EditText
    private lateinit var etPassword : EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        etEmail = findViewById(R.id.et_usuario)
        etPassword = findViewById(R.id.et_password)

    }
    fun callRegister(view: View){
        Register()
    }
    private fun Register(){
        userEmail = etEmail.text.toString()
        val intent = Intent(this, fragmentsActivity::class.java)
        startActivity(intent)
    }
}
package com.example.qta2

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class fragmentsActivity : AppCompatActivity() {

    private lateinit var tvUsername: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fragments)


        var userName = LoginActivity.userEmail


        tvUsername = findViewById(R.id.tv_username)
        //tvUsername.text = getString(R.id.tv_username, userName)


    }
}
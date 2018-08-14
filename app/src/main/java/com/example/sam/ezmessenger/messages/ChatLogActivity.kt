package com.example.sam.ezmessenger.messages

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.sam.ezmessenger.R

class ChatLogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_log)

        supportActionBar?.title = "Chat Log"
    }
}

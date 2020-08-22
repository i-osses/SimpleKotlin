package com.prodev.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_send.setOnClickListener{
            val userName = user_name.text.toString()

            if (userName.isEmpty())
                Toast.makeText(this,"Please insert you name", Toast.LENGTH_LONG).show()
            else
                Toast.makeText(this,"Welcome " +  userName, Toast.LENGTH_LONG).show()


        }
    }


    fun sendName(view: View) {}
}
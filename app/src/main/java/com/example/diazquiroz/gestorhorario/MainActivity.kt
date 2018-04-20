package com.example.diazquiroz.gestorhorario

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.login.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        iniciarBtn.setOnClickListener {
            val user = userTxt.text
            val password = passTxt.text

            //println("el usuario es $user y la contraseña es $password")


        }
    }
}

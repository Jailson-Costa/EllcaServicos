package com.example.ellcaservios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.TextureView
import android.widget.TextView
import com.example.ellcaservios.databinding.ActivityMainBinding
import com.google.android.gms.auth.api.signin.GoogleSignInClient

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    private lateinit var googleSignInClient: GoogleSignInClient



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        val view = binding.root
        //val fazer_login_conta_google = binding.bottonGoogle.getChildAt(0) as TextView




        setContentView(view)  


        //fazer_login_conta_google.text = "Fazer Login com Google"


    }
}
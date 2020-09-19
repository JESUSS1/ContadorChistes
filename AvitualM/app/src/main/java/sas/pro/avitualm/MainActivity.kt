package sas.pro.avitualm

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import sas.pro.avitualm.View.view_asistente


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // navigateToActivity(view_asistente.class)
        navigateToActivity()

    }
    private fun navigateToActivity() {
        startActivity(Intent(this, view_asistente::class.java))
    }



}
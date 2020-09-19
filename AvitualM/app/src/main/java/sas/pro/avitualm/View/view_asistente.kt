package sas.pro.avitualm.View

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_view_asistente.*
import sas.pro.avitualm.Base.BaseActivity
import sas.pro.avitualm.Interfaces.interface_asistente
import sas.pro.avitualm.Presenter.presenter_asistente
import sas.pro.avitualm.R

open class view_asistente :AppCompatActivity(),interface_asistente.View,
    TextToSpeech.OnInitListener {


   internal lateinit var mpresenterAsis : interface_asistente.Presenter
   // private val mpresenterAsis:interface_asistente.Presenter=presenter_asistente(this)

    //
    var leer : TextToSpeech?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_asistente)

        leer=TextToSpeech(this,this);
        mpresenterAsis=presenter_asistente(this)


        asistente_btn_hablar.setOnClickListener(View.OnClickListener {
            Hablar()
        })

    }


    override fun Hablar() {
        mpresenterAsis.Hablar();
    }

    override fun Responder(data:String) {
        leer?.speak(data,TextToSpeech.QUEUE_FLUSH,null,null )
        asistent_txt_respuesta.setText(data)
    }

    override fun onInit(p0: Int) {
      // Toast.makeText(this,"m...",Toast.LENGTH_SHORT).show()
    }


}
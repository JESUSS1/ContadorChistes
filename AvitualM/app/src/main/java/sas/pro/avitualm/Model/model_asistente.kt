package sas.pro.avitualm.Model


import android.app.Activity
import android.content.Intent
import android.speech.RecognizerIntent
import android.util.Log
import android.widget.Toast
import androidx.core.app.ActivityCompat.startActivityForResult
import sas.pro.avitualm.Interfaces.interface_asistente
import java.lang.Exception
import java.util.*

class model_asistente:interface_asistente.Model {

    private val REQUEST_CODE_SPEECH_INPUT=100
    var lectura=""

    override fun Hablar(): String {

        val arrayLista=Chistes().pChistes.size
        val rnds = (0..arrayLista-1).random()
        Log.d("datos",""+rnds)

        return Chistes().pChistes[rnds]
        /*  val speechIntent=Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
          speechIntent.putExtra(
              RecognizerIntent.EXTRA_LANGUAGE_MODEL,
              RecognizerIntent.LANGUAGE_MODEL_FREE_FORM)
          speechIntent.putExtra(RecognizerIntent.EXTRA_LANGUAGE,Locale.getDefault())
          speechIntent.putExtra(RecognizerIntent.EXTRA_PROMPT,"hola repite de nuevo")

          try {
              startActivityForResult(speechIntent,REQUEST_CODE_SPEECH_INPUT)


          }catch (e:Exception){
              return "error"
          }*/


    }



}
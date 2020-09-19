package sas.pro.avitualm.Interfaces

import android.content.Intent

open interface interface_asistente {

    open interface View{
        fun Hablar()
        fun Responder(data:String)
    }

    open interface Presenter{
        fun Hablar()
        fun Responder(data:String)
    }
    open interface Model{
        fun Hablar():String

    }

}
package sas.pro.avitualm.Presenter

import sas.pro.avitualm.Base.BasePresenter
import sas.pro.avitualm.Interfaces.interface_asistente
import sas.pro.avitualm.Model.model_asistente


open class presenter_asistente(var mViewAsis:interface_asistente.View )  : interface_asistente.Presenter {

   // internal lateinit var mModelAsis : interface_asistente.Model
  // internal lateinit var mViewAsis : interface_asistente.View


    var mModelAsis:interface_asistente.Model=model_asistente();



    override fun Hablar() {
        var data=mModelAsis.Hablar()
        Responder(data)

    }

    override fun Responder(data:String) {
        mViewAsis.Responder(data)
    }

}
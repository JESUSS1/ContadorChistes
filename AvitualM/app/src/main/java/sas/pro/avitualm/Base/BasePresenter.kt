package sas.pro.avitualm.Base

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.annotation.CallSuper
import androidx.annotation.Nullable


open abstract class BasePresenter {

    protected fun BasePresenter(){
    }

    @CallSuper
    open fun onCreate(saveInstanceState: Bundle?) {
    }

    @CallSuper
    open fun onResume() {
        Log.d("datos", "resumen")
    }

    @CallSuper
    open fun onPause() {
    }

    @CallSuper
    open fun onSaveInstanceState(outState: Bundle?) {
    }

    @CallSuper
    open fun onDestroy() {
    }

    @CallSuper
    open fun onActivityResult(resqustCode: Int, resulCode: Int, @Nullable data: Intent?) {
    }

    @CallSuper
    open fun onResquestPermissionResult(resquestCode: Int, permissions: Array<String?>, grantResults: IntArray) {
    }


}
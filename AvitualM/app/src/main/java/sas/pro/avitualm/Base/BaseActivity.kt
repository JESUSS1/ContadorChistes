package sas.pro.avitualm.Base

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.annotation.Nullable
import androidx.appcompat.app.AppCompatActivity


open abstract class BaseActivity <Presenter : BasePresenter> : AppCompatActivity() {

    protected var mPresenter: Presenter? = null

    protected abstract fun createPresenter(context: Context): Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mPresenter = createPresenter(this)
        mPresenter?.onCreate(savedInstanceState)
    }

    override fun onSaveInstanceState(
        outState: Bundle,
        outPersistentState: PersistableBundle
    ) {
        super.onSaveInstanceState(outState, outPersistentState)
        mPresenter?.onSaveInstanceState(outState)
    }


    override fun onPause() {
        super.onPause()
        mPresenter?.onPause()
    }

    override fun onResume() {
        super.onResume()
        mPresenter!!.onResume()
    }

    override fun onDestroy() {
        super.onDestroy()
        mPresenter!!.onDestroy()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, @Nullable data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        mPresenter!!.onActivityResult(resultCode, resultCode, data)
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String?>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        mPresenter!!.onResquestPermissionResult(requestCode, permissions, grantResults)
    }


}
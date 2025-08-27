package tr.com.solidandroid.common

import android.content.Context
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

object Dialogs {

    fun showToastMessage(context : Context,message: String){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
    fun showAlertDialog(context : Context,message: String){

        AlertDialog.Builder(context).apply {
            setTitle("Başlık")
            setMessage(message)
            setPositiveButton("Tamam") { dialog, _ ->
                dialog.dismiss()
            }
            setNegativeButton("İptal") { dialog, _ ->
                dialog.dismiss()
            }
            create()
            show()
        }

    }
}
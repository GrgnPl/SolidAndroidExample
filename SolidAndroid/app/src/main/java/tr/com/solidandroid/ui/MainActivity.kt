package tr.com.solidandroid.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import tr.com.solidandroid.common.Dialogs
import tr.com.solidandroid.data.Users
import tr.com.solidandroid.databinding.ActivityMainBinding
import tr.com.solidandroid.rest.AuthResult
import tr.com.solidandroid.rest.LoginInterface

class MainActivity : AppCompatActivity(), LoginInterface {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button.setOnClickListener {
            val email = binding.emailText.text.toString()
            val password = binding.passText.text.toString()

            val users = Users(email,password)
            val giris= login(users)

            when(giris){
                is AuthResult.Success -> {
                    Dialogs.showToastMessage(this,giris.message)
                    val intent = Intent(this,MenuActivity::class.java)
                    startActivity(intent)
                }
                is AuthResult.Error -> {
                    Dialogs.showAlertDialog(this,giris.message)
                }
            }
        }
    }

}
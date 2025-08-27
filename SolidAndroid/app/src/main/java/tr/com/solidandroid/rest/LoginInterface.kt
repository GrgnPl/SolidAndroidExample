package tr.com.solidandroid.rest

import android.util.Log
import tr.com.solidandroid.data.Users

interface LoginInterface: AuthInterface {

     fun login(users: Users):AuthResult{
        Log.e("LoginInterface","${users.email} ${users.pass}")
        val sonuc = auth(users)
        return sonuc
    }
}
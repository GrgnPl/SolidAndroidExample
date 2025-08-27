package tr.com.solidandroid.rest

import tr.com.solidandroid.data.Users

interface AuthInterface {
     fun auth(users: Users):AuthResult{
        if (users.email == "ADMIN" && users.pass == "girim"){

            return AuthResult.Success("Giriş Başarılı")
        }
        else
        {
            return  AuthResult.Error("Hatalı Giriş")
        }
    }
}
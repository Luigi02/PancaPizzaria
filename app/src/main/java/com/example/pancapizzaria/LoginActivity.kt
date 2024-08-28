package com.example.pancapizzaria

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.pancapizzaria.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun logar(view: View) {
        //Recuperar os valores digitados
        val login = binding.etLogin.text.toString()
        val senha = binding.etSenha.text.toString()
        //Valida o usuário e senha
        if (login == "FIAP" && senha == "123") {
            //Mudar de tela Tela de Destino
            val intent = Intent(this, MainActivity::class.java)
            //Passar uma valor para a outra tela
            intent.putExtra("usuario", login)
            //Iniciar a outra tela
            startActivity(intent)
            finish()
        } else {
            //Login ou senha inválidos
            Toast.makeText(
                this, "Usuário ou senha inválidos",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
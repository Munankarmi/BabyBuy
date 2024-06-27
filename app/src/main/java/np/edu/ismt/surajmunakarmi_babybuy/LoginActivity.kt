package np.edu.ismt.surajmunakarmi_babybuy

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.util.Patterns
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import np.edu.ismt.surajmunakarmi_babybuy.dashboard.DashboardActivity
import np.edu.ismt.surajmunakarmi_babybuy.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private val TAG = "LoginActivity"
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        Log.i(TAG, "onCreate: ")

        binding.btnLogin.setOnClickListener {
            val email = binding.tieEmail.text?.trim()
            val password = binding.tiePassword.text?.trim()

            if (email.isNullOrEmpty()){
                Toast.makeText(this@LoginActivity, "Please enter Email", Toast.LENGTH_SHORT).show()
            } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                Toast.makeText(this@LoginActivity, "Please enter valid Email", Toast.LENGTH_SHORT).show()
            }else if (password.isNullOrEmpty()){
                Toast.makeText(this@LoginActivity, "Please enter Password", Toast.LENGTH_SHORT).show()
            }else {
                val sharedPreferences = this@LoginActivity.getSharedPreferences("app", Context.MODE_PRIVATE)
                val sharedPrefEditor = sharedPreferences.edit()
                sharedPrefEditor.putBoolean("logged In", true)
                sharedPrefEditor.apply() // remembering last logged in ID in local xml file

               val intent = Intent(this@LoginActivity, DashboardActivity::class.java)
                startActivity(intent)
            }

        }
        binding.ctvRegister.setOnClickListener {
            val intent = Intent(this@LoginActivity, RegistrationActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy: ")
    }
    
}
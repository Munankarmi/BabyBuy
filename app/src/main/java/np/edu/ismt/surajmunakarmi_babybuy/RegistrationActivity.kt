package np.edu.ismt.surajmunakarmi_babybuy

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.util.Patterns
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import np.edu.ismt.surajmunakarmi_babybuy.databinding.ActivityLoginBinding
import np.edu.ismt.surajmunakarmi_babybuy.databinding.ActivityRegistrationBinding
import kotlin.jvm.Throws

class RegistrationActivity : AppCompatActivity() {

    private val TAG = "RegistrationActivity"
    private lateinit var binding: ActivityRegistrationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        Log.i(TAG, "onCreate: ")

        binding.btnRegister.setOnClickListener {
            val fullName = binding.tieFullname.text?.trim()
            val email = binding.tieEmail.text?.trim()
            val username = binding.tieUsername.text?.trim()
            val password = binding.tiePassword.text?.trim()
            val confirmPassword = binding.tieConfirmPassword.text?.trim()

            if (fullName.isNullOrEmpty()){
                Toast.makeText(this@RegistrationActivity, "Please enter your FullName", Toast.LENGTH_SHORT).show()
            }else if (email.isNullOrEmpty()){
                Toast.makeText(this@RegistrationActivity, "Please enter an Email", Toast.LENGTH_SHORT).show()
            } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                Toast.makeText(this@RegistrationActivity, "Please enter valid Email", Toast.LENGTH_SHORT).show()
            }else if (username.isNullOrEmpty()){
                Toast.makeText(this@RegistrationActivity, "Please enter Username", Toast.LENGTH_SHORT).show()
            }else if (password.isNullOrEmpty()){
                Toast.makeText(this@RegistrationActivity, "Please enter Password", Toast.LENGTH_SHORT).show()
            }else if (confirmPassword.isNullOrEmpty()){
                Toast.makeText(this@RegistrationActivity, "Please enter Password", Toast.LENGTH_SHORT).show()
            }else {
                // connect to local db
            }
        }

        binding.ctvLogin.setOnClickListener {
            val intent = Intent(this@RegistrationActivity, LoginActivity::class.java)
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
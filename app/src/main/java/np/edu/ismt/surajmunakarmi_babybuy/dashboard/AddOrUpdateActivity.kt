package np.edu.ismt.surajmunakarmi_babybuy.dashboard

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import np.edu.ismt.surajmunakarmi_babybuy.dashboard.db.BabyBuydb
import np.edu.ismt.surajmunakarmi_babybuy.databinding.ActivityAddOrUpdateBinding

class AddOrUpdateActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddOrUpdateBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddOrUpdateBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val babyBuyDb = BabyBuydb.getInstance(this.applicationContext)
        val productDao = babyBuyDb.getProductDao()

        Thread{
            productDao.getAllProduct()
            runOnUiThread {  }
        }.start()

    }
}
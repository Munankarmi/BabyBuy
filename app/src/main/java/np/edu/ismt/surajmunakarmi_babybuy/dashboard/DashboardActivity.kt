package np.edu.ismt.surajmunakarmi_babybuy.dashboard

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import np.edu.ismt.surajmunakarmi_babybuy.R
import np.edu.ismt.surajmunakarmi_babybuy.databinding.ActivityDashboardBinding


class DashboardActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDashboardBinding
    private val fragmentManager = supportFragmentManager
    private val homeFragment = HomeFragment()
    private val recommendationFragment = RecommendationFragment()
    private val myItemsFragment = MyItemsFragment()
    private val profileFragment = ProfileFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        loadRequiredFragments(homeFragment)
        binding.navBar.setOnItemSelectedListener {menuItem ->
            when(menuItem.itemId){
                R.id.home ->{
                    loadRequiredFragments(homeFragment)
                    true
                }
                R.id.recommendation ->{
                    loadRequiredFragments(recommendationFragment)
                    true
                }
                R.id.my_items ->{
                    loadRequiredFragments(myItemsFragment)
                    true
                }
                R.id.profile ->{
                    loadRequiredFragments(profileFragment)
                    true
                }

                else -> false
            }

        }

    }


    private fun loadRequiredFragments(Fragments: Fragment){
        fragmentManager.beginTransaction()
            .replace(binding.fragmentContainerView.id, Fragments, null)
            .setReorderingAllowed(true)
            .addToBackStack(null)
            .commit()
    }
}
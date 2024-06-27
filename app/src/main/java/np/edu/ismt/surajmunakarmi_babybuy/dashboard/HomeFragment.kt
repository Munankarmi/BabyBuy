package np.edu.ismt.surajmunakarmi_babybuy.dashboard

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import np.edu.ismt.surajmunakarmi_babybuy.PregnancyState
import np.edu.ismt.surajmunakarmi_babybuy.Product
import np.edu.ismt.surajmunakarmi_babybuy.dashboard.adapters.MyItemsHorizontalAdapter
import np.edu.ismt.surajmunakarmi_babybuy.dashboard.adapters.RecommendationHorizontalAdapter
import np.edu.ismt.surajmunakarmi_babybuy.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding : FragmentHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        loadRecommendation()
        loadAddItemPage()
        loadMyItems()
        return binding.root
    }

    private fun loadRecommendation(){
        val adapter = RecommendationHorizontalAdapter(getProductsRecommendation())
        binding.rvRecommendation.layoutManager = LinearLayoutManager(requireActivity(), RecyclerView.HORIZONTAL, false)
        binding.rvRecommendation.adapter = adapter
    }

    private fun loadMyItems(){
        val adapter = MyItemsHorizontalAdapter(getProductsRecommendation())
        binding.rvMyItems.layoutManager = LinearLayoutManager(requireActivity(), RecyclerView.HORIZONTAL, false)
        binding.rvMyItems.adapter = adapter
    }

    private fun getProductsRecommendation(): List<Product>{
        val products = mutableListOf<Product>()

        val product1 = Product(
            item = "product1",
            category = "category 1",
            itemRequiredTime = PregnancyState.PRE_BIRTH
        )
        products.add(product1)
        val product2 = Product(
            item = "product2",
            category = "category 2",
            itemRequiredTime = PregnancyState.PRE_BIRTH
        )
        products.add(product2)
        val product3 = Product(
            item = "product3",
            category = "category 3",
            itemRequiredTime = PregnancyState.POST_BIRTH
        )
        products.add(product3)
        val product4 = Product(
            item = "product4",
            category = "category4",
            itemRequiredTime = PregnancyState.PRE_BIRTH
        )
        products.add(product4)
        return products
    }

    private fun loadAddItemPage() {
        binding.fabToAddItem.setOnClickListener {
            val intent = Intent(requireActivity(), AddOrUpdateActivity::class.java)
            startActivity(intent)
        }
    }
}
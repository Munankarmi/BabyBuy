package np.edu.ismt.surajmunakarmi_babybuy.dashboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import np.edu.ismt.surajmunakarmi_babybuy.PregnancyState
import np.edu.ismt.surajmunakarmi_babybuy.Product
import np.edu.ismt.surajmunakarmi_babybuy.R
import np.edu.ismt.surajmunakarmi_babybuy.dashboard.adapters.MyItemsVerticalAdapter
import np.edu.ismt.surajmunakarmi_babybuy.dashboard.adapters.RecommendationVerticalAdapter
import np.edu.ismt.surajmunakarmi_babybuy.databinding.FragmentMyItemsBinding
import np.edu.ismt.surajmunakarmi_babybuy.databinding.MyItemsPageLayoutBinding


class MyItemsFragment : Fragment() {

    private lateinit var binding: FragmentMyItemsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMyItemsBinding.inflate(layoutInflater, container, false)
        loadMyItemsPage()
        return binding.root
    }

    private fun loadMyItemsPage(){
        val adapter = MyItemsVerticalAdapter(getProductsRecommendation())
        binding.rvMyItemsPage.layoutManager = LinearLayoutManager(requireActivity(), RecyclerView.VERTICAL, false)
        binding.rvMyItemsPage.adapter = adapter
    }

    private fun getProductsRecommendation(): List<Product>{
        val products = mutableListOf<Product>()

        val product1 = Product(
            item = "product1",
            category = "category 1",
            price = "$$$$$",
            description = "describe",
            itemRequiredTime = PregnancyState.PRE_BIRTH
        )
        products.add(product1)
        val product2 = Product(
            item = "product2",
            category = "category 2",
            price = "$$$$$",
            description = "describe",
            itemRequiredTime = PregnancyState.PRE_BIRTH
        )
        products.add(product2)
        val product3 = Product(
            item = "product3",
            category = "category 3",
            price = "$$$$$",
            description = "describe",
            itemRequiredTime = PregnancyState.POST_BIRTH
        )
        products.add(product3)
        val product4 = Product(
            item = "product4",
            category = "category4",
            price = "$$$$$",
            description = "describe",
            itemRequiredTime = PregnancyState.PRE_BIRTH
        )
        products.add(product4)
        return products
    }

}
package np.edu.ismt.surajmunakarmi_babybuy.dashboard.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import np.edu.ismt.surajmunakarmi_babybuy.Product
import np.edu.ismt.surajmunakarmi_babybuy.databinding.LayoutMyItemsBinding
import np.edu.ismt.surajmunakarmi_babybuy.databinding.RecommendationPageLayoutBinding

class RecommendationVerticalAdapter(private val products: List<Product>):RecyclerView.Adapter<RecommendationVerticalAdapter.ViewHolder>() {
    class ViewHolder(val binding: RecommendationPageLayoutBinding): RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = RecommendationPageLayoutBinding.inflate(inflater, parent, false)

        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return products.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = products[position]
        holder.binding.tvRecommendationPageItem.text = product.item
        holder.binding.tvRecommendationPageCategory.text = product.category
        holder.binding.tvRecommendationPagePrice.text = product.price
        holder.binding.tvRecommendationPageDescription.text = product.description
    }
}

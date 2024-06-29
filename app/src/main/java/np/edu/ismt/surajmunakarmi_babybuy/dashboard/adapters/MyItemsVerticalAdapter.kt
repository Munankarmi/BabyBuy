package np.edu.ismt.surajmunakarmi_babybuy.dashboard.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import np.edu.ismt.surajmunakarmi_babybuy.Product
import np.edu.ismt.surajmunakarmi_babybuy.databinding.MyItemsPageLayoutBinding
import np.edu.ismt.surajmunakarmi_babybuy.databinding.RecommendationPageLayoutBinding

class MyItemsVerticalAdapter(private val products: List<Product>): RecyclerView.Adapter<MyItemsVerticalAdapter.ViewHolder>() {
    class ViewHolder(val binding: MyItemsPageLayoutBinding): RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = MyItemsPageLayoutBinding.inflate(inflater, parent, false)

        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return products.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = products[position]
        holder.binding.tvMyItemsPageItem.text = product.item
        holder.binding.tvMyItemsPageCategory.text = product.category
        holder.binding.tvMyItemsPagePrice.text = product.price
        holder.binding.tvMyItemsPageDescription.text = product.description
    }
}
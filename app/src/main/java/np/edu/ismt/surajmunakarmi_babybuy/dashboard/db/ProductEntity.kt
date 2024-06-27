package np.edu.ismt.surajmunakarmi_babybuy.dashboard.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import np.edu.ismt.surajmunakarmi_babybuy.PregnancyState

@Entity(tableName = "product")
data class ProductEntity(
    @PrimaryKey(autoGenerate = true)
    val id : Long = 0,
    val item: String? = "",
    val price: String? ="",
    val description: String? ="",
    val category: String? = "",
    @ColumnInfo(name = "item_required_time")
    val itemRequiredTime: PregnancyState,
    @ColumnInfo(name = "mark_as_purchased")
    val markAsPurchased: Boolean = false,
    @ColumnInfo(name = "location_lat")
    val locationLat: String? ="",
    @ColumnInfo(name = "location_log")
    val locationLog: String? = "",
    val image: String = ""
)

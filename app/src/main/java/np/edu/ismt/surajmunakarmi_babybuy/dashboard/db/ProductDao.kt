package np.edu.ismt.surajmunakarmi_babybuy.dashboard.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface ProductDao {

    @Insert
    fun insertProduct(productEntity: ProductEntity)

    @Insert
    fun insertProduct(productEntities: List<ProductEntity>)

    @Update
    fun updateProduct(productEntity: ProductEntity)

    @Delete
    fun deleteProduct(productEntity: ProductEntity)

    @Query("select *from product")
    fun getAllProduct(): List<ProductEntity>

    @Query("select *from product where item = :nameOfProducy")
    fun getAllProductByName(nameOfProducy: String): List<ProductEntity>
}
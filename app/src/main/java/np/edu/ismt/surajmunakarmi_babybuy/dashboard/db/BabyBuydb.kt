package np.edu.ismt.surajmunakarmi_babybuy.dashboard.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
@Database(entities = [ProductEntity::class], version = 1)

abstract class BabyBuydb: RoomDatabase() {
    companion object{
        fun getInstance(applicationContext: Context): BabyBuydb{
            return Room.databaseBuilder(
                applicationContext,
                BabyBuydb::class.java,
                "BabyBuydb"
            ).build()
        }
    }

    abstract fun getProductDao(): ProductDao
}

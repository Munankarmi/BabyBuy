package np.edu.ismt.surajmunakarmi_babybuy

data class Product(
    val item: String? = "",
    val price: String? ="",
    val description: String? ="",
    val category: String? = "",
    val itemRequiredTime: PregnancyState,
    val markAsPurchased: Boolean = false,
    val locationLat: String? ="",
    val locationLog: String? = "",
    val image: String = ""
)

enum class PregnancyState{
    PRE_BIRTH, POST_BIRTH
}
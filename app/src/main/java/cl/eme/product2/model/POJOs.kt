package cl.eme.product2.model

import androidx.room.Entity
import androidx.room.PrimaryKey

// POJOs

@Entity (tableName = "product2")

data class Products2 (
    @PrimaryKey val id: Int,
    val name: String,
    val price: String,
    val image: String,
        )
@Entity (tableName = "productDetail2")

data class ProductDetail2 (
    @PrimaryKey val id: Int,
    val name: String,
    val price: String,
    val image: String,
    val description: String,
    val lastPrice: String,
    val credit: String,
        )
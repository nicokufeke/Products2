package cl.eme.product2.model

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path


interface Product2API {

    @GET("products/")
    suspend fun getProduct2() : Response<List<Products2>>

    @GET ("details/{pid")
    suspend fun getProductDetail2(@Path("pid") id: Int)
}
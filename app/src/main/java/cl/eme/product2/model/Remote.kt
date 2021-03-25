package cl.eme.product2.model

import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path


interface Product2API {

    @GET("products/")
    suspend fun getProduct2() : Response<List<Products2>>

    @GET ("details/{pid")
    suspend fun getProductDetail2(@Path("pid") id: Int)
}

//Cliente Retrofit

const val BASE_URL = "https://my-json-server.typicode.com/Himuravidal/FakeAPIdata/"

class RetrofitClient {
    companion object {

        fun instance() : Product2API{
            val retrofit = Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(
                GsonConverterFactory.create()).build()

            return retrofit.create(Product2API::class.java)

        }
    }

}
package uz.ilhomjon.kotlincoroutinesproject1.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {

    const val BASEURL1 = "https://jsonplaceholder.typicode.com/"
    const val BASEURL2 = "https://api.github.com/"

    fun getRetrofit(baseUrl:String): Retrofit{
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun apiService(baseUrl: String) : ApiService{
        return getRetrofit(baseUrl).create(ApiService::class.java)
    }
}

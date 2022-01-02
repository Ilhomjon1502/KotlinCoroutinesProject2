package uz.ilhomjon.kotlincoroutinesproject1.retrofit

import retrofit2.http.GET
import retrofit2.http.Path
import uz.ilhomjon.kotlincoroutinesproject1.models.GithubUser
import uz.ilhomjon.kotlincoroutinesproject1.models.User

interface ApiService {
    @GET("users")
    suspend fun getUsersFromJsonPlaceHolder(): List<User>

    @GET("users")
    suspend fun getUsersFromGithub():List<GithubUser>
}
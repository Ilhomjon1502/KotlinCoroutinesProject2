package uz.ilhomjon.kotlincoroutinesproject1.repository

import uz.ilhomjon.kotlincoroutinesproject1.retrofit.ApiService

class UserRepository(val apiService: ApiService) {

    suspend fun getUsersFromJsonPlaceHolder() = apiService.getUsersFromJsonPlaceHolder()
    suspend fun getUsersFromJsonGithub() = apiService.getUsersFromGithub()
}
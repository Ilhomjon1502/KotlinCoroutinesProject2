package uz.ilhomjon.kotlincoroutinesproject1.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class UserViewModelFactory :ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(UserViewModel::class.java)){
            return UserViewModel() as T
        }
        throw IllegalArgumentException("Error in UserViewModelFactory")
    }

}
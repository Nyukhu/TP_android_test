package com.openclassrooms.magicgithub.repository

import com.openclassrooms.magicgithub.api.ApiService
import com.openclassrooms.magicgithub.api.FakeApiServiceGenerator
import com.openclassrooms.magicgithub.model.User

class UserRepository(private val apiService: ApiService) {

    val users: MutableList<User> = apiService.getUsers() as MutableList<User>
        get() = field


    /**
     *
     * add a random user to the users list
     */
    fun generateRandomUser() {
        users.add(FakeApiServiceGenerator.generateRandomUser())
    }

    fun deleteUser(user: User?) {
        users.remove(user)
    }
}

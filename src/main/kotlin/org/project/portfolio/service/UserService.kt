package org.project.portfolio.service

import org.project.portfolio.entity.User
import org.project.portfolio.repository.UserRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class UserService(private val userRepository: UserRepository) {
    @Transactional
    fun save(user: User) {
        userRepository.save(user);
    }

    fun findById(email: String): User {
        return userRepository.findById(email).get()
    }

    fun findAll(): List<User> {
        return userRepository.findAll()
    }
}
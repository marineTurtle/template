package org.project.portfolio.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "users")
class User(
    @Id
    private val email: String,
    private val phone: String,
    private val name: String,
    private val password: String
)
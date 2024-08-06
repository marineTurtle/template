package org.project.portfolio.entity

import jakarta.persistence.*

@Entity
@Table(name = "board")
class Board (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var no: Long = 0,
    private var title: String,
    private var contents: String
): BaseTimeEntity()

package org.project.portfolio.dto

import org.project.portfolio.entity.Board

data class BoardDto (
    var title: String,
    var contents: String
) {
    fun toEntity(): Board {
        return Board(title=title, contents=contents)
    }
}

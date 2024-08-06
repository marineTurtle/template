package org.project.portfolio.service

import org.project.portfolio.entity.Board
import org.project.portfolio.repository.BoardRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class BoardService(private val boardRepository: BoardRepository) {
    @Transactional
    fun save(board: Board) {
        boardRepository.save(board);
    }

    fun findById(id: Long): Board {
        return boardRepository.findById(id).get()
    }

    fun findAll(): List<Board> {
        return boardRepository.findAll()
    }
}
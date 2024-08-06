package org.project.portfolio.controller

import org.project.portfolio.dto.BoardDto
import org.project.portfolio.service.BoardService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RequestMapping("/board")
@RestController
class BoardController(private val boardService: BoardService) {

    @PostMapping("/save")
    fun save(@RequestBody boardDto: BoardDto): ResponseEntity<Any> {
        boardService.save(boardDto.toEntity())
        return ResponseEntity.ok().body(true)
    }

    @GetMapping("/all")
    fun findAll(): ResponseEntity<Any> {
        return ResponseEntity.ok().body(boardService.findAll())
    }
}
package org.project.portfolio.controller

import org.project.portfolio.dto.UserDto
import org.project.portfolio.service.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/user")
@RestController
class UserController (private val userService: UserService) {

    @PostMapping("/save")
    fun save(@RequestBody userDto: UserDto): ResponseEntity<Any> {
        userService.save(userDto.toEntity())
        return ResponseEntity.ok().body(true)
    }

    @GetMapping("/all")
    fun findAll(): ResponseEntity<Any> {
        return ResponseEntity.ok().body(userService.findAll())
    }
}
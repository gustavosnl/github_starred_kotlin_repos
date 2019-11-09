package com.glima.github.domain.business.model


data class Repository(
    val id: Int,
    val name: String,
    val forks: Int,
    val stars: Int,
    val description: String,
    val owner: Owner
)
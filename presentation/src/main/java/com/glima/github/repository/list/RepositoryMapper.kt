package com.glima.github.repository.list

import com.glima.github.domain.business.model.Repository

fun List<Repository>.map(): List<RepositoryVO> {
    return map {
        it.map()
    }
}

fun Repository.map() = RepositoryVO(
    name = name,
    forks = forks.toString(),
    stars = stars.toString(),
    description = description,
    ownerAvatar = owner.avatar,
    ownerName = owner.name
)
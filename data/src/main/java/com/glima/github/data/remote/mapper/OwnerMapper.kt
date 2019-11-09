package com.glima.github.data.remote.mapper

import com.glima.github.data.remote.response.OwnerResponse
import com.glima.github.domain.business.model.Owner


fun OwnerResponse.mapFromResponse() = Owner(
    name = name,
    avatar = avatarUrl
)

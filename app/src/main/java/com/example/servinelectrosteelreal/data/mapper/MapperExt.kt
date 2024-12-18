package com.example.servinelectrosteelreal.data.mapper

import com.example.servinelectrosteelreal.data.source.local.GenreLocal
import com.example.servinelectrosteelreal.data.source.remote.GenreEntityRemote
import com.example.servinelectrosteelreal.domain.entity.GenreEntity


fun GenreEntityRemote.mapToGenreLocal() : GenreLocal {
        return GenreLocal(id=id , name =name)
    }

fun GenreLocal.mapToGenreEntity() : GenreEntity {
    return GenreEntity(id=id , name =name)
}
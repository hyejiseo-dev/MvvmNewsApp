package com.androiddevs.mvvmnewsapp.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(
    tableName = "articles"
)
data class Article(
    @PrimaryKey(autoGenerate = true)
    var id : Int? = null,
    val author: String?,
    val content: String?,
    val description: String?,
    val publishedAt: String?,
    val source: Source,   //Source 클래스를 DB가 읽을 수 있도록 String 형식으로 바꿔주는 Converter가 필요!
    val title: String?,
    val url: String,
    val urlToImage: String
) : Serializable
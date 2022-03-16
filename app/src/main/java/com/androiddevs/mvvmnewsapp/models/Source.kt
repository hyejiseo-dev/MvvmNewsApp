package com.androiddevs.mvvmnewsapp.models

data class Source(
    val id: Any,
    val name: String  //Article 테이블에서 읽을 수 있도록 String으로 형식 변환, id는 제외
)
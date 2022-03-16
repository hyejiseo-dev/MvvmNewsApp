package com.androiddevs.mvvmnewsapp.util

sealed class Resource<T>( //로딩, 에러처리, 성공시 응답 발생
    val data: T?=null,
    val message: String? = null
){
    class Success<T>(data: T) : Resource<T>(data)
    class Error<T>(message: String,data: T? = null) : Resource<T>(data,message)
    class Loading<T> : Resource<T>()
}
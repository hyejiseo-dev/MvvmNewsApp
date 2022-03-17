package com.androiddevs.mvvmnewsapp.repository

import com.androiddevs.mvvmnewsapp.api.RetrofitInstance
import com.androiddevs.mvvmnewsapp.db.ArticleDatabase
import retrofit2.Retrofit

class NewsRepository(
    val db : ArticleDatabase   //데이터베이스 접근!
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode,pageNumber)

    suspend fun searchNews(searchQuery:String, pageNumber:Int) =
        RetrofitInstance.api.searchForNews(searchQuery,pageNumber)
}
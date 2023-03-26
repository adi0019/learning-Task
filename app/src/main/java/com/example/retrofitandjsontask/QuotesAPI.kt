package com.example.retrofitandjsontask

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface QuotesAPI {

    @GET("/products")
    suspend fun getQuotes(@Query("page") page: Int) : Response<QuoteList>
}
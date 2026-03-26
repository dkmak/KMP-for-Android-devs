package com.learnkmp.newsapp.networking

import com.learnkmp.newsapp.models.Article
import io.ktor.client.request.get


interface NewsDataRepo {
    suspend fun getNewsData(): List<Article>
}

class NewsDataRepoImpl : NewsDataRepo {

    val httpClient = buildHttpClient() // dependency injection later

    override suspend fun getNewsData(): List<Article> {
        //TODO fetch articles from newsdata.io via the latest_news endpoint

        httpClient.get("https://newsdata.io/api/1/latest?apikey=pub_0d7524f246d842968e8678c486212bb4")
        return emptyList()
    }
}
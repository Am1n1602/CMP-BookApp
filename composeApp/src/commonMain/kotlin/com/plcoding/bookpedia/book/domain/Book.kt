package com.plcoding.bookpedia.book.domain

data class Book(
    val id: String,
    val title: String,
    val imageURL: String,
    val authors: List<String>,
    val description: String?,
    val languages: List<String>,
    val firstPublishYear: String?,
    val avgRating: Double?,
    val ratingCount: Int?,
    val numPages: Int?,
    val numEditions: Int,
)

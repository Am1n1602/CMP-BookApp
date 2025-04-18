package com.plcoding.bookpedia.book.presentation.book_list

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class BookListViewModel: ViewModel() {
    private val _state = MutableStateFlow(BookListState())
    val state = _state.asStateFlow()

    fun onAction(action: BookListAction){
        when(action){
            is BookListAction.OnBookClick -> TODO()
            is BookListAction.OnSearchQueryChange -> TODO()
            is BookListAction.OnTabSelected -> TODO()
        }
    }

}
package com.example.mvvm_livedata_fragment_noteapp.ui.characters

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.mvvm_livedata_fragment_noteapp.data.model.CharactersResponse
import com.example.mvvm_livedata_fragment_noteapp.data.repository.CharactersRepository
import com.example.mvvm_livedata_fragment_noteapp.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CharactersViewModel @Inject constructor(
    private val charactersRepository: CharactersRepository
) : ViewModel() {

    private val response : LiveData<Resource<CharactersResponse>> =
        charactersRepository.getCharactersResponse()

    init {
        getCharacters()
    }
    fun getCharacters(){
        charactersRepository.getCharacters()
    }

    fun getCharactersResponse() : LiveData<Resource<CharactersResponse>> = response

}
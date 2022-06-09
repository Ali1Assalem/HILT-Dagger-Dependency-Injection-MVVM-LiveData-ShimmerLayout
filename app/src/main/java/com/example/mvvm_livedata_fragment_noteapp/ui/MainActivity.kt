package com.example.mvvm_livedata_fragment_noteapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import com.example.mvvm_livedata_fragment_noteapp.ui.characters.CharactersFragment
import com.example.mvvm_livedata_fragment_noteapp.R
import com.example.mvvm_livedata_fragment_noteapp.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        supportFragmentManager.commit {
            replace(R.id.fragment_container,CharactersFragment())
        }
    }
}
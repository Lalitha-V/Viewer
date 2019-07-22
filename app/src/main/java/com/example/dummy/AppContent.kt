package com.example.dummy

import androidx.lifecycle.MutableLiveData
import com.example.models.Character
import com.example.models.CharactersResponse
import com.example.networking.Api
import java.util.ArrayList
import java.util.HashMap

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object AppContent {

    /**
     * An array of items.
     */
    val ITEMS: MutableList<Character> = arrayListOf()

    val ITEM_MAP: MutableMap<String, Character> = HashMap()



    val characters = MutableLiveData<List<Character>>()

}

package com.tutorial_kotlin

data class Hobby(var title:String)

object Supplier{
    val hobbies = listOf<Hobby>(
        Hobby(R.string.swimming.toString()),
        Hobby(R.string.reading.toString()),
        Hobby(R.string.walking.toString()),
        Hobby(R.string.sleeping.toString()),
        Hobby(R.string.gaming.toString()),
        Hobby(R.string.traveling.toString()),
        Hobby(R.string.talking.toString()),
        Hobby(R.string.loving.toString())
    )
}
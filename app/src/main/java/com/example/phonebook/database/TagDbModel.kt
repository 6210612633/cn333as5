package com.example.phonebook.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TagDbModel(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "nameTag") val nameTag: String
) {
    companion object {
        val DEFAULT_TAGS = listOf(
            TagDbModel(1, ""),
            TagDbModel(2, "Mobile"),
            TagDbModel(3, "Home"),
            TagDbModel(4, "Work"),
            TagDbModel(5, "Emergency"),
        )
        val DEFAULT_TAG = DEFAULT_TAGS[0]
    }
}
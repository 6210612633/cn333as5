package com.example.phonebook.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class NoteDbModel(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "content") val content: String,
    @ColumnInfo(name = "color_id") val colorId: Long,
    @ColumnInfo(name = "tag_id") val tagId: Long,
    @ColumnInfo(name = "in_trash") val isInTrash: Boolean
)  {
    companion object {
        val DEFAULT_NOTES = listOf(
            NoteDbModel(1, "Billy Harrington", "0885847415",  1, 2,false),
            NoteDbModel(2, "Tang HadYai", "0642899341",  2, 1,false),
            NoteDbModel(3, "Sang Phamok", "0921371942",  3, 1,false),
            NoteDbModel(4, "Rain Malee", "062154423", 4,2, false),
        )
    }
}
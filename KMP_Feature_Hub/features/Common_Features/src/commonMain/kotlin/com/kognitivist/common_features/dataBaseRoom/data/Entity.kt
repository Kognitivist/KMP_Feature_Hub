package com.kognitivist.common_features.dataBaseRoom.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "texts")
data class TextEntity(
	@PrimaryKey(autoGenerate = true)
	val id: Long = 0,

	val text: String
)
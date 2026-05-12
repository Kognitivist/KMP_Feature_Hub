package com.kognitivist.data.local_data_source.settings

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "settings")
data class SettingsEntity(
	@PrimaryKey
	val id: Long = 0,
	val theme: String = "",
	val language: String = "",
)


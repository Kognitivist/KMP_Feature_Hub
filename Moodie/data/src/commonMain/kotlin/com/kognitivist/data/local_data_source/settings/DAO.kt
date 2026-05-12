package com.kognitivist.data.local_data_source.settings

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.Companion.REPLACE
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow


@Dao
interface SettingsDao {

	@Insert(onConflict = REPLACE)
	suspend fun insert(item: SettingsEntity): Long

	@Update
	suspend fun update(item: SettingsEntity)

	@Query("SELECT * FROM settings WHERE id = 0 LIMIT 1")
	fun observeSettings(): Flow<SettingsEntity?>

	@Query("SELECT * FROM settings WHERE id = 0 LIMIT 1")
	suspend fun getSettings(): SettingsEntity?

}
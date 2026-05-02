package com.kognitivist.common_features.dataBaseRoom.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow


@Dao
interface TextDao {

	@Insert
	suspend fun insert(item: TextEntity): Long

	@Update
	suspend fun update(item: TextEntity)

	@Delete
	suspend fun delete(item: TextEntity)

	@Query("SELECT * FROM texts ORDER BY id DESC")
	fun observeAll(): Flow<List<TextEntity>>

	@Query("SELECT * FROM texts WHERE id = :id LIMIT 1")
	suspend fun getById(id: Long): TextEntity?

	@Query("DELETE FROM texts")
	suspend fun clear()

}
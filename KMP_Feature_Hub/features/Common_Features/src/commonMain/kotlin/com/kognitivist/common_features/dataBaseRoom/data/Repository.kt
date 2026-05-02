package com.kognitivist.common_features.dataBaseRoom.data

import kotlinx.coroutines.flow.Flow

class TextRepository(
	private val dao: TextDao
) {
	fun observeTexts(): Flow<List<TextEntity>> = dao.observeAll()

	suspend fun addText(text: String): Long = dao.insert(TextEntity(text = text))

	suspend fun updateText(id: Long, newText: String) { dao.update(TextEntity(id = id, text = newText)) }

	suspend fun deleteText(item: TextEntity) { dao.delete(item) }

	suspend fun clear() { dao.clear() }

}
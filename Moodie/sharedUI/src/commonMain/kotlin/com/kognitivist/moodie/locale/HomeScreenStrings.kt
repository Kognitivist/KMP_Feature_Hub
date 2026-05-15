package com.kognitivist.moodie.locale

data class HomeScreenStrings(
	val cardTitle: String,
	val cardText: String,
	val cardButton: String,
	val cardHint1: String,
	val cardHint2: String,
	val cardHint3: String,
	val hint: String,
	val hintResult: String,
	val hintResultStat: (Int)-> String,
	val cardResultTitle: String,
	val cardResultCharacterName: (String)-> String,
	val cardResultCharacterDesc: (String)-> String,
	val cardResultButton: String,
	val whatNext: String,
	val createNote: String,
	val share: String,
	val toCollection: String
)

val ruHomeScreenStrings = HomeScreenStrings(
	cardTitle = "Кто ты сегодня?",
	cardText = "Пройди короткий vibe-check и получи mood-персонажа дня",
	cardButton = "Пройти тест дня",
	cardHint1 = "6 визуальных вопросов",
	cardHint2 = "Менее 1 минуты",
	cardHint3 = "Веселый результат",
	hint = "Возвращайся каждый день и собирай свою коллекцию персонажей!",
	hintResult = "Вернись завтра за новым mood-персонажем!",
	hintResultStat = { "$it дня подряд vibe-check" },
	cardResultTitle = "Сегодня ты –",
	cardResultCharacterName = { it },
	cardResultCharacterDesc = { it },
	cardResultButton = "Посмотреть результат",
	whatNext = "Что дальше?",
	createNote = "Сделать заметку",
	share = "Поделиться",
	toCollection = "В коллекцию"
)

val enHomeScreenStrings = HomeScreenStrings(
	cardTitle = "Who are you today?",
	cardText = "Take a short vibe-check and get your mood character of the day",
	cardButton = "Take today’s test",
	cardHint1 = "6 visual questions",
	cardHint2 = "Less than 1 minute",
	cardHint3 = "Fun result",
	hint = "Come back every day and collect your character collection!",
	hintResult = "Come back tomorrow for a new mood character!",
	hintResultStat = { "$it days in a row with a vibe-check" },
	cardResultTitle = "Today you are",
	cardResultCharacterName = { it },
	cardResultCharacterDesc = { it },
	cardResultButton = "View result",
	whatNext = "What’s next?",
	createNote = "Create note",
	share = "Share",
	toCollection = "To collection"
)


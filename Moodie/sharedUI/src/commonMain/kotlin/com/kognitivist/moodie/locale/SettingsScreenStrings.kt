package com.kognitivist.moodie.locale

import kotlin.String

data class SettingsScreenStrings(
	val settingsTitle: String = "",
	val appearance: String = "",
	val themeApp: String = "",
	val likeSystemTheme: String = "",
	val darkTheme: String = "",
	val lightTheme: String = "",
	val dark: String = "",
	val light: String = "",
	val language: String = "",
	val languageApp: String = "",
	val russian: String = "",
	val english: String = "",
	val howItWorks: String = "",
	val howItWorksText: String = "",
	val lookOnboardingAgainTitle: String = "",
	val lookOnboardingAgainText: String = "",
	val aboutAppTitle: String = "",
	val aboutAppText: String = "",
	val docs: String = "",
	val politics: String = "",
)

val ruSettingsScreenStrings = SettingsScreenStrings(
	settingsTitle = "Настройки",
	appearance = "Внешний вид",
	themeApp = "Тема приложения",
	likeSystemTheme = "Как в системе",
	darkTheme = "Темная тема",
	lightTheme = "Светлая тема",
	dark = "Темная",
	light = "Светлая",
	language = "Язык",
	languageApp = "Язык приложения",
	russian = "Русский",
	english = "English",
	howItWorks = "Как это работает",
	howItWorksText = "Визуальный тест ➔ персонаж ➔ заметка",
	lookOnboardingAgainTitle = "Посмотреть onboarding",
	lookOnboardingAgainText = "Повторный просмотр",
	aboutAppTitle = "О приложении",
	aboutAppText = "Что такое Moodie и для чего оно",
	docs = "Документы",
	politics = "Политика конфиденциальности",
)

val enSettingsScreenStrings = SettingsScreenStrings(
	settingsTitle = "Settings",
	appearance = "Appearance",
	themeApp = "App theme",
	likeSystemTheme = "Use system theme",
	darkTheme = "Dark theme",
	lightTheme = "Light theme",
	dark = "Dark",
	light = "Light",
	language = "Language",
	languageApp = "App language",
	russian = "Русский",
	english = "English",
	howItWorks = "How it works",
	howItWorksText = "Visual test ➔ character ➔ note",
	lookOnboardingAgainTitle = "View onboarding",
	lookOnboardingAgainText = "Watch again",
	aboutAppTitle = "About the app",
	aboutAppText = "What Moodie is and what it is for",
	docs = "Documents",
	politics = "Privacy Policy"
)



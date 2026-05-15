package com.kognitivist.moodie.ui.screens._02_Home

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kognitivist.data.models.Theme
import com.kognitivist.moodie.locale.LocalStrings
import com.kognitivist.moodie.theme.LocalColors
import com.kognitivist.moodie.theme.LocalTextStyles
import com.kognitivist.moodie.theme.MoodieTheme
import com.kognitivist.moodie.ui.kit.vectors.ArrowRight24
import com.kognitivist.moodie.ui.kit.vectors.CardPattern
import com.kognitivist.moodie.ui.kit.vectors.CollectionIcon
import com.kognitivist.moodie.ui.kit.vectors.CreateNoteIcon
import com.kognitivist.moodie.ui.kit.vectors.DescIcon
import com.kognitivist.moodie.ui.kit.vectors.FunResultIcon
import com.kognitivist.moodie.ui.kit.vectors.HintEndIcon
import com.kognitivist.moodie.ui.kit.vectors.HintStartIcon
import com.kognitivist.moodie.ui.kit.vectors.LightThemeSelectedIcon
import com.kognitivist.moodie.ui.kit.vectors.ShareIcon
import com.kognitivist.moodie.ui.kit.vectors.TimeIcon
import com.kognitivist.moodie.ui.kit.vectors.VectorRes
import com.kognitivist.moodie.ui.kit.vibroClickable
import com.kognitivist.moodie.ui.navigation.NavEvents
import com.kognitivist.moodie.ui.screens._02_Home.mvi.HomeIntent
import com.kognitivist.moodie.ui.screens._02_Home.mvi.HomeState
import org.koin.compose.viewmodel.koinViewModel
import pro.respawn.flowmvi.api.IntentReceiver
import pro.respawn.flowmvi.compose.dsl.subscribe
import pro.respawn.flowmvi.compose.preview.EmptyReceiver

@Composable
fun HomeScreen(
	container: HomeVM = koinViewModel(),
	onNavEvent: (NavEvents)-> Unit
) = with(container.store) {

	val state by subscribe()

	HomeScreenContent(state, onNavEvent)
}

@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@Composable
private fun IntentReceiver<HomeIntent>.HomeScreenContent(
	state: HomeState,
	onNavEvent: (NavEvents) -> Unit
) {

	val scrollState = rememberScrollState()
	val colors = LocalColors.current
	val strings = LocalStrings.current
	val textStyles = LocalTextStyles.current

	Column(
		modifier = Modifier.fillMaxSize()
			.background(colors.background)
			.windowInsetsPadding(WindowInsets.systemBars)
			.padding(20.dp),
		horizontalAlignment = Alignment.CenterHorizontally
	){
		Text(strings.appName, style = textStyles.display36, color = colors.text1)
		Column(
			modifier = Modifier
				.verticalScroll(scrollState)
		) {
			Spacer(Modifier.height(24.dp))
			if (state.dailyTestIsPassed){
				CardResult(onNavEvent)
				Spacer(Modifier.height(24.dp))
				Text(
					text = strings.homeStrings.whatNext,
					style = textStyles.bodySmall12,
					color = colors.text2
				)
				Spacer(Modifier.height(6.dp))
				Row {
					CardNextMove(strings.homeStrings.createNote, VectorRes.CreateNoteIcon, onNavEvent)
					Spacer(Modifier.width(16.dp))
					CardNextMove(strings.homeStrings.share, VectorRes.ShareIcon, onNavEvent)
					Spacer(Modifier.width(16.dp))
					CardNextMove(strings.homeStrings.toCollection, VectorRes.CollectionIcon, onNavEvent)
				}
				Spacer(Modifier.height(23.dp))
				CardHint(strings.homeStrings.hintResult)
			}
			else{
				CardTest(onNavEvent)
				Spacer(Modifier.height(24.dp))
				CardHint(strings.homeStrings.hint)
			}
			Spacer(Modifier.height(66.dp))
		}
	}
}

@Composable
private fun CardTest(onNavEvent: (NavEvents) -> Unit){

	val colors = LocalColors.current
	val strings = LocalStrings.current
	val textStyles = LocalTextStyles.current

	Card(
		modifier = Modifier.fillMaxWidth(),
		elevation = CardDefaults.cardElevation(5.dp),
		shape = RoundedCornerShape(20.dp),
		border = BorderStroke(1.dp, color = colors.stroke1),
		colors = CardDefaults.cardColors(containerColor = colors.surface1)
	)
	{
		Box(
			modifier = Modifier.fillMaxWidth()
		){
			Image(
				imageVector = VectorRes.CardPattern,
				contentDescription = null,
				contentScale = ContentScale.FillBounds,
				modifier = Modifier.matchParentSize()
			)
			Column(
				modifier = Modifier.fillMaxWidth(),
				horizontalAlignment = Alignment.CenterHorizontally,
				verticalArrangement = Arrangement.SpaceBetween
			) {
				Column(
					horizontalAlignment = Alignment.CenterHorizontally,
					modifier = Modifier.padding(16.dp)
				)
				{
					Text(
						text = strings.homeStrings.cardTitle,
						style = textStyles.display30,
						color = colors.text1
					)
					Spacer(Modifier.height(16.dp))
					Text(
						text = strings.homeStrings.cardText,
						textAlign = TextAlign.Center,
						style = textStyles.bodyMedium16,
						color = colors.text1
					)
					Spacer(Modifier.height(24.dp))
				}
				Image(
					imageVector = VectorRes.LightThemeSelectedIcon,
					contentDescription = null,
					modifier = Modifier.size(196.dp)
				)
				Column(
					horizontalAlignment = Alignment.CenterHorizontally,
					modifier = Modifier.padding(16.dp)
				) {
					Spacer(Modifier.height(24.dp))
					Button(
						onClick = {},
						modifier = Modifier.fillMaxWidth(),
						colors = ButtonDefaults.buttonColors(containerColor = colors.primary),
						shape = RoundedCornerShape(20.dp),
						contentPadding = PaddingValues(16.dp)
					)
					{
						Text(
							text = strings.homeStrings.cardButton,
							style = textStyles.labelLarge16,
							color = colors.text3
						)
						Spacer(Modifier.width(16.dp))
						Icon(
							imageVector = VectorRes.ArrowRight24,
							contentDescription = null
						)
					}
					Spacer(Modifier.height(16.dp))
					Row {
						CardTestHint(
							text = strings.homeStrings.cardHint1,
							icon = VectorRes.DescIcon
						)
						CardTestHint(
							text = strings.homeStrings.cardHint2,
							icon = VectorRes.TimeIcon
						)
						CardTestHint(
							text = strings.homeStrings.cardHint3,
							icon = VectorRes.FunResultIcon
						)
					}
				}
			}
		}
	}
}

@Composable
private fun RowScope.CardTestHint(
	text: String,
	icon: ImageVector
){
	val colors = LocalColors.current
	val textStyles = LocalTextStyles.current

	Column(
		horizontalAlignment = Alignment.CenterHorizontally,
		modifier = Modifier.weight(1f).padding(horizontal = 16.dp)
	) {
		Icon(
			imageVector = icon,
			contentDescription = null,
			tint = colors.text2
		)
		Spacer(Modifier.height(4.dp))
		Text(
			text = text,
			style = textStyles.captionSmall11,
			color = colors.text2,
			textAlign = TextAlign.Center
		)
	}
}

@Composable
private fun CardHint(
	text: String
){
	val colors = LocalColors.current
	val textStyles = LocalTextStyles.current
	Row(
		modifier = Modifier.fillMaxWidth()
			.clip(RoundedCornerShape(20.dp))
			.background(color = colors.hint).padding(horizontal = 16.dp, vertical = 10.dp),
		verticalAlignment = Alignment.CenterVertically,
		horizontalArrangement = Arrangement.SpaceBetween
	) {
		Icon(
			imageVector = VectorRes.HintStartIcon,
			contentDescription = null,
			tint = colors.accent
		)
		Spacer(Modifier.width(16.dp))
		Text(
			text = text,
			style = textStyles.bodySmall12,
			color = colors.text2,
			textAlign = TextAlign.Center,
			modifier = Modifier.weight(1f)
		)
		Spacer(Modifier.width(16.dp))
		Icon(
			imageVector = VectorRes.HintEndIcon,
			contentDescription = null,
			tint = colors.text2
		)
	}
}

@Composable
private fun CardResult(onNavEvent: (NavEvents) -> Unit){

	val colors = LocalColors.current
	val strings = LocalStrings.current
	val textStyles = LocalTextStyles.current

	Card(
		modifier = Modifier.fillMaxWidth(),
		elevation = CardDefaults.cardElevation(5.dp),
		shape = RoundedCornerShape(20.dp),
		border = BorderStroke(1.dp, color = colors.stroke1),
		colors = CardDefaults.cardColors(containerColor = colors.surface1)
	)
	{
		Box(
			modifier = Modifier.fillMaxWidth().padding(16.dp)
		){
			Image(
				imageVector = VectorRes.CardPattern,
				contentDescription = null,
				contentScale = ContentScale.FillBounds,
				modifier = Modifier.matchParentSize()
			)
			Column(
				modifier = Modifier.fillMaxWidth(),
				horizontalAlignment = Alignment.CenterHorizontally,
				verticalArrangement = Arrangement.SpaceBetween
			) {
				Row {
					Image(
						imageVector = VectorRes.LightThemeSelectedIcon,
						contentDescription = null,
						modifier = Modifier.size(142.dp)
					)
					Spacer(Modifier.width(8.dp))
					Column(
						modifier = Modifier
					)
					{
						Text(
							text = strings.homeStrings.cardResultTitle,
							style = textStyles.titleMedium22,
							color = colors.text1
						)
						Spacer(Modifier.height(12.dp))
						Text(
							text = strings.homeStrings.cardResultCharacterName("Пледовый тюлень"),
							style = textStyles.display30,
							color = colors.text1
						)
						Text(
							text = strings.homeStrings.cardResultCharacterDesc("Режим энергосбережения активирован."),
							style = textStyles.bodySmall12,
							color = colors.text1
						)
					}
				}
				Spacer(Modifier.height(36.dp))
				Button(
					onClick = {},
					modifier = Modifier.fillMaxWidth(),
					colors = ButtonDefaults.buttonColors(containerColor = colors.primary),
					shape = RoundedCornerShape(20.dp),
					contentPadding = PaddingValues(16.dp)
				)
				{
					Text(
						text = strings.homeStrings.cardResultButton,
						style = textStyles.labelLarge16,
						color = colors.text3
					)
					Spacer(Modifier.width(16.dp))
					Icon(
						imageVector = VectorRes.ArrowRight24,
						contentDescription = null
					)
				}
				Spacer(Modifier.height(16.dp))
			}
		}
	}
}

@Composable
private fun RowScope.CardNextMove(
	text: String,
	icon: ImageVector,
	onClick: (NavEvents) -> Unit
){
	val colors = LocalColors.current
	val textStyles = LocalTextStyles.current

	Column(
		horizontalAlignment = Alignment.CenterHorizontally,
		modifier = Modifier.weight(1f).aspectRatio(110/97f)
			.clip(RoundedCornerShape(20.dp))
			.background(colors.surface2)
			.border(1.dp, colors.stroke1,RoundedCornerShape(20.dp))
			.vibroClickable(){}
			.padding(horizontal = 10.dp),
		verticalArrangement = Arrangement.Center
	) {
		Icon(
			imageVector = icon,
			contentDescription = null,
			tint = colors.primary
		)
		Spacer(Modifier.height(4.dp))
		Text(
			text = text,
			style = textStyles.bodySmall12,
			color = colors.text1,
			textAlign = TextAlign.Center
		)
	}
}




@Composable
@Preview
private fun HomeScreenPreviewLight() = EmptyReceiver {
	MoodieTheme(theme = Theme.LIGHT) {
		HomeScreenContent(HomeState(true)){}
	}
}

@Composable
@Preview
private fun HomeScreenPreviewDark() = EmptyReceiver {
	MoodieTheme(theme = Theme.LIGHT) {
		HomeScreenContent(HomeState()){}
	}
}

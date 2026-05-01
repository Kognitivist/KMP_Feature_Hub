package com.kognitivist.common_features

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kognitivist.common_features.mvi.CommonFeaturesIntent
import com.kognitivist.core.tools.NavigationActions
import com.kognitivist.common_features.mvi.CommonFeaturesState
import pro.respawn.flowmvi.api.IntentReceiver
import pro.respawn.flowmvi.compose.dsl.subscribe
import pro.respawn.flowmvi.compose.preview.EmptyReceiver


@Composable
fun CommonFeaturesScreen(
	container: CommonFeaturesViewModel,
	navAction:(NavigationActions)-> Unit
) = with(container.store) {

	val state by subscribe(){}

	CommonFeaturesScreenContent(state, navAction)
}

@Composable
private fun IntentReceiver<CommonFeaturesIntent>.CommonFeaturesScreenContent(
	state: CommonFeaturesState,
	navAction:(NavigationActions)-> Unit
) {
	LazyColumn(
		modifier = Modifier.fillMaxSize().padding(horizontal = 16.dp)
	) {
		items(state.listFeatures){feature->
			Column {
				Box(
					modifier = Modifier
						.fillMaxWidth()
						.clickable{
							navAction(NavigationActions.NavigationTo(feature.route))
						}
						.clip(RoundedCornerShape(16.dp))
						.background(Color.Gray).padding(16.dp)
					,
					contentAlignment = Alignment.Center
				) {
					Text(feature.uiName)
				}
				Spacer(modifier = Modifier.height(16.dp))
			}
		}
	}
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
private fun CommonFeaturesScreenPreview() = EmptyReceiver {
	CommonFeaturesScreenContent(CommonFeaturesState()){}
}



package com.inxparticle.composecalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.inxparticle.composecalculator.ui.theme.ComposeCalculatorTheme
import com.inxparticle.composecalculator.ui.theme.mediumGrey


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCalculatorTheme {
                val viewModel = viewModel<CalculatorViewModel>()
                val sate = viewModel.state
                val buttonSpacing = 8.dp
                Calculator(
                    state = sate,
                    onAction = viewModel::onAction,
                    buttonSpacing = buttonSpacing,
                    modifier = Modifier
                        .background(mediumGrey)
                        .fillMaxSize()
                        .padding(16.dp)
                )
            }
        }
    }
}
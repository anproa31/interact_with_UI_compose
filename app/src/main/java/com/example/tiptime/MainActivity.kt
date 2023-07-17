/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

//https://github.com/gitlood/Art-Space
//https://github.com/KartikG69/ArtSpaceApp
//https://developer.android.com/codelabs/basic-android-kotlin-compose-art-space?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-art-space#0
package com.example.tiptime

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.VisibleForTesting
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.tiptime.ui.theme.TipTimeTheme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TipTimeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    TipTimeLayout()
                    ArtSpaceApp()
                }
            }
        }
    }
}


//@Composable
//fun TipTimeLayout() {
//    var amountInput by remember {
//        mutableStateOf("")
//    }
//    var tipInput by remember {
//        mutableStateOf("")
//    }
//    var roundUp by remember {
//        mutableStateOf(false)
//    }
//    val amount = amountInput.toDoubleOrNull() ?: 0.0
//    val tipPercent = tipInput.toDoubleOrNull() ?: 0.0
//    val tip = calculateTip(amount, tipPercent, roundUp)
//
//    Column(
//        modifier = Modifier
//            .padding(40.dp)
//            .verticalScroll(rememberScrollState()),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//    ) {
//        Text(
//            text = stringResource(R.string.calculate_tip),
//            modifier = Modifier
//                .padding(bottom = 16.dp)
//                .align(alignment = Alignment.Start)
//        )
//        EditNumberField(
//            value = amountInput,
//            onValueChange = { amountInput = it },
//            label = R.string.bill_amount,
//            keyboardOptions = KeyboardOptions.Default.copy(
//                keyboardType = KeyboardType.Number,
//                imeAction = ImeAction.Next
//            ),
//            leadingIcon = R.drawable.money,
//            modifier = Modifier
//                .padding(bottom = 32.dp)
//                .fillMaxWidth()
//        )
//        EditNumberField(
//            value = tipInput,
//            onValueChange = { tipInput = it },
//            label = R.string.how_was_the_service,
//            keyboardOptions = KeyboardOptions.Default.copy(
//              keyboardType = KeyboardType.Number,
//              imeAction = ImeAction.Done
//            ),
//            leadingIcon = R.drawable.percent,
//            modifier = Modifier
//                .padding(bottom = 32.dp)
//                .fillMaxWidth()
//        )
//        RoundTheTipRow(roundUp = roundUp, onRoundUpChanged = {roundUp = it}, modifier = Modifier.padding(bottom = 32.dp))
//        Text(
//            text = stringResource(R.string.tip_amount, tip),
//            style = MaterialTheme.typography.displaySmall
//        )
//        Spacer(modifier = Modifier.height(150.dp))
//    }
//}

//@SuppressLint("UnrememberedMutableState")
//@Composable
//fun EditNumberField(
//    value: String,
//    onValueChange: (String) -> Unit,
//    @StringRes label: Int,
//    @DrawableRes leadingIcon: Int,
//    keyboardOptions: KeyboardOptions,
//    modifier: Modifier = Modifier
//) {
////    var amountInput: MutableState<String> = mutableStateOf("0")
////    var amountInput = mutableStateOf("0")
//    TextField(
//        value = value,
//        onValueChange = onValueChange,
//        label = { Text(stringResource(id = label)) },
//        singleLine = true,
//        keyboardOptions = keyboardOptions,
//        leadingIcon = { Icon(painter = painterResource(id = leadingIcon), contentDescription = null)},
//        modifier = modifier,
//    )
//}

//@Composable
//fun RoundTheTipRow(modifier: Modifier = Modifier, roundUp: Boolean, onRoundUpChanged: (Boolean) -> Unit) {
//    Row(modifier = modifier
//        .fillMaxWidth()
//        .size(48.dp), verticalAlignment = Alignment.CenterVertically) {
//        Text(text = stringResource(id = R.string.round_up_tip))
//        Switch(modifier = modifier
//            .fillMaxWidth()
//            .wrapContentWidth(Alignment.End), checked = roundUp, onCheckedChange = onRoundUpChanged)
//    }
//}

/**
 * Calculates the tip based on the user input and format the tip amount
 * according to the local currency.
 * Example would be "$10.00".
 */
//@VisibleForTesting
//internal fun calculateTip(amount: Double, tipPercent: Double = 15.0, roundUp: Boolean): String {
//    var tip = tipPercent / 100 * amount
//    if (roundUp)
//        tip = kotlin.math.ceil(tip)
//    return NumberFormat.getCurrencyInstance().format(tip)
//}

@SuppressLint("MutableCollectionMutableState")
@Composable
fun ArtSpaceApp() {
    var currentImage by remember {
        mutableStateOf(mutableListOf(1, R.drawable.first, R.string.first_image_name, R.string.author, R.string.year))
    }
    fun nextButton() {
        currentImage = handleNextButton(currentImage[0]) as MutableList<Int>
    }

    fun previousButton() {
        currentImage = handlePreviousButton(currentImage[0]) as MutableList<Int>
    }

    Column {
        ArtSpaceImage(painter = currentImage[1])
        Row {
            Button(onClick = {nextButton()} ) {
                Text(text = stringResource(id = R.string.next))
            }
            Button(onClick = {previousButton()} ) {
                Text(text = stringResource(id = R.string.previous))
            }
        }
    }

    
}


@Composable
@SuppressLint("SupportAnnotationUsage")
fun ArtSpaceImage(@DrawableRes painter: Int) {
    Image(painter = painterResource(id = painter), contentDescription = null)
}




@VisibleForTesting
internal fun handleNextButton(
    currentIndex: Int,
): List<Int> {
    val iList: MutableList<Int> = mutableListOf()
    when(currentIndex) {
        1 -> {
            iList.clear()
            iList.add(currentIndex + 1)
            iList.add(R.drawable.second)
            iList.add(R.string.second_image_name)
            iList.add(R.string.author)
            iList.add(R.string.year)
        }
        2 -> {
            iList.clear()
            iList.add(currentIndex + 1)
            iList.add(R.drawable.third)
            iList.add(R.string.third_image_name)
            iList.add(R.string.author)
            iList.add(R.string.year)
        }
        3 -> {
            iList.clear()
            iList.add(1)
            iList.add(R.drawable.first)
            iList.add(R.string.first_image_name)
            iList.add(R.string.author)
            iList.add(R.string.year)
        }
    }
    return iList
}

@VisibleForTesting
@SuppressLint("SupportAnnotationUsage")
internal fun handlePreviousButton(
    currentIndex: Int,
): List<Int> {
    val iList: MutableList<Int> = mutableListOf()
    when(currentIndex) {
        1 -> {
            iList.clear()
            iList.add(3)
            iList.add(R.drawable.third)
            iList.add(R.string.third_image_name)
            iList.add(R.string.author)
            iList.add(R.string.year)
        }
        2 -> {
            iList.clear()
            iList.add(currentIndex - 1)
            iList.add(R.drawable.first)
            iList.add(R.string.first_image_name)
            iList.add(R.string.author)
            iList.add(R.string.year)
        }
        3 -> {
            iList.clear()
            iList.add(currentIndex - 1)
            iList.add(R.drawable.second)
            iList.add(R.string.second_image_name)
            iList.add(R.string.author)
            iList.add(R.string.year)
        }
    }
    return iList
}


@Preview(showBackground = true)
@Composable
fun TipTimeLayoutPreview() {
    TipTimeTheme {
//        TipTimeLayout()
        ArtSpaceApp()
    }
}

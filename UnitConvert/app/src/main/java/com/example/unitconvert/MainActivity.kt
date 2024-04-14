package com.example.unitconvert

import android.graphics.drawable.Icon
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.unitconvert.ui.theme.UnitConvertTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UnitConvertTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    UnitConverter();
                }
            }
        }
    }
}

@Composable
fun UnitConverter() {

    var inputValue by remember {
        mutableStateOf("")
    }
    var outputValue by remember {
        mutableStateOf("")
    }
    var inputUnit by remember {
        mutableStateOf("")
    }
    var outputUnit by remember {
        mutableStateOf("")
    }
    var iExpanded by remember {
        mutableStateOf(false)
    }
    var oExpanded by remember {
        mutableStateOf(false)
    }
    val conversionFactor by remember {
        mutableStateOf(0.01)
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Text(text = "Unit Converter", modifier = Modifier.padding(16.dp))

        OutlinedTextField(value = "Enter your value", onValueChange = {})
        Spacer(modifier = Modifier.height(16.dp))
        Row {


            Box {
                val context = LocalContext.current
                Button(onClick = {
//                    Toast.makeText(context, "Thanks For Clicking", Toast.LENGTH_LONG).show()
                    iExpanded = true
                }) {
                    Text(text = "Select")
                    Icon(
                        Icons.Default.ArrowDropDown,
                        contentDescription = "Arrow Down"
                    )
                }

                DropdownMenu(expanded = iExpanded, onDismissRequest = { iExpanded = false }) {
                    DropdownMenuItem(text = { Text(text = "CM") }, onClick = { })
                    DropdownMenuItem(text = { Text(text = "Foot") }, onClick = { /*TODO*/ })
                }
            }
            Spacer(modifier = Modifier.width(16.dp))
            Box {

                Button(onClick = {
                    oExpanded = true
                }) {
                    Text(text = "Select")
                    Icon(
                        Icons.Default.ArrowDropDown,
                        contentDescription = "Arrow Down"
                    )
                }
                DropdownMenu(expanded = oExpanded, onDismissRequest = { oExpanded = false }) {
                    DropdownMenuItem(text = { Text(text = "CM") }, onClick = { /*TODO*/ })
                    DropdownMenuItem(text = { Text(text = "Foot") }, onClick = { /*TODO*/ })
                }
            }


//For toasting msg
//            val context = LocalContext.current
////
//            Button(onClick = {
//                Toast.makeText(context, "Thanks For Clicking", Toast.LENGTH_LONG).show()
//            }) {
//                Text(text = "Click Here")
//            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    UnitConvertTheme {

    }
}

@Preview(showBackground = true)
@Composable
fun UnitConverterPreview() {


    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Text(text = "Unit Converter", modifier = Modifier.padding(16.dp))

        OutlinedTextField(value = "Enter your value", onValueChange = {})
        Spacer(modifier = Modifier.height(16.dp))
        Row {


            Box {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Select")
                    Icon(
                        Icons.Default.ArrowDropDown,
                        contentDescription = "Arrow Down"
                    )
                }

                DropdownMenu(expanded = true, onDismissRequest = { /*TODO*/ }) {
                    DropdownMenuItem(text = { Text(text = "CM") }, onClick = { /*TODO*/ })
                    DropdownMenuItem(text = { Text(text = "Foot") }, onClick = { /*TODO*/ })
                }
            }
            Spacer(modifier = Modifier.width(16.dp))
            Box {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Select")
                    Icon(
                        Icons.Default.ArrowDropDown,
                        contentDescription = "Arrow Down"
                    )
                }
                DropdownMenu(expanded = true, onDismissRequest = { /*TODO*/ }) {
                    DropdownMenuItem(text = { Text(text = "CM") }, onClick = { /*TODO*/ })
                    DropdownMenuItem(text = { Text(text = "Foot") }, onClick = { /*TODO*/ })
                }
            }


//For toasting msg
//            val context = LocalContext.current
//
//            Button(onClick = {
//                Toast.makeText(context, "Thanks For Clicking", Toast.LENGTH_LONG).show()
//            }) {
//                Text(text = "Click Here")
//            }
        }

//        Text(text = "dsd")
    }

}
package pe.gadolfolozano.composeexperiment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.core.setContent
import androidx.ui.layout.Column
import androidx.ui.material.MaterialTheme
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Story("Android")
            }
        }
    }
}

@Composable
fun Story(name: String) {
    Column {
        Text(text = "Hello $name!")
        Text(text = "What you doing?")
        Text(text = "I am trying out some compose stuff")
    }
}

@Preview
@Composable
fun DefaultPreview() {
    MaterialTheme {
        Story("Android")
    }
}
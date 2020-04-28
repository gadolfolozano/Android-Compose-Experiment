package pe.gadolfolozano.composeexperiment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.setContent
import androidx.ui.foundation.Text
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.layout.Column
import androidx.ui.material.Card
import androidx.ui.material.MaterialTheme
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp

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
    Card(shape = RoundedCornerShape(4.dp), elevation = 4.dp) {
        Column {
            Text(text = "Hello $name!")
            Text(text = "What you doing?")
            Text(text = "I am trying out some compose stuff")
        }
    }

}

@Preview
@Composable
fun DefaultPreview() {
    MaterialTheme {
        Story("Android")
    }
}
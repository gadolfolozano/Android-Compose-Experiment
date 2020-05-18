package pe.gadolfolozano.composeexperiment.ui.main

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.ui.core.setContent
import androidx.ui.foundation.AdapterList
import androidx.ui.foundation.Text
import androidx.ui.layout.Column
import androidx.ui.layout.Row
import androidx.ui.material.MaterialTheme
import androidx.ui.tooling.preview.Preview
import pe.gadolfolozano.composeexperiment.model.PlaceCategory

class MainActivity : AppCompatActivity() {
    lateinit var mainInteractor: MainInteractor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainInteractor = ViewModelProvider(this).get(MainInteractor::class.java)
        setContent {
            MaterialTheme {
                Story("Android")
            }
        }
        mainInteractor.placeCategoriesLiveData.observe(
            this,
            Observer { placeCategories -> updatePlaceCategories(placeCategories) })
        mainInteractor.fetchCategories()
    }

    fun updatePlaceCategories(placeCategories: List<PlaceCategory>) {
        Toast.makeText(this, "updatePlaceCategories ${placeCategories.size}", Toast.LENGTH_SHORT)
            .show()
    }
}

@Composable
fun Story(name: String) {
    val categories = mutableListOf(
        PlaceCategory(0, "catg 1"),
        PlaceCategory(1, "catg 2"),
        PlaceCategory(2, "catg 3")
    )

    Column {
        Text("Filter")
        Text("Categories")

        AdapterList(data = categories) { placeCategory ->
            MovieItem(placeCategory)
        }
    }
}

@Composable
fun MovieItem(placeCategory: PlaceCategory) {
    Row {
        /* val image = imageResource(id = R.drawable.ic_launcher_foreground)

         val imageModifier = Modifier
             .preferredHeightIn(maxHeight = 180.dp)
             .fillMaxWidth()
             .clip(shape = RoundedCornerShape(4.dp))

         Image(asset = image, modifier = imageModifier,
             contentScale = ContentScale.Crop)*/
        Text("${placeCategory.id} - ${placeCategory.name}")
    }
}

@Preview
@Composable
fun DefaultPreview() {
    MaterialTheme {
        Story("Android")
    }
}
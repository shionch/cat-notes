package shionch.catnotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.ui.platform.ComposeView

class MainActivity : AppCompatActivity() {

    private var composeView: ComposeView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        composeView = findViewById(R.id.composeView)
        composeView?.setContent {
            NotesListScreen()
        }
    }
}
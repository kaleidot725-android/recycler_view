package jp.kaleidot725.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler_view.apply {
            this.adapter = CustomAdapter(listOf("A", "B", "C", "D", "E"))
            this.layoutManager = LinearLayoutManager(context).also { lm -> lm.orientation = RecyclerView.VERTICAL }
        }
    }
}

package com.projectbox.footballtask.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import com.projectbox.footballtask.R
import com.projectbox.footballtask.adapter.ClubAdapter
import com.projectbox.footballtask.model.Club
import kotlinx.android.synthetic.main.notification_template_lines_media.view.*
import org.jetbrains.anko.*
import org.jetbrains.anko.recyclerview.v7.recyclerView

class MainActivity : AppCompatActivity() {

    val laligaClubs: List<Club> by lazy {
        listOf(
                Club(R.drawable.ic_atletico, "Atletico Madrid", "Club Atlético de Madrid, commonly known as Atlético Madrid, or simply as Atlético or Atleti, is a Spanish professional football club based in Madrid, that plays in La Liga."),
                Club(R.drawable.ic_barcelona, "Barcelona", "Futbol Club Barcelona, known simply as Barcelona and colloquially as Barça, is a professional football club based in Barcelona, Catalonia, Spain."),
                Club(R.drawable.ic_espanyol, "Espanyol", "Reial Club Deportiu Espanyol de Barcelona, commonly known as RCD Espanyol, or simply as Espanyol, is a professional sports club based in Barcelona, Spain."),
                Club(R.drawable.ic_getafe, "Getafe", "Getafe Club de Fútbol, or simply Getafe, is a Spanish professional football club that plays in La Liga. The club is based in Getafe, a city in the Madrid metropolitan area. Getafe was founded in 1946 and refounded in 1983."),
                Club(R.drawable.ic_malaga, "Malaga", "Málaga Club de Fútbol, or simply Málaga, is a Spanish football team based in Málaga, Spain. The team currently plays in La Liga 2, the second division of Spanish football."),
                Club(R.drawable.ic_real_madrid, "Real Madrid", "Real Madrid Club de Fútbol, commonly known as Real Madrid, or simply as Real, is a professional football club based in Madrid, Spain."),
                Club(R.drawable.ic_sevilla, "Sevilla", "Sevilla Fútbol Club, S.A.D., or simply Sevilla, is Spain’s oldest sporting club solely devoted to football. Sevilla FC is based in Seville, the capital and largest city of the autonomous community of Andalusia."),
                Club(R.drawable.ic_valencia, "Valencia", "Valencia Club de Fútbol is a Spanish football club based in Valencia. They play in La Liga. Valencia have won six La Liga titles, seven Copa del Rey titles, two Inter-Cities Fairs Cups, one UEFA Cup"),
                Club(R.drawable.ic_villareal, "Villareal", "Villarreal Club de Fútbol, S.A.D. (Valencian: Vila-real Club de Futbol, S.A.D.), usually abbreviated to Villarreal CF or just Villarreal, is a Spanish football club based in Villarreal, a city in the province of Castellón within the Valencian Community.")

        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainActivityUI(ClubAdapter(laligaClubs)).setContentView(this)
    }
}

class MainActivityUI(val clubAdapter: ClubAdapter) : AnkoComponent<MainActivity> {
    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
        verticalLayout {

            recyclerView {
                lparams(width = matchParent, height = matchParent)
                layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
                setHasFixedSize(true)

                adapter = clubAdapter
            }
        }
    }
}
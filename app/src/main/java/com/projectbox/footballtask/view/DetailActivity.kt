package com.projectbox.footballtask.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.projectbox.footballtask.R
import com.projectbox.footballtask.model.Club
import kotlinx.android.synthetic.main.notification_template_lines_media.view.*
import org.jetbrains.anko.*

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXT_DATA = "data"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val clubData = intent.getParcelableExtra<Club>(EXT_DATA)
        DetailActivityUI(clubData.imageRes, clubData.info).setContentView(this)

        initAppBar(clubData.title)
    }

    private fun initAppBar(title: String) {
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.title = title
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()
    }
}

class DetailActivityUI(val imageRes: Int, val detail: String) : AnkoComponent<DetailActivity> {
    override fun createView(ui: AnkoContext<DetailActivity>) = with(ui) {
        verticalLayout {
            padding = dip(32)

            imageView {
                scaleType = ImageView.ScaleType.CENTER_INSIDE
                setImageResource(imageRes)
            }.lparams(width = dip(128), height = dip(128)) {
                bottomMargin = dip(16)
            }

            textView {
                text = detail
            }
        }
    }
}
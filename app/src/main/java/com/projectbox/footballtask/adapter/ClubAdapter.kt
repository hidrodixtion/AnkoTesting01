package com.projectbox.footballtask.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.projectbox.footballtask.R
import com.projectbox.footballtask.adapter.viewholder.ClubVH
import com.projectbox.footballtask.model.Club
import org.jetbrains.anko.*

/**
 * Created by adinugroho
 */
class ClubAdapter(val list: List<Club>) : RecyclerView.Adapter<ClubVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClubVH {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_club, parent, false)
        return ClubVH(v)
//        ClubVH(ClubItemUI().createView(AnkoContext.Companion.create(parent.context)))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ClubVH, position: Int) {
        holder.bind(list[position])
    }
}

// commented because by using ankocomponent, the ids can't be recognized by LayoutContainer
//class ClubItemUI : AnkoComponent<Context> {
//    override fun createView(ui: AnkoContext<Context>) = with(ui) {
//        linearLayout {
//            orientation = LinearLayout.HORIZONTAL
//            gravity = Gravity.CENTER_VERTICAL
//
//            imageView {
//                id = R.id.img_icon
//            }.lparams(width = dip(42), height = dip(42)) {
//                rightMargin = dip(8)
//            }
//
//            textView {
//                id = R.id.txt_title
//            }
//
//        }
//    }
//}
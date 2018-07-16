package com.projectbox.footballtask.adapter.viewholder

import android.support.v7.widget.RecyclerView
import android.view.View
import com.projectbox.footballtask.model.Club
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_club.*

/**
 * Created by adinugroho
 */
class ClubVH(override val containerView: View) : RecyclerView.ViewHolder(containerView), LayoutContainer {
    fun bind(data: Club) {
        img_icon.setImageResource(data.imageRes)
        txt_title.text = data.title
    }
}
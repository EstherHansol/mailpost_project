package com.example.mailbox

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_mails.view.*


class MailsViewHolder(v: View) : RecyclerView.ViewHolder(v) {
    var view : View = v

    fun bind(item: Mail) {
        view.mName.text = item.name
        view.mTitle.text = item.title
        view.mDate.text = item.date
        view.mWho.text = item.who

    }
}
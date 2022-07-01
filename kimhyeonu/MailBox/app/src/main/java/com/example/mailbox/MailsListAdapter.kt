package com.example.mailbox

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mailbox.databinding.FragmentHomeBinding.bind

class MailsListAdapter(private val itemList : List<Mail>) : RecyclerView.Adapter<MailsViewHolder>()  {

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MailsViewHolder {
        val inflatedView = LayoutInflater.from(parent.context).inflate(R.layout.item_mails, parent, false)
        return MailsViewHolder(inflatedView);
    }

    override fun onBindViewHolder(holder: MailsViewHolder, position: Int) {
        val item = itemList[position]
        holder.apply {
            bind(item)
        }
    }

}
package com.sheng.recycler

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class UIRecyclerAdapter() :RecyclerView.Adapter<UIViewHolder>() {

    var mData: ArrayList<UIHolderData> ? = null


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UIViewHolder {

        var holder: UIViewHolder? = null
        when(viewType){

            UIRecyclerItemType.TEXT_ITEM -> {
                holder = TextHolder(R.layout.text_item_layout,parent.context,parent)
            }
        }

        if(holder == null){
            holder = UIEmptyHolder(View(parent.context))
        }

        return holder
    }

    fun setData(data: ArrayList<UIHolderData>?){
        if(data == mData){
            return
        }
        this.mData = data
        notifyDataSetChanged()
    }


    override fun getItemCount(): Int {
        return mData?.size ?: 0
    }

    override fun getItemViewType(position: Int): Int {
        return mData?.get(position)?.type ?: 0
    }

    override fun onBindViewHolder(holder: UIViewHolder, position: Int) {
        holder.bindData(mData?.get(position))
    }

}
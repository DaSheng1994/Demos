package com.sheng.recycler

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

open abstract class UIViewHolder : RecyclerView.ViewHolder ,IDataBinding{

    constructor(resId: Int,context:Context,parent:ViewGroup):super(LayoutInflater.from(context).inflate(resId,parent,false)){

    }

    constructor(view: View):super(view){

    }
}
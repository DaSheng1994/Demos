package com.sheng.recycler

import android.content.Context
import android.view.ViewGroup

class TextHolder: UIViewHolder{

    constructor(resId:Int, context: Context,parent:ViewGroup ):super(resId,context,parent)

    override fun bindData(data: UIHolderData?) {
        if(data is TextItem){

        }
    }

}
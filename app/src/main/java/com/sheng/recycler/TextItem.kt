package com.sheng.recycler

class TextItem : UIHolderData() {

    init {
        type = UIRecyclerItemType.TEXT_ITEM
    }

    var text:String? = ""
}
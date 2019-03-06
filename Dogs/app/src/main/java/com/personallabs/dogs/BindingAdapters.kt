package com.personallabs.dogs

import android.databinding.BindingAdapter
import android.support.v7.widget.RecyclerView

class BindingAdapters {


    companion object {
        @BindingAdapter("items")
        @JvmStatic
        fun setItems(recyclerView: RecyclerView, list: List<Any>) {

            recyclerView.adapter.let {
                if (it is AdapterItemsContract) {
                    it.replaceItems(list)
                }
            }
        }
    }

}
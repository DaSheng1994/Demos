package com.sheng.recycler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var mLayout : LinearLayoutManager? = null
    private var mAdapter : UIRecyclerAdapter ? = null
    private var mData : ArrayList<UIHolderData> ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mData = ArrayList()
        mData?.add(TextItem())
        mLayout = LinearLayoutManager(this)
        mAdapter = UIRecyclerAdapter()
        mAdapter?.setData(mData)

        recycler_view.layoutManager = mLayout
        recycler_view.adapter = mAdapter
        recycler_view.itemAnimator = DefaultItemAnimator()
        recycler_view.itemAnimator?.addDuration = 1200

        btn_add.setOnClickListener{
            if(mData?.size ?: 0 < 1){
                return@setOnClickListener
            }
            mData?.add(1,TextItem())
            mAdapter?.notifyItemInserted(1)
        }


        btn_remove.setOnClickListener{
            if(mData?.size ?: 0 < 2){
                return@setOnClickListener
            }
            mData?.removeAt(1)
            mAdapter?.notifyItemRemoved(1)

        }


        btn_change.setOnClickListener{
            if(mData?.size ?: 0 > 1){

                mData?.set(1,TextItem())
                mAdapter?.notifyItemChanged(1)
            }



            val intent = Intent(this@MainActivity,SecondActivity::class.java)

            startActivity(intent)
        }
    }


    override fun onPause() {
        super.onPause()
        Log.e("Life","main onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("Life","main onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("Life","main onRestart")

    }


    override fun onStart() {
        super.onStart()

        Log.e("Life","main onStart")

    }


    override fun onResume() {
        super.onResume()

        Log.e("Life","main onResume")

    }
}

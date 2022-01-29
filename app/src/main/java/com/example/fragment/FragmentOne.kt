package com.example.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment

class FragmentOne : Fragment() {
    val TAG = "FragmentOne"

    override fun onAttach(context: Context) {
        Log.d(TAG,"OnAttach")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG,"OnCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG,"OnCreateView")
        return inflater!!.inflate(R.layout.fragment_one,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d(TAG,"OnActivityCreated")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.d(TAG,"OnStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG,"OnResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG,"OnPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG,"OnStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG,"OnDestroy")
        super.onDestroy()
    }

    override fun onDestroyView() {
        Log.d(TAG,"onDestroyView")
        super.onDestroyView()
    }

    override fun onDetach() {
        Log.d(TAG,"onDetach")
        super.onDetach()
    }
    fun showToast(mContext: Context?, message: String?) {
        Toast.makeText(mContext, TAG, Toast.LENGTH_SHORT).show()
    }
}
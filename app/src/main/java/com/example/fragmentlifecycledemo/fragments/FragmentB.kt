package com.example.fragmentlifecycledemo.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentlifecycledemo.MainActivity
import com.example.fragmentlifecycledemo.R
import kotlinx.android.synthetic.main.fragment_b.*

class FragmentB : BaseFragment()
{
    companion object {
        private val LOG_TAG: String = FragmentB::class.java.simpleName

        fun newInstance(): FragmentB {
            return FragmentB()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.i(LOG_TAG, "onCreateView")

        val rootView: View = inflater.inflate(R.layout.fragment_b, null, false)

        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonPop.setOnClickListener {
            (activity as MainActivity).pop()
        }

        buttonAddFragmentC.setOnClickListener {
            (activity as MainActivity).goToFragmentUsingAdd(FragmentC.newInstance())
        }

        buttonReplaceFragmentC.setOnClickListener {
            (activity as MainActivity).goToFragmentUsingReplace(FragmentC.newInstance())
        }
    }
}
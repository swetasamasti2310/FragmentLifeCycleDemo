package com.example.fragmentlifecycledemo.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentlifecycledemo.MainActivity
import com.example.fragmentlifecycledemo.R
import kotlinx.android.synthetic.main.fragment_a.*

class FragmentA : BaseFragment()
{
    companion object {
        private val LOG_TAG: String = FragmentA::class.java.simpleName

        fun newInstance(): FragmentA {
            return FragmentA()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.i(LOG_TAG, "onCreateView")

        val rootView: View = inflater.inflate(R.layout.fragment_a, null, false)
        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonPop.setOnClickListener {
            (activity as MainActivity).pop()
        }

        buttonAddFragmentB.setOnClickListener {
            (activity as MainActivity).goToFragmentUsingAdd(FragmentB.newInstance())
        }

        buttonReplaceFragmentB.setOnClickListener {
            (activity as MainActivity).goToFragmentUsingReplace(FragmentB.newInstance())
        }

    }
}
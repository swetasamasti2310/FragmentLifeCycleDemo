package com.example.fragmentlifecycledemo.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
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

    override fun onCreateAnimation(transit: Int, enter: Boolean, nextAnim: Int): Animation? {
        Log.i(LOG_TAG, "onCreateAnimation")
        return super.onCreateAnimation(transit, enter, nextAnim)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i(LOG_TAG, "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(LOG_TAG, "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i(LOG_TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(LOG_TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(LOG_TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(LOG_TAG, "onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i(LOG_TAG, "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(LOG_TAG, "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i(LOG_TAG, "onDetach")
    }
}
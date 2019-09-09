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
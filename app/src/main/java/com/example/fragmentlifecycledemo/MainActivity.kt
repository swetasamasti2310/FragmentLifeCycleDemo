package com.example.fragmentlifecycledemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import com.example.fragmentlifecycledemo.fragments.FragmentA
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        private val LOG_TAG: String? = MainActivity::class.qualifiedName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(LOG_TAG, "on create")
        setContentView(R.layout.activity_main)

        addFragmentA.setOnClickListener {
            goToFragmentUsingAdd(FragmentA.newInstance())
        }

        replaceWithFragmentA.setOnClickListener {
            goToFragmentUsingReplace(FragmentA.newInstance())
        }

        buttonPop.setOnClickListener {
            pop()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(LOG_TAG, "on start")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(LOG_TAG, "on Restart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(LOG_TAG, "on Resume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(LOG_TAG, "on Pause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(LOG_TAG, "on Stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(LOG_TAG, "on Destroy")
    }

    fun goToFragmentUsingAdd(fragment : Fragment) {
        Log.i(LOG_TAG, "Adding Fragment")
        supportFragmentManager.beginTransaction().add(R.id.frame, fragment).addToBackStack("").commit()
    }

    fun goToFragmentUsingReplace(fragment : Fragment) {
        Log.i(LOG_TAG, "Replacing with Fragment")
        supportFragmentManager.beginTransaction().replace(R.id.frame, fragment).addToBackStack("").commit()
    }

    fun pop() {
        Log.i(LOG_TAG, "Popping Fragment from back stack")
        supportFragmentManager.popBackStack()
    }
}

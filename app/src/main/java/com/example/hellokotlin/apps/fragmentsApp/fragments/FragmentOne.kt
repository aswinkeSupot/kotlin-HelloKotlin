package com.example.hellokotlin.apps.fragmentsApp.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hellokotlin.R

class FragmentOne : Fragment() {

    // Called when the fragment is associated with an activity
    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    //Called when the fragment is created
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    // Called to create the view hierarchy associated with the fragment
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    // Called when the fragment becomes visible to the user
    override fun onStart() {
        super.onStart()
    }

    // Called when the fragment is visible and active
    override fun onResume() {
        super.onResume()
    }

    // Called when the fragment is no longer interacting with the user
    override fun onPause() {
        super.onPause()
    }

    // Called when the fragment is no longer visible to the user
    override fun onStop() {
        super.onStop()
    }

    // Called when the view hierarchy associated with the fragment is removed.
    override fun onDestroyView() {
        super.onDestroyView()
    }

    // Called when the fragment is being destroyed
    override fun onDestroy() {
        super.onDestroy()
    }

    // Fragment is being disassociated from the activity.
    override fun onDetach() {
        super.onDetach()
    }

}
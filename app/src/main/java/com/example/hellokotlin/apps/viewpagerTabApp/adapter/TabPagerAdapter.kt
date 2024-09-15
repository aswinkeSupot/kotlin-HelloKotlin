package com.example.hellokotlin.apps.viewpagerTabApp.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class TabPagerAdapter(fm: FragmentManager, lc: Lifecycle): FragmentStateAdapter(fm,lc) {

    var fragmentsList: ArrayList<Fragment> = ArrayList()

    fun addFragmentToList(fragment: Fragment){
        fragmentsList.add(fragment)
    }

    // returns the total number of items in your ViewPager2
    override fun getItemCount(): Int {
        return fragmentsList.size
    }

    // Responsible for creating and returning a Fragment for a specific position within ViewPager2
    override fun createFragment(position: Int): Fragment {
        return fragmentsList.get(position)
    }
}

















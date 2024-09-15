package com.example.hellokotlin.apps.viewpagerTabApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.viewpager2.widget.ViewPager2
import com.example.hellokotlin.R
import com.example.hellokotlin.apps.viewpagerTabApp.adapter.TabPagerAdapter
import com.example.hellokotlin.apps.viewpagerTabApp.fragments.TabOneFragment
import com.example.hellokotlin.apps.viewpagerTabApp.fragments.TabThreeFragment
import com.example.hellokotlin.apps.viewpagerTabApp.fragments.TabTwoFragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class ViewpagerTabHomeActivity : AppCompatActivity() {
    lateinit var viewPager2: ViewPager2
    lateinit var tabPagerAdapter: TabPagerAdapter
    lateinit var tabLayout: TabLayout

    var tabsArrays = arrayOf("TabOne","TabTwo","TabThree")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewpager_tab_home)

        // 1. Initialize the ViewPager
        viewPager2= findViewById(R.id.viewPager2)
        viewPager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        // 2. Add Fragments to the list in the adapter class
        tabPagerAdapter = TabPagerAdapter(supportFragmentManager, lifecycle)
        tabPagerAdapter.addFragmentToList(TabOneFragment())
        tabPagerAdapter.addFragmentToList(TabTwoFragment())
        tabPagerAdapter.addFragmentToList(TabThreeFragment())

        // 3. Connecting the adapter with ViewPager2
        viewPager2.adapter = tabPagerAdapter


        // 4. Connecting TabLayout with ViewPager
        tabLayout = findViewById(R.id.tablayout)
        TabLayoutMediator(tabLayout, viewPager2){
            tab, position ->
            // Customize the tab labels if needed
                // tab.text = "Tab ${position}"

            tab.text = tabsArrays[position]


            /**
             * UnComment the below code for Set the initial text color for all tabs after the mediator attaches
             * Otherwise set the 'app:tabTextColor="@color/red"' in the xml TabLayout.
             * **/
            tabLayout.post {
                for (i in 0 until tabLayout.tabCount) {
                    val tab = tabLayout.getTabAt(i)
                    val tabTextView = tab?.view?.getChildAt(1) as? TextView
                    tabTextView?.setTextColor(
                        if (tab?.isSelected == true)
                            ContextCompat.getColor(this@ViewpagerTabHomeActivity, R.color.white)
                        else
                            ContextCompat.getColor(this@ViewpagerTabHomeActivity, R.color.red)
                    )
                }
            }

            // Access the TextView and set the text color while clicking the tab item
            tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
                override fun onTabSelected(selectedTab: TabLayout.Tab) {
                    if (selectedTab == tab) {
                        val tabTextView = (tab.view.getChildAt(1) as? TextView)
                        tabTextView?.setTextColor(ContextCompat.getColor(this@ViewpagerTabHomeActivity, R.color.white))
                    }
                }

                override fun onTabUnselected(unselectedTab: TabLayout.Tab) {
                    if (unselectedTab == tab) {
                        val tabTextView = (tab.view.getChildAt(1) as? TextView)
                        tabTextView?.setTextColor(ContextCompat.getColor(this@ViewpagerTabHomeActivity, R.color.red))
                    }
                }

                override fun onTabReselected(reselectedTab: TabLayout.Tab) {
                    // No action needed for reselected tabs
                }
            })

        }.attach()

    }
}
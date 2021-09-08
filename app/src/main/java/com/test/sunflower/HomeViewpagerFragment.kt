package com.test.sunflower

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.test.sunflower.databinding.FragmentViewPagerBinding
import dagger.hilt.android.AndroidEntryPoint

/**
 *
 * @ProjectName: MyTestSunflower
 * @Package: com.test.sunflower
 * @ClassName: HomeViewpagerFragment
 * @Description:
 * @Author: lijinning
 * @CreateDate: 2021/9/7 19:17
 */
@AndroidEntryPoint
class HomeViewpagerFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentViewPagerBinding.inflate(inflater, container, false)
        val tabs = binding.tabs
        val viewPager2 = binding.viewPager2
        viewPager2.adapter=
        return binding.root
    }
}
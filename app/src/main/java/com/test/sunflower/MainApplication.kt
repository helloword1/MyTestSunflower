package com.test.sunflower

import android.app.Application
import androidx.work.Configuration
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.HiltAndroidApp

/**
 *
 * @ProjectName: MyTestSunflower
 * @Package: com.test.sunflower
 * @ClassName: MainApplication
 * @Description:
 * @Author: lijinning
 * @CreateDate: 2021/9/7 16:48
 */
@HiltAndroidApp
class MainApplication : Application(), Configuration.Provider {
    override fun getWorkManagerConfiguration(): Configuration = Configuration.Builder()
        .setMinimumLoggingLevel(if (BuildConfig.DEBUG) android.util.Log.DEBUG else android.util.Log.ERROR)
        .build()
}
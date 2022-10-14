package ru.hivislav.edamamtestapp.presentation.view

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import ru.hivislav.edamamtestapp.R
import ru.hivislav.edamamtestapp.data.RemoteRepositoryImpl

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val remoteRepositoryImpl = RemoteRepositoryImpl()
        Thread {
            val list = remoteRepositoryImpl.getFoodList("pizza")
            Log.d("pizza", list?.hints.toString())
        }.start()
    }
}
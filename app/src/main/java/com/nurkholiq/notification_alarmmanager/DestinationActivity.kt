package com.nurkholiq.notification_alarmmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DestinationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        supportActionBar?.title = "Notification Alarm"

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_destination)
    }
}
package com.websarva.wings.android.myalarmclock

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast


class AlarmBroadcastReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val intent = Intent(context, MainActivity::class.java)
            .putExtra("onReceive", true)
            .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context?.startActivity(intent)
//        context?.run {
//            startActivity(intentFor<MainActivity>("onReceive" to true).newTask())
//        }
        Toast.makeText(context, "アラームを受信しました", Toast.LENGTH_SHORT).show()
    }
}
package com.tutorial_kotlin.activities

import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.tutorial_kotlin.R
import com.tutorial_kotlin.onSNACK
import com.tutorial_kotlin.showToast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnToast = findViewById<Button>(R.id.btnToast)
        val btnWhatsapp = findViewById<Button>(R.id.btnWhatsapp)
        val btnSendData = findViewById<Button>(R.id.btnSendData)
        val btnRecyclerView = findViewById<Button>(R.id.btnRecyclerView)
        val btnCalculator = findViewById<Button>(R.id.btnCalculator)

        val parentLayout = findViewById<View>(android.R.id.content)

        btnToast.setOnClickListener{
            Toast.makeText(this, "This is toast message", Toast.LENGTH_SHORT).show()
            showToast("This is extension toast")
            onSNACK(parentLayout)
        }

        btnWhatsapp.setOnClickListener{
            val pm: PackageManager = this.getPackageManager()

            try {
                // Raise exception if whatsapp doesn't exist
                val info = pm.getPackageInfo("com.whatsapp", PackageManager.GET_META_DATA)
                val waIntent = Intent(Intent.ACTION_SEND)
                waIntent.type = "text/plain"
                waIntent.setPackage("com.whatsapp")
                waIntent.putExtra(Intent.EXTRA_TEXT, "YOUR TEXT")
                startActivity(waIntent)
            } catch (e: PackageManager.NameNotFoundException) {
                Toast.makeText(this,"Please install whatsapp app",Toast.LENGTH_SHORT).show()
            }
        }

        btnSendData.setOnClickListener {
//            val message: String = "This is message"
            val message = "This is message"
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("user_message", message)
            startActivity(intent)
        }

        btnRecyclerView.setOnClickListener{
            val intent = Intent(this, RecyclerViewActivity::class.java)
            startActivity(intent)
        }

        btnCalculator.setOnClickListener{
            val intent = Intent(this, CalculatorActivity::class.java)
            startActivity(intent)
        }
    }
}
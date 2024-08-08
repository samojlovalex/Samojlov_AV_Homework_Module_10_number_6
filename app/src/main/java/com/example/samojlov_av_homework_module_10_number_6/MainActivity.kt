package com.example.samojlov_av_homework_module_10_number_6

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.samojlov_av_homework_module_10_number_6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var toolbarMain: androidx.appcompat.widget.Toolbar
    private lateinit var editTextHeightET: EditText
    private lateinit var editTextWeightET: EditText
    private lateinit var  calculateLaunchBTN: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
//        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        init()
    }
    private fun init() {
        toolbarMain = binding.toolbarMain
        setSupportActionBar(toolbarMain)
        title = getString(R.string.toolbar_title)
        toolbarMain.subtitle = getString(R.string.toolbar_subtitle)
        toolbarMain.setLogo(R.drawable.toolbar_icon)

        editTextHeightET = binding.editTextHeightET
        editTextWeightET = binding.editTextWeightET
        calculateLaunchBTN = binding.calculateLaunchBTN

        calculateLaunchBTN.setOnClickListener {
            if (editTextHeightET.text.isEmpty() || editTextWeightET.text.isEmpty())
                return@setOnClickListener
            val intent = Intent(this, BodyMassIndexActivity::class.java)
            intent.putExtra("height", editTextHeightET.text.toString())
            intent.putExtra("weight", editTextWeightET.text.toString())
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    @SuppressLint("SetTextI18n", "ShowToast")
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.resetMenuMain -> {
                editTextHeightET.text.clear()
                editTextWeightET.text.clear()
                Toast.makeText(
                    applicationContext,
                    getString(R.string.toast_reset),
                    Toast.LENGTH_LONG
                ).show()
            }

            R.id.exitMenuBodyMassIndex -> {
                Toast.makeText(
                    applicationContext,
                    getString(R.string.toast_exit),
                    Toast.LENGTH_LONG
                ).show()
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }

}
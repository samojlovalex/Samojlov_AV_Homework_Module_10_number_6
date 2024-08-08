package com.example.samojlov_av_homework_module_10_number_6

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.samojlov_av_homework_module_10_number_6.databinding.ActivityBodyMassIndexBinding


class BodyMassIndexActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBodyMassIndexBinding
    private lateinit var toolbarBodyMassIndex: androidx.appcompat.widget.Toolbar
    private lateinit var textViewBodyMassIndexTV: TextView
    private lateinit var imageViewIV: ImageView
    private lateinit var textViewRecommendationsTV: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityBodyMassIndexBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
//        setContentView(R.layout.activity_body_mass_index)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        init()
    }
    private fun init() {
        toolbarBodyMassIndex = binding.toolbarBodyMassIndex
        setSupportActionBar(toolbarBodyMassIndex)
        title = getString(R.string.toolbar_title)
        toolbarBodyMassIndex.subtitle = getString(R.string.toolbar_subtitle)
        toolbarBodyMassIndex.setLogo(R.drawable.toolbar_icon)

        textViewBodyMassIndexTV = binding.textViewBodyMassIndexTV
        imageViewIV = binding.imageViewIV
        textViewRecommendationsTV = binding.textViewRecommendationsTV

        var height = intent.getStringExtra("height")
        val weight = intent.getStringExtra("weight")
        if (height != null && weight != null){
            val bodyMassIndex = BodyMassIndex (height,weight)
            textViewBodyMassIndexTV.text = bodyMassIndex.indexPrint()
            textViewRecommendationsTV.text = bodyMassIndex.recommendations()
            bodyMassIndex.imageIndex(imageViewIV)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_body_mass_index, menu)
        return super.onCreateOptionsMenu(menu)
    }

    @SuppressLint("SetTextI18n", "ShowToast")
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.backMenuBodyMassIndex -> {
                Toast.makeText(
                    applicationContext,
                    getString(R.string.toast_backBodyMassIndex),
                    Toast.LENGTH_LONG
                ).show()
                finish()
            }
            R.id.exitMenuBodyMassIndex -> {
                Toast.makeText(
                    applicationContext,
                    getString(R.string.toast_exitBodyMassIndex),
                    Toast.LENGTH_LONG
                ).show()
                finishAffinity()
            }
        }
        return super.onOptionsItemSelected(item)
    }

}
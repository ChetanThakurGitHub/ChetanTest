package com.example.chetantest

import Museum
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val list = intent.getSerializableExtra("data") as? Museum

        Glide.with(this).load(list?.thumbnail).placeholder(R.drawable.place_holder).into(ivThumb)
        tvName.text = list?.title.toString().trim();
        tvIngredients.text = list?.ingredients

        btnMore.setOnClickListener(View.OnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse(list?.href))
            startActivity(i)
        })

        ivBcak.setOnClickListener(View.OnClickListener {
           onBackPressed()
        })

        //Toast.makeText(applicationContext,href,Toast.LENGTH_SHORT).show()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}

package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnAllBooks,btnAlreadyRead,btnWantToRead,btnCurrentlyReading,btnFavorite,btnAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        btnAllBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AllBooksActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initView() {
        btnAllBooks = findViewById(R.id.btn_SeeAllBooks);
        btnAlreadyRead = findViewById(R.id.btn_AReadBooks);
        btnWantToRead = findViewById(R.id.btn_CReadBooks);
        btnCurrentlyReading = findViewById(R.id.btn_YWishList);
        btnFavorite = findViewById(R.id.btn_SYourFavorite);
        btnAbout = findViewById(R.id.btn_About);
    }
}
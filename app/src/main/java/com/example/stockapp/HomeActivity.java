package com.example.stockapp;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.stockapp.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {

    TextView addProduct, editProduct, viewProducts, deleteProduct;
    private AppBarConfiguration appBarConfiguration;
    private ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        addProduct = findViewById(R.id.addProduct);
        editProduct = findViewById(R.id.editProduct);
        viewProducts = findViewById(R.id.viewProduct);
        deleteProduct = findViewById(R.id.deleteProduct);

        addProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"I have been clicked",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(), AddProduct.class));
            }
        });

        editProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), EditProduct.class));
            }
        });

        viewProducts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ViewProduct.class));
            }
        });

        deleteProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), DeleteProduct.class));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
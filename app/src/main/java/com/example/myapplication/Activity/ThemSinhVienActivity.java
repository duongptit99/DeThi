package com.example.myapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class ThemSinhVienActivity extends AppCompatActivity {
    EditText editTextTen,editTextNamSinh,editTextQueQuan;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_them_sinh_vien);
        init();
    }
    public void init(){
        editTextTen = findViewById(R.id.edit_text_ten);
        editTextNamSinh = findViewById(R.id.edit_text_namsinh);
        editTextQueQuan = findViewById(R.id.edit_text_quequan);
        spinner = findViewById(R.id.spinner);
        String[] array = {"Nam nhat","Nam hai","Nam ba","Nam tu"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,array);
        spinner.setAdapter(adapter);
    }
}
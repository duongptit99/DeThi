package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.myapplication.Model.SinhVien;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "student";
    private static final String TABLE_NAME = "student_table";
    private static final String ID = "id";
    private static final String NAME = "name";
    private static final String NAMSINH = "namsinh";
    private static final String QUEQUAN = "quequan";
    private static final String NAMHOC = "namhoc";

    private Context context;
    //tap database
    public DatabaseHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, null, 1);
        this.context = context;
    }
    //tao bang
    @Override
    public void onCreate(SQLiteDatabase db) {
        String sqlQuery = "CREATE TABLE " +TABLE_NAME +"(" + ID +" integer primary key, "
                +NAME +"TEXT,"
                +NAMSINH+"TEXT,"
                +QUEQUAN+"TEXT,"
                +NAMHOC+"TEXT)";
        db.execSQL(sqlQuery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }
    //them sinh vien
    public void themSinhVien(SinhVien sinhvien){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(NAME,sinhvien.getTenSV());
        values.put(NAMSINH,sinhvien.getNamsinh());
        values.put(QUEQUAN,sinhvien.getQuequan());
        values.put(NAMHOC,sinhvien.getNamhoc());
        db.insert(TABLE_NAME,null,values);
        db.close();
    }

    //doc du lieu
    public SinhVien getSdtudentById(int id){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(TABLE_NAME, new String[] { ID,
                        NAME, NAMSINH,QUEQUAN,NAMHOC }, ID + "=?",
                new String[] { String.valueOf(id) }, null, null, null, null);

        if (cursor != null)
            cursor.moveToFirst();

        SinhVien sinhVien = new SinhVien(cursor.getString(1),cursor.getString(2),cursor.getString(3),cursor.getString(4));
        cursor.close();
        db.close();
        return sinhVien;
    }
}

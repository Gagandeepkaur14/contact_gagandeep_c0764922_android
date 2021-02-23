package com.contact_gagandeep_c0764922_android;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    // Table Name
    public static final String TABLE_NAME = "CONTACT";

    // Table columns
    public static final String _ID = "_id";
    public static final String FIRSTNAME = "subject";
    public static final String ADDRESS = "address";
    public static final String LASTNAME = "lastname";
    public static final String EMAIL = "email";
    public static final String PHONENO = "phoneno";

    // Database Information
    static final String DB_NAME = "Assignments.DB";

    // database version
    static final int DB_VERSION = 1;

    // Creating table query
    private static final String CREATE_TABLE = "create table " + TABLE_NAME + "(" + _ID
            + " INTEGER PRIMARY KEY AUTOINCREMENT, " + FIRSTNAME + " TEXT NOT NULL, "+ LASTNAME +" TEXT NOT NULL,"+ PHONENO +" TEXT NOT NULL,"+ EMAIL +" TEXT NOT NULL, " + ADDRESS + " TEXT);";

    public DatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}

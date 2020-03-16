package com.asiapay.percentagecalulate;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class StudentDataBaseModel extends SQLiteOpenHelper implements StudentContracts.Model {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "studentsPercentage";
    private static final String TABLE_STUDENT = "student";
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";
    private static final String KEY_ROLL_NO = "rollNumber";
    private static final String KEY_PHYSICS_NO = "physicsNumber";
    private static final String KEY_CHEMISTRY_NO = "chemistryNumber";
    private static final String KEY_MATHS_NO = "mathsNumber";
    private static final String KEY_ENGLISH_NO = "englishNumber";
    private static final String KEY_HINDI_NO = "hindiNumber";
    private static final String KEY_PERCENTAGE_NO = "percentageNumber";
    Context context;
    String exceptionMessage;

    public StudentDataBaseModel(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE_STUDENT + "("
                + KEY_ID + " INTEGER PRIMARY KEY," + KEY_NAME + " TEXT,"
                + KEY_ROLL_NO + " TEXT," + KEY_PHYSICS_NO + " TEXT," + KEY_CHEMISTRY_NO + " TEXT,"
                + KEY_MATHS_NO + " TEXT," + KEY_ENGLISH_NO + " TEXT," + KEY_HINDI_NO + " TEXT," + KEY_PERCENTAGE_NO + " TEXT" + ")";
        db.execSQL(CREATE_CONTACTS_TABLE);
        Log.i("database", "onCreate");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    @Override
    public void insertStudentEntry(OnFinishedListener onFinishedListener, Student student) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_NAME, student.getStudentName());
        values.put(KEY_ROLL_NO, student.getStudentRollNo());
        values.put(KEY_PHYSICS_NO, student.getPhysics());
        values.put(KEY_CHEMISTRY_NO, student.getChemistry());
        values.put(KEY_MATHS_NO, student.getMaths());
        values.put(KEY_ENGLISH_NO, student.getEnglish());
        values.put(KEY_HINDI_NO, student.getHindi());
        values.put(KEY_PERCENTAGE_NO, student.getPercentage());
        // Inserting Row
        long newRowId = 0;
        try {
            newRowId = db.insert(TABLE_STUDENT, null, values);
            onFinishedListener.onSuccess(student);
        } catch (Throwable t) {
            onFinishedListener.onFailure(t);
        }
        // Closing database connection
        db.close();

      /*  if (newRowId != -1) {
            //Insert success.

        } else {
            //Inser failed.

        }*/


    }
}

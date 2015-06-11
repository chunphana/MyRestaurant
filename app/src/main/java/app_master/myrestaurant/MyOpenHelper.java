package app_master.myrestaurant;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by MyLife on 10/6/2558.
 */
public class MyOpenHelper extends SQLiteOpenHelper{

    private static final String DB_NAME = "Restaurant.db";
    private static final int    DB_VERSION = 1;
    private static final String USER_TABLE = "CREATE TABLE UserTABLE (_id integer primary key, "+" User text, Password text, Officer text);";
    private static final String ORDER_TABLE = "CREATE TABLE OrderTABLE (_id integer primary key "+" Officer text, Date text, Order text, Item integer);";


    public MyOpenHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);

    } // end Constructor

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(USER_TABLE);
        db.execSQL(ORDER_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
} //end Main Class

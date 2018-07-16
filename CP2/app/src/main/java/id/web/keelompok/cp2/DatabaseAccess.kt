package id.web.keelompok.cp2

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

import java.util.ArrayList

class DatabaseAccess
/**
 * Private constructor to aboid object creation from outside classes.
 *
 * @param context
 */
constructor(context: Context) {
    private val openHelper: SQLiteOpenHelper
    private var database: SQLiteDatabase? = null

    /**
     * Read all quotes from the database.
     *
     * @return a List of quotes
     */
    val quotes: List<Note>
        get() {
            val list = ArrayList<Note>()
            val cursor = database!!.rawQuery("Select NAMA_SEKOLAH,LONGTITUDE,LATITUDE FROM smk,jurusan,smk_jurusan where NAMA_JURUSAN='Administrasi Perkantoran' AND smk_jurusan.ID_SEKOLAH = smk.ID_SEKOLAH;", null)
            if(cursor.moveToFirst()){
                do{

                    val NAMA_SEKOLAH = cursor.getString(cursor.getColumnIndex("NAMA_SEKOLAH"))
                    val LONGTITUDE = cursor.getString(cursor.getColumnIndex("LONGTITUDE"))
                    val LATITUDE =  cursor.getString(cursor.getColumnIndex("LATITUDE"))
                    list.add(Note(NAMA_SEKOLAH,LONGTITUDE,LATITUDE))
                } while (cursor.moveToNext())
            }

            cursor.close()
            return list
        }


    init {
        this.openHelper = DatabaseHelper(context)
    }

    /**
     * Open the database connection.
     */
    fun open() {
        this.database = openHelper.writableDatabase
    }

    /**
     * Close the database connection.
     */
    fun close() {
        if (database != null) {
            this.database!!.close()
        }
    }

    companion object {
        private var instance: DatabaseAccess? = null

        /**
         * Return a singleton instance of DatabaseAccess.
         *
         * @param context the Context
         * @return the instance of DabaseAccess
         */
        fun getInstance(context: Context): DatabaseAccess {
            if (instance == null) {
                instance = DatabaseAccess(context)
            }
            return instance as DatabaseAccess
        }
    }
}
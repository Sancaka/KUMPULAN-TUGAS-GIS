package id.web.keelompok.cp2
import android.content.Context

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper

class DatabaseHelper(context: Context) : SQLiteAssetHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
    companion object {
        private val DATABASE_NAME = "CP2.db"
        private val DATABASE_VERSION = 1
    }
}
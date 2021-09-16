package com.example.conctact.Database

import android.content.Context
@Database(entities)
abstract class ContactDatabase:RoomDatabase {
    abstract fun contactDao():ContactDao

    companion object{
        var database:ContactDatabase?=null

        fun getDatabase(context: Context):ContactDatabase{
            if(database==null)
                database=Room.databaseBuilder(context,ContactDatabase::class.java,"")
                    .fallbackToDestructiveMigration().build()
        }
        return database as ContactDatabase
    }

}
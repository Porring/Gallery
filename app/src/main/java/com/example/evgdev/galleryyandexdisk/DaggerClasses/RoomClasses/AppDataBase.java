package com.example.evgdev.galleryyandexdisk.DaggerClasses.RoomClasses;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.example.evgdev.galleryyandexdisk.AnyClasses.InfoClass;
import com.example.evgdev.galleryyandexdisk.App;

//класс описания самой бд
@Database(entities = {YandexDiskData.class}, version = 2)
public abstract class AppDataBase extends RoomDatabase{

    public abstract YandexDiskDataDao YandexDiskDataDao();
}

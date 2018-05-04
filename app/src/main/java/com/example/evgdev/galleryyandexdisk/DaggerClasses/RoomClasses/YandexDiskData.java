package com.example.evgdev.galleryyandexdisk.DaggerClasses.RoomClasses;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;
import android.text.TextUtils;

import com.yandex.disk.rest.json.Resource;
import com.yandex.disk.rest.json.ResourceList;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;

import static android.arch.persistence.room.ColumnInfo.TEXT;

//класс с описанием полей таблицы
@Entity(primaryKeys = {"md5", "filePath"})
public class YandexDiskData {

//    @PrimaryKey(autoGenerate = true)
    public long id;

    @NonNull
    @ColumnInfo(typeAffinity = TEXT)
    public String md5;

    @ColumnInfo(typeAffinity = TEXT)
    @NonNull
    public String filePath;

    @ColumnInfo(typeAffinity = TEXT)
    @NonNull
    public String fileName;

    @ColumnInfo(typeAffinity = TEXT)
    public String previewURL;

    //метод конвертирует ресурс полученный с диска в объект БД
    public static YandexDiskData ConvertFromResource(Resource resource){

        YandexDiskData record = new YandexDiskData();

        record.previewURL = resource.getPreview();
        record.md5 = resource.getMd5();
        record.fileName = resource.getName();
        record.filePath = resource.getPath().toString();

        return record;
    }

}

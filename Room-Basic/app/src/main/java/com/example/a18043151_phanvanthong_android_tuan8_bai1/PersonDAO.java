package com.example.a18043151_phanvanthong_android_tuan8_bai1;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface PersonDAO {
    @Insert
    void addPerson(Person person);
    @Query("Select * from person")
    List<Person> getAllPersons();
}

package com.example.addressbook.model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqliteConnection
{
    private static Connection instance = null;

    private  SqliteConnection()
    {
        String url = "jdbc:sqlite:contacts.db";
        try {
            instance = DriverManager.getConnection(url);
            System.out.println("Connected to database successfully");
        } catch (SQLException sqlEx) {
            System.out.println(sqlEx);
        }
    }
    public static Connection getInstance(){
        if (instance == null){
            new SqliteConnection();
        }
        return instance;
    }

}

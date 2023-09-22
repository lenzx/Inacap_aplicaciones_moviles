package com.example.hotel_app;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class TestDatabase {
    public static void main(String[] args) {
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        DatabaseReference myRef = db.getReference("message");
        myRef.setValue("hello Wold");
    }
}

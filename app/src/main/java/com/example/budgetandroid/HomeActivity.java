package com.example.budgetandroid;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ListView transactionsListView = findViewById(R.id.transactionsListView);

       List<Transaction> transactions = new ArrayList<>();
       transactions.add(new Transaction("Zakupy", -50.0, "Wydatek", "2023-10-01"));
       transactions.add(new Transaction("Wynagrodzenie", 3000.0, "Przychód", "2023-10-02"));
       transactions.add(new Transaction("Kino", -30.0, "Wydatek", "2023-10-03"));
       transactions.add(new Transaction("Sprzedaż", 150.0, "Przychód", "2023-10-04"));
       transactions.add(new Transaction("Rachunki", -200.0, "Wydatek", "2023-10-05"));

        TransactionAdapter adapter = new TransactionAdapter(this, transactions);
        transactionsListView.setAdapter(adapter);
    }
}
package com.example.budgetandroid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class TransactionAdapter extends BaseAdapter {
    private Context context;
    private List<Transaction> transactions;

    public TransactionAdapter(Context context, List<Transaction> transactions) {
        this.context = context;
        this.transactions = transactions;
    }

    @Override
    public int getCount() {
        return transactions.size();
    }

    @Override
    public Object getItem(int position) {
        return transactions.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.transaction_item, parent, false);
        }

        Transaction transaction = transactions.get(position);


        TextView titleTextView = convertView.findViewById(R.id.titleTextView);
        TextView amountTextView = convertView.findViewById(R.id.amountTextView);
        TextView dateTextView = convertView.findViewById(R.id.dateTextView);

        titleTextView.setText(transaction.getTitle());
        amountTextView.setText(transaction.getAmount() + " zł");
        dateTextView.setText(transaction.getDate());

        if (transaction.getAmount() >= 0) {
            amountTextView.setTextColor(Color.parseColor("#1B8047"));
        } else {
            amountTextView.setTextColor(Color.parseColor("#D32F2F"));
        }

        return convertView;
    }
}
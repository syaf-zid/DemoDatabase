package com.example.demodatabase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Task> {
    private Context context;
    private ArrayList<Task> taskList;
    private TextView tvID, tvDesc, tvDate;

    public CustomAdapter(Context context, int resource, ArrayList<Task> objs) {
        super(context, resource, objs);

        taskList = objs;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.row, parent, false);

        tvID = row.findViewById(R.id.textViewID);
        tvDesc = row.findViewById(R.id.textViewDesc);
        tvDate = row.findViewById(R.id.textViewDate);

        Task item = taskList.get(position);
        tvID.setText(Integer.toString(item.getId()));
        tvDesc.setText(item.getDescription());
        tvDate.setText(item.getDate());

        return row;
    }
}

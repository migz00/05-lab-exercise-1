package com.migue.a05_lab_exercise_1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ProgramSpinnerAdapter extends ArrayAdapter<String>{

    private Context context;
    private int itemLayoutResource;
    private ArrayList<String> programs = new ArrayList<>();

    public ProgramSpinnerAdapter(@NonNull Context context, int resource, @NonNull List<String> programs) {
        super(context, resource, programs);

        this.context = context;
        this.itemLayoutResource = resource;
        this.programs.addAll(programs);
    }
    public String getItem(int position) {
        return this.programs.get(position);
    }
    @Override
    public int getCount() {
        return this.programs.size();
    }
    @Override
    public int getPosition(@Nullable String item) {
        return this.programs.indexOf(item);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String programname = getItem(position);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View spinnerlayout = inflater.inflate(itemLayoutResource, parent, false);

        TextView programname_tv = spinnerlayout.findViewById(R.id.name_textView);
        programname_tv.setText(programname);

        return spinnerlayout;
    }
}

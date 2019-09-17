package com.example.android.notes;

import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class UploadsAdapter extends RecyclerView.Adapter<UploadsAdapter.MyViewHolder> {

    private ArrayList<FileDetails> cardSet;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView fileName;
        TextView subjectName;
        TextView fileSize;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.fileName = itemView.findViewById(R.id.file_name);
            this.subjectName = itemView.findViewById(R.id.subject_name);
            this.fileSize = itemView.findViewById(R.id.file_size);
        }
    }

    public UploadsAdapter(ArrayList<FileDetails> card) {
        this.cardSet = card;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.uploads_file_details_layout, parent, false);

        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int listPosition) {

        TextView textViewName = holder.fileName;
        TextView textViewSubject = holder.subjectName;
        TextView textViewSize = holder.fileSize;

        textViewName.setText(cardSet.get(listPosition).getFileName());
        textViewSubject.setText(cardSet.get(listPosition).getSubjectName());
        textViewSize.setText(cardSet.get(listPosition).getFileSize());
    }

    @Override
    public int getItemCount() {
        return cardSet.size();
    }
}

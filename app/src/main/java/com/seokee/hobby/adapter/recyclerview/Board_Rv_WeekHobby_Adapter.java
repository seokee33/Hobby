package com.seokee.hobby.adapter.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.seokee.hobby.R;
import com.seokee.hobby.model.Board_WeekHobby_Rv_Model;

import java.util.ArrayList;

public class Board_Rv_WeekHobby_Adapter extends RecyclerView.Adapter<Board_Rv_WeekHobby_Adapter.CustomViewHolder> {
    private ArrayList<Board_WeekHobby_Rv_Model> weekHobbyList;

    public Board_Rv_WeekHobby_Adapter(ArrayList<Board_WeekHobby_Rv_Model> arrayList) {
        this.weekHobbyList = arrayList;
    }

    @NonNull
    @Override
    public Board_Rv_WeekHobby_Adapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View holder = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.board_rv_weekhobby_item, viewGroup, false);
        return new Board_Rv_WeekHobby_Adapter.CustomViewHolder(holder);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.iv_Board_WeekHobby.setImageResource(R.drawable.run);
        holder.tv_Board_WeekHobby_title.setText(weekHobbyList.get(position).getTitle());
    }


    @Override
    public int getItemCount() {
        return 3;
    }


    public class CustomViewHolder extends RecyclerView.ViewHolder {

        ImageView iv_Board_WeekHobby;
        TextView tv_Board_WeekHobby_title;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);

            this.iv_Board_WeekHobby = itemView.findViewById(R.id.iv_Board_WeekHobby);
            this.tv_Board_WeekHobby_title = itemView.findViewById(R.id.tv_Board_WeekHobby_title);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

        }
    }
}

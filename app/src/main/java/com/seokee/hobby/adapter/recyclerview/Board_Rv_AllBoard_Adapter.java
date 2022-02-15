package com.seokee.hobby.adapter.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.seokee.hobby.R;
import com.seokee.hobby.model.Board_AllBoard_Rv_Model;

import java.util.ArrayList;

public class Board_Rv_AllBoard_Adapter extends RecyclerView.Adapter<Board_Rv_AllBoard_Adapter.CustomViewHolder> {
    private ArrayList<Board_AllBoard_Rv_Model> allBoardList;

    public Board_Rv_AllBoard_Adapter(ArrayList<Board_AllBoard_Rv_Model> arrayList) {
        this.allBoardList = arrayList;
    }

    @NonNull
    @Override
    public Board_Rv_AllBoard_Adapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View holder = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.board_rv_allboard_item,viewGroup,false);
        return new CustomViewHolder(holder);
    }

    @Override
    public void onBindViewHolder(@NonNull Board_Rv_AllBoard_Adapter.CustomViewHolder holder, int position) {
        holder.tv_Board_AllBoard_Title.setText(allBoardList.get(position).getTitle());
        holder.tv_Board_AllBoard_Body.setText(allBoardList.get(position).getBody());
        holder.tv_Board_AllBoard_Time.setText(allBoardList.get(position).getDate().toString());

    }

    @Override
    public int getItemCount() {
        return 3;
    }


    public class CustomViewHolder extends RecyclerView.ViewHolder {


        TextView tv_Board_AllBoard_Title;
        TextView tv_Board_AllBoard_Body;
        TextView tv_Board_AllBoard_Time;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);

            this.tv_Board_AllBoard_Title = itemView.findViewById(R.id.tv_Board_AllBoard_Title);
            this.tv_Board_AllBoard_Body = itemView.findViewById(R.id.tv_Board_AllBoard_Body);
            this.tv_Board_AllBoard_Time = itemView.findViewById(R.id.tv_Board_AllBoard_Time);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

        }
    }
}



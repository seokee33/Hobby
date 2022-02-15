package com.seokee.hobby.adapter.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.seokee.hobby.R;
import com.seokee.hobby.model.Board_HotBoard_Rv_Model;

import java.util.ArrayList;

public class Board_Rv_HotBoard_Adapter extends RecyclerView.Adapter<Board_Rv_HotBoard_Adapter.CustomViewHolder> {
    private ArrayList<Board_HotBoard_Rv_Model> hotBoardList;

    public Board_Rv_HotBoard_Adapter(ArrayList<Board_HotBoard_Rv_Model> arrayList) {
        this.hotBoardList = arrayList;
    }

    @NonNull
    @Override
    public Board_Rv_HotBoard_Adapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View holder = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.board_rv_hotboard_item,viewGroup,false);
        return new Board_Rv_HotBoard_Adapter.CustomViewHolder(holder);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.tv_Board_HotBoard_Title.setText(hotBoardList.get(position).getTitle());
        holder.tv_Board_HotBoard_Body.setText(hotBoardList.get(position).getBody());
        holder.tv_Board_HotBoard_Time.setText(hotBoardList.get(position).getDate().toString());
    }



    @Override
    public int getItemCount() {
        return 3;
    }


    public class CustomViewHolder extends RecyclerView.ViewHolder {


        TextView tv_Board_HotBoard_Title;
        TextView tv_Board_HotBoard_Body;
        TextView tv_Board_HotBoard_Time;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);

            this.tv_Board_HotBoard_Title = itemView.findViewById(R.id.tv_Board_HotBoard_Title);
            this.tv_Board_HotBoard_Body = itemView.findViewById(R.id.tv_Board_HotBoard_Body);
            this.tv_Board_HotBoard_Time = itemView.findViewById(R.id.tv_Board_HotBoard_Time);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

        }
    }
}
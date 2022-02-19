package com.seokee.hobby.adapter.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.seokee.hobby.R;
import com.seokee.hobby.model.HobbyList_Rv_Model;

import java.util.ArrayList;

public class HobbyList_Rv_List_Adapter extends RecyclerView.Adapter<HobbyList_Rv_List_Adapter.CustomViewHolder>{
   private ArrayList<HobbyList_Rv_Model> itemList;
    public HobbyList_Rv_List_Adapter(ArrayList<HobbyList_Rv_Model> itemList){
        this.itemList = itemList;
    }


    @NonNull
    @Override
    public HobbyList_Rv_List_Adapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View holder = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.hoobylist_rv_item,viewGroup,false);
        return new HobbyList_Rv_List_Adapter.CustomViewHolder(holder);
    }

    @Override
    public void onBindViewHolder(@NonNull HobbyList_Rv_List_Adapter.CustomViewHolder holder, int position) {
        holder.iv_HobbyList_Icon.setImageResource(itemList.get(position).getHobbyImage());
        holder.tv_HobbyList_Title.setText(itemList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_HobbyList_Icon;
        TextView tv_HobbyList_Title;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);

            this.iv_HobbyList_Icon = itemView.findViewById(R.id.iv_HobbyList_Icon);
            this.tv_HobbyList_Title = itemView.findViewById(R.id.tv_HobbyList_Title);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }
    }
}

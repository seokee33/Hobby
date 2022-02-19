package com.seokee.hobby.adapter.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.seokee.hobby.R;
import com.seokee.hobby.model.HobbyList_Rv_Model;
import com.seokee.hobby.model.LikedSubs_Rv_Model;
import com.seokee.hobby.view.menu.like.MenuLike;

import java.util.ArrayList;

public class Like_Rv_LikedSub_Adapter extends RecyclerView.Adapter<Like_Rv_LikedSub_Adapter.CustomViewHolder>{
   private ArrayList<LikedSubs_Rv_Model> itemList;
    private MenuLike menuLike;
    public Like_Rv_LikedSub_Adapter(ArrayList<LikedSubs_Rv_Model> itemList, MenuLike menuLike){
        this.itemList = itemList;
        this.menuLike = menuLike;

    }


    @NonNull
    @Override
    public Like_Rv_LikedSub_Adapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View holder = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.like_rv_subs_item,viewGroup,false);
        return new Like_Rv_LikedSub_Adapter.CustomViewHolder(holder);
    }

    @Override
    public void onBindViewHolder(@NonNull Like_Rv_LikedSub_Adapter.CustomViewHolder holder, int position) {
        holder.iv_LikedSub_Icon.setImageResource(itemList.get(position).getHobbyImage());
        holder.tv_LikedSub_Title.setText(itemList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_LikedSub_Icon;
        TextView tv_LikedSub_Title;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);

            this.iv_LikedSub_Icon = itemView.findViewById(R.id.iv_LikedSub_Icon);
            this.tv_LikedSub_Title = itemView.findViewById(R.id.tv_LikedSub_Title);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    menuLike.showContents(tv_LikedSub_Title.getText().toString());

                }
            });
        }
    }
}

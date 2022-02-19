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
import com.seokee.hobby.model.Like_Content_Rv_Model;
import com.seokee.hobby.model.ViewType_Like_Content;

import java.util.ArrayList;

public class Like_Rv_Subs_Contents_Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private ArrayList<Like_Content_Rv_Model> itemList;

    public Like_Rv_Subs_Contents_Adapter(ArrayList<Like_Content_Rv_Model> itemList){
        this.itemList = itemList;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = null;
        Context context = viewGroup.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(viewType == ViewType_Like_Content.Media)
        {
            view = inflater.inflate(R.layout.like_rv_media_content, viewGroup, false);
            return new MediaViewHolder(view);
        }
        else
        {
            view = inflater.inflate(R.layout.like_rv_nomedia_content, viewGroup, false);
            return new NoMediaViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {

        if(viewHolder instanceof MediaViewHolder)
        {
            ((MediaViewHolder) viewHolder).media_id.setText(itemList.get(position).getId());
            ((MediaViewHolder) viewHolder).media_image.setImageResource(itemList.get(position).getImageSource());
            ((MediaViewHolder) viewHolder).media_Content.setText(itemList.get(position).getContent());
        }
        else
        {
            ((NoMediaViewHolder) viewHolder).nomedia_id.setText(itemList.get(position).getId());
            ((NoMediaViewHolder) viewHolder).nomedia_Content.setText(itemList.get(position).getContent());
        }
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return itemList.get(position).getViewType();
    }

    public class MediaViewHolder extends RecyclerView.ViewHolder{
        private TextView media_id;
        private ImageView media_image;
        private TextView media_Content;
        MediaViewHolder(View itemView)
        {
            super(itemView);
            media_id = itemView.findViewById(R.id.tv_Like_Media_Content_ID);
            media_image = itemView.findViewById(R.id.iv_Like_Media_Image);
            media_Content = itemView.findViewById(R.id.tv_Like_Media_Content_content);
        }
    }

    public class NoMediaViewHolder extends RecyclerView.ViewHolder{
        private TextView nomedia_id;
        private TextView nomedia_Content;

        NoMediaViewHolder(View itemView)
        {
            super(itemView);
            nomedia_id = itemView.findViewById(R.id.tv_Like_NoMedia_Content_ID);
            nomedia_Content = itemView.findViewById(R.id.tv_Like_NoMedia_Content_content);
        }
    }

}

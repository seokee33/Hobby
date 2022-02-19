package com.seokee.hobby.view.menu.like;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.seokee.hobby.R;
import com.seokee.hobby.adapter.recyclerview.Like_Rv_LikedSub_Adapter;
import com.seokee.hobby.adapter.recyclerview.Like_Rv_Subs_Contents_Adapter;
import com.seokee.hobby.databinding.MenuLikeBinding;
import com.seokee.hobby.model.Like_Content_Rv_Model;
import com.seokee.hobby.model.LikedSubs_Rv_Model;
import com.seokee.hobby.model.ViewType_Like_Content;

import java.util.ArrayList;

public class MenuLike extends Fragment {

    private View view;
    private MenuLikeBinding binding;

    //Sub
    private RecyclerView rv_Subs;
    private RecyclerView.Adapter adapter_Subs;
    private ArrayList<LikedSubs_Rv_Model> list_Subs;
    private String sports[] = {"야구","축구","탁구","배드민턴","골프","배구","헬스"};
    private int sports_Image[] = {R.drawable.baseball,R.drawable.football,R.drawable.tabletennis,R.drawable.badminton,R.drawable.golf,R.drawable.volleyball,R.drawable.health};


    //Content
    private RecyclerView rv_Content;
    private RecyclerView.Adapter adapter_Content;
    private ArrayList<Like_Content_Rv_Model> list_Content;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = MenuLikeBinding.inflate(inflater,container,false);
        view = binding.getRoot();
        init();

        //sub
        rv_Subs = binding.rvLikeLikedHobby;
        rv_Subs.setHasFixedSize(true);
        LinearLayoutManager lm_Sub = new LinearLayoutManager(getContext());
        lm_Sub.setOrientation(LinearLayoutManager.HORIZONTAL);
        rv_Subs.setLayoutManager(lm_Sub);

        adapter_Subs = new Like_Rv_LikedSub_Adapter(list_Subs,this);
        rv_Subs.setAdapter(adapter_Subs);

        SnapHelper snap_rv_Sports = new LinearSnapHelper();
        snap_rv_Sports.attachToRecyclerView(rv_Subs);
        adapter_Subs.notifyDataSetChanged();

        return view;
    }

    public void init(){
        list_Subs = new ArrayList<>();
        for(int i= 0; i<sports.length;i++){
            list_Subs.add(new LikedSubs_Rv_Model(sports_Image[i],sports[i]));
        }
    }

    public void showContents(String subName){
        if(subName.equals("축구")){
            list_Content = new ArrayList<>();
            list_Content.add(new Like_Content_Rv_Model("user1","........", ViewType_Like_Content.No_Media));
            list_Content.add(new Like_Content_Rv_Model("user2",R.drawable.football,"........",ViewType_Like_Content.Media));


            rv_Content = binding.rvLikeContent;
            rv_Content.setHasFixedSize(true);
            LinearLayoutManager lm_Sub = new LinearLayoutManager(getContext());
            lm_Sub.setOrientation(LinearLayoutManager.VERTICAL);
            rv_Content.setLayoutManager(lm_Sub);

            adapter_Content = new Like_Rv_Subs_Contents_Adapter(list_Content);
            rv_Content.setAdapter(adapter_Content);
            adapter_Content.notifyDataSetChanged();
        }
    }


}

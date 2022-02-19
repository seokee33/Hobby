package com.seokee.hobby.view.menu.hobbylist;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.seokee.hobby.R;
import com.seokee.hobby.adapter.recyclerview.Board_Rv_WeekHobby_Adapter;
import com.seokee.hobby.adapter.recyclerview.HobbyList_Rv_List_Adapter;
import com.seokee.hobby.databinding.MenuHobbylistBinding;
import com.seokee.hobby.model.Board_WeekHobby_Rv_Model;
import com.seokee.hobby.model.HobbyList_Rv_Model;

import java.util.ArrayList;

public class MenuHobbyList extends Fragment {
    private View view;
    private MenuHobbylistBinding binding;

    //sports
    private RecyclerView rv_Sports;
    private RecyclerView.Adapter adapter_Sports;
    private ArrayList<HobbyList_Rv_Model> list_Sports;

    private String sports[] = {"야구","축구","탁구","배드민턴","골프","배구","헬스"};
    private int sports_Image[] = {R.drawable.baseball,R.drawable.football,R.drawable.tabletennis,R.drawable.badminton,R.drawable.golf,R.drawable.volleyball,R.drawable.health};

    //travel
    private RecyclerView rv_Travel;
    private RecyclerView.Adapter adapter_Travel;
    private ArrayList<HobbyList_Rv_Model> list_Travel;
    private String travel[] = {"캠핑","백패킹","등산"};
    private int trabel_Image[] = {R.drawable.camping,R.drawable.backpack,R.drawable.hiking};

    //games
    private RecyclerView rv_Game;
    private RecyclerView.Adapter adapter_Game;
    private ArrayList<HobbyList_Rv_Model> list_Game;
    private String games[] = {"LOL","PUBG","서든어택"};
    private int games_Image[] = {R.drawable.lol,R.drawable.pubg,R.drawable.sa};

    //maker
    private RecyclerView rv_Maker;
    private RecyclerView.Adapter adapter_Maker;
    private ArrayList<HobbyList_Rv_Model> list_Maker;
    private String maker[] = {"레고","퍼즐","종이접기"};
    private int maker_Image[] = {R.drawable.lego,R.drawable.puzzle,R.drawable.origami};


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = MenuHobbylistBinding.inflate(inflater,container,false);
        view = binding.getRoot();

        init();
        LinearLayoutManager lm_Sports =new GridLayoutManager(getContext(),5);
        lm_Sports.setOrientation(LinearLayoutManager.VERTICAL);

        LinearLayoutManager lm_Travel = new GridLayoutManager(getContext(),5);
        lm_Travel.setOrientation(LinearLayoutManager.VERTICAL);

        LinearLayoutManager lm_Games = new GridLayoutManager(getContext(),5);
        lm_Games.setOrientation(LinearLayoutManager.VERTICAL);

        LinearLayoutManager lm_Maker = new GridLayoutManager(getContext(),5);
        lm_Maker.setOrientation(LinearLayoutManager.VERTICAL);


        //sports
        rv_Sports = binding.rvSports;
        rv_Sports.setHasFixedSize(true);
        rv_Sports.setLayoutManager(lm_Sports);
        adapter_Sports = new HobbyList_Rv_List_Adapter(list_Sports);
        rv_Sports.setAdapter(adapter_Sports);

        SnapHelper snap_rv_Sports = new LinearSnapHelper();
        snap_rv_Sports.attachToRecyclerView(rv_Sports);
        adapter_Sports.notifyDataSetChanged();

        //travel
        rv_Travel = binding.rvTravel;
        rv_Travel.setHasFixedSize(true);
        rv_Travel.setLayoutManager(lm_Travel);
        adapter_Travel = new HobbyList_Rv_List_Adapter(list_Travel);
        rv_Travel.setAdapter(adapter_Travel);

        SnapHelper snap_rv_Travel = new LinearSnapHelper();
        snap_rv_Travel.attachToRecyclerView(rv_Travel);
        adapter_Travel.notifyDataSetChanged();

        //games
        rv_Game = binding.rvGame;
        rv_Game.setHasFixedSize(true);

        rv_Game.setLayoutManager(lm_Games);

        adapter_Game = new HobbyList_Rv_List_Adapter(list_Game);
        rv_Game.setAdapter(adapter_Game);

        SnapHelper snap_rv_Games = new LinearSnapHelper();
        snap_rv_Games.attachToRecyclerView(rv_Game);
        adapter_Game.notifyDataSetChanged();

        //maker
        rv_Maker = binding.rvMaker;
        rv_Maker.setHasFixedSize(true);

        rv_Maker.setLayoutManager(lm_Maker);

        adapter_Maker = new HobbyList_Rv_List_Adapter(list_Maker);
        rv_Maker.setAdapter(adapter_Maker);

        SnapHelper snap_rv_Maker = new LinearSnapHelper();
        snap_rv_Maker.attachToRecyclerView(rv_Maker);
        adapter_Maker.notifyDataSetChanged();
        return view;
    }


    public void init(){
        list_Sports = new ArrayList<>();
        for(int i= 0; i<sports.length;i++){
            list_Sports.add(new HobbyList_Rv_Model(sports_Image[i],sports[i]));
        }

        list_Travel = new ArrayList<>();
        for(int i= 0; i<travel.length;i++){
            list_Travel.add(new HobbyList_Rv_Model(trabel_Image[i],travel[i]));
        }

        list_Game = new ArrayList<>();
        for(int i= 0; i<games.length;i++){
            list_Game.add(new HobbyList_Rv_Model(games_Image[i],games[i]));
        }

        list_Maker = new ArrayList<>();
        for(int i= 0; i<maker.length;i++){
            list_Maker.add(new HobbyList_Rv_Model(maker_Image[i],maker[i]));
        }
    }

}

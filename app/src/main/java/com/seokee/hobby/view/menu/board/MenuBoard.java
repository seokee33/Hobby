package com.seokee.hobby.view.menu.board;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.seokee.hobby.R;
import com.seokee.hobby.adapter.recyclerview.Board_Rv_AllBoard_Adapter;
import com.seokee.hobby.adapter.recyclerview.Board_Rv_HotBoard_Adapter;
import com.seokee.hobby.databinding.MenuBoardBinding;
import com.seokee.hobby.model.Board_AllBoard_Rv_Model;
import com.seokee.hobby.model.Board_HotBoard_Rv_Model;

import java.util.ArrayList;
import java.util.Date;

public class MenuBoard extends Fragment {
    private View view;
    private MenuBoardBinding binding;

    //AllBoard
    private RecyclerView rv_AllBoard;
    private RecyclerView.Adapter adapter_AllBoard;
    private ArrayList<Board_AllBoard_Rv_Model> list_AllBoard;

    //HotBoard
    private RecyclerView rv_HotBoard;
    private RecyclerView.Adapter adapter_HotBoard;
    private ArrayList<Board_HotBoard_Rv_Model> list_HotBoard;

    @SuppressLint("NotifyDataSetChanged")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,  @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        binding = MenuBoardBinding.inflate(inflater,container,false);
        view = binding.getRoot();

        //AllBoard RecyclerView
        //임의 아이템
        list_AllBoard = new ArrayList<>();
        for(int i = 0; i<6; i++){
            Date date_now = new Date(System.currentTimeMillis());
            Board_AllBoard_Rv_Model item = new Board_AllBoard_Rv_Model("Title"+i,"Body", date_now);
            list_AllBoard.add(item);
        }

        rv_AllBoard = binding.rvAllBoard;
        rv_AllBoard.setHasFixedSize(true);
        rv_AllBoard.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter_AllBoard = new Board_Rv_AllBoard_Adapter(list_AllBoard);
        rv_AllBoard.setAdapter(adapter_AllBoard);
        adapter_AllBoard.notifyDataSetChanged();

        //AllBoard RecyclerView
        //임의 아이템
        list_HotBoard = new ArrayList<>();
        for(int i = 0; i<6; i++){
            Date date_now = new Date(System.currentTimeMillis());
            Board_HotBoard_Rv_Model item = new Board_HotBoard_Rv_Model("Title"+i,"Body", date_now);
            list_HotBoard.add(item);
        }

        rv_HotBoard = binding.rvHotBoard;
        rv_HotBoard.setHasFixedSize(true);
        rv_HotBoard.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter_HotBoard = new Board_Rv_HotBoard_Adapter(list_HotBoard);
        rv_HotBoard.setAdapter(adapter_HotBoard);
        adapter_HotBoard.notifyDataSetChanged();
        return view;
    }
}

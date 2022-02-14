package com.seokee.hobby.view.menu.board;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.seokee.hobby.databinding.MenuBoardBinding;

public class MenuBoard extends Fragment {
    private View view;
    private MenuBoardBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = MenuBoardBinding.inflate(inflater,container,false);
        view = binding.getRoot();

        return view;
    }
}

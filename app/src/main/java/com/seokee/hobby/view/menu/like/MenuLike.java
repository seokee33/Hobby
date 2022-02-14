package com.seokee.hobby.view.menu.like;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.seokee.hobby.databinding.MenuLikeBinding;

public class MenuLike extends Fragment {

    private View view;
    private MenuLikeBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = MenuLikeBinding.inflate(inflater,container,false);
        view = binding.getRoot();

        return view;
    }
}

package com.seokee.hobby.view.menu.hobbylist;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.seokee.hobby.databinding.MenuHobbylistBinding;

public class MenuHobbyList extends Fragment {
    private View view;
    private MenuHobbylistBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = MenuHobbylistBinding.inflate(inflater,container,false);
        view = binding.getRoot();

        return view;
    }

}

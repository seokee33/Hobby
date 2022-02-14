package com.seokee.hobby.view;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.seokee.hobby.R;
import com.seokee.hobby.databinding.ActivityMainBinding;
import com.seokee.hobby.view.menu.board.MenuBoard;
import com.seokee.hobby.view.menu.hobbylist.MenuHobbyList;
import com.seokee.hobby.view.menu.like.MenuLike;

import org.jetbrains.annotations.NotNull;

public class MainActivity extends AppCompatActivity {

    //BottomNavi
    private BottomNavigationView bottomNavi;
    private FragmentManager fm;
    private FragmentTransaction ft;
    private Menu menu;

    //bottomNavi - fragment
    private MenuBoard menuBoard;
    private MenuHobbyList menuHobbyList;
    private MenuLike menuLike;

    private ActivityMainBinding binding;
    private View view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        view = binding.getRoot();
        setContentView(view);
        menu = binding.bottomNavi.getMenu();

        init();

        binding.bottomNavi.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.navi_Board:
                        setFrag(0);
                        item.setIcon(R.drawable.watching);    // 선택한 이미지 변경
                        menu.findItem(R.id.navi_HobbyList).setIcon(R.drawable.nonplay);
                        menu.findItem(R.id.navi_MyHobby).setIcon(R.drawable.like);
                        break;
                    case R.id.navi_HobbyList:
                        setFrag(1);
                        item.setIcon(R.drawable.run);    // 선택한 이미지 변경
                        menu.findItem(R.id.navi_Board).setIcon(R.drawable.board);
                        menu.findItem(R.id.navi_MyHobby).setIcon(R.drawable.like);
                        break;
                    case R.id.navi_MyHobby:
                        setFrag(2);
                        item.setIcon(R.drawable.likeheart);    // 선택한 이미지 변경
                        menu.findItem(R.id.navi_Board).setIcon(R.drawable.board);
                        menu.findItem(R.id.navi_HobbyList).setIcon(R.drawable.nonplay);
                        break;
                }
                return true;
            }
        });
        setFrag(0);
    }


    private void setFrag(int i){
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        switch (i){
            case 0:
                ft.replace(binding.mainFlBottomNavi.getId(),menuBoard).commit();
                break;
            case 1:
                ft.replace(binding.mainFlBottomNavi.getId(),menuHobbyList).commit();
                break;
            case 2:
                ft.replace(binding.mainFlBottomNavi.getId(),menuLike).commit();
                break;
        }
    }


    private void init(){
        menuBoard = new MenuBoard();
        menuHobbyList = new MenuHobbyList();
        menuLike = new MenuLike();
    }
}
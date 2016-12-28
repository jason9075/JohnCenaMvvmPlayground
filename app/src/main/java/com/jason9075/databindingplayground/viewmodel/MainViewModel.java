package com.jason9075.databindingplayground.viewmodel;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.jason9075.databindingplayground.model.User;

/**
 * Created by jason9075 on 2016/12/27.
 */

public class MainViewModel implements ViewModel {

    private Context context;
    private final User user;

    public MainViewModel(Context context) {
        this.context = context;
        user = new User("John", "Cena");
    }

    public User getUser() {
        return user;
    }

    @Override
    public void destroy() {

    }

    public void onClickButton(View view) {
        Toast.makeText(context, "John Cenaaaaaa !", Toast.LENGTH_SHORT).show();
        user.setLastName(user.getLastName() + "a");
    }
}

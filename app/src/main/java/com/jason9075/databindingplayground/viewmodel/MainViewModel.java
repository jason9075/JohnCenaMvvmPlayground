package com.jason9075.databindingplayground.viewmodel;

import android.content.Context;
import android.databinding.Observable;
import android.databinding.ObservableField;
import android.view.View;
import android.widget.Toast;

import com.jason9075.databindingplayground.model.User;

/**
 * Created by jason9075 on 2016/12/27.
 */

public class MainViewModel implements ViewModel {

    private Context context;
    private final User user;
    private ObservableField<String> fullName;

    public MainViewModel(Context context) {
        this.context = context;
        user = new User("John", "Cena");
        fullName = new ObservableField<>("John Cena");
    }

    @Override
    public void destroy() {

    }

    /* Getter */

    public User getUser() {
        return user;
    }

    public ObservableField<String> getFullName() {
        return fullName;
    }

    /* OnClick */

    public void onClickTopButton(View view) {
        Toast.makeText(context, "Add a!", Toast.LENGTH_SHORT).show();
        user.setLastName(user.getLastName() + "a");
    }

    public void onClickBottomButton(View view) {
        Toast.makeText(context, "Add na!", Toast.LENGTH_SHORT).show();
        fullName.set(fullName.get()+"na");
    }
}

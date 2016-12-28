package com.jason9075.databindingplayground.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.jason9075.databindingplayground.BR;

/**
 * Created by jason9075 on 2016/12/27.
 */

public class User extends BaseObservable {

    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Bindable // annotation for generate BR
    public String getFirstName() {
        return firstName;
    }

    @Bindable // annotation for generate BR
    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }
}

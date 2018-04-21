package com.dotapp.h3ng3.dotapp.model;

import com.orm.SugarRecord;

import java.util.List;

public class User extends SugarRecord<User> {
    int account_id;

    public User() {
    }

    public User(int account_id) {
        this.account_id = account_id;
    }
}
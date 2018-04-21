package com.dotapp.h3ng3.dotapp.model;

import com.orm.SugarRecord;

public class Favourite extends SugarRecord<Favourite> {
    int match_id;

    public Favourite() {
    }

    public  Favourite(int match_id) {
        this.match_id = match_id;
    }
}

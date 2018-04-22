package com.alatheer.testapp;

import java.io.Serializable;

/**
 * Created by elashry on 4/22/2018.
 */

public class  Teacher{
    String id;
    String email;

    public Teacher(String id, String email) {
        this.id = id;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

package com.aka.dscatalog.dto;

import com.aka.dscatalog.services.validation.UserInsertValid;

import java.io.Serializable;

@UserInsertValid
public class UserInsertDTO extends UserDTO implements Serializable {

    private String password;

    public UserInsertDTO(){
        super();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

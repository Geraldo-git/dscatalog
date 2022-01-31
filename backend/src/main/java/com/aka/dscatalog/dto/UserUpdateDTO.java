package com.aka.dscatalog.dto;

import com.aka.dscatalog.services.validation.UserInsertValid;
import com.aka.dscatalog.services.validation.UserUpdateValid;

import java.io.Serializable;

@UserUpdateValid
public class UserUpdateDTO extends UserDTO implements Serializable {


}

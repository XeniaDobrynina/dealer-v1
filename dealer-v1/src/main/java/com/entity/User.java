package com.entity;

import com.enums.Role;
import lombok.Data;

@Data
public abstract class User {

    String id, email, name, address;
    Role role;
}

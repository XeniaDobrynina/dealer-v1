package com.enums;

import lombok.Getter;

@Getter
public enum Role {
    CUSTOMER("USER"),
    ADMIN( "ADMIN");

    private final String value;


    Role(String value) {
        this.value = value;
    }
}

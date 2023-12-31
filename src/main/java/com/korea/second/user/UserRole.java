package com.korea.second.user;

import lombok.Getter;

@Getter
public class UserRole {
    ADMIN("ROLE_ADMIN"),

    USER("ROLE_USER");

    UserRole (String value) {
        this.value = value;
    }

    private String value;
}

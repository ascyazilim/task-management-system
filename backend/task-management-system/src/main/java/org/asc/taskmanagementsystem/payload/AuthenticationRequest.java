package org.asc.taskmanagementsystem.payload;

import lombok.Data;

@Data
public class AuthenticationRequest {
    private String username;
    private String password;
}

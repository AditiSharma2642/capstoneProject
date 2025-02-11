package com.wecp.logisticsmanagementandtrackingsystem.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginResponse {
    private String token;

    private String username;

    private String email;

    private String role;

<<<<<<< HEAD
=======
    private Number id;

>>>>>>> 1b4d1814d850f0219a666c7d9f66690b21047e46
    @JsonCreator
    public LoginResponse(@JsonProperty("token") String token,
                         @JsonProperty("username") String username,
                            @JsonProperty("email") String email,
<<<<<<< HEAD
                            @JsonProperty("role") String role) {
=======
                            @JsonProperty("role") String role,
                            @JsonProperty("id") Number id) {
>>>>>>> 1b4d1814d850f0219a666c7d9f66690b21047e46
        this.token = token;
        this.username = username;
        this.email = email;
        this.role = role;
<<<<<<< HEAD
=======
        this.id = id;
    }

    public Number getId() {
        return id;
    }

    public void setId(Number id) {
        this.id = id;
>>>>>>> 1b4d1814d850f0219a666c7d9f66690b21047e46
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
<<<<<<< HEAD
}

=======
}
>>>>>>> 1b4d1814d850f0219a666c7d9f66690b21047e46

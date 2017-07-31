package com.framework.action;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.stereotype.Controller;

@Controller
public class LoginAction extends ActionSupport {
    private static final long serialVersionUID = 1L;
    private String username;
    private String password;

    public String login() {
        System.out.println(username);
        System.out.println(password);
        return SUCCESS;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

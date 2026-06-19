package com.sit.Springdemo2;

public class User {
	private int UserId;
    private String UserName;

    public User() {
        super();
    }

    public User(int UserId, String UserName) {
        super();
        this.UserId = UserId;
        this.UserName = UserName;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    @Override
    public String toString() {
        return "User[ UserId=" +  UserId+ ", UserName=" + UserName+ "]";
    }

}

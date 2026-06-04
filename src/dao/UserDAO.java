package dao;

import domain.Book;
import domain.User;

public class UserDAO {
    private User[] users;
    private int totalUsers;

    public UserDAO() {
        this.users = new User[100];
        this.totalUsers = 0;
    }

    public boolean save(User user) {
        if (this.totalUsers >= this.users.length) return false;
        this.users[this.totalUsers] = user;
        this.totalUsers++;
        return true;
    }

    public User[] getUsers() {
        return this.users;
    }

    public int getTotalUsers() {
        return this.totalUsers;
    }
}

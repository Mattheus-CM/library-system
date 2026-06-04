package controller;

import dao.UserDAO;
import domain.User;
import view.MenuView;
import view.UserView;

public class UserController {
    UserDAO userDAO;
    UserView userView;
    MenuView menuView;

    public UserController(UserDAO userDAO, UserView userView, MenuView menuView) {
        this.userDAO = userDAO;
        this.userView = userView;
        this.menuView = menuView;
    }

    public void create() {
        System.out.println("--------------------------");
        System.out.println("------ CREATE USER -------");
        System.out.println("--------------------------");

        String name = menuView.readString("Name: ");
        String email = menuView.readString("Email: ");

        User user = new User(name, email);
        if (!userDAO.save(user)) {
            System.out.println("User could not be saved");
        } else {
            System.out.println("User has been created");
        }
    }

    public void list() {
        User[] users = userDAO.getUsers();
        userView.showUsersList(users);
    }
}

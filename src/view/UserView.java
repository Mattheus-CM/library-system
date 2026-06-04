package view;

import domain.User;

public class UserView {
    public void showUsersList(User[] users) {
        if (users.length == 0) {
            System.out.println("No users found");
            return;
        }
        System.out.println("--------------------------");
        System.out.println("------- USERS LIST -------");
        System.out.println("--------------------------");
        for (User user : users) {
            if (user == null) continue;
            System.out.println(user);
        }
        System.out.println("--------------------------");
    }
}

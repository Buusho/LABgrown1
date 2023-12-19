package Impl;

import InterFace.UserInterFace;
import Model.Profile;
import Model.User;

import java.util.ArrayList;

public class UserInterFaceImpl implements UserInterFace {

ArrayList<User> users = new ArrayList<>();

    @Override
    public void saveUser(User user) {
    users.add(user);
        System.out.println("Успешно добавлен!!");
    }

    @Override
    public User findUserById(long id) {
        for (User user : users) {
            if (user.getId() == id) {
                System.out.println("Найден пользователь с id " + id + ": " + user.getUserName());
                return user;
            }
        }
        System.out.println("Пользователь с id " + id + " не найден.");
        return null;
    }
    @Override
    public void updateUserPro(long userId, Profile profile) {
        for (User user:users) {
          if (user.getId()==userId){
              user.setProfiles(new ArrayList<>());
          }

        }
        System.out.println("successfully updated!!!");
    }

    @Override
    public void deleteUser(long userId) {
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if (user.getId() == userId) {
                users.remove(i);
                System.out.println("Пользователь с id " + userId + " успешно удален.");
                return;
            }
        }
        System.out.println("Пользователь с id " + userId + " не найден.");
    }

}

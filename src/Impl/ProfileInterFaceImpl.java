package Impl;


import InterFace.ProfileInterFace;
import Model.Profile;
import Model.User;

import java.util.ArrayList;

public class ProfileInterFaceImpl implements ProfileInterFace {
    private  DataBase dataBase;

    public ProfileInterFaceImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    ArrayList<Profile> profiles = new ArrayList<>();

    @Override
    public void saveProfile(long userId, Profile profile) {
        for (User user: dataBase.getUsers()) {
            if (user.getId()==userId){
                profiles.add(profile);
                System.out.println("Успешно добавлен!!");
            }
        }
    }

    @Override
    public Profile findProfileByUserId(long userId) {
        for (User user:dataBase.getUsers()) {
            if(user.getId()==userId){
               user.getProfiles();
            }
        }
        System.out.println("Профиль с UserId " + userId + " не найден.");
        return null;
    }

    @Override
    public void deleteProfileByUserId(long userId) {

        for (User user: dataBase.getUsers()) {
            if(user.getId()==userId){
               user.setProfiles(null);
                System.out.println("Профиль пользователя с id " + userId + " успешно удален.");
            } else {
                System.out.println("У пользователя с id " + userId + " нет профиля для удаления.");            }
        }
    }
}

package Impl;

import Model.User;

import java.util.ArrayList;
import java.util.Arrays;

public class DataBase {

    private ArrayList<User> users = new ArrayList<>();

    public DataBase(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "DataBase{" +
                "users=" + users +
                '}';
    }

    //private User [] users;
//
//    public DataBase(User[] users) {
//        this.users = users;
//    }
//
//    public User[] getUsers() {
//        return users;
//    }
//
//    public void setUsers(User[] users) {
//        this.users = users;
//    }
//
//    @Override
//    public String toString() {
//        return "DataBase{" +
//                "users=" + Arrays.toString(users) +
//                '}';
//    }
}

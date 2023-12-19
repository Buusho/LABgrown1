package Model;

import java.util.ArrayList;
import java.util.Arrays;

public class User {

    private static int idd;
    private int id;
    private String userName;
    private String email;
    private String password;

    private ArrayList<Post> posts = new ArrayList<>();
    private ArrayList<Profile> profiles = new ArrayList<>();

    public User(int id, String userName, String email, String password, ArrayList<Post> posts, ArrayList<Profile> profiles) {
        this.id = ++idd;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.posts = posts;
        this.profiles = profiles;
    }

    public static int getIdd() {
        return idd;
    }

    public static void setIdd(int idd) {
        User.idd = idd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }

    public ArrayList<Profile> getProfiles() {
        return profiles;
    }

    public void setProfiles(ArrayList<Profile> profiles) {
        this.profiles = profiles;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", posts=" + posts +
                ", profiles=" + profiles +
                '}';
    }
}

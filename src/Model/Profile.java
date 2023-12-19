package Model;

import java.time.LocalDate;

public class Profile {
private  static int idd;
private  int id ;
private String fullName;
private LocalDate localDate;
private String gender;
private String biography;


    public Profile(int id, String fullName, LocalDate localDate, String gender, String biography) {
        this.id = ++idd;
        this.fullName = fullName;
        this.localDate = localDate;
        this.gender = gender;
        this.biography = biography;
    }

    public static int getIdd() {
        return idd;
    }

    public static void setIdd(int idd) {
        Profile.idd = idd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", localDate=" + localDate +
                ", gender='" + gender + '\'' +
                ", biography='" + biography + '\'' +
                '}';
    }
}

package org.example.User;

public class User {

    private String name;
    private String Surname;
    private Long id;
    private String nickname;

    public User() {
    }


    public User(String name, String surname, Long id, String nickname) {
        this.name = name;
        Surname = surname;
        this.id = id;
        this.nickname = nickname;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", id=" + id +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}

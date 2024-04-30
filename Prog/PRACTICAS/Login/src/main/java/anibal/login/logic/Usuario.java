/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anibal.login.logic;

/**
 *
 * @author aniba
 */
public class Usuario {
    private int id;
    private String nickname;
    private String password;
    
    public Usuario() {
    }
    public Usuario(String nickname, String password, int id) {
        this.id = id;
        this.nickname = nickname;
        this.password = password;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
}

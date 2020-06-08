package org.gaetan.DAO;

public class user {
    private int id;
    private String pseudo;
    private String email;
    private String password;
    private int id_1402f_numberGroupe;
    private String cle;
    private int actif;

    public user(int id, String pseudo, String email) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
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

    public int getId_1402f_numberGroupe() {
        return id_1402f_numberGroupe;
    }

    public void setId_1402f_numberGroupe(int id_1402f_numberGroupe) {
        this.id_1402f_numberGroupe = id_1402f_numberGroupe;
    }

    public String getCle() {
        return cle;
    }

    public void setCle(String cle) {
        this.cle = cle;
    }

    public int getActif() {
        return actif;
    }

    public void setActif(int actif) {
        this.actif = actif;
    }

    public user(int id, String pseudo, String email, String password, int id_1402f_numberGroupe, String cle, int actif) {
        this.id = id;
        this.pseudo = pseudo;
        this.email = email;
        this.password = password;
        this.id_1402f_numberGroupe = id_1402f_numberGroupe;
        this.cle = cle;
        this.actif = actif;
    }
}

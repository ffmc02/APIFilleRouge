package org.gaetan.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class userDao extends connexion {
    public userDao() {

    }

    //methode d'insertion
    public void Insertuser(user user) {
        //appel a la fonction connexion
        this.createConnection();

        //requette préparer
        PreparedStatement pstm;
        try {
            pstm = this.con.prepareStatement("INSERT INTO 1402f_user (`pseudo`, `email`, `password`,  `cle`)VALUE (?, ? ,?, ?)");
            pstm.setString(1, user.getPseudo());
            pstm.setString(2, user.getEmail());
            pstm.setString(3, user.getPassword());
            pstm.setString(4, user.getCle());
            pstm.execute();
            pstm.close();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        this.closeConnection();

    }
    //liste Utilisateur
    public List<user> List(){
        List<user> listUser= new ArrayList();
        this.createConnection();
        try {
            Statement stm= con.createStatement();
            ResultSet res =stm.executeQuery("SELECT  `id`, `pseudo`,  `email` FROM `1402f_user` ");
            while(res.next()){
                int id =res.getInt("id");
                String pseudo =res.getString("pseudo");
                String email = res.getString("email");
                user n= new user( id, pseudo, email);
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        this.closeConnection();
        return listUser;
    }

}

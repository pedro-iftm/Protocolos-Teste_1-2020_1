/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author fferreia
 */
public class Usuario {
    
    private String login;
    private String senha;
    private int qntAcessos;
    
    public Usuario(){
        qntAcessos = 0;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the qntAcessos
     */
    public int getQntAcessos() {
        return qntAcessos;
    }

    /**
     * @param qntAcessos the qntAcessos to set
     */
    public void setQntAcessos(int qntAcessos) {
        this.qntAcessos = qntAcessos;
    }
    
    
    
}

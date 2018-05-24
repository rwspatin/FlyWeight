/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoflyweight;

/**
 *
 * @author rwspa
 */
class Email {
    protected String conteudo;
    
    public Email(String email){
        this.conteudo = email;
    }
    
    public void enviarEmail(){
        System.out.println(conteudo + "!");
    }
}

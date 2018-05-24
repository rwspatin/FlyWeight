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
class Conteudo extends ConteudoFlyweight{
    protected Email email;
    
    public Conteudo(String conteudoDoEmail){
        this.email = new Email(conteudoDoEmail);
    }
    
    @Override
	public void enviarEmail(Destinatario dest) {
		email.enviarEmail();
		System.out.println("Para o destinatario (" + dest.nome + "," + dest.email + ")!");
	}

    
}

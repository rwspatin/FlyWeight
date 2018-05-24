/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoflyweight;
import projetoflyweight.FlyweightFactory.Conteudos;
/**
 *
 * @author rwspa
 */
public class ProjetoFlyWeight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        
        System.out.println("\t\t\tPadrão de Projeto FlyWeight");
        System.out.println("\n_______________________________________________________________________________________\n");
        factory.getFlyweight(Conteudos.PROMOCAO_TELEVISAO).enviarEmail(new Destinatario("Renan","rwspatin@gmail.com"));
        System.out.println("\n_______________________________________________________________________________________\n");
        factory.getFlyweight(Conteudos.PROMOCAO_CELULAR).enviarEmail(new Destinatario("Nikollas","nikollas@gmail.com"));
        System.out.println("\n_______________________________________________________________________________________\n");
        factory.getFlyweight(Conteudos.PROMOCAO_NOTEBOOK).enviarEmail(new Destinatario("Marco","marco@gmail.com"));
        System.out.println("\n_______________________________________________________________________________________\n");
        factory.getFlyweight(Conteudos.NEWS).enviarEmail(new Destinatario("Petrobras","gasolina@petrobras.com"));
        System.out.println("\n_______________________________________________________________________________________\n");
    }
    
}

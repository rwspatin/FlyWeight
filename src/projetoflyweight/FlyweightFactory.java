/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoflyweight;

import java.util.ArrayList;

/**
 *
 * @author rwspa
 */
public class FlyweightFactory {
    
    protected ArrayList<ConteudoFlyweight> flyweights;

	public enum Conteudos {
		PROMOCAO_TELEVISAO, PROMOCAO_CELULAR, NEWS, PROMOCAO_NOTEBOOK
	}
        
        public FlyweightFactory() {
		flyweights = new ArrayList<ConteudoFlyweight>();
		flyweights.add(new Conteudo("Nova Promoção televisão, por apenas R$ 10.000,00.\nVá na loja e confira"));
		flyweights.add(new Conteudo("Nova Promoção celular, por apenas R$ 1.000,00.\nVá na loja e confira"));
		flyweights.add(new Conteudo("Postos de Gasolina sem combustível"));
		flyweights.add(new Conteudo("Nova Promoção notebook, por apenas R$ 2.000,00.\nVá na loja e confira"));
	}
        
        public ConteudoFlyweight getFlyweight(Conteudos conteudo) {
		switch (conteudo) {
		case PROMOCAO_TELEVISAO:
                    return flyweights.get(0);
		case PROMOCAO_CELULAR:
                    return flyweights.get(1);
		case NEWS:
                    return flyweights.get(2);
		case PROMOCAO_NOTEBOOK:
                    return flyweights.get(3);
                default:
                    return null;
		}
	}
}

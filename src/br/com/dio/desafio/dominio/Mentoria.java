package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

		
    private LocalDate data;

   
    public void setData(LocalDate data) {
        this.data = data;
    }
	
    
    @Override
	public double calcularXP() {
		return XP_PADRAO + 20;
	}
    
   
    @Override
	public String toString() {
		return "Mentoria Titulo: " + getTitulo() + ", Descrição: " + getDescricao() + ", Data da mentoria: " + data + ", XP: "+ calcularXP()+ "";
	}






	
	
    

}

package br.com.dio.desafio.dominio;


import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Objects;


public class Bootcamp {
	
	private String nome;
	private String descricao;
	private final LocalDate dataInicial = LocalDate.now();
	private final LocalDate dataFinal = dataInicial.plusDays(45);
	private Set<Alunos> alunosInscritos = new HashSet<>();
	private Set<Conteudo> conteudos = new LinkedHashSet<>();
	
		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Set<Alunos> getAlunosInscritos() {
		return alunosInscritos;
	}

	public void setAlunosInscritos(Set<Alunos> alunosInscritos) {
		this.alunosInscritos = alunosInscritos;
	}

	public Set<Conteudo> getConteudos() {
		return conteudos;
	}

	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}

	public LocalDate getDataInicial() {
		return dataInicial;
	}

	public LocalDate getDataFinal() {
		return dataFinal;
	}

	@Override
	public int hashCode() {
		return Objects.hash(alunosInscritos, dataFinal, dataInicial, descricao, nome);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(alunosInscritos, other.alunosInscritos) && Objects.equals(dataFinal, other.dataFinal)
				&& Objects.equals(dataInicial, other.dataInicial) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(nome, other.nome);
	}

		
}

package sistema_prw;

import java.util.ArrayList;
import java.util.Objects;

public class Restaurante {
	private String nome;
	private String pratoEscolhido;
	private int qtdVotos;
	private ArrayList<Cliente> clientesVisitantes = new ArrayList<>();
	
	public Restaurante(String nome, String prtEscolhido) {
		this.nome = nome;
		this.pratoEscolhido = prtEscolhido;
		this.qtdVotos = 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurante other = (Restaurante) obj;
		return Objects.equals(nome, other.nome);
	}
	
	public String getPratoEscolhido() {
		return this.pratoEscolhido;
	}
	
	public void adicionaVisitante(Cliente cli) {
		this.clientesVisitantes.add(cli);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public ArrayList<Cliente> getClientesVisitantes() {
		return this.clientesVisitantes;
	}
	
	public int getQtdVotos() {
		return this.qtdVotos;
	}
	
	public void adicionaVoto() {
		this.qtdVotos++;
	}

}

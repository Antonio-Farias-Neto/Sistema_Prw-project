package sistema_prw;

import java.util.HashMap;

public class SistemaPrw {
	private HashMap<String,Cliente> clientes;
	private HashMap<String,Restaurante> restaurantes;
	
	public SistemaPrw() {
		this.clientes = new HashMap<>();
		this.restaurantes = new HashMap<>();
	}
	
	public void adicionarRestaurante(String nome, String prato) {
		if ("".equals(nome.trim())) {
		throw new IllegalArgumentException("Nome vazio");
		}
		
		Restaurante res = new Restaurante(nome,prato);
		if (this.restaurantes.containsKey(nome) || this.restaurantes.size() == 50) {
			return;
		}
		this.restaurantes.put(nome, res);
	}
	
	public void adicionarCliente(String nome, String email) {
		if ("".equals(email.trim())) {
			throw new IllegalArgumentException("Email vazio");
		}
		Cliente cli = new Cliente(nome,email);
		if (this.clientes.containsKey(email) || this.clientes.size() == 100) {
			return;
		}
		this.clientes.put(email, cli);
		
		
	}
	
	public void visitarRestaurante(String emailCliente, String nomeRestaurante) {
		if (this.restaurantes.get(nomeRestaurante).getClientesVisitantes().contains(this.clientes.get(emailCliente))) {
			return;
		}
		this.restaurantes.get(nomeRestaurante).adicionaVisitante(this.clientes.get(emailCliente));
	}
	
	public String votarPratoPreferido(String emailCliente, String nomeRestaurante) {
		if (this.restaurantes.get(nomeRestaurante).getClientesVisitantes().contains(this.clientes.get(emailCliente))) {
			this.clientes.get(emailCliente).setPratoPreferido(this.restaurantes.get(nomeRestaurante).getPratoEscolhido());
			this.restaurantes.get(nomeRestaurante).adicionaVoto();
			return "Voto registrado com sucesso!";
		}
		return "Voto não registrado";
	}
	
	public String[] listarClientesRestaurante(String nomeRestaurante) {
		String out = "";
		for (Cliente cli: this.restaurantes.get(nomeRestaurante).getClientesVisitantes()) {
			out += cli.toString() + " ";
		}
		return out.split(" ");
	}
	
	public String melhorPrato() {
		String mlhrPrato = "";
		int qtdVotos = 0;
		for (Restaurante valor: this.restaurantes.values()) {
			if (valor.getQtdVotos() >= qtdVotos) {
				mlhrPrato = valor.getPratoEscolhido();
			}
		}
		return mlhrPrato;
	}
}

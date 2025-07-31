package sistema_prw;

import java.util.Objects;

public class Cliente {
	private String nome;
	private String email;
	private String pratoPreferido;
	
	public Cliente(String nome, String email) {
		this.nome = nome;
		this.email = email;
		this.pratoPreferido = "Prato preferido não definido";
	}

	@Override
	public int hashCode() {
		return Objects.hash(email);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(email, other.email);
	}
	
	@Override
	public String toString() {
		return "Cliente: " + this.nome + ", Prato preferido: " + this.pratoPreferido;
	}

	public String getPratoPreferido() {
		return pratoPreferido;
	}

	public void setPratoPreferido(String pratoPreferido) {
		this.pratoPreferido = pratoPreferido;
	}
	
	public String getEmail() {
		return this.email;
	}
}

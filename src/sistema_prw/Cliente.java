package sistema_prw;

import java.util.Objects;

/**
 * Representação de um cliente , o qual possui nome, email e um prato preferido.
 * @author Antonio Neto
 */
public class Cliente {
	private String nome;
	private String email;
	private String pratoPreferido;
	
	/**
	 * constroi um cliente que inicia sem um prato preferido definido, pois ainda não provou nenhum
	 * @param nome é o nome do cliente
	 * @param email é o email do cliente
	 */
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

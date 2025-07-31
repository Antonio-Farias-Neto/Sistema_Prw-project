package sistema_prw;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SistemaPrwTeste {

	@Test
	void testarVotarPratoPreferidoComClienteTendoVisitadoORestaurante() {
		SistemaPrw sp = new SistemaPrw();
		sp.adicionarCliente("Hugo", "hugo@gmail.com");
		sp.adicionarRestaurante("MCdonalds", "BigMac");
		sp.visitarRestaurante("hugo@gmail.com", "MCdonalds");
		assertEquals(sp.votarPratoPreferido("hugo@gmail.com","MCdonalds"), "Voto registrado com sucesso!");
	}
	
	@Test
	void testarVotarPratoPreferidoComClienteSemVisitarORestaurante() {
		SistemaPrw sp = new SistemaPrw();
		sp.adicionarCliente("Hugo", "hugo@gmail.com");
		sp.adicionarRestaurante("MCdonalds", "BigMac");
		assertEquals(sp.votarPratoPreferido("hugo@gmail.com","MCdonalds"), "Voto não registrado");
	}
}

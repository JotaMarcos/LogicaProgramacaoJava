package cursologicaCapitulo09;

public class Cliente {
	
	private String primeiroNome;
	
	private String ultimoNome;
		
	private String telefone;
	
	private String email;
	
	
	String getPrimeiroNome() {
		return primeiroNome;
	}
	
	void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	
	String getUltimoNome() {
		return ultimoNome;
	}
	
	void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}
	
	String getNomeCompleto() {
		return primeiroNome + " " + ultimoNome;
	}
	
	void setNomeCompleto(String nome) {
		String[] nomeCompleto = nome.split(" ");
		primeiroNome = nomeCompleto[0];
		ultimoNome = nomeCompleto[1];
	}
	
	String getTelefone() {
		return telefone;
	}
	
	void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	String getEmail() {
		return email;
	}
	
	void setEmail(String email) {
		this.email = email;
	}

	
//	String obterNomeCompleto() {
//		String[] nomeCompleto = this.getPrimeiroNome().split( "")		
//		return nomeCompleto;
//	}
	
	
	String obterDDD() {
		String ddd = telefone.substring(0,2);
		return ddd;
	}
}

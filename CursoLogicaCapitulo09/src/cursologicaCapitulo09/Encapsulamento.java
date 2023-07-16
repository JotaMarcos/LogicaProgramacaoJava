package cursologicaCapitulo09;

public class Encapsulamento {

	public static void main(String[] args) {
		
//		Cliente cliente = new Cliente();
//		
//		cliente.primeiroNome = "Poliane";
//		cliente.ultimoNome = "Duarte";
//		cliente.telefone = "92999999999";
//		cliente.email = "poliane.duarte@mail.com";
//		
//		System.out.println("Nome cliente: " + cliente.obterNomeCompleto());
		
		Cliente cliente = new Cliente();
		
//		cliente.setPrimeiroNome("Poliane");
//		cliente.setUltimoNome("Duarte");
		cliente.setNomeCompleto("Poliane Cardoso");
		cliente.setTelefone("92999999999");
		cliente.setEmail("poliane.duarte@mail.com");
		
		System.out.println("*************************************************************");
		System.out.println("Nome do(a) cliente: " + cliente.getNomeCompleto() + " \n" + "Telefone: " + cliente.getTelefone() + " \n" + "E-mail: " + cliente.getEmail());
		System.out.println("*************************************************************");
		
		System.out.println("*************************************************************");
		System.out.println("Primeiro nome do(a) cliente: " + cliente.getPrimeiroNome() + " \n" + "Telefone: " + cliente.getTelefone() + " \n" + "E-mail: " + cliente.getEmail());
		System.out.println("*************************************************************");
		
		System.out.println("*************************************************************");
		System.out.println("Ultimo nome do(a) cliente: " + cliente.getUltimoNome() + " \n" + "Telefone: " + cliente.getTelefone() + " \n" + "E-mail: " + cliente.getEmail());
		System.out.println("*************************************************************");
	}

}

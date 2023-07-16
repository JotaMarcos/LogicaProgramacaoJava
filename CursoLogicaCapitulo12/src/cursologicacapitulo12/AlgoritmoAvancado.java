package cursologicacapitulo12;


public class AlgoritmoAvancado {

	public static void main(String[] args) {
		
		
		ListaAlunos listaAlunos = new ListaAlunos();
		
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "João";
		listaAlunos.adicionar(aluno1);
		
		Aluno aluno2 = new Aluno();
		aluno2.nome = "Marcos";
		listaAlunos.adicionar(aluno2);
		
		Aluno aluno3 = new Aluno();
		aluno3.nome = "Poliane";
		listaAlunos.adicionar(aluno3);
		
		Aluno aluno4 = new Aluno();
		aluno4.nome = "Ellen";
		listaAlunos.adicionar(aluno4);
		
		Aluno aluno5 = new Aluno();
		aluno5.nome = "Elza";
		listaAlunos.adicionar(aluno5);
		
		Aluno aluno6 = new Aluno();
		aluno6.nome = "Neto";
		listaAlunos.adicionar(aluno6);
		
		Aluno aluno7 = new Aluno();
		aluno7.nome = "Jésica";
		listaAlunos.adicionar(aluno7);
		
		Aluno aluno8 = new Aluno();
		aluno8.nome = "Maria";
		listaAlunos.adicionar(aluno8);
		
		Aluno aluno9 = new Aluno();
		aluno9.nome = "Guilherme";
		listaAlunos.adicionar(aluno9);
		
		Aluno aluno10 = new Aluno();
		aluno10.nome = "Bryan";
		listaAlunos.adicionar(aluno10);
		
		Aluno aluno11 = new Aluno();
		aluno11.nome = "Breno";
		listaAlunos.adicionar(aluno11);
		
		Aluno aluno12 = new Aluno();
		aluno12.nome = "Sofia";
		listaAlunos.adicionar(aluno12);
		
		Aluno aluno13 = new Aluno();
		aluno13.nome = "Rayan";
		listaAlunos.adicionar(aluno13);
		
		Aluno aluno14 = new Aluno();
		aluno14.nome = "Paulo";
		listaAlunos.adicionar(aluno14);
		
		Aluno aluno15 = new Aluno();
		aluno15.nome = "Jucilene";
		
		listaAlunos.adicionar(aluno15);
		iterarAlunos(listaAlunos);	
		
		listaAlunos.remover(aluno13);		
		iterarAlunos(listaAlunos);
		
		
		
		
		
		listaAlunos.ordenar();
		iterarAlunos(listaAlunos);
		
	}
	
	static void iterarAlunos(ListaAlunos listaAlunos) {
		
		for (int i = 0; i < listaAlunos.tamanho(); i++) {
			Aluno alunos = listaAlunos.obter(i);
			
			if(alunos != null) {
				
				System.out.println("Aluno(a): " + alunos.nome);
			} else {
				System.out.println("Aluno(a): sem cadastro.");
			}
		}
		System.out.println("------------------------------------------------");
	}

}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Index {
    public static void main(String[] args) {

        // Declaração de Variáveis 

        Scanner scanner = new Scanner(System.in);
        	       
        // Declaração de listas

        ArrayList<Aparelho> eletrodomesticos = new ArrayList<> (Arrays.asList(new Televisao("TV de casa"), new RadioFM("RádioFM")));

        // for() para printar a lista de aparelhos
        
        for (int i = 0; i < eletrodomesticos.size(); i++) {

            eletrodomesticos.get(i).Ligar();

        }

        // Chama a classe chacorro

        cachorro cachorro;
        cachorro = new cachorro("Cachorro", "Masculino", 4.0);
        cachorro.reagir("Au Au");

        // Capta há entrada do usuário

		print(2, "");
		print(1, "Digite seu nome e aperte enter:");
		String nomeDoUsuario = scanner.nextLine();
		print(2, "");
		print(1, "Digite sua idade e aperte enter:");
		String idadeDoUsuario = scanner.nextLine();
		print(2, "");
		System.out.println("Olá, " + nomeDoUsuario + ", você tem " + idadeDoUsuario + " anos, você quer tomar um chá, " + nomeDoUsuario + "?");

    }

    // Função de print

    public static void print(int tipo, String mensagem) {

        if (tipo == 1) {
        
        	System.out.println(mensagem);
        	
        } else if (tipo == 2) {
        
        	print(1, "");
        	print(1, "=================================================================");
        	print(1, "");
        	
        } else if (tipo == 3) {
        
        	System.err.println(mensagem);
        	
        } else {
        
        	print(3, "Erro: print() não recebeu um valor válido");
        	
        }

    }

}

// Classe pai

class Aparelho {

    private String nome;

    Aparelho(String nomeRecebido) {

        this.nome = nomeRecebido;

    }

    public void Ligar() {

		Index.print(2, "");
        Index.print(1, "Ligando o aparelho " + nome);

    }

    public String getNome() {

        return nome;

    }

}

// Classe filho(a)

class Televisao extends Aparelho {

    public Televisao(String nomeRecebido) {

        super(nomeRecebido);

    }

    @Override
    public void Ligar() {

        super.Ligar();
        Index.print(2, "");
        Index.print(1, "Sintonizando canais...");

    }

}

// Classe filho(a)

class RadioFM extends Aparelho {

	public RadioFM(String nomeRecebido) {

		super(nomeRecebido);
		
	}

	@Override
	public void Ligar() {

		super.Ligar();
		Index.print(2, "");
		Index.print(1, "Ligando rádio, por favor cheque a antena");
		
	}
	
}

abstract class animal {

	private String nomeDoAnimal;
	private String sexoDoAnimal;

	public animal(String nomeDoAnimal, String sexoDoAnimal) {

		this.nomeDoAnimal = nomeDoAnimal;
		this.sexoDoAnimal = sexoDoAnimal;
		
	}

	public abstract void reagir(String reagir);
	
}

class cachorro extends animal {

	private double intensidadeDoLatido;

	public cachorro(String nomeDoAnimal, String sexoDoAnimal, double intensidadeDoLatido) {

		super(nomeDoAnimal, sexoDoAnimal);
		this.intensidadeDoLatido = intensidadeDoLatido;
		
	}

	@Override
	public void reagir(String reagir) {

		Index.print(2, "");
		System.out.println(reagir);
		
	}
	
}

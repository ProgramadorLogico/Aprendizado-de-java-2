import java.util.ArrayList;
import java.util.Arrays;

public class Index {
    public static void main(String[] args) {

        // Variáveis 



        // Variáveis;

        // Listas

        ArrayList<Aparelho> eletrodomesticos = new ArrayList<> ();

        // Listas;

        // Lógica

        eletrodomesticos.add(Televisao());
        
        for (int i = 0; i < eletrodomesticos.size(); i++) {

            eletrodomesticos.get(i).Ligar();

        }

        // Lógica;

    }

    public static void print(String mensagem) {

        System.out.println(mensagem);

    }

}

class Aparelho {

    private String nome;

    Aparelho(String nomeRecebido) {

        this.nome = nomeRecebido;

    }

    public void Ligar() {

        Index.print("Ligando o aparelho " + nome);

    }

    public String getNome() {

        return nome;

    }

}

class Televisao extends Aparelho {

    public void Televisao(String nomeRecebido) {

        super(nome) = nomeRecebido;

    }

    @Override
    public void Ligar() {

        super.Ligar();
        Index.print("Sintonizando canais...");

    }

}
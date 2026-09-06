import java.util.ArrayList;
import java.util.Arrays;

public class Index {
    public static void main(String[] args) {

        // Declaração de Variáveis 

        // Declaração de listas

        ArrayList<Aparelho> eletrodomesticos = new ArrayList<> (Arrays.asList(new Televisao("TV de casa")));

        // for para printar a lista
        
        for (int i = 0; i < eletrodomesticos.size(); i++) {

            eletrodomesticos.get(i).Ligar();

        }

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

    public Televisao(String nomeRecebido) {

        super(nomeRecebido);

    }

    @Override
    public void Ligar() {

        super.Ligar();
        Index.print("Sintonizando canais...");

    }

}

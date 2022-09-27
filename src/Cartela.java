import java.util.Random;

public class Cartela {
    private int[][] cartela = new int[5][5];
    private Random random = new Random();

    private int qtdCartelas = 0;


    public Cartela(int qtdCartelas)
    {
        for (int i = 0; i < qtdCartelas; i++)
        {
            gerarCartela();
        }

    }
    public void gerarCartela()
    {
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                cartela[i][j] = random.nextInt(99) + 1;
            }
        }
        this.ImprimirCartela();
    }

    public void ImprimirCartela()
    {
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                System.out.print(cartela[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("____________________________");
    }

}

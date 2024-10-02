import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produtos p = new Produtos();
        System.out.println("Digite o nome do produto:");
        p.setNome(sc.next());
        System.out.println("Digite o código do produto:");
        p.setCodigo(sc.nextInt());
        System.out.println("Digite o valor de venda do produto");
        p.setValor(sc.nextDouble());
        System.out.println("Digite o peso do produto em gramas:");
        p.setPeso(sc.nextDouble());
        System.out.println("Digite a cor do produto:");
        p.setCor(sc.next());
        System.out.println("Digite a quantidade em estoque:");
        p.setQtdEstoque(sc.nextInt());
        System.out.printf("O produto cadastrado foi: %s\nCódigo: %.0f\nValor de venda: %.2f\nPeso: %.2f gramas\nCor: %s\nQuantidade de estoque: %.0f\n", p.getNome(), p.getCodigo(), p.getValor(),p.getPeso(), p.getCor(), p.getQtdEstoque());
        int g;
        do {
            System.out.println("1 - Venda no Pix\n2 - Espécie\n3 - Transferência\n4 - Débito\n5 - Cartão de Crédito\n");
            int v = sc.nextInt();
            switch (v){
                case 1:
                    System.out.println("Você escolheu o pagamento via pix!");
                    System.out.println("Digite a quantidade que você quer comprar:");
                    p.setQtdProduto(sc.nextDouble());
                    p.calc();
                    p.est();
                    System.out.printf("Você tem que pagar R$ %.2f o desconto é de: R$ %.2f\nO novo estoque é de %.0f", p.VendaDesc, p.desc, p.NovoEstoque);
                    break;
                    case 2:
                        System.out.println("Você escolheu o pagamento via espécie!");
                        System.out.println("Digite a quantidade que você quer comprar:");
                        p.setQtdProduto(sc.nextDouble());
                        p.calc();
                        p.est();
                        System.out.printf("Você tem que pagar R$ %.2f o desconto é de: R$ %.2f\nO novo estoque é de %.0f\n", p.VendaDesc, p.desc, p.NovoEstoque);
                        System.out.println("Digite quanto você vai dar em espécie:\n");
                        p.setEspecie(sc.nextDouble());
                        if (p.getEspecie()> p.VendaDesc){
                            double troco;
                            troco = p.getEspecie()-p.VendaDesc;
                            System.out.printf("O seu troco é de: R$ %.2f\n", troco);
                        } else if (p.getEspecie() == p.VendaDesc) {
                            System.out.println("Sua compra foi aprovada!");
                        } else {
                            System.out.println("Saldo Insuficiente!");
                        }
                        break;
                        case 3:
                            System.out.println("Você escolheu o pagamento via Transferência!");
                            System.out.println("Digite a quantidade que você quer comprar:");
                            p.setQtdProduto(sc.nextDouble());
                            p.calc();
                            p.est();
                            System.out.printf("Você tem que pagar R$ %.2f o desconto é de: R$ %.2f\nO novo estoque é de %.0f\n", p.VendaDesc, p.desc, p.NovoEstoque);
                            break;
                        case 4:
                            System.out.println("Você escolheu o pagamento via Débito!");
                            System.out.println("Digite a quantidade que você quer comprar:");
                            p.setQtdProduto(sc.nextDouble());
                            p.calc();
                            p.est();
                            System.out.printf("Você tem que pagar R$ %.2f o desconto é de: R$ %.2f\nO novo estoque é de %.0f\n", p.VendaDesc, p.desc, p.NovoEstoque);
                        break;
                        case 5:
                            System.out.println("Você escolheu o pagamento via Crédito!");
                            System.out.println("Digite a quantidade que você quer comprar:");
                            p.setQtdProduto(sc.nextDouble());
                            p.parc();
                            p.calc();
                            p.est();
                            System.out.printf("Você tem que pagar 3 parcelas de R$ %.2f, somando um total de %.2f\nO novo estoque é de: %.0f", p.parcelamento, p.VendaTot, p.NovoEstoque);
                        break;
            }System.out.println("Para fazer uma nova venda digite 0");
            g = sc.nextInt();
        }while (g == 0);
    }
}
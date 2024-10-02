public class Produtos {
    private double tamanho, peso, valor, QtdEstoque, codigo, QtdProduto, especie;
    private String nome, cor;
    double VendaDesc, desc, NovoEstoque, parcelamento, VendaTot;

    public void setQtdProduto(double QtdProduto){
        this.QtdProduto = QtdProduto;
    }

    public double getQtdProduto(){

        return QtdProduto;
    }

    public double getTamanho() {

        return tamanho;
    }

    public void setTamanho(double tamanho) {

        this.tamanho = tamanho;
    }

    public double getPeso() {

        return peso;
    }

    public void setPeso(double peso) {

        this.peso = peso;
    }

    public double getValor() {

        return valor;
    }

    public void setValor(double valor) {

        this.valor = valor;
    }

    public double getQtdEstoque() {

        return QtdEstoque;
    }

    public void setQtdEstoque(double qtdEstoque) {

        QtdEstoque = qtdEstoque;
    }

    public double getCodigo() {

        return codigo;
    }

    public void setCodigo(double codigo) {

        this.codigo = codigo;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getCor() {

        return cor;
    }

    public void setCor(String cor) {

        this.cor = cor;
    }

    public void calc(){
        VendaDesc = (valor*QtdProduto) * 0.95;
        desc = (valor*QtdProduto) * 0.05;
        VendaTot = (valor*QtdProduto);
    }

    public void est(){

        NovoEstoque = QtdEstoque - QtdProduto;
    }

    public void setEspecie(double especie){

        this.especie = especie;
    }

    public double getEspecie(){

        return especie;
    }

    public void parc(){

        parcelamento = (valor*QtdProduto)/3;
    }
}

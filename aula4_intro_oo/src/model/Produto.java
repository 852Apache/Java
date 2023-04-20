package model;

public class Produto {
    private String sku;
    private String codigoDeBarra;
    private String nome;
    private float preco;
    private short qtdEmEstoque;

    public Produto(String sku, String nome, float preco) {
        this.sku = sku;
        this.nome = nome;
        this.preco = preco;
    }

    public String getSku() {
        return sku;
    }

    public String getCodigoDeBarra() {
        return codigoDeBarra;
    }

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public short getQtdEmEstoque() {
        return qtdEmEstoque;
    }

    public void setQtdEmEstoque(short qtdEmEstoque) {
        this.qtdEmEstoque = qtdEmEstoque;
    }
}

public class Bolo implements Consumivel {
    private double preco;
    private double peso;
    private String descricao;
    private String nome;
    private int calorias;

    public Bolo(double preco, double peso, String descricao, String nome, int calorias) {
        this.preco = preco;
        this.peso = peso;
        this.descricao = descricao;
        this.nome = nome;
        this.calorias = calorias;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
}

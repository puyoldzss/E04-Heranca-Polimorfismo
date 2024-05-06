import java.util.Date;

public class Operacao {

    protected Date data;
    protected char tipo;
    protected double valor;
    protected static int totalOperacoes = 0;

    void imprimir() {
        System.out.printf("%s\t%s\t%s\n", this.data, this.tipo, this.valor);
    }

    public Date getData() {
        return data;
    }

    public char getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public static int getTotalOperacoes() {
        return Operacao.totalOperacoes;
    }

    public void setTipo(char tipo) {
        if(tipo == 'd' || tipo == 's')
            this.tipo = tipo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}

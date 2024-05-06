import java.util.Date;

public class PF extends Cliente{

    private int idade;
    private char sexo;
    private String cpf;

    public String getCpf(){
        return cpf;
    }

    public int getIdade(){
        return idade;
    }

    public char getSexo(){
        return sexo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Cliente criarCliente(String nome, String cpf, String endereco, int idade, char sexo) {
        if(this.VerificaCPF(cpf)) {
            this.setNome(nome);
            this.setEndereco(endereco);
            this.setIdade(idade);
            this.setSexo(sexo);
            this.data = new Date();
            this.cpf = cpf;
            return this;
        } else {
            return null;
        }
    }

    public boolean VerificaCPF(String cpf){
        boolean cpfValido = true;

        cpf = cpf.replaceAll("[^0-9]", "");

        if (cpf.length() != 11) {
            cpfValido = false;
            return cpfValido;
        }

        boolean allDigitsEqual = true;
        for (int i = 1; i < cpf.length(); i++) {
            if (cpf.charAt(i) != cpf.charAt(0)) {
                allDigitsEqual = false;
                break;
            }
        }
        if (allDigitsEqual) {
            cpfValido = false;
            return cpfValido;
        }

        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += (cpf.charAt(i) - '0') * (10 - i);
        }
        int digit1 = 11 - (sum % 11);
        if (digit1 > 9)
            digit1 = 0;

        if ((cpf.charAt(9) - '0') != digit1) {
            cpfValido = false;
            return cpfValido;
        }

        sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += (cpf.charAt(i) - '0') * (11 - i);
        }
        int digit2 = 11 - (sum % 11);
        if (digit2 > 9)
            digit2 = 0;

        if ((cpf.charAt(10) - '0') != digit2) {
            cpfValido = false;
            return cpfValido;
        }

        return (cpfValido);
    }

    public void imprimir(){
        System.out.println("Nome: " + this.nome +
                "\nIdade: " + this.idade +
                "\nSexo: " + this.sexo +
                "\nEndereco: " + this.endereco +
                "\nData da criacao: " + this.data +
                "\nCPF: " + this.cpf);
    }
}

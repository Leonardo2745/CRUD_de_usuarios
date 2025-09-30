import java.util.Date;

public class Pessoa {

    //Atributos com visibilidade privada
    private String nome;
    private String sobrenome;
    private Date dataNascimento;
    private int telefone;
    private char sexo;
    private String endereco;
    private int idade;

    //Construtores
    public Pessoa() {
        this.nome = "";
        this.sobrenome = "";
        this.dataNascimento = new Date();
        this.telefone = 0;
        this.sexo = ' ';
        this.endereco = "";
        this.idade = 0;
    }

    public Pessoa(String nome, String sobrenome, Date dataNascimento, int telefone, char sexo, String endereco, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.sexo = sexo;
        this.endereco = endereco;
        this.idade = idade;
    }


    //GETS AND SETS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    //Métodos

    public int getIdade(){
        Date currentDate = new Date();
        this.idade = currentDate.getYear()- this.dataNascimento.getYear();
        return this.idade;
    }

    public String getFullSexo(){
        if (this.sexo == 'M' || this.sexo == 'm') {
            return "Masculino";
        }else if(this.sexo == 'F' || this.sexo == 'f'){
            return "Feminino";
        } else{
            return "";
        }
    }

    public String info(){
        return nome + " " + sobrenome + " | " + getIdade() + " anos !" + telefone +
                " | " + getFullSexo() + "\n" + endereco;

    }
}

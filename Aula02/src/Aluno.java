public class Aluno {
    private String nome;
    private String email;   
    private int matricula;
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    private int numero;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatricula() {
        //System.out.println(nome + " " + matricula);
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}

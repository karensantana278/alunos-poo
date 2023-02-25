public class Alunos {
    private String matricula;
    private String nome;
    private String email;
    private String curso;
    private String telefone;
    private String endereco;
    private int numero_de_faltas;

    private double[] notas = new double[3];

    public Alunos(String matricula, String nome, String email, String curso, String telefone, String endereco){
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
        this.curso = curso;
        this.telefone = telefone;
        this.endereco = endereco;
        this.numero_de_faltas = 0;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getNumero_de_faltas(){
        return numero_de_faltas;
    }

    public void setNumero_de_faltas(int numero_de_faltas) {
        this.numero_de_faltas = numero_de_faltas;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void lancarFaltas(int numero_de_faltas){
        this.numero_de_faltas += numero_de_faltas;
    }

    public void lancarNota1(double nota){
        notas[0] = nota;
    }

    public void lancarNota2(double nota){
        notas[1] = nota;
    }

    public void lancarNota3(double nota){
        notas[2] = nota;
    }

    public String verificar(){
        double somaNotas = notas[0] + notas[1] + notas[2];

        if (somaNotas >= 70 && numero_de_faltas <= 15){
            return "Aprovado";
        } else if (somaNotas < 50 || numero_de_faltas > 15) {
            return "Reprovado";
        } else if (somaNotas >= 50 && somaNotas < 70 && numero_de_faltas <= 15) {
            return "Exame";
        }
        return null;
    }
}

public class Lutador {
    // Atributos
   private String nome;
   private String nacionalidade;
   private int idade;
   private float altura;
   private float peso;
   private String catergoria;
   private int vitorias;
   private int derrotas;
   private int empates;
   // Métodos públicos
    public void Apresentar(){
        System.out.println("--------------------------------");
        System.out.println("Apresentando: " + this.getNome());
        System.out.println("Com: " + getIdade() + " anos");
        System.out.println("Pesando " + this.getPeso() + "KG");
        System.out.println("Nascido no(a): " + this.getNacionalidade());
        System.out.println("Com a altura de: " + this.getAltura());
        System.out.println("Da categoria: " + this.getCatergoria());
        System.out.println("Com o total de: " + this.getVitorias() + " vitórias");
        System.out.println("Com o total de: " + this.getDerrotas() + " derrotas");
        System.out.println("Com o total de: " + this.getEmpates() + " empates");

    }

    public  void Status(){
        System.out.println(getNome() + "é um peso" + catergoria + "com o total de " + getVitorias() + ", " + getDerrotas() + "derrotas e " + getEmpates() + "Empates");

    }

    public void Ganhar_luta(){
    this.setVitorias(this.getVitorias() + 1);
    }

    public void Perder_luta(){
    this.setDerrotas(this.getDerrotas() + 1);
    }

    public void Empatar_luta(){
    this.setDerrotas(getDerrotas() + 1);
    }
    //Métodos especiais


    public Lutador(String no, String na, int id, float al,
                   float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCatergoria();
    }

    public String getCatergoria() {
        return catergoria;
    }

    private void setCatergoria() {
        if (this.peso < 52.2){
            this.catergoria = "Inválido";
        } else if (this.peso <= 70.3) {
            this.catergoria = "Leve";

        } else if (this.peso <= 83.9) {
            this.catergoria = "Médio";

        } else if (this.peso <= 120.2) {
            this.catergoria = "Pesado";
        }else {
            this.catergoria = "Inválido";
        }
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}

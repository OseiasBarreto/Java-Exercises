import java.util.Random;

public class Luta {
    //Atributo
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    //Métodos pub
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCatergoria().equals(l2.getCatergoria()) && l1 != l2){
            System.out.println("luta agendada!");
        this.aprovada = true;
        this.desafiado = l1;
        this.desafiante = l2;
        }else{
            System.out.println("A luta não pode ser agendada!");
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }

    }
    public void lutar(){
        if(this.aprovada){
            System.out.println("###DESAFIADO###");
            this.desafiado.Apresentar();
            System.out.println("###DESAFIANTE###");
            this.desafiante.Apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor){
                case 0:
                    System.out.println("Empate");
                    this.desafiado.Empatar_luta();
                    this.desafiante.Empatar_luta();
                    break;
                case 1:
                    System.out.println("Virória do: " + this.desafiado.getNome());
                    this.desafiado.Ganhar_luta();
                    this.desafiante.Perder_luta();
                    break;
                case 2:
                    System.out.println("Vitória do: " + this.desafiante.getNome());
                    this.desafiante.Ganhar_luta();
                    this.desafiado.Perder_luta();

            }
        }else {
            System.out.println("A luta não pode acontecer!");
        }

    }
    //metodo especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}


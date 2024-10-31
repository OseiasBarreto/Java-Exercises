
package controle;
public class Controle_remoto implements Controlador {
    //atributos 
    private int volume;
    private boolean ligado;
    private boolean tocando;
    //metodos especiais

    public Controle_remoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;     
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    //metodos abstratos

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrir_menu() {
        System.out.println("---MENU---");
        System.out.println("Está ligado?" + this.getLigado());
        System.out.println("Está tocando?" + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10){
            System.out.print("|");
        }
    }

    @Override
    public void fechar_menu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void mais_volume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume()+5);
        }
    }

    @Override
    public void menos_volume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume()-5);
        }
    }

    @Override
    public void ligar_mutar() {
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligar_mutar() {
        if (this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !this.getTocando())
            this.setTocando(true);
    }

    @Override   
    public void pause() {
        if (this.getLigado() && this.getTocando())
            this.setTocando(false);
    }
    
    
}

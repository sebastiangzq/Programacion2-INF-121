public class Juego {
    public int numeroDeVidas=3;
    public int record=0;
    public Juego(){
        this.numeroDeVidas=numeroDeVidas;
    }
    public Juego(int numeroDeVidas){
        this.numeroDeVidas=numeroDeVidas;
    }
    public void reiniciaPartida(){
        System.out.println("reiniciando la partida........");
    }
    public int actualizaRecord(int x){
        record=record+x;
        return record;
    }
    public boolean quitaVida(){
        numeroDeVidas=numeroDeVidas-1;
        if(numeroDeVidas>0){
            return true;
        }
        else {
            return false;
        }
    }
}

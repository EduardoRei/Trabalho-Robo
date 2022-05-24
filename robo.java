public class robo {
    private double bateria = 100;
    private double andadofrente;
    private double andadotras;
    private double girado;
    private int capturado;

    public double getBateria() {
        return bateria;
    }

    public void andarPraFrente(Double mfrente){
        bateria -= 10;
        andadofrente += mfrente;
    }

    public void andarPraTras(double mtras){
        bateria -= 12;
        andadotras += mtras;
    }
    public void girarRobo(Double graus){
        bateria -= 15;
        girado += graus;
    }

    public void tirarFoto(int foto){  
      bateria -= 25;
      capturado += foto;  
    }
    public String toString(){
        return "O robo andou pra frente " + andadofrente + " metros\n" +
               "O robo andou pra tras "+ andadotras + " metros\n" +
               "O robo girou " + girado + " graus\n" +
               "O robo capturou "+ capturado + " imagens\n" +
               "O robo gastou " + (100-bateria) + "% de bateria\n" 
                ;
    }
}
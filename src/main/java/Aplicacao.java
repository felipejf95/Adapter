public class Aplicacao {

    Sinal sinal;
    SinalAdapter persistencia;

    public Aplicacao(){
        sinal = new SinalBarra();
        persistencia = new SinalAdapter(sinal);
    }

    public void setSinal(int potencia){
        sinal.setSinal(potencia);
        persistencia.salvarSinal();
    }

    public int getSinal(){
        return persistencia.verificarSinal();
    }

    public float getSinalPorcentagem(){
        return persistencia.getSinal();
    }
}

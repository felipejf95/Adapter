public class SinalBarra implements Sinal{

    private int sinal;
    @Override
    public void setSinal(int potencia) {
        this.sinal = potencia;
    }

    @Override
    public int getSinal() {
        return this.sinal;
    }
}

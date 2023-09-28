public class SinalAdapter extends SinalPorcentagem{

    private Sinal sinalBarra;

    public SinalAdapter (Sinal sinalBarra){
        this.sinalBarra = sinalBarra;
    }

    public void salvarSinal(){
        if(sinalBarra.getSinal() == 4)
            this.setSinal(1.0f);
        else
            if(sinalBarra.getSinal() == 3)
                this.setSinal(0.75f);
            else
                if(sinalBarra.getSinal() == 2)
                    this.setSinal(0.5f);
                else
                    if(sinalBarra.getSinal() == 1)
                        this.setSinal(0.25f);
                    else
                            this.setSinal(0);
    }

    public int verificarSinal(){
        if(this.getSinal() == 1)
            sinalBarra.setSinal(4);
        else
            if(this.getSinal() >= 0.75f)
                sinalBarra.setSinal(3);
            else
                if(this.getSinal() >= 0.5f)
                    sinalBarra.setSinal(2);
                else
                    if(this.getSinal() >= 0.25f)
                        sinalBarra.setSinal(1);
                    else
                        sinalBarra.setSinal(0);
        return sinalBarra.getSinal();
    }
}

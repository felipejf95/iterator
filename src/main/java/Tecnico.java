import java.util.Iterator;

public class Tecnico {

    public static Integer contarJogadoresDisponiveis(Equipe equipe){
        int quant = 0;
        for(Jogador jogador : equipe){
            if(jogador.isDisponivel()){
                quant++;
            }
        }
        return quant;
    }

    public static Integer contarTotalJogadores(Equipe equipe){
        int quant =0;
        for(Iterator a = equipe.iterator(); a.hasNext();){
            quant++;
            a.next();
        }
        return quant;
    }
}

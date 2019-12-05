package miage.lela.bowling;

public class Jeu {
    private Integer lc1;
    private Integer lc2;

    public Jeu(Integer lc1){
        this.lc1 = lc1;
    }

    public Jeu(Integer lc1, Integer lc2){
        this.lc1 = lc1;
        this.lc2 = lc2;
    }

    public boolean isValid(){
        if (lc1 == null){
            return false;
        }
        if (lc2 == null && Integer.valueOf(10)!=lc1){
            return false;
        }
        Integer somme = lc1;
        if (lc2 != null){
            somme += lc2;
        }
        if (somme > 10){
            return false;
        }
        return true;
    }
}

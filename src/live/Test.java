package live;
import music.playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
    public static void main(String[] args) {
        Veena v = new Veena();
        v.play();
        Saxophone S = new Saxophone();

        S.play();
        playable ps = new Saxophone();
        ps.play();
    }
}
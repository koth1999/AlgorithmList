package 문제.중복없는로또번호;

import java.util.List;
import java.util.ArrayList;

// ArrayList 활용
public class LottoEx2 {
    public static void main(String[] args) {
        List<Integer> lotto = new ArrayList<>();
        int tmp;

        while(true) {
            tmp = (int)((Math.random()*45)+1);
            if(!lotto.contains(tmp)) lotto.add(tmp);

            if(lotto.size()==6) break;
        }
        System.out.print(lotto);
    }
}

package 문제.중복없는로또번호;

import java.util.HashSet;

// HashSet 활용
public class LottoEx3 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int tmp;

        while(true) {
            tmp = (int)((Math.random()*45)+1);
            set.add(tmp);

            if(set.size()==6) break;
        }

        System.out.print(set);
    }
}

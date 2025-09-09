package Problem.중복없는로또번호;

import java.util.Arrays;

// 배열 이용
public class LottoEx1 {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        int tmp, index = 0;
        boolean isExist = false;

        while(true) {
            tmp = (int)((Math.random()*45)+1);
            for(int i=0; i<lotto.length; i++) {
                if(lotto[i]==tmp) isExist = true;
            }

            if(isExist==false) lotto[index++]=tmp;
            if(index==6) break;
            isExist = false;
        }
        System.out.print(Arrays.toString(lotto));
    }
}

package Day0415;

// 로또는 1~45까지의 숫자들 중 6개를 선택
// 로또번호는 중복 X
// 중복을 막기 위해 Hashset 사용
// Math.random() 사용 - 숫자 0 ~ 1에서 소수점을 임의로 만들어주는 함수
// Math.random() * 45 => 가장 작은 수 - 0 , 가장 큰 수 - 44.999..(정수화 하면 0,1,2 ~ 44 => +1)

import java.util.HashSet;

public class LottoNum {
    public static void main(String[] args) {
        HashSet<Integer> lotto = new HashSet<Integer>();
        for (int i = 1; i <= 6; i++) {
            int num = (int)(Math.random() * 45 + 1);
            lotto.add(num);
        }System.out.println("로또 번호 >> " + lotto);
    }
}

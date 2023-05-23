package day18.com.ict.edu;

import java.util.TreeSet;

public class Ex05 {
	public static void main(String[] args) {
// 로또 : 1 ~ 45, 랜덤, 중복안됨, 6자리
		TreeSet<Integer> lotto = new TreeSet<>();
		for (int i = 0; i < 6; i++) {
			int su = (int) (Math.random() * 45) + 1;
// 안들어가지면(set이기 때문에 중복되면) ▼ 앞으로 들어가서 다시 돌려서 넣는다.
			if (!lotto.add(su)) {
				i--;
			}
		}
		System.out.println(lotto);
	}
}

package string;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        /*
        * string tokenizer => 문자열 분리 (vs split)
        *
        * 문자열을 특정 구분자로 하여 문자열을 반환하는 기능
        * 1. split() : 정규 표현식을 이용해 문자열을 분리,
        *               비정형화된 문자열을 분리할 때 좋음 (공백 문자열 값 포함)
        *
        * 2. StringTokenizer : 문자열의 모든 문자들을 구분자로 하여 문자열을 분리,
        *                       정형화된 문자열 패턴을 분리할때 좋음 (공백 문자열을 무시)
        *                       => split()보다 속도면에서 조금 더 빠름
        *
        * */

        // 사번,이름,주소,부서
        String emp1 = "100,홍길동,서울,영업부"; // 모든 값 O
        String emp2 = "200,유관순,,총무부"; // 주소X
        String emp3 = "300,이순신,경기도,"; // 부서X

        compareSplitAndTokeizer("emp1", emp1);
        compareSplitAndTokeizer("emp2", emp2);
        compareSplitAndTokeizer("emp3", emp3);

    }

    public static void compareSplitAndTokeizer(String lable, String data) {
        System.out.println("==============" + lable + "비교 ==============");

        // split() 사용
        String[] splitResult = data.split(",", -1); // 빈 문자열도 포함
        System.out.println("[split()] 결과: " + Arrays.toString(splitResult));

        // StringTokenizer 사용
        StringTokenizer tokenizer = new StringTokenizer(data, ",");
        System.out.println("[StringTokenizer] 결과 :");
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println("[StringTokenizer] token: " + token);
        }

    }
}

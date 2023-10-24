package chap_02;

/*어린이 키에 따른 놀이 기구 탑승 가능 여부를 확인하는 프로그램

조건
1. 키가 120cm 이상인 경우에만 탑승 가능
2. 삼항 연산자 이용

실행 결과
키가 115cm 이므로 탑승 불가능합니다.
키가 121cm 이므로 탑승 가능합니다.*/

import java.sql.SQLOutput;

public class _Quiz_02 {
    public static void main(String[] args) {
//        int height = 115;
        int height = 121;
        boolean rideOk = (height >= 120) ? true : false;

        String result = (rideOk == true) ?
                "키가 " + height + "cm 이므로 탑승 가능합니다." :
                "키가 " + height + "cm 이므로 탑승 불가능합니다.";

        System.out.println(result);

        int heightLec = 115;
        String resultLec = (heightLec >= 120) ? "탑승 가능합니다" :
                "탑승 불가능합니다.";
        System.out.println("키가 " + heightLec + "cm 이므로 " + resultLec);

    }

}

public class ControlStudy {
    public static void main(String[] args) {
        //조건문
        int score = 85;
        if(score >= 60) {
            System.out.println("합격 ㅊㅋ");
        }

        int age = 17;
        if (age >= 18) {
            System.out.println("성인입니다."); //True 명령어 출력
        } else {
            System.out.println("미성년자입니다."); // False 명령어 출력
        }

        // =========================================================
        // 3. 다중 if문 (else if)
        // =========================================================
        int point = 72;

        if (point >= 90) {
            System.out.println("A");
        } else if (point >= 80) {
            System.out.println("B");
        } else if (point >= 70) {
            System.out.println("C"); // point가 72에 조건에 해당하면 "C"에 해당함.
        } else {
            System.out.println("F");
        }


    }
}

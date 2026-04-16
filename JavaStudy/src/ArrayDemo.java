import java.util.Scanner; //스캐너 모둘 갖고옴
public class ArrayDemo {
    public static void main(String[] args) {
        // # Array 배열
//        int[] arr1; //이게 정석
//        int arr2[]; // 이렇게 해도 됨. (C언어 스타일이긴 함)
//        int[] arr3 = new int[3]; //배열 생성하여 대입
//        // System.out.println(arr3[0]);
//        System.out.println(arr3.length);
//        System.out.println(arr3[arr3.length - 1]);
//
//        int[] nums1 = {10, 20, 30};
//        int[] nums2 = new int[] {10, 20, 30};
//        int[] nums3;
//        nums3 = new int[] {10, 20, 30};

//        int[] arr = {10, 20, 30, 40, 50};
//        System.out.println(arr[0]);
//        arr[0] = 100;
//        arr[4] = 500;
//        System.out.println(arr[arr.length -1]); // 마지막 {50}부분 인덱스 값 500 출력

//        int[] data = {1, 2, 3, 4, 5};
//        int sum = 0;
//        // data의 모든 값을 sum에 더하기 (for문 사용)
//        // 지시) data.length 사용, 인덱스 값을 i로 사용.
//
//        for (int i = 0; i<data.length; i++) {
//            sum += data[i];
//        }
//        System.out.println(sum);


//        int[] x = {1, 2, 3};
//        int[] y = x; // x의 참조(주소)를 y에 복사 -> 같은 배열 공유
//
//        y[0] = 999;
//        System.out.println(x[0]);

//        int[] x = {1, 2, 3};
//        int[] y = new int[3];
//        // y = x; <- Shallow copy
//
//        for(int i = 0; i<y.length; i++) {
//            y[i] = x[i];
//        }
//
//        y[0] = 999;
//        System.out.println(x[0]);
//        System.out.println(y[0]);


//        int[] nums = {10, 20, 30, 40, 50}; //#1
//        // 향상된 for문 (for-each ans)
//        for (int n : nums) {
//            System.out.println(n);
//
//        }
//
//        for (int i = 0; i<nums.length; i++) { //#1번과 결과는 같음.
//            System.out.println(nums[i]);
//        }
//
//        // 짝수 위치의 인덱스에 있는 요소만 출력 (20,40)
//        for(int i = 0; i<nums.length; i++) {
//            if ((i+1)%2 == 0) {
//                System.out.println(nums[i]); //20 , 40 위치 출력
//            }
//        }

        // 1) 스캐너로 배열의 크기를 입력 받고
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 크기를 입력하세요: ");
        int size = sc.nextInt();
        // 2) 그 사이즈 만큼 배열을 만들어 주고
        int[] numsarry = new int[size];

        // 3) 배열의 크기만큼 숫자를 입력받게 해서 모두 채우고
        for (int i = 0; i<numsarry.length; i++) {
            System.out.print((i+1) + "번째 숫자 입력: ");
            numsarry[i] = sc.nextInt();
        }

        // 4) 배열의 모든 내용을 출력 (가급적 for-each 사용)
        for (int n : numsarry) {
            System.out.println(n);
        }



        //배열의 크기는 절대. 변경할 수 없다.
        int[] x = new int[5];
        // x.length = 10 오류 뜸
        x = new int[10]; //이건 원래 있던 new int[5]를 10으로 바꾸는 것이 아닌, 새로운 배열 10을 생성함.






    }
}

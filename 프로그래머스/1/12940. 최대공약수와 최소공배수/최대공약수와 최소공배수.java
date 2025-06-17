// class Solution {
//     public int[] solution(int n, int m) {
//         int[] answer = new int[2];
//         int min = 1;
//         int max = 0;
//         int cnt2 = 0;
//         int cnt3 = 0;
//         answer[1] = n*m;
//         while(true){
//             if((n%2==0 && m%2==0)) {
//                 min *= 2;
//                 n /= 2;
//                 m /= 2;
//                 cnt2++;
//             } else if (n%3==0 && m%3==0) {
//                 min *= 3;
//                 n /= 3;
//                 m /= 3;
//                 cnt3++;
//             } else {
//                 break;
//             }
//         }
//         answer[0] = min;
//         answer[1] /= min;
        
        
        
//         return answer;
//     }
// }

// 위 방법은 2,3 이외의 소인수 처리 불가
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int gcd = getGCD(n, m);        // 최대공약수
        int lcm = (n * m) / gcd;       // 최대공배수

        answer[0] = gcd;
        answer[1] = lcm;
        
        return answer;
    }
    
    // 유클리드 호제법 사용
    public int getGCD(int a, int b) {
        if (b == 0) return a;
        return getGCD(b, a % b);
    }
}

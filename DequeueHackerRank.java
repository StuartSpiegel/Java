import java.util.*;
/*
Stuart Spiegel
Date: 1/2/2020
*/
    public class test {
        public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap();
        ArrayDeque<Integer> deque     = new ArrayDeque();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int max = 0;

        for (int i = 0; i < n; i++) {
            /* Remove old value (if necessary) */
            if (i >= m) {
                int old = deque.removeFirst();
                if (map.get(old) == 1) {
                    map.remove(old);
                } else {
                    map.merge(old, -1, Integer.Sum());
                }
            }

            /* Add new value */
            int num = scan.nextInt();
            deque.addLast(num);
            map.merge(num, 1, Integer.Sum());

            max = Math.max(max, map.size());

            //break out of loop, we have found largest INT possible.
            if (max == m) {
                break;
            }
        }

        scan.close();
        System.out.println(max);
        }
    }

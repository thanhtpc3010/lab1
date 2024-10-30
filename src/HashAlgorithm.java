import java.util.HashSet;
import java.util.Set;

public class HashAlgorithm {

    public static boolean isDivisibleByThree(int x) {
        return x % 3 == 0;
    }

    public static Set<Integer> getDivisibleByThreeSet(Set<Integer> inputSet) {
        Set<Integer> divisibleByThreeSet = new HashSet<>(); // Set mới để lưu kết quả

        for (int number : inputSet) {
            if (isDivisibleByThree(number)) { // Kiểm tra tính chia hết cho 3
                divisibleByThreeSet.add(number); // Thêm vào Set kết quả nếu thỏa mãn
            }
        }
        return divisibleByThreeSet;
    }
}

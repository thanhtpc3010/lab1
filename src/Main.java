import java.util.HashSet;
import java.util.Set;


public static void main(String[] args) {
    Set<Integer> numbers = new HashSet<>();
    numbers.add(1);
    numbers.add(3);
    numbers.add(6);
    numbers.add(8);
    numbers.add(9);
    numbers.add(11);
    numbers.add(15);

    // Sử dụng hàm getDivisibleByThreeSet để lấy các số chia hết cho 3
    Set<Integer> result = HashAlgorithm.getDivisibleByThreeSet(numbers);

    System.out.println("Các số chia hết cho 3 trong tập hợp là: " + result);
}

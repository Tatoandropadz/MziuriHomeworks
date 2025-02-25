package gakvetili39davaleba;

import java.util.*;
import java.util.stream.Collectors;

public class Fourth {
    public static void main(String[] args) {
        List <Student> students = Arrays.asList(
                new Student("Tea", 80),
                new Student("Gurjani", 20),
                new Student("Jumberi", 75),
                new Student("Elguja", 55),
                new Student("Baibala", 100)
        );
        Comparator<Student> GradeComparator = (s1, s2) -> Integer.compare(s2.grade, s1.grade);

        Map<String, Integer> productMap = students.stream().filter(s -> s.grade>70).sorted(GradeComparator)
                .collect(Collectors.toMap(s -> s.name, s -> s.grade, (existing, replacement) -> existing));


        System.out.println(productMap);
    }
}

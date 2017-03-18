package ppj.assignments;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Created by acer aspire on 6.3.2017.
 */
public class Assignment3Impl implements Assignment3 {
    public int deepSumOfEvenSquaredNumbers(List<List<Integer>> src){

        return  src.stream()
                .flatMap(t -> t.stream())
                .filter(i -> i%2 ==0)
                .map(b -> b*b)
                .reduce((a, b) -> a+b)
                .get() : 0;

    }

    public int sumOfDivisibleInRange(int from, int to, List<Integer> divisibleBy){

        return IntStream.range(from, to).boxed()
                .filter(number -> 
						divisiblesBy.stream().allMatch(div -> 
													  number % div == 0)
				)
                .mapToInt(i -> i).sum();

    }
}

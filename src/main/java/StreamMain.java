import java.util.*;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
//        Person pavel = new Person(25, "Pavel");
//        Person alesya = new Person(20, "Alesya");

        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");
        stringList.add("4");
        stringList.add("5");
        stringList.add("15");
        stringList.add("14");
        stringList.add("13");
        stringList.add("12");
        stringList.add("11");
        stringList.add("11");
        stringList.add("6");

//        List<Person> people = new ArrayList<>();
//        people.add(pavel);
//        people.add(alesya);

        //Возвращает сумму всех чисел
        int sum = stringList.stream()
                .mapToInt(Integer::parseInt)
                .sum();
        System.out.println("Sum: " + sum);

        //Возвращает среднее арифметическое всех чисел
        double average = stringList.stream()
                .mapToDouble(Double::parseDouble)
                .average()
                .getAsDouble();
        System.out.println("Average: " + average);

        //Найти максимальное значение среди коллекции строк
        int max = stringList.stream()
                .mapToInt(Integer::parseInt)
                .max()
                .getAsInt();
        System.out.println("Max: " + max);

        //Вернуть количество вхождений объекта «11»
        long amountOfObject = stringList.stream()
                .filter(x -> x.equals("11"))
                .count();
        System.out.println("Amount of \"11\" in collection: " + amountOfObject);

        //Вернуть первый элемент коллекции или 0, если коллекция пуста
        String firstElement = stringList.stream()
                .findFirst()
                .orElse("0");
        System.out.println("First element: " + firstElement);

        //Вернуть последний элемент коллекции или «empty», если коллекция пуста
        String emptyOrNot = stringList.stream()
                .skip(stringList.size() - 1)
                .findAny()
                .orElse("empty");
        System.out.println("Last element or collection is empty: " + emptyOrNot);

        //Найти элемент в коллекции равный «15» или кинуть ошибку
        String elementInCollection = stringList.stream()
                .filter(s -> s.equals("15"))
                .findAny()
                .orElse(null);
        System.out.println("Element equals \"15\" or null: " + elementInCollection);

        //Вернуть третий элемент коллекции по порядку
        String thirdElement = stringList.stream()
                .skip(2)
                .findFirst()
                .get();
        System.out.println("Third element: " + thirdElement);

        //Вернуть два элемента начиная со второго
        Object[] array = stringList.stream()
                .skip(1)
                .limit(2)
                .toArray();
        System.out.println("Two elements starting from second element: " + Arrays.toString(array));

        //Выбрать все элементы по шаблону
        List<String> allElementsEqualsEleven = stringList.stream()
                .filter(s -> s.contains("11"))
                .collect(Collectors.toList());
        System.out.println("Elements equal \"11\": " + allElementsEqualsEleven);


        //Получение коллекции без дубликатов из неупорядоченного стрима через distinct()
        List<String> uniqueDistinct = stringList.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Unique with distinct(): " + uniqueDistinct);

        //Найти существуют ли хоть один «8» элемент в коллекции
        boolean equalsEight = stringList.stream()
                .anyMatch(x -> x.equals("3"));
        System.out.println("Any \"3\" in collection: " + equalsEight);

        //Найти есть ли символ «1» у всех элементов коллекции
        boolean onePresentInEveryElementInCollection = stringList.stream()
                .allMatch(x -> x.contains("1"));
        System.out.println("\"1\" in all elements in collection: " + onePresentInEveryElementInCollection);

        //Проверить что не существуют ни одного «7» элемента в коллекции
        boolean sevenInCollection = stringList.stream()
                .noneMatch(x -> x.contains("7"));
        System.out.println("None match \"7\" in all elements in collection: " + sevenInCollection);

        //Добавить "_1" к каждому элементу первой коллекции
        List<String> collectionAdded = stringList.stream()
                .map(s -> s + "_1")
                .collect(Collectors.toList());
        System.out.println("Collection Added _1: " + collectionAdded);

        //В первой коллекции убрать первый символ и вернуть массив чисел (int[])
        List<String> collection1 = Arrays.asList("a1", "a2", "a3", "a1");
        int[] ints = collection1.stream()
                .mapToInt(s -> Integer.parseInt(s.substring(1)))
                .toArray();
        System.out.println("Array without first symbol: " + Arrays.toString(ints));

        //Из второй коллекции получить все числа, перечисленные через запятую из всех элементов
        List<String> collection2 = Arrays.asList("1,2,0", "4,5");
        String[] strings = collection2.stream()
                .flatMap(p -> Arrays.stream(p.split(",")))
                .toArray(String[]::new);
        System.out.println("Nums: " + Arrays.toString(strings));

        //Из второй коллекции получить сумму всех чисел, перечисленных через запятую
        int sumOfStrinds = collection2.stream()
                .flatMap((p) -> Arrays.stream(p.split(",")))
                .mapToInt(Integer::parseInt)
                .sum();
        System.out.println("Sum of all strings represented as ints: " + sumOfStrinds);

        //Найти максимальное значение среди коллекции строк
        String maxString = collection1.stream()
                .max(String::compareTo)
                .get();
        System.out.println("Max string: " + maxString);

        // Обе ForEach и Peek по сути делают одно и тоже, меняют свойства объектов в стриме,
        // единственная разница между ними в том что ForEach терминальная и она заканчивает работу со стримом,
        // в то время как Peek конвейерная и работа со стримом продолжается.
        // И нужно добавить к каждому элементу "_new", то для ForEach
        List<StringBuilder> list = Arrays.asList(new StringBuilder("a1"), new StringBuilder("a2"), new StringBuilder("a3"));
        list.stream()
                .forEach(stringBuilder -> System.out.println(stringBuilder.append("_new")));
        //peek
        List<StringBuilder> aNew = list.stream()
                .peek(stringBuilder -> stringBuilder.append("_new"))
                .collect(Collectors.toList());
        System.out.println("Added via peek: " + aNew);

        //Получить сумму чисел или вернуть 0
        int[] nums = {1, 2, 3, 4, 2};
        int result = Arrays.stream(nums)
                .reduce((a, b) -> a + b)
                .orElse(0);
        System.out.println("Sum of array or 0: " + result);

        //Вернуть максимум или -1
        int result2 = Arrays.stream(nums)
                .reduce(Integer::max)
                .orElse(-1);
        System.out.println("Max of array or -1: " + result2);

        //Вернуть сумму нечетных чисел или 0
        int result3 = Arrays.stream(nums)
                .filter(x -> x % 2 != 0)
                .reduce(Integer::sum)
                .orElse(0);
        System.out.println("Sum of odd nums of array or 0: " + result3);

        //Вернуть сумму нечетных чисел через summingInt()
        List<Integer> integerList2 = Arrays.asList(1, 2, 3, 4);
        int result4 = integerList2.stream()
                .collect(Collectors.summingInt((p -> p % 2 != 0 ? p : 0)));
        System.out.println("Sum of odd nums of array or 0 with summingInt(): " + result4);

        //Вычесть от каждого элемента 1 и получить среднее
        double result5 = integerList2.stream()
                .collect(Collectors.averagingInt(x -> x - 1));
        System.out.println("Minus 1 and count average: " + result5);

        //Прибавить к числам 3 и получить статистику
        IntSummaryStatistics result6 = integerList2.stream()
                .collect(Collectors.summarizingInt(num -> num + 3));
        System.out.println("Add 3 and get statistics: " + result6);

        //Разделить числа на четные и нечетные
        Map<Boolean, List<Integer>> result7 = integerList2.stream()
                .collect(Collectors.partitioningBy(num -> num % 2 != 0));
        System.out.println("Separation on odd and even: " + result7);
    }
}

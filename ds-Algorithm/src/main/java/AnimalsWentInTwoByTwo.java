import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnimalsWentInTwoByTwo {

    public static void main(String[] args) {
//A great flöod has hit the land. and just as İn Biblital times we need tö get the animals tö the ark İn paİrS, We
//are only İnterested İn getting one paİr of eoch anğna', and not İnterested İn any animals where there are
//than 2. They ned to mate to reppulate the planet after ali!
//Write a functİon that takeş 0 Of aş a parameter, which need to check to Whİch animalş
//there are at least two of, then return a Map•zString, that containş the name Of the animal
//along Wİth the fact that there 2 Of to bring onto ark.
//Input: [l
//Output: O
//Input: ['goat'l
//Output: O
//Input : [”dcX, "pat', "dog'l
//Output: [dog221
//Input : ["dog•, "cat", 'dog", •cat", 'beaver", "can
//Output: [cat-2, dog-21
//Input: [•goat", •goat••, •rabbİt••, "tabbİt", "tabbit•, "duck•, "hotse", "hotse",
//Output: [horse:2. rabbİt22, goat22)


        List<String> animals = List.of("goat", "goat", "rabbit", "rabbit", "rabbit", "duck", "horse", "horse", "swan");

        Map<String, Integer> stringIntegerMap = pairOfAnimals(animals);
        System.out.println("stringIntegerMap = " + stringIntegerMap);
    }

    //  Output: [horse=2, rabbit=2, goat=2]
    public static Map<String, Integer> pairOfAnimals(List<String> animals) {

        Map<String, Integer> pair = new HashMap<>();

        for (String animal : animals) {

            int count = pair.getOrDefault(animal, 0);

            if (count < 2) {
                pair.put(animal, ++count);
            }

        }

        pair.entrySet().removeIf(each -> each.getValue() == 1);



        return pair;
    }

}

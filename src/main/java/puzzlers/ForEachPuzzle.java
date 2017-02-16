package puzzlers;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
    stream().forEach() --> spliterator().forEachReamining()
 * forEachRemaining проверяет modcount один раз в конце
 * Удаление  элемента приведёт к сдвигу массива и добавлением null в конец
 * ["One","Two","Three"] ->["One","Three",null]
 * на последней итерации будет if(null.equals("Two")) и throws NPE
 */
public class ForEachPuzzle {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("One", "Two", "Three"));
        list.stream().forEach(x -> {
            if (x.equals("Two")) {
                list.remove(x);// Will be NPE
            }
        });
    }


}

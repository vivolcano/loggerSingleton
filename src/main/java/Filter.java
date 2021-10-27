import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {

        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();

        List<Integer> result = new ArrayList<>();
        for (Integer value : source) {
            if (treshold >= value) {
                result.add(value);
                logger.log(new Date() + " Элемент \"" +value + "\" проходит ");
            } else {
                logger.log(new Date() + " Элемент \"" +value + "\" не проходит ");
            }
        }

        logger.log(new Date() + " Прошло фильтр " + result.size() + " элемента из " + source.size());

        return result;
    }
}
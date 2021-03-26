import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BinarySearch {

    private static final Logger logger = LoggerFactory.getLogger(BinarySearch.class);

    public static int Search(int[] ms, int startIndex, int endIndex, int value) {
        if (endIndex >= 1) {
            logger.info("Index range: [" + startIndex + "-" + endIndex + "]");
            int middle = startIndex + (endIndex - startIndex) / 2;
            if (value == ms[middle]) {
                logger.info("Element found. Index - :" + middle);
                return middle;
            }
            if (startIndex == endIndex){
                logger.info("Element not found");
                return -1;
            }
            if (value < ms[middle]) {
                logger.info("Value is lower: " + value + "<" + ms[middle]);
                return Search(ms, startIndex, middle - 1, value);
            }
            if (value > ms[middle]) {
                logger.info("Value is higher: " + value + ">" + ms[middle]);
                return Search(ms, middle + 1, endIndex, value);
            }
        }
        return -1;
    }
}

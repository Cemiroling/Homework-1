import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BinarySearch {

    private static final Logger logger = LoggerFactory.getLogger(BinarySearch.class);

    public static int search(int[] ms, int value){
        return search(ms, 0, ms.length, value);
    }

    public static int search(int[] ms, int startIndex, int endIndex, int value) {
        if (endIndex >= 1) {
            logger.debug("Index range: [{}-{}]", startIndex, endIndex);
            int middle = startIndex + (endIndex - startIndex) / 2;
            if (value == ms[middle]) {
                logger.debug("Element found. Index - {}", middle);
                return middle;
            }
            if (startIndex == endIndex){
                logger.debug("Element not found");
                return -1;
            }
            if (value < ms[middle]) {
                logger.debug("Value is lower: {} < {}", value, ms[middle]);
                return search(ms, startIndex, middle - 1, value);
            }
            if (value > ms[middle]) {
                logger.debug("Value is higher: {} > {}", value, ms[middle]);
                return search(ms, middle + 1, endIndex, value);
            }
        }
        return -1;
    }
}

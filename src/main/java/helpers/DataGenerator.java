package helpers;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DataGenerator {
    public static String createPassword() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        return RandomStringUtils.random( 15, characters );
    }

    public static String createString() {
        String characters = "abcdefghijklmnopqrstuvwxyz0123456789";
        return RandomStringUtils.random( (int) (3 + Math.random() * 10), characters );
    }

    public static int selectRandom(){
        List givenList = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21));
        Random random = new Random();
        int randomSelect = (int) givenList.get(random.nextInt(givenList.size()));
        return randomSelect;
    }

}

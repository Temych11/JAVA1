package JCHW2;
import JCHW2.Exceptions.*;
import JCHW2.Tools.Converter;
// на проверку

public class JCHW2 {
    public static void main(String[] args) {
        String[][] correctMatrix = {
                {"5", "2", "4", "8"},
                {"2", "3", "2", "4"},
                {"1", "7", "7", "9"},
                {"3", "2", "1", "3"}
        };
        String[][] wrongSizeMatrix = {
                {"5", "3", "3", "1"},
                {"0", "2", "7", "3"},
                {"3", "0"},
                {"4", "2", "2", "0"}
        };
        String[][] wrongChar = {
                {"6", "9", "1", "3"},
                {"4", "5", "", "5"},
                {"7", "7", "7", "7"},
                {"3", "9", "3", "6"}
        };

        try {
            System.out.println(Converter.strConverter(correctMatrix));
        } catch (CustomException e) {
            e.getMessage();
        }


        try {
            System.out.println(Converter.strConverter(wrongSizeMatrix));
        } catch (CustomException e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println(Converter.strConverter(wrongChar));
        } catch (CustomException e) {
            System.err.println(e.getMessage());
        }
    }
}

package JCHW2.Exceptions;

public class MyArrayDataException extends CustomException {

    public MyArrayDataException(int row, int col) {
            super(String.format("Parse to int exception in array[%d, %d]", row, col));
        }
}

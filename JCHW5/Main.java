package JCHW5;

import java.io.*;
import java.util.ArrayList;

public class Main {

    //метод вывода объекта в файл
    public static void writeFile(AppData2 appData2, File file){
        try (PrintWriter out = new PrintWriter(file)) {
            int k = 0;
            String[] header = appData2.getHeader();
            for (String v : header){
                out.print(v);
                if (k < header.length - 1) out.print(";");
                k++;
            }
            out.println();

            int[][] data = appData2.getData();
            for (int i = 0; i < data.length; i++){
                for (int j = 0; j < data[i].length; j++){
                    out.print( data[i][j]);
                    if (j < header.length - 1) out.print(";");
                }

                out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //метод для чтения объекта из файла
    public static AppData2 readFile(File file) {

        //создаем объект, чтобы его вернуть
        AppData2 appData2 = new AppData2();

        //создаем промежуточный список для хранения массивов чисел
        ArrayList<int[]> dataList = new ArrayList<int[]>();
        try{
            BufferedReader in = new BufferedReader(new FileReader(file));

            //читаем заголовок, разделяем по точке с запятой
            String[] header = in.readLine().split(";");
            appData2.setHeader(header);

            //читаем значения
            String readLine = null;
            while ( (readLine = in.readLine()) != null) {
                String[] strLine = readLine.split(";");

                //массив для хранения чисел из строки
                int[] intLine = new int[strLine.length];
                for (int i = 0; i < strLine.length; i++){
                    intLine[i] = Integer.parseInt(strLine[i]);
                }
                dataList.add(intLine);
            }

            in.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        int[][] data = new int[dataList.size()][];
        for(int i = 0; i < dataList.size(); i++ ){
            data[i] = dataList.get(i);
        }
        appData2.setData(data);
        return appData2;
    }


    public static void main(String args[]) {
        File file = new File("./file.csv");
        try{
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }


        //создаем header
        String[] header = {"Value1","Value2","Value3"};

        //создаем data
        //n - number of rows
        int n = 5;
        int[][] data = new int[n][3];
        for(int i = 0; i < n; i++){
            data[i][0] = 100 + i;
            data[i][1] = 200 + i;
            data[i][2] = 300 + i;
        }

        //создание объекта с данными
        AppData2 appData2 = new AppData2(header, data);

        //вывод объекта в файл
        writeFile(appData2, file);

        //чтение из файла
        AppData2 readAppData = readFile(file);

        //вывод результата чтения в другой файл
        writeFile(readAppData, new File("result.txt"));

    }
}

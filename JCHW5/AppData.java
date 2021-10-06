package JCHW5;

import java.io.Serializable;

public class AppData implements Serializable {
    private String[] header;
    private int[][] data;


    public AppData(String[] header, int[][] data){
        this.header = header;
        this.data = data;
    }

    public String headerToString(){
        return String.format("%s;%s;%s\n",header);
    }

    public String rowToString(int i){
        return String.format("%d;%d;%d\n",data[i][0], data[i][1], data[i][2]);
    }

    public String dataToString(){
        String result = "";
        for(int i = 0; i < data.length; i++)
            result = result + String.format("%s", rowToString(i));
        return result;
    }

    @Override
    public String toString(){
        return headerToString() + dataToString();
    }
}

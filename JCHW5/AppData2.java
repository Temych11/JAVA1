package JCHW5;

import java.io.Serializable;

public class AppData2 implements Serializable {
    private String[] header;
    private int[][] data;

    public AppData2() {}

    public AppData2(String[] header, int[][] data){
        this.header = header;
        this.data = data;
    }

    public String[] getHeader() { return header; }

    public int[][] getData() { return data; }

    public void setHeader(String[] header) { this.header = header; }

    public void setData(int[][] data) { this.data = data; }
}

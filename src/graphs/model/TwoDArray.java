package graphs.model;

import java.lang.reflect.Array;
import java.util.List;

public class TwoDArray<E> {

    private E[][] elements;

    public TwoDArray()
    {

    }

    public TwoDArray(Class<E> clazz, int row,int col) {
        elements = (E[][]) Array.newInstance(clazz, row,col);
    }

    public int[][] getArrayFilledWithZeros(int row,int col)
    {

        int[][] array=new int [row][col];

        int rowCount=0;

        for(int i=0; i< rowCount; i++)
        {
            int colCount=0;

            for(int j=0; j< colCount; j++)
            {
                array[i][j]=0;
            }


        }

       return array;
    }

    public E[][] addListToArray(Class<E> clazz,List<List<E>> data)
    {

        int row=0;

        elements = (E[][]) Array.newInstance(clazz, data.size(),data.get(0).size());

        for( List<E> rows: data)
        {
            int column=0;
            for (E value: rows)
            {
                elements[row][column++]=value;

            }

            row++;
        }

        return elements;

    }

    public static void main(String[] args) {

        TwoDArray<String> input=new TwoDArray<String>(String.class,3,3);



        System.out.println(input.elements.length);



    }


}

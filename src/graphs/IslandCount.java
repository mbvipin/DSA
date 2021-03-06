package graphs;

import graphs.model.TwoDArray;
import graphs.utils.GraphUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class IslandCount {

    public static void main(String[] args) {

        TwoDArray<String> input=new TwoDArray<>();

        String [] [] inputArray=input.addListToArray(String.class,  GraphUtils.createGrid());

        int rowCount= inputArray.length;
        int colCount=inputArray[0].length;

        int [][] visited=input.getArrayFilledWithZeros(rowCount,colCount);

        int count=0;

        for (int i = 0; i < inputArray.length; i++) {

            for (int j = 0; j < inputArray[i].length; j++) {

                if(depthFirstSearch(inputArray,i,j,visited))
                {
                    count++;
                }

            }



        }


        System.out.println(count);

    }

    private static boolean depthFirstSearch(String[][] inputArray, int row, int col, int[][] visited) {

        if( row <0 || row >=inputArray.length || col <0 || col >=inputArray[row].length)
        {
            return false;
        }

        if(inputArray[row][col]== "W")
        {
            return false;
        }
        if(visited[row][col]== 1)
        {
            return false;
        }
        visited[row][col]=1;

        depthFirstSearch(inputArray,row+1,col,visited);
        depthFirstSearch(inputArray,row-1,col,visited);
        depthFirstSearch(inputArray,row,col+1,visited);
        depthFirstSearch(inputArray,row,col-1,visited);

        return true;

    }


}

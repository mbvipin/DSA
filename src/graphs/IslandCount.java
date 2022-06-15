package graphs;

import graphs.model.TwoDArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class IslandCount {

    public static void main(String[] args) {

        TwoDArray<String> input=new TwoDArray<>();

        String [] [] inputArray=input.addListToArray(String.class,  createGrid());



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

    private static List<List<String>>  createGrid() {


        List<List<String>> grid=new ArrayList<>();

        List<String> firstRow=new ArrayList<>();

        firstRow.add("W");
        firstRow.add("L");
        firstRow.add("W");
        firstRow.add("W");
        firstRow.add("W");

        grid.add(firstRow);

        List<String> secondRow=new ArrayList<>();

        secondRow.add("W");
        secondRow.add("L");
        secondRow.add("W");
        secondRow.add("W");
        secondRow.add("W");

        grid.add(secondRow);

        List<String> thirdRow=new ArrayList<>();

        thirdRow.add("W");
        thirdRow.add("W");
        thirdRow.add("W");
        thirdRow.add("L");
        thirdRow.add("W");

        grid.add(thirdRow);

        List<String> fourthRow=new ArrayList<>();

        fourthRow.add("W");
        fourthRow.add("W");
        fourthRow.add("L");
        fourthRow.add("L");
        fourthRow.add("W");

        grid.add(fourthRow);

        List<String> fifthRow=new ArrayList<>();

        fifthRow.add("L");
        fifthRow.add("W");
        fifthRow.add("W");
        fifthRow.add("L");
        fifthRow.add("L");

        grid.add(fifthRow);

        List<String> sixthRow=new ArrayList<>();

        sixthRow.add("L");
        sixthRow.add("L");
        sixthRow.add("W");
        sixthRow.add("W");
        sixthRow.add("W");

        grid.add(sixthRow);

        return grid;
    }
}

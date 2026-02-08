import java.util.*;
class Multi_array{
	public static void main(String... args){
		int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int row=arr.length;
        int col=arr[0].length;
        int OneDArray[]= new int[row*col];
        int index=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
			OneDArray[index]= arr[i][j];
			i++;
		    }
		}
		System.out.println("Elements of 1D array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(OneDArray[i] + " ");
        }
	}
}
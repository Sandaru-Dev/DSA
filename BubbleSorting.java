public class BubbleSorting{

		// Sorts items in an array into ascending order.
public void bubbleSort(int data[]){
		int out, in;
		for(out=data.length-1; out>0; out--)//outer loop
			// moves the largest element to end of array
			for(in=0; in<out; in++) // inner loop (forward)
			if( data[in] > data[in+1] ) // compare adjacent elements
				swap(data,in, in+1); // swap them
		} // end bubbleSort()


		private void swap(int array[],int t1, int t2){
			 int temp = array[t1];
				array[t1] = array[t2];
				array[t2] = temp;
		}

public static void main(String[] args){
int[] data={76,142,91,420,113,37};// distance from head office to competitors' home
System.out.println("-----------Before sorting------------");
for(int i=0; i<data.length;i++)
	System.out.print(data[i]+"\t");

BubbleSorting s1=new BubbleSorting();
s1.bubbleSort(data);

System.out.println("\n-----------After sorting------------");
for(int i=0; i<data.length;i++)
	System.out.print(data[i]+"\t");

}//end main
}//end class	
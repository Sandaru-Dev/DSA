public class SelectionSorting{

public static void selectionSort(int data[]){
int out, in, min;
for(out=0; out<data.length-1; out++){// outer loop
	min = out; // minimum value index
	for(in=out+1; in<data.length; in++){// inner loop
		if(data[in] < data[min]){// if min value greater,
			 min = in; //we have a new min index
		}//end if	
	}//end inner		
	if(out!=min)//better for maintenance
		swap(data,out, min); //swap them
} // end for outer
} // selectionSort
//---------------------------------------------------------------------------
	private static void swap(int data[],int out,int min){
			int temp=data[out];
				data[out]=data[min];
				data[min]=temp;
	}
//---------------------------------------------------------------------------

public static void main(String[] args){
int data[]={76,142,91,420,113,37};
System.out.println("----------------Before sorting-----------------------\n");
for(int i=0;i<data.length;i++)
	System.out.print(data[i]+"\t");

selectionSort(data);

System.out.println("\n----------------After sorting------------------------");
for(int i=0;i<data.length;i++)
	System.out.print(data[i]+"\t");
}//end main
}//end class


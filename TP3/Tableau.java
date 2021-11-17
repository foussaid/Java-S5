public class Tableau{
	static void swap(int[] array,int index1,int index2){
		int a;
		a = array[index1];
		array[index1] = array[index2];
		array[index2] = a;
		for(var i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
	}
	static int indexOfMin(int[] array,int index1,int index2){
		/*renvoie le minimum entre index1 et index2*/
		int min;
		min = array[index1];
		int i;
		for(i = index1; i <= index2; i++){
			if(min > array[i])
				min = array[i];
		}
		return min;
	}
	static void sort(int[] array){
		int min;
		min = array[0];
		int i;
		for(i = 0; i < array.length-1; i++){
			min = indexOfMin(array, i, i+1);/* je trouve le minimum entre deux cases */
			swap(array,i,i+1);
		}	    
	}
	public static void main(String[] args){
		int min;
		int[] tableau = {1, 3, 7, 6, 5, 8};
		swap(tableau, 0, 1);
		min = indexOfMin(tableau, 2, 4);
		System.out.println("Le minimum est " + min);
		System.out.println("Le tableau trié apparaîtera ici !");
		sort(tableau);
	}
}
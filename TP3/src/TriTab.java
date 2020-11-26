
public class TriTab {
	public static void main(String[] args) {
		int[] tab1 = {12, 3, 4, 56, 7};
		System.out.println("Tableau 1 : ");
		afficheTab(tab1);
		
		// Q1 Exo4
		swap(tab1, 2, 4);
		System.out.println("Tableau 1 modifié : ");
		afficheTab(tab1);
		
		// Q2 Exo 4
		int minimumI = indexOfMin(tab1);
		System.out.println("L'indice de la valeur minimum est " + minimumI + " et correspond à la valeur " + tab1[minimumI]);
	
		// Q3 Exo4
		int minimumI2 = indexOfMin(tab1, 2, 5);
		System.out.println("L'indice de la valeur minimum est " + minimumI2 + " et correspond à la valeur " + tab1[minimumI2] + " dans l'intervalle donné.");
	
		// Q4 Exo4
		sortTab(tab1);
	}
	
	public static void afficheTab(int[] tab) {
		for(int e : tab) {
			System.out.println(e);
		}
	}
	
	// Q1 Exo4
	public static void swap(int[] array, int index1, int index2) {
		if(index1 <= array.length || index2 <= array.length) {
			int vartmp = array[index1];
			array[index1] = array[index2];
			array[index2] = vartmp;
		} else {
			System.out.println("ERROR : Indice plus grand que la taille du tableau");
		}
	}
	
	// Q2 Exo4
	public static int indexOfMin(int[] array) {
		int indexMin = -1;
		int valueMin = Integer.MAX_VALUE;
		if(array.length != 0) {
			for(int i=0 ; i < array.length ; i++) {
				if(valueMin > array[i]) {
					indexMin = i;
					valueMin = array[i];
				}
			}
			return indexMin;
		} else {
			System.out.println("ERROR : Tableau vide");
			return -1;
		}
	}
	
	// Q3 Exo4
	public static int indexOfMin(int[] array, int indexMin, int indexMax) {
		int indexMinim = -1;
		int valueMin = Integer.MAX_VALUE;
		if(indexMin <= array.length || indexMax <= array.length) {
			for(int i=indexMin ; i < indexMax ; i++) {
				if(valueMin > array[i]) {
					indexMinim = i;
					valueMin = array[i];
				}
			}
			return indexMinim;
		} else {
			System.out.println("ERROR : indices incorrects");
			return -1;
		}
	}
	
	// Q4 Exo4
	public static void sortTab(int[] tabToSort) {
		int indexMin = -1;
		if(tabToSort.length != 0) {
			for(int i=0 ; i < tabToSort.length ; i++) {
				indexMin = indexOfMin(tabToSort, i, tabToSort.length);
				if(indexMin != tabToSort[i]) {
					swap(tabToSort, indexMin, i);
				}
			} 
			System.out.println("Tri terminé");
			afficheTab(tabToSort);
		} else { System.out.println("ERROR : Tableau vide"); }
	}
}

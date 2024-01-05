public class UnionIntersection {
	public static void main(String[] args) {
		int[] i1 = {12,32,14,35,89,16,120};
		int[] i2 = {9,12,8,17,120,35,36};
		Union(i1,i2);
		System.out.println();
		Intersect(i1,i2);
	}
	public static void Union(int[] i1,int[] i2){
		boolean flag = false;
		for(int i = 0;i<i1.length;i++) {
			for(int j = 0;j<i2.length;j++){
				if(i1[i]==i2[j]) {
					flag = false;
					break;
				}
				else
					flag = true;
			}	
			if(flag)
				System.out.print(i1[i]+" ");
		}
		for(int i = 0;i<i2.length;i++) {
			System.out.print(i2[i]+" ");
		}
	}
	public static void Intersect(int[] i1,int[] i2) {
		for(int i = 0;i<i1.length;i++) {
			for(int j = 0;j<i2.length;j++) {
				if(i1[i]==i2[j]) {
					System.out.print(i2[j]+" " );
					break;		
				}
			}
		}
	}
}


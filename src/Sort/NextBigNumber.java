package DSA;

public class NextBigNumber {
//Not working
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] data= {'2','1','8','7','6','5'};
		
		String data1="1234";
		//System.out.println(data1.toCharArray());
		nextBigNumber(data,data);

	}
	public static void nextBigNumber(char[] data,char[] data1) {
		
		String originalValue=getStringFromArray(data);
		System.out.println(originalValue);
		Integer values[]=new Integer[200];
		String newVal="";
		int counter=0;
		for(int l=0;l<data.length;l++) {
		for(int j=data.length-1;j>0;j--) {
		char c=data[j];
		
			for(int x=j-1;x>=j-1 && x!=0;x--) {
				char c1=data1[x];
				
				data1[x]=c;
				data1[j]=c1;
				newVal=getStringFromArray(data1);
				values[counter]=Integer.parseInt(newVal);
				counter++;
				//System.out.println("done");
			}
			//System.out.println(newVal);
			data=newVal.toCharArray();
		}
		data=newVal.toCharArray();
		}
		for(int z=0;z<values.length;z++) {
			System.out.println(values[z]);
    	}

	}
    public static String getStringFromArray(char[] data) {
    	String newVal="";
    	for(int j=0;j<data.length;j++) {
			newVal=newVal+data[j];
    	}
		return newVal;
    }
}

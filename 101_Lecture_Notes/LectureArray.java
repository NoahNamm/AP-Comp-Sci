/* 
    Lecture note example - Arrays
*/

class LectureArray{
    public static void main(String args[]) {
        // Your Code Goes here!
        int [] arr = {5,8,7,8,4,2,9,1};
        for (int i = 1; i<arr.length-1; i=i+2){
            System.out.println(arr[i]+" "+arr[i+1]);
        }
        int x = 8;
        for (int i = 0; i<arr.length; i++){
            if (arr[i] == x){
            System.out.println("There is a duplicate at index "+i);
            }
        }
        for (int i = 0; i<arr.length-1; i++){
            if (arr[i] == arr[i+1]){
            System.out.println("There are two in a row at "+i+"  and "+(i+1));;
            }
        }
        
	}
}
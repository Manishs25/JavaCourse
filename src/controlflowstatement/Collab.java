package controlflowstatement;


//array reverse
//duplicate
//even and odd
//default case mdhe array list

public class Collab {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,5,6,6,6};
        for (int i=0;i< arr.length-1;i++){
            for (int j=i+1;j< arr.length;j++){
                if(arr [i]==arr[j]){
                    System.out.println(arr[i]);
                    return;
                    }

                }
            }
        }
    }


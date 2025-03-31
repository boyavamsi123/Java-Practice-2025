public class Main{
    public static void main(String[] args){
        short i=20000;
        String s1 = "Yadagiri Reddy";
        boolean b1 = true;

        System.out.println(i);  //20000
        System.out.println(s1); //Yadagiri Reddy
        System.out.println(b1); //true

        int var = 10;
        var = var + var;
        System.out.println(var); 
       // int[] arr = new int[5];
       // arr[0]= 1;
        var arr =  new int[]{1,2,3};
        var arr2 = new int[3];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;
    }
    public void add(int i,int j){
        System.out.println(i+j);
    }
}
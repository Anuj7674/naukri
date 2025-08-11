package prac;

class Main {
    public static void main(String[] args) {
        int c=0;
        int d=0;
        int[] b={1,3,2,3,3,4,7};
        int target=5;
        outerLoop:
        for(int i=0;i<=b.length-1;i++){
            for(int j=i+1;j<b.length;j++){
                if(b[i]+b[j]==target){
                    c= b[i];
                    d=b[j];
                    break outerLoop;
                }
            }
        }
        System.out.println("["+c+","+d+"]");
    }





}
package prac;

class reverseWithoutSplit{
    public static void main(String[] args) {


        String s="this is anuj";

        StringBuilder word=new StringBuilder();
        StringBuilder result=new StringBuilder();

        for(int i=0;i<s.length();i++){


            if(s.charAt(i)==' '){
               StringBuilder b =rev(word);
               result.append(b).append(" ");
               word.setLength(0);

            }else {
                word.append(s.charAt(i));
            }

        }

            StringBuilder b =rev(word);
            result.append(b).append(" ");
            word.setLength(0);

        result.append(word).append(" ");
        System.out.println(result);
    }

    static StringBuilder rev(StringBuilder s){
         StringBuilder re =new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            re.append(s.charAt(i));

        }

        return re;
    }

}
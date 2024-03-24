public class CountSubstrings {
    public static long countSubstrings(String s, char c) {
        char[] inp = s.toCharArray();
        long out = 0;
        long count = 0;

        for(int i=0; i<inp.length; i++){
            if(inp[i] == c){
                out++;
                if(count == 0){
                    for(int j=i+1; j<inp.length; j++){
                        if(inp[j]==c){
                            out++;
                        }
                    }
                }else{
                    out += count-1;
                }
                if(count == 0) {
                    count = out - 1;
                }else{
                    count--;
                }
            }

        }
        return out;
    }

    public static void main(String[] args) {
        System.out.println(countSubstrings("abada", 'a'));
    }
}

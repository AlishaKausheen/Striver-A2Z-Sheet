public class NumberOfSubstringContainingAllThreeCharacters {
    public int bruteForce(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            int[] hash = new int[3];
            for(int j=i;j<s.length();j++){
                hash[s.charAt(j)-'a']=1;
                if(hash[0]+hash[1]+hash[2]==3) count = count+1;
            }
        }
        return count;
    }
    public int better(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            int[] hash = new int[3];
            for(int j=i;j<s.length();j++){
                hash[s.charAt(j)-'a']=1;
                if(hash[0]+hash[1]+hash[2]==3) {
                    count = count + (s.length() - j);
                    break;
                }
                }
            }

        return count;
    }
    public int optimal(String s) {
        int count=0;
        int[] leastsum = {-1,-1,-1};
        for(int i=0;i<s.length();i++){
            leastsum[s.charAt(i)-'a'] =i;
            if(leastsum[0]!=-1 && leastsum[1]!=-1 && leastsum[2]!=-1){
                count = count +(1+ Math.min(leastsum[0], Math.min(leastsum[1],leastsum[2])));
            }
        }
        return count;
    }
}

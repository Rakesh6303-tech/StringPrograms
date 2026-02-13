class Solution {
    public static String longestCommonPrefix(String[] s) {
        Arrays.sort(s);
        String s1 = s[0];
        String s2 = s[s.length-1];
        int index=0;
        while(index<s1.length())
        {
            if(s1.charAt(index)==s2.charAt(index))
            {
                index++;
            }
            else{
                break;
            }
        }
        return index==0?"":s1.substring(0,index);

    }
    public static void main(String args [])
    {
        Scanner scan = new Scanner(System.in);
        String [] s = {"flower","flow","flight"};
        System.out.print(longestCommonPrefix(s));
    }
}

class Solution {
    public int romanToInt(String s) {
          HashMap<Character,Integer> myMap=new HashMap<Character,Integer>();
        myMap.put('I',1);
        myMap.put('V',5);
        myMap.put('X',10);
        myMap.put('L',50);
        myMap.put('C',100);
        myMap.put('D',500);
        myMap.put('M',1000);
        int outNumper = 0;
        int current=0;
        int next=0;
        for (int i=0;i<s.length();i++){
            current=myMap.get(s.charAt(i));
            next= (i+1<s.length())? myMap.get(s.charAt(i+1)):0;
            if(current<next){
                outNumper+=(next-current);
                i++;
            }else{
                outNumper+=current;
            }
        }
return outNumper;
    }
}
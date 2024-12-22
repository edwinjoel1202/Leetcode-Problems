class RomanToInteger {
    public int romanToInt(String s) {
        int sum=0,prev=0;
        for(int i=s.length()-1;i>=0;i--){
            int value=getValue(s.charAt(i));
            if(value>=prev) sum+=value;
            else sum-=value;
            prev=value;
        }
        return sum;
    }
    public int getValue(int i){
        switch(i){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
        }return 0;
    }
}
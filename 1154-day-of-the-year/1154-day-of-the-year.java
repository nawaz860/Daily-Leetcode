class Solution {
    public int dayOfYear(String date) {

        int[] days={31,28,31,30,31,30,31,31,30,31,30,31};

        int month=(date.charAt(5)-'0')*10+(date.charAt(6)-'0');
        int date_day=(date.charAt(8)-'0')*10+(date.charAt(9)-'0');
        int year=(date.charAt(0)-'0')*1000+(date.charAt(1)-'0')*100+(date.charAt(2)-'0')*10+(date.charAt(3)-'0');

        int day=0;
        for(int i=0;i<month-1;i++) day+=days[i];

       if (month > 2 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))  return day + date_day + 1;
        return day+date_day;

        
    }
}
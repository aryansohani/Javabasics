package JavaBasics;
public class switchcase {
    
    public static void main(String[] args) {
        int day=3;
        String dayname;

        switch(day){
            case 1:
                dayname="Monday";
                break;
            case 2:
                dayname="Tuesday";
                break;
            case 3:
                dayname="Wednesday";
                break;
            case 4:
                dayname="Thursday";
                break;
            default:
                dayname = "Invalid day";
        }

        

        
        System.out.println("The day is: " +  dayname );
    }
}

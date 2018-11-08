import java.util.ArrayList;
import java.util.List;


public class main {

    public static void main(String[] args){

        int n = 10;
        List<String> myList = new ArrayList<>();
        for(int i =1;i<=n;i++){
            if(i%3 ==0 && i%5 == 0){
                myList.add("FizzBuzz");
            }
            else if(i % 3 == 0){
                myList.add("Fizz");
            }
            else if(i % 5 == 0){
                myList.add("Buzz");
            }
            else
                myList.add(Integer.toString(i));

        }
        //return myList;
    }

}

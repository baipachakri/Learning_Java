public class strings{
    public static void main(String[] args) {
        String str = new String("Chakri");
        System.out.println("hello "+str);

        System.out.println(str.charAt(5));

        /*Strings : 
        * 1.String is a class in java
        * 2.String is immutable in java
        * 3.String is final class in java
        * String can be mutuable also 

        **1.MUTUABLE** -> the data in the string object can be changed 
        **2.IMMMUTUABLE** -> the data in the string object can't be changed 

        MUTUABLE can be achived by string buffer and string Builder

        StringBuffer:-
        * 1.StringBuffer is a class in java
        * 2.StringBuffer is mutable in java
        * 3.StringBuffer is not final class in java
        * 4.StringBuffer is synchronized in java
        * 5.StringBuffer is thread safe in java

        String Builder:-
        * 1.StringBuilder is a class in java
        * 2.StringBuilder is mutable in java
        * 3.StringBuilder is not final class in java
        * 4.StringBuilder is not synchronized in java
        * 5.StringBuilder is not thread safe in java
        
        */
    }
}
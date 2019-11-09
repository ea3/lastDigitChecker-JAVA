public class LastDigitChecker {

    public static boolean hasSameLastDigit( int numberOne, int numberTwo, int numberThree) {

        if ( numberOne < 10 || numberOne > 1000 || numberTwo < 10 || numberTwo > 1000 || numberThree < 10 || numberThree > 1000) {

            return false;

        }else{

            if( (numberOne % 10 == numberTwo % 10) || (numberOne % 10 == numberThree % 10) || (numberTwo % 10 == numberThree % 10)  ){
                return true;
            }else{
                return false;
            }


        }

    }

    public static boolean isValid(int numberFour){

        if (numberFour >= 10 && numberFour <= 1000 ){
            return true;
        }else{

            return false;
        }
    }


}

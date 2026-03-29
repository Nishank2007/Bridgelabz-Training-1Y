package out.gla.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runtime {
    static void Exception(int a,int b) throws ArithmeticException,InputMismatchException{
        if(b==0){
            throw new ArithmeticException();
        }
    }
}

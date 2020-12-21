package PasswordPackage;

public class Password {

    public String encruptedPassword(String logingPasswordTry){
        char [] chars = logingPasswordTry.toCharArray();

        for (char c : chars){
            c += 5;
            logingPasswordTry += c;
        }
// ;;;666 is the encruptedPassword for 666 after i manipulate it in the for loop.
        if (logingPasswordTry.equals("666;;;")){
            return logingPasswordTry;
        }
        return "Wrong password";
    }

    public String decruptedPassword(String logingPasswordTry){
        char [] chars = logingPasswordTry.toCharArray();

        for (char c : chars){
            c -= 5;
            System.out.print(c);
        }
// ;;;666 is the encruptedPassword for 666 after i manipulate it in the for loop.
        if (logingPasswordTry.equals(";;;666")){
            return logingPasswordTry;
        }
        return "Wrong password";
    }
}

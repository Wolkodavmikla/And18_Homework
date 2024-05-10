package example1;

public class Validator {
    public static void validate(String login, String password, String confirmPassword) throws WrongLoginException,WrongPasswordException{


        if(login == null || login.length() > 20 ){
            throw new WrongLoginException("Логин должна быть меньше 20 символов");

        }
        if(password == null || password.length() > 20){
            throw new WrongPasswordException("Пароль должна быть меньше 20 символов");

        }
        if(!password.equals(confirmPassword)){
            throw new WrongPasswordException("Подтверждение пароля должно совпадать с паролем");

        }

    }
}

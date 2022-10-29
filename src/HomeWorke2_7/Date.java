package HomeWorke2_7;

public class Date {
    String login;
    String password;
    String confirmPassword;

    public Date(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    static final String check = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[_])(?=.*[-]).{1,20}$";


    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public static boolean checkPassworldLogin(Date date) throws WrongLoginException, WrongPasswordException {
        if (date.login.matches(check) && !date.login.isBlank()) {
            System.out.println("Логин верный");
        } else {
            throw new WrongLoginException("Не верно заданы символы в логин");
        }

        if (date.password != null && !date.password.isBlank() && date.getPassword().matches(check) &&
                date.getPassword().equals(date.getConfirmPassword())) {
            System.out.println("Пароль верный");
        } else {
            throw new WrongPasswordException("Пароль задан не верно/ Проверьте, пароль не совпадает");
        }
        return false;
    }
}

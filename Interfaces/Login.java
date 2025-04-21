interface LoginDAO{
    void login();
    void logout();
}
class LoginImpl implements LoginDAO{
    public Void login(){
        System.out.println("Login Successfully!...");
    }
    public void logout(){
        System.out.println("Logout Successfully!...");
    }
}
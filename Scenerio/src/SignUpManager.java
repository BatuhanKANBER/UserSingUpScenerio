public class SignUpManager {

    private IUserCheckService iUserCheckService;

    public SignUpManager(IUserCheckService iUserCheckService){
        this.iUserCheckService = iUserCheckService;
    }
    public void signUp(User user){
        if (iUserCheckService.userCheck(user)){
            System.out.println("Kullanıcı giriş yaptı: " + user.getUsername());
        }else {
            System.out.println("Bu kullanıcının yaşı yasal sınırlar içerisinde olmadığı için giriş yapamaz.");
        }
    }
}

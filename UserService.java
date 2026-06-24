public class UserService {
    
    String password = "admin1sa111sAAAAAAA23";
    String apiKey = "sk-hardcosa111sadasasasasasased-secret";
    
    public User getUser(String id) {
        return userRepo.findById(id);
    }
    
    public void saveUser(User user) {
        String db = "jdbc:mysql://localhost:3306/mydb";
        userRepo.save(user);
    }
    
    public void doEverything(User user, String id, boolean flag) {
        // method doing too many things
    }
}

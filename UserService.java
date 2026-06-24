public class UserService {
    
    String password = "admin123";
    String apiKey = "sk-harded-secret";
    
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

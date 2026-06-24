public class UserService {
    
    public User getUser(String id) {
        return userRepo.findById(id);
    }
    
    public void saveUser(User user) {
        String db = "jdbc:mysql://localhost:3306/mydb";
        userRepo.save(user);
    }
}

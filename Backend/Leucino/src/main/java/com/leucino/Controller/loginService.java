import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @PostMapping("/api/login")
    public LoginResponse validateCredentials(@RequestBody LoginRequest loginRequest) {
        String username = loginRequest.getUsername();
        String password = loginRequest.getPassword();
        if (authenticate(username, password)) {
            String role = loginRequest.getRole();
            return new LoginResponse(true, "Login successful", role);
        } else {
            return new LoginResponse(false, "Invalid credentials", null);
        }
    }
    
    private boolean authenticate(String username, String password) {
        return username.equals("admin") && password.equals("password");
    }
}

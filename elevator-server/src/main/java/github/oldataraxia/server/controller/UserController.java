package github.oldataraxia.server.Controller;

import github.oldataraxia.server.DTO.UserDTO;
import github.oldataraxia.server.DTO.UserSessionDTO;
import github.oldataraxia.server.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @GetMapping("/listUser")
    public List<String> listUser() {
        return userService.listUser();
    }

    @PostMapping("/register")
    public boolean register (
            @RequestParam("username") String username,
            @RequestParam("nfc") String nfc
    ) {
        System.out.println("username: " + username);
        System.out.println("nfc: " + nfc);
        return userService.register(username, nfc);
    }

    @PostMapping("/addAdmin")
    public boolean addAdmin (
            @RequestParam("username") String username,
            @RequestParam("nfc") String nfc
    ) {
        System.out.println("username: " + username);
        System.out.println("nfc: " + nfc);
        return userService.addAdmin(username, nfc);
    }

    @GetMapping("getUserById/{nfc}")
    public UserDTO getUserById (
            @PathVariable("nfc") String nfc
    ) {
        return userService.getUserById(nfc);
    }

    @PostMapping("/card")
    public boolean card (@RequestParam("nfc") String nfc) {
        return userService.card(nfc);
    }

}

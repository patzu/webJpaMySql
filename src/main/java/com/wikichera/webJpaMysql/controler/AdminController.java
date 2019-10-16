package com.wikichera.webJpaMysql.controler;

import com.wikichera.webJpaMysql.Admin;
import com.wikichera.webJpaMysql.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
public class AdminController {
    @Autowired
    private AdminRepository adminRepository;

    @GetMapping("/admin")
    public Admin send(String userName) {
        List<Admin> adminList = adminRepository.findByUserName(userName);
        return adminList.get(0);
    }

    @PostMapping("/admin")
    @ResponseBody
    public void receive(@RequestBody Admin admin) {
        adminRepository.save(admin);
        System.out.println("new Admin user is saved!");
    }

    @DeleteMapping("/admin")
    public void delete(Admin admin) {
        adminRepository.delete(admin);
        System.out.println("Admin is deleted!");
    }

    @PutMapping("/admin")
    public void update(Admin admin) {
        List<Admin> adminList = adminRepository.findByUserName(admin.getUserName());
        if (adminList.isEmpty()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Admin user = adminList.get(0);
        if (Objects.nonNull(user) && admin.getPassword().equals(user.getPassword())) {
            adminRepository.save(admin);
            System.out.println("Admin is updated!");
        }
    }
}
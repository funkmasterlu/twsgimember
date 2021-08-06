package com.example.openapidemo.controller;

import com.example.openapidemo.model.User;
import com.example.openapidemo.model.UserInfo;
import com.example.openapidemo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@Api(tags="使用者管理")
@RestController
@RequestMapping("/v1/users")
public class UserController {
    @Autowired private UserService userService;

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello,World!";
    }

//    @ApiOperation("建立使用者")
//    @PostMapping("/users")
//    public User create(@RequestBody @Valid User user) {
//        return user;
//    }

    @ApiOperation("顯示使用者資訊")
    @GetMapping("/info")
    public UserInfo getUserInfoByEmail() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserInfo user = userService.getUserInfoByEmail(authentication.getName());
        System.out.println("login user : " + authentication.getName());
        if (user != null) {
            return user;
        } else {
            return null;
        }
    }
//
//    @ApiOperation("使用者列表")
//    @GetMapping("/users")
//    public List<User> list(@ApiParam("檢視第幾頁") @RequestParam int pageIndex,
//                           @ApiParam("每頁多少條") @RequestParam int pageSize) {
//        List<User> result = new ArrayList<>();
//        result.add(new User("aaa", 50, "北京", "aaa@ccc.com"));
//        result.add(new User("bbb", 21, "廣州", "aaa@ddd.com"));
//        return result;
//    }

//    @DeleteMapping("/{id}")
//    public String deleteById(@PathVariable Long id) {
//        return "delete user : " + id;
//    }
}

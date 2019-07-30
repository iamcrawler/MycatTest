package cn.iamcrawler.crawlertest.controller;

import cn.iamcrawler.crawlertest.entity.MycatUser;
import cn.iamcrawler.crawlertest.service.MycatUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * create by liuliang
 * on 2019-07-30  17:17
 */
@RestController
@RequestMapping("/mycat/user")
public class MyCatUserController {

    @Autowired
    private MycatUserService userService;


    @PostMapping
    public ResponseEntity insertUser(@RequestBody MycatUser mycatUser){
        return ResponseEntity.ok(userService.save(mycatUser));
    }

    @GetMapping
    public ResponseEntity getUsers(){
        return ResponseEntity.ok(userService.getUsers());
    }

}

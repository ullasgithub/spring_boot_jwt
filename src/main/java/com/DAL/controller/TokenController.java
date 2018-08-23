package com.DAL.controller;

import com.DAL.entity.JwtUser;
import com.DAL.security.JwtGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/token")
public class TokenController {

    @Autowired
    private JwtGenerator jwtGenerator;

//    public TokenController(JwtGenerator jwtGenerator) {
//        this.jwtGenerator = jwtGenerator;
//    }

    @RequestMapping(method = RequestMethod.POST)
    public String generate(@RequestBody final JwtUser jwtUser) {

        return jwtGenerator.generate(jwtUser);

    }
}
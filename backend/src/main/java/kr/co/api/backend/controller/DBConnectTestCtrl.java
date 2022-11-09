package kr.co.api.backend.controller;

import kr.co.api.backend.dao.TestDAO;
import kr.co.api.backend.dto.TestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DBConnectTestCtrl {

    @Autowired
    private TestDAO testDAO;

    @GetMapping("/hello")
    public List<TestDTO> test() {
        return testDAO.getTestData();
    }
}

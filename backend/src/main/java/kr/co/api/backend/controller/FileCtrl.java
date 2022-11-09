package kr.co.api.backend.controller;

import kr.co.api.backend.dao.FileDAO;
import kr.co.api.backend.dto.FileDTO;
import kr.co.api.backend.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/file")
public class FileCtrl {
    @Autowired
    private FileService fileService;

    @GetMapping("/getImages")
    public List<FileDTO> getImages(@RequestParam String reviewId) {
        return fileService.getImages(reviewId);
    }
}

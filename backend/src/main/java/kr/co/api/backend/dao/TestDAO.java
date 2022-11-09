package kr.co.api.backend.dao;

import kr.co.api.backend.dto.TestDTO;

import java.util.List;

public interface TestDAO {
    List<TestDTO> getTestData();
}

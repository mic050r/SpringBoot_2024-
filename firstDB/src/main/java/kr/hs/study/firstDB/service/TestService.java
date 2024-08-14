package kr.hs.study.firstDB.service;

import kr.hs.study.firstDB.dto.TestDTO;

import java.util.List;

public interface TestService {
    public void insert(TestDTO dto);
    public void update(TestDTO dto);
    public void delete(int id);
    public List<TestDTO>listAll();
    public TestDTO read(int id);
}

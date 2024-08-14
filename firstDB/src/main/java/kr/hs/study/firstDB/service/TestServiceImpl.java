package kr.hs.study.firstDB.service;

import kr.hs.study.firstDB.dao.TestMapper;
import kr.hs.study.firstDB.dto.TestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper mapper;

    @Override
    public void insert(TestDTO dto) {
        mapper.insert(dto);
    }

    @Override
    public void update(TestDTO dto) {

    }

    @Override
    public void delete(int id) {
        mapper.delete(id);
    }

    @Override
    public List<TestDTO> listAll() {
        return mapper.listAll();
    }

    @Override
    public TestDTO read(int id) {
        return mapper.read(id);
    }
}

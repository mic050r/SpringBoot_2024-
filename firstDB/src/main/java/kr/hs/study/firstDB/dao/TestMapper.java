package kr.hs.study.firstDB.dao;

import kr.hs.study.firstDB.dto.TestDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

// Mapper는 mapper.xml을 찾아감
@Mapper
public interface TestMapper {
    public void insert(TestDTO dto);
    public void update(TestDTO dto);
    public void delete(int id);
    public List<TestDTO> listAll();
    public TestDTO read(int id);
}

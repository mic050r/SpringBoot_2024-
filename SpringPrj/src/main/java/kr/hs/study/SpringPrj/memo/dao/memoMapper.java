package kr.hs.study.SpringPrj.memo.dao;

import kr.hs.study.SpringPrj.memo.dto.MemoDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface memoMapper {
    public void insert(MemoDTO memoDTO);
    public List<MemoDTO> listAll();
    public void update(MemoDTO memoDTO);
    public void delete(int id);
}

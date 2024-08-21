package kr.hs.study.SpringPrj.memo.service;

import kr.hs.study.SpringPrj.memo.dao.memoMapper;
import kr.hs.study.SpringPrj.memo.dto.MemoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class memoServiceImpl implements memoService {

    @Autowired
    private memoMapper mapper;

    @Override
    public void insert(MemoDTO memoDTO) {
        mapper.insert(memoDTO);
    }

    @Override
    public void update(MemoDTO memoDTO) {

    }

    @Override
    public void delete(int id) {

    }
}

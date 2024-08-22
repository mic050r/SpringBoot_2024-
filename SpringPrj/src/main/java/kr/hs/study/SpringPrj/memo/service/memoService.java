package kr.hs.study.SpringPrj.memo.service;

import kr.hs.study.SpringPrj.memo.dto.MemoDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface memoService {
    /*
        insert, update, delete : 반환값 x -> void
        select : 반환값 o
    */

    // insert
    public void insert(MemoDTO memoDTO);

    // select
    public List<MemoDTO> listAll();

    // update
    public void update(MemoDTO memoDTO);

    // delete
    public void delete(int id);
}

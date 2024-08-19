package kr.hs.study.SpringPrj.memo.dto;

import lombok.Data;

@Data
public class MemoReq {
    private String writer;
    private String contents;
}

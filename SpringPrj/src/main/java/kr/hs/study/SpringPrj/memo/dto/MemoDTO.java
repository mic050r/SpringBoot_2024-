package kr.hs.study.SpringPrj.memo.dto;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class MemoDTO {
    private int id;
    private String writer;
    private String contents;
    private Timestamp regDate;
}

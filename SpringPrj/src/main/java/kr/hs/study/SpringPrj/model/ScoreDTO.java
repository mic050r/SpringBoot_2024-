package kr.hs.study.SpringPrj.model;

import lombok.Data;

@Data
public class ScoreDTO {
    private String name;
    private int kor;
    private int eng;
    private int math;
}

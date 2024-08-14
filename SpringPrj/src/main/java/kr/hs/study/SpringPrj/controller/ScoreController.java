package kr.hs.study.SpringPrj.controller;

import kr.hs.study.SpringPrj.model.ScoreDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ScoreController {

    @GetMapping("/score")
    public String score() {
        return "score";
    }

    @PostMapping("/score")
    public String score(@ModelAttribute ScoreDTO scoreDTO, Model model) {
        // 사용자가 입력한 값을 자동으로 set메서드를 이용해서 dto의 멤버변수에 넣는다(DI)
        int sum = scoreDTO.getEng() + scoreDTO.getKor() + scoreDTO.getMath(); // 총점
        double avg = (double) sum / 3; // 평균

        model.addAttribute("result", scoreDTO);
        model.addAttribute("sum", sum);
        model.addAttribute("avg", avg);

        return "score";
    }
}

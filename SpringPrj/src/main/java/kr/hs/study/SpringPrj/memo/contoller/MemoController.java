package kr.hs.study.SpringPrj.memo.contoller;

import kr.hs.study.SpringPrj.memo.dto.MemoReq;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemoController {

    @GetMapping("/memo")
    public String memo() {
        return "./memo/memo";
    }

    @PostMapping("/memo")
    public String memo(@ModelAttribute MemoReq memoReq, Model model) {
        model.addAttribute("result", memoReq);
        return "./memo/memo";
    }
}

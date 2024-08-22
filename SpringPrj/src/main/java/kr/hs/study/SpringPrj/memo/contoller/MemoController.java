package kr.hs.study.SpringPrj.memo.contoller;

import kr.hs.study.SpringPrj.memo.dto.MemoDTO;
import kr.hs.study.SpringPrj.memo.service.memoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MemoController {

    @Autowired
    private memoService memoService;

    @GetMapping("/memo")
    public String memo() {
        return "./memo/memo";
    }

    @PostMapping("/memo")
    public String memo(@ModelAttribute MemoDTO memoDTO, Model model) {
        memoService.insert(memoDTO);
        model.addAttribute("result", memoDTO);
        return "./memo/memo";
    }

    @GetMapping("/memo/list")
    public String listAll(Model model) {
        List<MemoDTO> list = memoService.listAll();
        model.addAttribute("list",list);
        return "./memo/result";
    }
}

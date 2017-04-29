package com.springapp.mvc;

import com.springapp.model.BunchOf;
import com.springapp.model.SomeLine;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class BrowseMore {

    @RequestMapping("/more")
    public @ResponseBody BunchOf printBunch(@RequestParam (value="cnt", defaultValue="5") Integer cnt) {
		return generated(cnt);
	}
	@RequestMapping("/more5")
    public @ResponseBody BunchOf printBunch5() {
		return generated(5);
	}

	private BunchOf generated(Integer cnt) {
		BunchOf bunch = new BunchOf();
		for (int i = 0; i < cnt; i++) {
            SomeLine theLine = new SomeLine("a" + i % 3, "b" + i % 4, "c" + i % 5, "d" + 1, i %5 , 1 + i % 7, 10 - i % 9);
            bunch.getDatLines().add(theLine);
        }
		return bunch;
	}

}
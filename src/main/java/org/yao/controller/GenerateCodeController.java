package org.yao.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.yao.model.RespBean;
import org.yao.model.TableClass;
import org.yao.service.GenerateCodeService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author yao
 * @jikeyou vhr generate-code
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
@RestController
public class GenerateCodeController {
    @Autowired
    GenerateCodeService generateCodeService;


    @PostMapping("/generateCode")
    public RespBean generateCode(@RequestBody List<TableClass> tableClassList, HttpServletRequest req) {
        return generateCodeService.generateCode(tableClassList, "src/main/resources");
    }
}

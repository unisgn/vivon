package com.sink.web.core;


@Controller
@RequestMapping(value="/resty/messages")
public class MessageController {

    @Autowired
    MessageService ms;

    @RequestMapping()

}

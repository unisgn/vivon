package com.sink.web.core;

@Controller
@RequestMapping(value="/resty/financialaccountjournals")
public class FinancialAccountJournalController {

    @Autowired
    FinancialAccountJournalService fajs;


    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> findJournalById(@PathVariable int id) {

    }

    @RequestMapping(value="/{id}", method=RequestMethod.PUT)
    @ResponseBody
    public Map<String, Object> updateJournal(@RequestBody FinancialAccountJournal journal) {

    }



}

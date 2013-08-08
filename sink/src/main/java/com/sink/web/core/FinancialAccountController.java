package com.sink.web.core;

@Controller
@RequestMapping(value="/resty/financialaccounts/")
public class FinancialAccountController {

	@Autowired
	FinancialAccountService fas;

	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getAccountsTree(@RequestParam boolean active) {

	}

	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> addAccount(@RequestBody FinancialAccount account) {

	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getAccount(@PathVariable int id) {

	}

	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	@ResponseBody
	public Map<String, Object> updateAccount(@RequestBody FinancialAccount account) {

	}

	@RequestMapping(value="/{id}/journals", method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getJournalsByAccount(@PathVariable int id) {

	}

	@RequestMapping(value="/{id}/journals", method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> addJournalToAccount(@PathVariable int id) {

	}

}

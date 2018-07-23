package org.xfl.springbootlearn.controller;import org.apache.ibatis.session.SqlSession;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.web.bind.annotation.*;import org.xfl.springbootlearn.bean.Account;import org.xfl.springbootlearn.dao.AccountDao;import org.xfl.springbootlearn.mapper.AccountMapper;import java.math.BigDecimal;import java.util.List;/** * @program: learn * @description: JAP * @author: xfl * @create: 2018-07-19 16:37 **/@RestController@RequestMapping("/account/")public class AccountController {    @Autowired    AccountDao accountDao;    @Autowired(required = false)    AccountMapper accountMapper;    @Autowired    SqlSession sqlSession;    /**     * 获取所有Account     * @return     */    @GetMapping("list")    public List<Account> getAccounts(){        return accountMapper.findAll();    }    /**     * 查找单个Account     * @param id     * @return     */    @GetMapping("{id}")    public Account getAccount(@PathVariable(value = "id") Integer id){        return accountDao.getOne(id);    }    /**     * 更新Account     * @param id     * @param name     * @param money     * @return     */    @PutMapping("{id}")    public String updateAccount(@PathVariable("id") Integer id , @RequestParam(value = "name") String name,                                @RequestParam(value = "money",required = true)BigDecimal money){        Account account = initAccount(name, id, money);        Account account1 = accountDao.saveAndFlush(account);        return account1.toString();    }    /**     * 新建Account     * @param id     * @param name     * @param money     * @return     */    @PostMapping("{id}")    public String saveAccount(@PathVariable("id") Integer id,@RequestParam(value = "name") String name,@RequestParam(value = "money") BigDecimal money){        Account account = initAccount(name, id, money);        Account account1 = accountDao.save(account);        return account1.toString();    }    /**     * 初始化Account     * @param name     * @param id     * @param money     * @return     */    private Account initAccount(String name,Integer id,BigDecimal money){        Account account = new Account();        account.setId(id);        account.setName(name);        account.setMoney(money);        return account;    }}
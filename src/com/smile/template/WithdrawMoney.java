package com.smile.template;

/**
 * @author smi1e
 * Date 2019/8/26 10:48
 * Description
 */
public class WithdrawMoney extends ABSBank {
    @Override
    public void handlingBusiness() {
        System.out.println("正在取钱。。。");
    }

    @Override
    public void evaluate() {
        System.out.println("评价：取钱服务很周到！");
    }


}

package com.crm.service;

import com.sunyun.dao.GoodsDao;
import com.sunyun.dao.SaleDao;
import com.sunyun.domain.Goods;
import com.sunyun.domain.Sale;
import com.sunyun.excep.NotEnoughException;
import com.sunyun.service.BuyGoodsService;

public class crmServiceImpl implements BuyGoodsService {
    private SaleDao saleDao;
    private GoodsDao goodsDao;



    @Override
    public void buy(Integer goodsId, Integer nums) {
        System.out.println("buy方法的开始========");
        //记录销售的信息，向sale表添加激励
        Sale sale = new Sale();
        sale.setGid(goodsId);
        sale.setNums(nums);
        saleDao.insertSale(sale);

        //更新库存
        Goods goods = goodsDao.selectGoods(goodsId);
        if(goods==null){
            //商品不在
            throw  new NullPointerException("编号是："+goodsId+"，商品不存在");

        }else  if(goods.getAmount() < nums){
            //商品库存不足
            throw new NotEnoughException("编号是："+goodsId+"商品库存不足");
        }

        //修改库存
        Goods buyGoods = new Goods();
        buyGoods.setId(goodsId);
        buyGoods.setAmount(nums);
        goodsDao.updateGoods(buyGoods);
        System.out.println("buy方法的完成========");

    }
    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }
}
